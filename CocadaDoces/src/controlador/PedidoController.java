package controlador;

import dao.PedidoDAO;
import dao.Conexao;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import modelos.Doce;
import modelos.Pedido;

public class PedidoController {
    public PedidoController() {
    }
    
    public String imprimePedido(int idP){
        StringBuilder sb=new StringBuilder();
        Pedido pedi=consultaPedidoP(idP).get(0);
        sb.append("Pedido ").append(pedi.getIdPedido()).append("\n");
        sb.append("Doces: ").append(getNomesDoces(pedi.getIdPedido())).append("\n");
        sb.append("Ingredientes necessarios: \n").append(getIngredientesDoces(pedi));
        return sb.toString();
    }
    
    public ArrayList<Doce> getDoces(int idP, ArrayList<Doce> docAL){
        DoceController dc=new DoceController();
        for(Pedido pedi : consultaPedidoP(idP)){
            docAL.add(dc.consultaDoceI(pedi.getIdDoce()));
        }
        return docAL;
    }
    
    public String getNomesDoces(int idP){
        DoceController dc=new DoceController();
        StringBuilder sb=new StringBuilder();
        ArrayList<Pedido> pediAL=consultaPedidoP(idP);
        for(Pedido pedi : pediAL){
            sb.append(dc.consultaDoceI(pedi.getIdDoce()).getNomedoce());
            sb.append(", ");
        }
        return sb.toString();
    }
    
    public int getQuantDoce(int idP){
        int total=0;
        ArrayList<Pedido> pediAL=consultaPedidoP(idP);
        for(Pedido pedi : pediAL){
            total+=pedi.getQntDoce();
        }
        return total;
    }
    
    public String getIngredientesDoces(Pedido p){
        DoceController dc=new DoceController();
        StringBuilder sb=new StringBuilder();
        ArrayList<Pedido> pediAL=consultaPedidoP(p.getIdPedido());
        int i=1;
        for(Pedido pedi : pediAL){
            sb.append(i++).append(" - ");
            sb.append(dc.consultaDoceI(pedi.getIdDoce()).getNomedoce());
            sb.append(": ");
            sb.append(dc.consultaDoceI(pedi.getIdDoce()).getIngredientes());
            sb.append("\n");
        }
        return sb.toString();
    }
    
    public Pedido salvaPedidoNovo(int idD) {
        Pedido pedi = new Pedido();
        pedi.setIdDoce(idD);
        try {
            Connection conexao = new Conexao().getConnection();
            PedidoDAO pediDao = new PedidoDAO(conexao);
            pedi=pediDao.insert(pedi);
            conexao.close();
            return pedi;
        } catch (SQLException ex) {
            System.out.println("ex salvaPedidoJTable\n"+ex.getMessage());
            return null;
        }
    }
    
    public Pedido salvaPedidoExistente(int idP, int idD) {
        Pedido pedi;
        try {
            Connection conexao = new Conexao().getConnection();
            PedidoDAO pediDao = new PedidoDAO(conexao);
            pedi= pediDao.insertPedidoExistente(idP, idD);
            conexao.close();
            return pedi;
        } catch (SQLException ex) {
            System.out.println("ex salvaPedidoExistente\n"+ex.getMessage());
            return null;
        }
    }

    public void updatePedido(Pedido p){
        try {
            Connection conexao=new Conexao().getConnection();
            PedidoDAO pediDao=new PedidoDAO(conexao);
            pediDao.update(p);
            conexao.close();
        } catch (SQLException ex) {
            System.out.println("ex updatePedido\n"+ex.getMessage());
        }
    }
    
    public boolean deletePedidoD(Pedido p){
        try {
            Connection conexao=new Conexao().getConnection();
            PedidoDAO pediDao=new PedidoDAO(conexao);
            pediDao.deleteD(p);
            conexao.close();
            return true;
        } catch (SQLException ex) {
            System.out.println("ex deletePedido\n"+ex.getMessage());
            return false;
        }
    }
    
    public ArrayList<Pedido> consultaPedidoP(int idP) {
        ArrayList<Pedido> pediAL;
        try {
            Connection conexao = new Conexao().getConnection();
            PedidoDAO pediDao = new PedidoDAO(conexao);
            pediAL= pediDao.selectIdP(idP);
            conexao.close();
            return pediAL;
        } catch (SQLException ex) {
            System.out.println("ex consultaPedidoP\n"+ex.getMessage());
            return null;
        }
    }
    
    public Pedido consultaPedidoD(int idP, int idD) {
        Pedido pedi;
        try {
            Connection conexao = new Conexao().getConnection();
            PedidoDAO pediDao = new PedidoDAO(conexao);
            pedi= pediDao.selectIdD(idP, idD);
            conexao.close();
            return pedi;
        } catch (SQLException ex) {
            System.out.println("ex consultaPedidoD\n"+ex.getMessage());
            return null;
        }
    }
    
    public ArrayList<Pedido> consultaPedidoDAny(int idD) {
        ArrayList<Pedido> pediAL;
        try {
            Connection conexao = new Conexao().getConnection();
            PedidoDAO pediDao = new PedidoDAO(conexao);
            pediAL= pediDao.selectIdDAny(idD);
            conexao.close();
            return pediAL;
        } catch (SQLException ex) {
            System.out.println("ex consultaPedidoD\n"+ex.getMessage());
            return null;
        }
    }
    
    public boolean existePedido(int idP) {
        Pedido pedi = new Pedido(idP);
        try {
            Connection conexao = new Conexao().getConnection();
            PedidoDAO clientDao = new PedidoDAO(conexao);
            if (clientDao.novoP(idP)) {
                conexao.close();
                return false;
            } else {
                pedi.setIdPedido(0);
                conexao.close();
                return true;
            }
        } catch (SQLException ex) {
            System.out.println("ex existePedido\n"+ex.getMessage());
            return false;
        }
    }
    
    public ArrayList<Pedido> anyPedido() {
        ArrayList<Pedido> pediAL;
        try {
            Connection conexao = new Conexao().getConnection();
            PedidoDAO clientDao = new PedidoDAO(conexao);
            pediAL=clientDao.selectAny();
            conexao.close();
            return pediAL;
        } catch (SQLException ex) {
            System.out.println("ex anyPedido\n"+ex.getMessage());
            return null;
        }
    }
    
    public void preencheTabelaO(Pedido p, javax.swing.JTable jT) {
        DefaultTableModel dtmDoces = (DefaultTableModel) jT.getModel();
        DoceController dc = new DoceController();
        Object[] dados = {p.getIdDoce(), dc.consultaDoceI(p.getIdDoce()).getNomedoce(), p.getQntDoce(), dc.consultaDoceI(p.getIdDoce()).getPvenda()};
        dtmDoces.addRow(dados);
    }
}
