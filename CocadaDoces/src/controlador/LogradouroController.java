package controlador;

import dao.LogradouroDAO;
import dao.Conexao;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import modelos.Logradouro;
import telas.CadastroLogradouro;
import telas.EditorLogradouro;

public class LogradouroController {
    private EditorLogradouro view;

    public LogradouroController(EditorLogradouro view) {
        this.view = view;
    }
    public LogradouroController(CadastroLogradouro view) {
    }
    public LogradouroController() {
    }

    public void preencheTabelaO(Logradouro l, javax.swing.JTable jT) {
        DefaultTableModel dtmEnderecos = (DefaultTableModel) jT.getModel();
        Object[] dados = {l.getIdLogradouro(), l.getEndereco(), l.getNum(),
            l.getComplemento(), l.getBairro(), l.getCep(), l.getCidade(),
            l.getUf(), l.getPais(), l.getIdCliente()};
        dtmEnderecos.addRow(dados);
    }

    public void salvaLogradouro(String end, String n, String comp, String bairro, String cep, String cidade, String uf, String pais, int idC) {
        Logradouro log = new Logradouro(end, n, comp, bairro, cep, cidade, uf, pais, idC);
        try {
            Connection conexao = new Conexao().getConnection();
            LogradouroDAO logDao = new LogradouroDAO(conexao);
            logDao.insert(log);
            conexao.close();
        } catch (SQLException ex) {
            System.out.println("ex salvaLogradouro\n"+ex.getMessage());
        }
    }
    
    public void updateLogradouro(Logradouro d){
        try {
            Connection conexao=new Conexao().getConnection();
            LogradouroDAO docDao=new LogradouroDAO(conexao);
            docDao.update(d);
            conexao.close();
        } catch (SQLException ex) {
            System.out.println("ex updateLogradouro\n"+ex.getMessage());
        }
    }

    public Logradouro consultaLogradouroIL(int id) {
        Logradouro doc = new Logradouro();
        try {
            Connection conexao = new Conexao().getConnection();
            LogradouroDAO docDao = new LogradouroDAO(conexao);
            doc = docDao.selectIdL(id);
            conexao.close();
        } catch (SQLException ex) {
            System.out.println("ex consultaLogradouroIL\n"+ex.getMessage());
        }
        return doc;
    }
    
    public ArrayList<Logradouro> consultaLogradouroIC(int id) {
        ArrayList<Logradouro> logAL;
        try {
            Connection conexao = new Conexao().getConnection();
            LogradouroDAO docDao = new LogradouroDAO(conexao);
            logAL=docDao.selectIdC(id);
            conexao.close();
            return logAL;
        } catch (SQLException ex) {
            System.out.println("ex consultaLogradouroIC\n"+ex.getMessage());
            return null;
        }
    }

    public ArrayList<Logradouro> consultaLogradouroEnd(String end) {
        ArrayList<Logradouro> doc;
        try {
            Connection conexao = new Conexao().getConnection();
            LogradouroDAO docDao = new LogradouroDAO(conexao);
            doc = docDao.selectEndereco(end);
            conexao.close();
        } catch (SQLException ex) {
            System.out.println("ex consultaLogradouroEnd\n"+ex.getMessage());
            return null;
        }
        return doc;
    }

    public ArrayList<Logradouro> consultaLogradouroB(String bairro) {
        ArrayList<Logradouro> doc;
        try {
            Connection conexao = new Conexao().getConnection();
            LogradouroDAO docDao = new LogradouroDAO(conexao);
            doc = docDao.selectBairro(bairro);
            conexao.close();
        } catch (SQLException ex) {
            System.out.println("ex consultaLogradouroB\n"+ex.getMessage());
            return null;
        }
        return doc;
    }
    
    public ArrayList<Logradouro> consultaLogradouroP(String pais) {
        ArrayList<Logradouro> doc;
        try {
            Connection conexao = new Conexao().getConnection();
            LogradouroDAO docDao = new LogradouroDAO(conexao);
            doc = docDao.selectPais(pais);
            conexao.close();
        } catch (SQLException ex) {
            System.out.println("ex consultaLogradouroP\n"+ex.getMessage());
            return null;
        }
        return doc;
    }
    
    public ArrayList<Logradouro> consultaLogradouroCep(String cep) {
        ArrayList<Logradouro> doc;
        try {
            Connection conexao = new Conexao().getConnection();
            LogradouroDAO docDao = new LogradouroDAO(conexao);
            doc = docDao.selectCep(cep);
            conexao.close();
        } catch (SQLException ex) {
            System.out.println("ex consultaLogradouroCep\n"+ex.getMessage());
            return null;
        }
        return doc;
    }
    
    public ArrayList<Logradouro> consultaLogradouroCidade(String cid) {
        ArrayList<Logradouro> doc;
        try {
            Connection conexao = new Conexao().getConnection();
            LogradouroDAO docDao = new LogradouroDAO(conexao);
            doc = docDao.selectCidade(cid);
            conexao.close();
        } catch (SQLException ex) {
            System.out.println("ex consultaLogradouroCidade\n"+ex.getMessage());
            return null;
        }
        return doc;
    }
    
    public boolean existeLogradouro(int id) {
        Logradouro doc = new Logradouro(id);
        try {
            Connection conexao = new Conexao().getConnection();
            LogradouroDAO logDao = new LogradouroDAO(conexao);
            if (logDao.novo(doc)) {
                conexao.close();
                return false;
            } else {
                doc.setIdLogradouro(0);
                conexao.close();
                return true;
            }
        } catch (SQLException ex) {
            System.out.println("ex existeLogradouro\n"+ex.getMessage());
            return false;
        }
    }
    
    public String imprimeLog(Logradouro log){
        StringBuilder sb=new StringBuilder();
        sb.append("Endereco: ").append(log.getEndereco());
        sb.append("\nNum: ").append(log.getNum());
        sb.append("\nComplemento: ").append(log.getComplemento());
        sb.append("\nBairro: ").append(log.getBairro());
        sb.append("\nCEP: ").append(log.getCep());
        sb.append("\nCidade: ").append(log.getCidade());
        sb.append("\nUF: ").append(log.getUf());
        sb.append("\nPais: ").append(log.getPais()).append("\n");
        return sb.toString();
    }
}
