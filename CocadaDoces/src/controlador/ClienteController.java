package controlador;

import dao.ClienteDAO;
import dao.Conexao;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import modelos.Cliente;
import modelos.Fidelidade;
import telas.EditorCliente;

public class ClienteController {
    private EditorCliente view;

    public ClienteController(EditorCliente view) {
        this.view = view;
    }

    public ClienteController() {
    }

    public void preencheTabelaO(Cliente c, javax.swing.JTable jT) {
        DefaultTableModel dtmClientes = (DefaultTableModel) jT.getModel();
        Object[] dados = {c.getIdCliente(),
            c.getNome(),
            c.getCpf(),
            c.getTelefone(),
            c.getFid().getPontos(),
            c.getFid().getBonus()};
        dtmClientes.addRow(dados);
    }

    public Cliente salvaCliente(long cpf, String nome, String telefone) {
        Cliente client = new Cliente(cpf, nome, telefone);
        try {
            Connection conexao = new Conexao().getConnection();
            ClienteDAO clientDao = new ClienteDAO(conexao);
            client=clientDao.insert(client);
            conexao.close();
        } catch (SQLException ex) {
            System.out.println("ex salvaCliente\n"+ex.getMessage());
        }
        return client;
    }
    
    public boolean novo(long cpf) throws SQLException{
        boolean b = false;
        try {
            Cliente client = new Cliente(cpf);
            Connection conexao = new Conexao().getConnection();
            ClienteDAO clientDao = new ClienteDAO(conexao);
            b = clientDao.novo(client);
            conexao.close();
        } catch (SQLException ex) {
            System.out.println("ex novo\n"+ex.getMessage());
        }
        return b;
    }

    public void updateCliente(Cliente c) {
        try {
            Connection conexao = new Conexao().getConnection();
            ClienteDAO clientDao = new ClienteDAO(conexao);
            clientDao.update(c);
            conexao.close();
        } catch (SQLException ex) {
            System.out.println("ex updateCliente\n"+ex.getMessage());
        }
    }
    
    public void attFidelidade(Fidelidade fid) {
        try {
            Connection conexao = new Conexao().getConnection();
            ClienteDAO clientDao = new ClienteDAO(conexao);
            clientDao.updateFid(fid);
            conexao.close();
        } catch (SQLException ex) {
            System.out.println("ex attFidelidade\n"+ex.getMessage());
        }
    }

    public Cliente consultaClienteI(int id) {
        Cliente client = new Cliente();
        try {
            Connection conexao = new Conexao().getConnection();
            ClienteDAO clientDao = new ClienteDAO(conexao);
            client = clientDao.selectId(id);
            conexao.close();
        } catch (SQLException ex) {
            System.out.println("ex consultaClienteI\n"+ex.getMessage());
        }
        return client;
    }

    public ArrayList<Cliente> consultaClienteN(String nome) {
        ArrayList<Cliente> client = new ArrayList<>();
        try {
            Connection conexao = new Conexao().getConnection();
            ClienteDAO clientDao = new ClienteDAO(conexao);
            client = clientDao.selectNome(nome);
            conexao.close();
        } catch (SQLException ex) {
            System.out.println("ex consultaClienteN\n"+ex.getMessage());
        }
        return client;
    }

    public Cliente consultaClienteC(long cpf) {
        Cliente client = new Cliente(cpf);
        try {
            Connection conexao = new Conexao().getConnection();
            ClienteDAO clientDao = new ClienteDAO(conexao);
            client = clientDao.selectCpf(cpf);
            conexao.close();
        } catch (SQLException | IndexOutOfBoundsException ex) {
            System.out.println("ex consultaClienteC\n"+ex.getMessage());
            client.setIdCliente(0);
        }
        return client;
    }
    
    /*public Fidelidade getFidelidade(Cliente client) {
    try {
    Connection conexao = new Conexao().getConnection();
    ClienteDAO clientDao = new ClienteDAO(conexao);
    return clientDao.selectFidelidade(client.getIdCliente());
    } catch (SQLException | IndexOutOfBoundsException ex) {
    Logger.getLogger(EditorCliente.class.getName()).log(Level.SEVERE, null, ex);
    System.out.println("ex getFidelidade\n"+ex.getMessage());
    return null;
    }
    }*/

    public ArrayList<Cliente> consultaClienteT(String telefone) {
        ArrayList<Cliente> client = new ArrayList<>();
        try {
            Connection conexao = new Conexao().getConnection();
            ClienteDAO clientDao = new ClienteDAO(conexao);
            client = clientDao.selectTelefone(telefone);
            conexao.close();
        } catch (SQLException ex) {
            System.out.println("ex consultaClienteT\n"+ex.getMessage());
        }
        return client;
    }

    public boolean existeCliente(long cpf) {
        Cliente client = new Cliente(cpf);
        try {
            Connection conexao = new Conexao().getConnection();
            ClienteDAO clientDao = new ClienteDAO(conexao);
            if (clientDao.novo(client)) {
                conexao.close();
                return false;
            } else {
                client.setIdCliente(0);
                conexao.close();
                return true;
            }
        } catch (SQLException ex) {
            System.out.println("ex existeCliente\n"+ex.getMessage());
            return false;
        }
    }
}
