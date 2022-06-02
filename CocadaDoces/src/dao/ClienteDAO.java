package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import modelos.Cliente;
import modelos.Fidelidade;

public class ClienteDAO {

    private final Connection connection;

    public ClienteDAO(Connection connection) {
        this.connection = connection;
    }

    public Cliente insert(Cliente client) throws SQLException {
        String sql = "insert into clientes (cpf, nome_cliente, telefone) values (?, ?, ?)";
        PreparedStatement statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
        statement.setLong(1, client.getCpf());
        statement.setString(2, client.getNome());
        statement.setString(3, client.getTelefone());
        statement.execute();
        ResultSet resultSet = statement.getGeneratedKeys();
        if (resultSet.next()) {
            int id = resultSet.getInt("id_cliente");
            client.setIdCliente(id);
            System.out.println("Cliente de ID " + id + " criado com sucesso!");
        }
        insertFidelidade(client);
        client.setFid(selectFidelidade(client.getIdCliente()));
        return client;
    }

    public void insertFidelidade(Cliente c) throws SQLException {
        String sql = "insert into fidelidades (cod_fidelidade) values (?)";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setInt(1, c.getIdCliente());
        statement.execute();
    }

    public Fidelidade selectFidelidade(int codF) throws SQLException, IndexOutOfBoundsException {
        String sql = "select * from fidelidades where cod_fidelidade=?";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setInt(1, codF);
        ResultSet resultSet = statement.executeQuery();
        resultSet.next();
        int pontos = resultSet.getInt("pontos");
        int bonus = resultSet.getInt("bonus");
        int resgates = resultSet.getInt("resgates");
        Fidelidade fid = new Fidelidade(codF, pontos, bonus, resgates);
        return fid;
    }

    public void update(Cliente client) throws SQLException {
        String sql = "update clientes set cpf=?, nome_cliente=?, telefone=? where id_cliente=?";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setLong(1, client.getCpf());
        statement.setString(2, client.getNome());
        statement.setString(3, client.getTelefone());
        statement.setInt(4, client.getIdCliente());
        client.setFid(selectFidelidade(client.getIdCliente()));
        statement.execute();
    }
    
    public void updateFid(Fidelidade fid) throws SQLException {
        String sql = "update fidelidades set pontos=?, bonus=?, resgates=? where cod_fidelidade=?";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setInt(1, fid.getPontos());
        statement.setInt(2, fid.getBonus());
        statement.setInt(3, fid.getResgates());
        statement.setInt(4, fid.getCodFidelidade());
        statement.execute();
    }

    public void delete(Cliente client) throws SQLException {
        String sql = "delete from clientes where id_cliente=?";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setInt(1, client.getIdCliente());
        statement.execute();
    }

    public ArrayList<Cliente> returnSelect(PreparedStatement statement) throws SQLException {
        ArrayList<Cliente> clientList = new ArrayList();
        ResultSet resultSet = statement.executeQuery();
        int id;
        long cpf;
        String nome, telefone;
        Fidelidade fid;
        while (resultSet.next()) {
            id = resultSet.getInt("id_cliente");
            cpf = resultSet.getLong("cpf");
            nome = resultSet.getString("nome_cliente");
            telefone = resultSet.getString("telefone");
            fid = selectFidelidade(id);
            Cliente clientX = new Cliente(id, cpf, nome, telefone, fid);
            clientList.add(clientX);
        }
        return clientList;
    }

    public ArrayList<Cliente> selectAny() throws SQLException {
        String sql = "select * from clientes order by id_cliente";
        PreparedStatement statement = connection.prepareStatement(sql);
        return returnSelect(statement);
    }

    public Cliente selectId(int id) throws SQLException, IndexOutOfBoundsException {
        String sql = "select * from clientes where id_cliente=?";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setInt(1, id);
        return returnSelect(statement).get(0);
    }

    public ArrayList<Cliente> selectNome(String nome) throws SQLException {
        //String sql="select * from selectclientesnome(?)";
        String sql = "select * from clientes cl where cl.nome_cliente like '%'||?||'%' order by id_cliente";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, nome);
        return returnSelect(statement);
    }

    public Cliente selectCpf(long cpf) throws SQLException {
        String sql = "select * from clientes where cpf=?";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setLong(1, cpf);
        return returnSelect(statement).get(0);
    }

    public ArrayList<Cliente> selectTelefone(String telefone) throws SQLException {
        String sql = "select * from clientes cl where cl.telefone like '%'||?||'%' order by id_cliente";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, telefone);
        return returnSelect(statement);
    }

    public boolean novo(Cliente client) throws SQLException {
        String sql = "select * from clientes where cpf=?";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setLong(1, client.getCpf());
        ResultSet resultSet = statement.executeQuery();
        if (resultSet.isBeforeFirst()) {
            System.out.println("Existente");
            return false;
        } else {
            System.out.println("Novo");
            return true;
        }
    }
}
