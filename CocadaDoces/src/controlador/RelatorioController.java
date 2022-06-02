package controlador;

import dao.Conexao;
import dao.RelatorioDAO;
import java.sql.Connection;
import java.sql.Date;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import modelos.Doce;
import modelos.MaisVendidos;
import modelos.VendasFaturamento;

public class RelatorioController {
    public RelatorioController() {
    }
    
    public ArrayList<MaisVendidos> setQuantDoceVendido(int quantRel) {
        ArrayList<MaisVendidos> relAL;
        try {
            Connection conexao = new Conexao().getConnection();
            RelatorioDAO relDao = new RelatorioDAO(conexao);
            relAL= relDao.selectDocesVendidosQuant(quantRel);
            conexao.close();
            return relAL;
        } catch (SQLException ex) {
            System.out.println("ex setQuantDoceVendido\n"+ex.getMessage());
            return null;
        }
    }
    
    public ArrayList<VendasFaturamento> setVendasUsuario() {
        ArrayList<VendasFaturamento> relAL;
        try {
            Connection conexao = new Conexao().getConnection();
            RelatorioDAO relDao = new RelatorioDAO(conexao);
            relAL= relDao.selectVendasUsuarioAny();
            conexao.close();
            return relAL;
        } catch (SQLException ex) {
            System.out.println("ex setVendasUsuario\n"+ex.getMessage());
            return null;
        }
    }
    
    public VendasFaturamento setVendasPorUsuario(int idU) {
        VendasFaturamento rel;
        try {
            Connection conexao = new Conexao().getConnection();
            RelatorioDAO relDao = new RelatorioDAO(conexao);
            rel= relDao.selectVendasUsuarioU(idU);
            conexao.close();
            return rel;
        } catch (SQLException ex) {
            System.out.println("ex setVendasPorUsuario\n"+ex.getMessage());
            return null;
        }
    }
    
    public ArrayList<MaisVendidos> setQuantDoceVendidoPeriodo(int quantRel, Date dataI, Date dataF) {
        ArrayList<MaisVendidos> relAL;
        try {
            Connection conexao = new Conexao().getConnection();
            RelatorioDAO relDao = new RelatorioDAO(conexao);
            relAL=relDao.selectDocesVendidosQuantPeriodo(quantRel, dataI, dataF);
            conexao.close();
            return relAL;
        } catch (SQLException ex) {
            System.out.println("ex setQuantDoceVendidoPeriodo\n"+ex.getMessage());
            return null;
        }
    }
    
    public MaisVendidos setDoceVendido(int idD) {
        MaisVendidos rel;
        try {
            Connection conexao = new Conexao().getConnection();
            RelatorioDAO relDao = new RelatorioDAO(conexao);
            rel=relDao.selectDoceVendido(idD);
            conexao.close();
            return rel;
        } catch (SQLException ex) {
            System.out.println("ex setDoceVendido\n"+ex.getMessage());
            return null;
        }
    }
    
    public MaisVendidos setVendasUsuario(int idD) {
        MaisVendidos rel;
        try {
            Connection conexao = new Conexao().getConnection();
            RelatorioDAO relDao = new RelatorioDAO(conexao);
            rel=relDao.selectDoceVendido(idD);
            conexao.close();
            return rel;
        } catch (SQLException ex) {
            System.out.println("ex setDoceVendido\n"+ex.getMessage());
            return null;
        }
    }
    
    public void preencheTabelaMV(MaisVendidos rel, javax.swing.JTable jT) {
        DefaultTableModel dtmDoces = (DefaultTableModel) jT.getModel();
        DoceController dc = new DoceController();
        Object[] dados = {rel.getIdDoce(), dc.consultaDoceI(rel.getIdDoce()).getNomedoce(), rel.getQntDoce(), getLucro(rel.getIdDoce(), rel.getQntDoce())};
        dtmDoces.addRow(dados);
    }
    
    public void preencheTabelaVF(VendasFaturamento rel, javax.swing.JTable jT) {
        DefaultTableModel dtmDoces = (DefaultTableModel) jT.getModel();
        UsuarioController uc = new UsuarioController();
        Object[] dados = {rel.getIdUsuario(), uc.consultaUsuarioI(rel.getIdUsuario()).getUsuario(), rel.getQntDoces(), rel.getValorVendido(), rel.getValorDesconto()};
        dtmDoces.addRow(dados);
    }
    
    public double getLucro(int idD, int quantD){
        DoceController dc = new DoceController();
        Doce doc=dc.consultaDoceI(idD);
        return (doc.getPvenda()*quantD)-doc.getPcusto()*quantD;
    }
}
