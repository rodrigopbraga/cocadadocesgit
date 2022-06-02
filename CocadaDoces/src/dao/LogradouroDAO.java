package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import modelos.Logradouro;

public class LogradouroDAO {
    private final Connection connection;

    public LogradouroDAO(Connection connection) {
        this.connection = connection;
    }
    
    public Logradouro insert(Logradouro doc) throws SQLException{
        String sql="insert into clientes_logradouros(id_cliente, endereco, num, complemento, bairro, cidade, uf, cep, pais) values (?, ?, ?, ?, ?, ?, ?, ?, ?)";
        PreparedStatement statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
        statement.setInt(1, doc.getIdCliente());
        statement.setString(2, doc.getEndereco());
        statement.setString(3, doc.getNum());
        statement.setString(4, doc.getComplemento());
        statement.setString(5, doc.getBairro());
        statement.setString(6, doc.getCidade());
        statement.setString(7, doc.getUf());
        statement.setString(8, doc.getCep());
        statement.setString(9, doc.getPais());
        statement.execute();
        ResultSet resultSet=statement.getGeneratedKeys();
        if(resultSet.next()){
            int id=resultSet.getInt("id_logradouro");
            doc.setIdLogradouro(id);
            System.out.println("Logradouro de ID "+id+" criado com sucesso!");
        }
        return doc;
    }
    
    public void update(Logradouro doc) throws SQLException{
        String sql="update clientes_logradouros set endereco=?, num=?, complemento=?, bairro=?, cidade=?, uf=?, cep=?, pais=? where id_logradouro=?";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, doc.getEndereco());
        statement.setString(2, doc.getNum());
        statement.setString(3, doc.getComplemento());
        statement.setString(4, doc.getBairro());
        statement.setString(5, doc.getCidade());
        statement.setString(6, doc.getUf());
        statement.setString(7, doc.getCep());
        statement.setString(8, doc.getPais());
        statement.setInt(9, doc.getIdLogradouro());
        statement.execute();
    }
    
    public void delete(Logradouro doc) throws SQLException{
        String sql="delete from clientes_logradouros where id_logradouro=?";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setInt(1, doc.getIdLogradouro());
        statement.execute();
    }
    

    public ArrayList<Logradouro> returnSelect(PreparedStatement statement) throws SQLException, IndexOutOfBoundsException{
        ArrayList<Logradouro> logList=new ArrayList();
        ResultSet resultSet = statement.executeQuery();
        int idL, idC;
        String endereco, num, complemento, bairro, cidade, uf, cep, pais;
        while(resultSet.next()){
            idL=resultSet.getInt("id_logradouro");
            idC=resultSet.getInt("id_cliente");
            endereco=resultSet.getString("endereco");
            num=resultSet.getString("num");
            complemento=resultSet.getString("complemento");
            bairro=resultSet.getString("bairro");
            cidade=resultSet.getString("cidade");
            uf=resultSet.getString("uf");
            cep=resultSet.getString("cep");
            pais=resultSet.getString("pais");
            Logradouro logX=new Logradouro(endereco, num, complemento, bairro,
                    cidade, uf, cep, pais, idL, idC);
            logList.add(logX);
        }
        return logList;
    }
    
    
    
    public ArrayList<Logradouro> selectAny() throws SQLException{
        String sql="select * from clientes_logradouros order by id_logradouro";
        PreparedStatement statement = connection.prepareStatement(sql);
        return returnSelect(statement);
    }
    
    
    public Logradouro selectIdL(int id) throws SQLException, IndexOutOfBoundsException{
        String sql="select * from clientes_logradouros where id_logradouro=?";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setInt(1, id);
        return returnSelect(statement).get(0);
    }
    public ArrayList<Logradouro> selectIdC(int id) throws SQLException, IndexOutOfBoundsException{
        String sql="select * from clientes_logradouros where id_cliente=? order by id_logradouro";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setInt(1, id);
        return returnSelect(statement);
    }
    public ArrayList<Logradouro> selectEndereco(String end) throws SQLException{
        String sql="select * from clientes_logradouros cllo where cllo.endereco like '%'||?||'%' order by id_logradouro";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, end);
        return returnSelect(statement);
    }
    public ArrayList<Logradouro> selectBairro(String bairro) throws SQLException{
        String sql="select * from clientes_logradouros cllo where cllo.bairro like '%'||?||'%' order by id_logradouro";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, bairro);
        return returnSelect(statement);
    }
    
    public ArrayList<Logradouro> selectCidade(String cid) throws SQLException{
        String sql="select * from clientes_logradouros cllo where cllo.cidade like '%'||?||'% order by id_logradouro";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, cid);
        return returnSelect(statement);
    }
    public ArrayList<Logradouro> selectPais(String pais) throws SQLException{
        String sql="select * from clientes_logradouros cllo where cllo.pais like '%'||pa||'%' order by id_logradouro";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, pais);
        return returnSelect(statement);
    }
    public ArrayList<Logradouro> selectCep(String cep) throws SQLException{
        String sql="select * from clientes_logradouros where cep=? order by id_logradouro";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, cep);
        return returnSelect(statement);
    }
    public boolean novo(Logradouro doc) throws SQLException{
        String sql="select * from clientes_logradouros where id_logradouro=?";
        PreparedStatement statement=connection.prepareStatement(sql);
        statement.setInt(1, doc.getIdLogradouro());
        ResultSet resultSet=statement.executeQuery();
        if(resultSet.isBeforeFirst()){
            return false;
        }else{
            return true;
        }
    }
}