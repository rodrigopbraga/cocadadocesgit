package controlador;

import dao.VendaDAO;
import dao.Conexao;
import java.sql.Date;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import modelos.MetodoPagamento;
import modelos.Pedido;
import modelos.Usuario;
import modelos.Venda;

public class VendaController {
    
    public Venda salvaVenda(int idP, int idC, Date data, double bruto, double desc, Usuario u) {
        Venda vend = new Venda(idP, idC, data, bruto, desc);
        vend.setIdUsuario(u.getId());
        try {
            Connection conexao = new Conexao().getConnection();
            VendaDAO vendDao = new VendaDAO(conexao);
            vend= vendDao.insert(vend);
            conexao.close();
        } catch (SQLException ex) {
            System.out.println("ex salvaVenda\n"+ex.getMessage());
        }
        return vend;
    }
    
    public void concluiVenda(int idP, int idC, Date data, double bruto, double desc) {
        Venda vend = new Venda(idP, idC, data, bruto, desc);
        try {
            Connection conexao = new Conexao().getConnection();
            VendaDAO vendDao = new VendaDAO(conexao);
            vendDao.update(vend);
            conexao.close();
        } catch (SQLException ex) {
            System.out.println("ex updateVenda\n"+ex.getMessage());
        }
    }    
    
    public MetodoPagamento attMetodoPagamento(int mp, int idP){
        MetodoPagamento metPag;
        try {
            Connection conexao=new Conexao().getConnection();
            VendaDAO vendDao=new VendaDAO(conexao);
            metPag= vendDao.updateMP(mp, idP);
            conexao.close();
        } catch (SQLException ex) {
            System.out.println("ex attMetodoPagamento\n"+ex.getMessage());
            return null;
        }
        return metPag;
    }

    public void attStatusPronto(int idV){
        try {
            Connection conexao=new Conexao().getConnection();
            VendaDAO vendDao=new VendaDAO(conexao);
            vendDao.updateStatusPronto(idV);
            conexao.close();
        } catch (SQLException ex) {
            System.out.println("ex attStatusPronto\n"+ex.getMessage());
        }
    }
    
    public ArrayList<Venda> getAnyPedidoAberto() {
        ArrayList<Venda> alVenda = new ArrayList<>();
        try {
            Connection conexao = new Conexao().getConnection();
            VendaDAO vendDao = new VendaDAO(conexao);
            alVenda = vendDao.selectAnyAberto();
            conexao.close();
        } catch (SQLException ex) {
            System.out.println("ex getAnyPedidoAberto\n"+ex.getMessage());
        }
        return alVenda;
    }
    
    public ArrayList<Venda> getAnyVendido() {
        ArrayList<Venda> alVenda = new ArrayList<>();
        try {
            Connection conexao = new Conexao().getConnection();
            VendaDAO vendDao = new VendaDAO(conexao);
            alVenda = vendDao.selectAnyVendido();
            conexao.close();
        } catch (SQLException ex) {
            System.out.println("ex getAnyPedidoAberto\n"+ex.getMessage());
        }return alVenda;
    }
    
    public ArrayList<Venda> getVendasP(ArrayList<Pedido> pediAL) {
        try {
            Connection conexao = new Conexao().getConnection();
            VendaDAO vendDao = new VendaDAO(conexao);
            ArrayList<Venda> vendAL=new ArrayList<>();
            for(Pedido p:pediAL){
                vendAL.add(vendDao.selectIdP(p.getIdPedido()));
            }
            conexao.close();
            return vendAL;
        } catch (SQLException ex) {
            System.out.println("ex getVendasP\n"+ex.getMessage());
            return null;
        }
    }
    
    public ArrayList<MetodoPagamento> getAnyMP() {
        ArrayList<MetodoPagamento> mpAL;
        try {
            Connection conexao = new Conexao().getConnection();
            VendaDAO vendDao = new VendaDAO(conexao);
            mpAL=vendDao.selectAnyMP();
            conexao.close();
            return mpAL;
        } catch (SQLException ex) {
            System.out.println("ex getAnyMP\n"+ex.getMessage());
            return null;
        }
    }
    
    public void setMetodoPagamento(javax.swing.JTable jT){
        ArrayList<MetodoPagamento> mpAL=getAnyMP();
        preencheTabelaMP(mpAL, jT);
    }
    
    public void setPedidoPendente(javax.swing.JTable jT){
        ArrayList<Venda> vendAL=getAnyPedidoAberto();
        for (Venda venda : vendAL) {
            preencheTabelaCozinha(venda, jT);
        }
    }
    
    public void preencheTabelaMP(ArrayList<MetodoPagamento> mpAL, javax.swing.JTable jT){
        DefaultTableModel dtmPedidos=(DefaultTableModel) jT.getModel();
        for(MetodoPagamento mp:mpAL){
            Object[] dados={mp.getCodMetodo(), mp.getDescMetodo()};
            dtmPedidos.addRow(dados);
        }
    }
    
    public void preencheTabelaO(Venda v, javax.swing.JTable jT){
        VendaController vc=new VendaController();
        PedidoController pc=new PedidoController();
        DefaultTableModel dtmPedidos=(DefaultTableModel) jT.getModel();
        Object[] dados={v.getIdPedido(), pc.getNomesDoces(v.getIdPedido()),
            v.getValorBruto(),
            vc.consultaVendaP(v.getIdPedido()).getStatus()};
        dtmPedidos.addRow(dados);
    }
    
    public void preencheTabelaCozinha(Venda v, javax.swing.JTable jT){
        VendaController vc=new VendaController();
        PedidoController pc=new PedidoController();
        DefaultTableModel dtmPedidos=(DefaultTableModel) jT.getModel();
        Object[] dados={v.getIdPedido(), pc.getNomesDoces(v.getIdPedido()),
            pc.getQuantDoce(v.getIdPedido()),
            vc.consultaVendaP(v.getIdPedido()).getStatus()};
        dtmPedidos.addRow(dados);
    }
    
    public Venda consultaVenda(int idV) {
        Venda vend = new Venda(idV);
        try {
            Connection conexao = new Conexao().getConnection();
            VendaDAO vendDao = new VendaDAO(conexao);
            vend = vendDao.selectId(idV);
            conexao.close();
        } catch (SQLException ex) {
            System.out.println("ex consultaVenda\n"+ex.getMessage());
        }
        return vend;
    }
    
    public Venda consultaVendaP(int idP) {
        Venda vend = new Venda();
        vend.setIdPedido(idP);
        try {
            Connection conexao = new Conexao().getConnection();
            VendaDAO vendDao = new VendaDAO(conexao);
            vend=vendDao.selectIdP(idP);
            conexao.close();
        } catch (SQLException ex) {
            System.out.println("ex consultaVendaP\n"+ex.getMessage());
        }
        return vend;
    }
    
    public ArrayList<Venda> consultaVendaC(int idC) {
        ArrayList<Venda> vendAL;
        try {
            Connection conexao = new Conexao().getConnection();
            VendaDAO vendDao = new VendaDAO(conexao);
            vendAL= vendDao.selectIdC(idC);
            conexao.close();
            return vendAL;
        } catch (SQLException ex) {
            System.out.println("ex consultaVendaD\n"+ex.getMessage());
            return null;
        }
    }
    
    public void finalizaPedido(int idP){
        try {
            Connection conexao=new Conexao().getConnection();
            VendaDAO vendDao=new VendaDAO(conexao);
            vendDao.updateStatusPronto(idP);
            conexao.close();
        } catch (SQLException ex) {
            System.out.println("ex finalizaPedido\n"+ex.getMessage());
        }
    }
    
    public void finalizaVenda(int idV, Usuario user){
        try {
            Connection conexao=new Conexao().getConnection();
            VendaDAO vendDao=new VendaDAO(conexao);
            vendDao.updateStatusConcluido(idV, user);
            conexao.close();
        } catch (SQLException ex) {
            System.out.println("ex finalizaVenda\n"+ex.getMessage());
        }
    }
    
    public void attClienteVenda(int idP, int idC) {
        try {
            Connection conexao = new Conexao().getConnection();
            VendaDAO vendDao = new VendaDAO(conexao);
            vendDao.updateC(idP, idC);
            conexao.close();
        } catch (SQLException ex) {
            System.out.println("ex attClienteVenda\n"+ex.getMessage());
        }
    }
    
    public void cancelaVenda(int idP){
        try {
            Connection conexao=new Conexao().getConnection();
            VendaDAO vendDao=new VendaDAO(conexao);
            vendDao.cancelaP(idP);
            conexao.close();
        } catch (SQLException ex) {
            System.out.println("ex cancelaVenda\n"+ex.getMessage());
        }
    }
    
    public boolean pedidoPronto(int idP) {
        try {
            Connection conexao = new Conexao().getConnection();
            VendaDAO clientDao = new VendaDAO(conexao);
            if (clientDao.pronto(idP)) {
                conexao.close();
                return true;
            } else {
                conexao.close();
                return false;
            }
        } catch (SQLException ex) {
            System.out.println("ex pedidoPronto\n"+ex.getMessage());
            return false;
        }
    }
    
    public boolean clienteNull(int idV){
        return consultaVenda(idV).getIdCliente() == 0;
    }
    
    public ArrayList<Venda> getAnyVenda() {
        ArrayList<Venda> vendAL;
        try {
            Connection conexao = new Conexao().getConnection();
            VendaDAO clientDao = new VendaDAO(conexao);
            vendAL= clientDao.selectAny();
            conexao.close();
            return vendAL;
        } catch (SQLException ex) {
            System.out.println("ex getAnyVenda\n"+ex.getMessage());
            return null;
        }
    }
    
    public double getTotalPagar(double bruto, double desconto){
        return bruto-desconto;
    }
}
