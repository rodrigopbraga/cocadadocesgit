package controlador;

import dao.DoceDAO;
import dao.Conexao;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import modelos.Doce;
import telas.EditorDoce;

public class DoceController {
    private EditorDoce view;

    public DoceController(EditorDoce view) {
        this.view = view;
    }

    public DoceController() {
    }

    public Doce salvaDoce(String nome, String ing, double pcusto, double pvenda) {
        Doce doc = new Doce(nome, ing, pcusto, pvenda);
        try {
            Connection conexao = new Conexao().getConnection();
            DoceDAO docDao = new DoceDAO(conexao);
            doc=docDao.insert(doc);
            conexao.close();
        } catch (SQLException ex) {
            System.out.println("ex salvaDoce\n"+ex.getMessage());
        }return doc;
    }

    public boolean novo(String nome) throws SQLException{
        boolean b = false;
        try {
            Doce doc = new Doce(nome);
            Connection conexao = new Conexao().getConnection();
            DoceDAO docDao = new DoceDAO(conexao);
            b = docDao.novo(doc);
            conexao.close();
        } catch (SQLException ex) {
            System.out.println("ex novo\n"+ex.getMessage());
        }
        return b;
    }
    
    public void updateDoce(Doce d){
        try {
            Connection conexao=new Conexao().getConnection();
            DoceDAO docDao=new DoceDAO(conexao);
            docDao.update(d);
            conexao.close();
        } catch (SQLException ex) {
            System.out.println("ex updateDoce\n"+ex.getMessage());
        }
    }
    
    public void deleteDoce(Doce d){
        try {
            Connection conexao=new Conexao().getConnection();
            DoceDAO docDao=new DoceDAO(conexao);
            docDao.delete(d);
            conexao.close();
        } catch (SQLException ex) {
            System.out.println("ex deleteDoce\n"+ex.getMessage());
        }
    }
    
    public Doce consultaDoceI(int id) {
        Doce doc = new Doce(id);
        try {
            Connection conexao = new Conexao().getConnection();
            DoceDAO docDao = new DoceDAO(conexao);
            doc = docDao.selectId(id);
            conexao.close();
        } catch (SQLException ex) {
            System.out.println("ex consultaDoceI\n"+ex.getMessage());
        }
        return doc;
    }

    public ArrayList<Doce> consultaDoceN(String nome) {
        ArrayList<Doce> doc = new ArrayList<Doce>();
        try {
            Connection conexao = new Conexao().getConnection();
            DoceDAO docDao = new DoceDAO(conexao);
            doc = docDao.selectNome(nome);
            conexao.close();
        } catch (SQLException ex) {
            System.out.println("ex consultaDoceN\n"+ex.getMessage());
        }
        return doc;
    }

    public ArrayList<Doce> consultaDoceIng(String ingredientes) {
        ArrayList<Doce> doc = new ArrayList<Doce>();
        try {
            Connection conexao = new Conexao().getConnection();
            DoceDAO docDao = new DoceDAO(conexao);
            doc = docDao.selectIngrediente(ingredientes);
            conexao.close();
        } catch (SQLException ex) {
            System.out.println("ex consultaDoceIng\n"+ex.getMessage());
        }
        return doc;
    }
    
    public boolean existeDoce(int id) {
        Doce doc = new Doce(id);
        try {
            Connection conexao = new Conexao().getConnection();
            DoceDAO docDao = new DoceDAO(conexao);
            if (docDao.exist(doc)) {
                conexao.close();
                return true;
            } else {
                doc.setId(0);
                conexao.close();
                return false;
            }
        } catch (SQLException ex) {
            System.out.println("ex existeDoce\n"+ex.getMessage());
            return false;
        }
    }
    
    public void preencheTabelaO(Doce d, javax.swing.JTable jT){
        DefaultTableModel dtmDoces=(DefaultTableModel) jT.getModel();
        Object[] dados={d.getId(), d.getNomedoce(), d.getIngredientes(), d.getPcusto(), d.getPvenda()};
        dtmDoces.addRow(dados);
    }
}
