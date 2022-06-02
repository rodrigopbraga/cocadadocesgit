package controlador;

import dao.Conexao;
import dao.UsuarioDAO;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelos.Usuario;
import telas.Menu;

public class UsuarioController {
    private java.awt.Frame parent;
    private Usuario currentUser;

    public UsuarioController(java.awt.Frame parent) {
        this.parent = parent;
    }
    public UsuarioController(){
    }

    public Usuario getCurrentUser() {
        return currentUser;
    }

    public void setCurrentUser(Usuario currentUser) {
        this.currentUser = currentUser;
    }
    
    public void preencheTabelaO(Usuario u, javax.swing.JTable jT) {
        DefaultTableModel dtmClientes = (DefaultTableModel) jT.getModel();
        Object[] dados = {u.getId(), u.getUsuario(), u.getFunc()};
        dtmClientes.addRow(dados);
    }
    
    public void autenticar(String user, String password) throws SQLException {
        Usuario auteUser=new Usuario(user, password);
        Connection conexao=new Conexao().getConnection();
        UsuarioDAO usuDAO=new UsuarioDAO(conexao);
        
        if(usuDAO.auteUser(auteUser)){
           auteUser=usuDAO.selectUserPass(auteUser);
           setCurrentUser(usuDAO.selectId(auteUser));
           getCurrentUser().setLv(usuDAO.getUserLevel(auteUser));
           Menu telademenu = new Menu(getCurrentUser());
           parent.dispose();
           telademenu.setVisible(true);
        }else{
            JOptionPane.showMessageDialog(parent, "Usuario ou senha invalidos!!!");
        }
        conexao.close();
    }
    
    public boolean salvaUsuario(Usuario user) throws IOException{
        try {
            Connection conexao=new Conexao().getConnection();
            UsuarioDAO userDAO=new UsuarioDAO(conexao);
            if (!userDAO.jaExiste(user)) {
                userDAO.insert(user);
                conexao.close();
                return true;
            }else{
                conexao.close();
                return false;
            }
        } catch (SQLException ex) {
            System.out.println("ex salvaUsuario\n"+ex.getMessage());
            return false;
        }
    }
    
    public void updateUsuario(Usuario user){
        try {
            Connection conexao=new Conexao().getConnection();
            UsuarioDAO userDAO=new UsuarioDAO(conexao);
            userDAO.update(user);
            conexao.close();
        } catch (SQLException ex) {
            System.out.println("ex updateUsuario\n"+ex.getMessage());
        }
    }
    
    public void updateSenha(Usuario user){
        try {
            Connection conexao=new Conexao().getConnection();
            UsuarioDAO userDAO=new UsuarioDAO(conexao);
            userDAO.updateSenha(user);
            conexao.close();
        } catch (SQLException ex) {
            System.out.println("ex updateSenha\n"+ex.getMessage());
        }
    }
    
    public boolean validaAlteraSenha(Usuario user, String pass){
        user.setSenha(pass);
        boolean b=false;
        try {
            Connection conexao=new Conexao().getConnection();
            UsuarioDAO userDAO=new UsuarioDAO(conexao);
            b=userDAO.auteUser(user);
            conexao.close();
            return b;
        } catch (SQLException ex) {
            System.out.println("ex validaAlteraSenha\n"+ex.getMessage());
            return false;
        }
    }
    
    public Usuario consultaUsuarioI(int idU) {
        Usuario user=new Usuario(idU);
        try {
            Connection conexao = new Conexao().getConnection();
            UsuarioDAO usuDao = new UsuarioDAO(conexao);
            user = usuDao.selectIdView(user);
            conexao.close();
            //JOptionPane.showMessageDialog(null, "Usuario de ID "+idU+" nao encontrado.", "Aviso", 0);
        } catch (SQLException ex) {
            System.out.println("ex consultaUsuarioI\n"+ex.getMessage());
            return null;
        }
        return user;
    }
    
    public int nivelPrivilegios(Usuario user){
        int lv=0;
        try {
            Connection conexao = new Conexao().getConnection();
            UsuarioDAO usuDao = new UsuarioDAO(conexao);
            lv= usuDao.getUserLevel(user);
            conexao.close();
        } catch (SQLException ex) {
            System.out.println("ex nivelPrivilegios\n"+ex.getMessage());
        }
        return lv;
    }
    
    public ArrayList<Usuario> consultaUsuarioU(String usuario) {
        ArrayList<Usuario> userAL = new ArrayList<>();
        try {
            Connection conexao = new Conexao().getConnection();
            UsuarioDAO clientDao = new UsuarioDAO(conexao);
            userAL = clientDao.selectUsuario(usuario);
            conexao.close();
        } catch (SQLException ex) {
            System.out.println("ex consultaUsuarioU\n"+ex.getMessage());
        }
        return userAL;
    }
    
    public ArrayList<Usuario> consultaUsuarioF(String func) {
        ArrayList<Usuario> userAL = new ArrayList<>();
        try {
            Connection conexao = new Conexao().getConnection();
            UsuarioDAO clientDao = new UsuarioDAO(conexao);
            userAL = clientDao.selectFuncao(func);
            conexao.close();
        } catch (SQLException ex) {
            System.out.println("ex consultaUsuarioF\n"+ex.getMessage());
        }
        return userAL;
    }
    
    public boolean validaSenha(String senha){
        return senha.length() >= 4;
    }
    
    public int indexOf(String func, javax.swing.JComboBox jCB){
        int index=-1;
        for (int i=0;i<jCB.getMaximumRowCount();i++) {
            if (jCB.getItemAt(i).equals(func)) {
                index=i;
                break;
            }
        }return index;
    }
    
    /*public boolean possuiUsuario(int idC) throws SQLException{
    Connection conexao = new Conexao().getConnection();
    UsuarioDAO usuDao = new UsuarioDAO(conexao);
    return usuDao.existeC(idC);
    }*/
}