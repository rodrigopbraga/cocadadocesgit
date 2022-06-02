package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import modelos.Doce;

public class DoceDAO {
    private final Connection connection;

    public DoceDAO(Connection connection) {
        this.connection = connection;
    }
    
    public Doce insert(Doce doc) throws SQLException{
        String sql="insert into doces (nome_doce, ingredientes, custo_medio, preco_venda) values (?, ?, ?, ?)";
        PreparedStatement statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
        statement.setString(1, doc.getNomedoce());
        statement.setString(2, doc.getIngredientes());
        statement.setDouble(3, doc.getPcusto());
        statement.setDouble(4, doc.getPvenda());
        statement.execute();
        ResultSet resultSet=statement.getGeneratedKeys();
        if(resultSet.next()){
            int id=resultSet.getInt("id_doce");
            doc.setId(id);
            System.out.println("Doce de ID "+id+" criado com sucesso!");
        }
        return doc;
    }
    
    public void update(Doce doc) throws SQLException{
        String sql="update doces set nome_doce=?, ingredientes=?, custo_medio=?, preco_venda=? where id_doce=?";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, doc.getNomedoce());
        statement.setString(2, doc.getIngredientes());
        statement.setDouble(3, doc.getPcusto());
        statement.setDouble(4, doc.getPvenda());
        statement.setInt(5, doc.getId());
        statement.execute();
    }
    
    public void delete(Doce doc) throws SQLException{
        String sql="delete from doces where id_doce=?";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setInt(1, doc.getId());
        statement.execute();
    }
    
    public ArrayList<Doce> returnSelect(PreparedStatement statement) throws SQLException{
        ArrayList<Doce> docList=new ArrayList();
        ResultSet resultSet = statement.executeQuery();
        int id;
        double custo_medio, preco_venda;
        String nome_doce, ingredientes;
        while(resultSet.next()){
            id=resultSet.getInt("id_doce");
            nome_doce=resultSet.getString("nome_doce");
            ingredientes=resultSet.getString("ingredientes");
            custo_medio=resultSet.getDouble("custo_medio");
            preco_venda=resultSet.getDouble("preco_venda");
            Doce docX=new Doce(id, nome_doce, ingredientes, custo_medio, preco_venda);
            docList.add(docX);
        }
        return docList;
    }
    
    public ArrayList<Doce> selectAny() throws SQLException{
        String sql="select * from doces order by id_doce";
        PreparedStatement statement = connection.prepareStatement(sql);
        return returnSelect(statement);
    }
    
    public Doce selectId(int id) throws SQLException, IndexOutOfBoundsException{
        String sql="select * from doces where id_doce=?";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setInt(1, id);
        return returnSelect(statement).get(0);
    }
    public ArrayList<Doce> selectNome(String nome) throws SQLException{
        String sql="select * from doces dc where dc.nome_doce like '%'||?||'%' order by id_doce";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, nome);
        return returnSelect(statement);
    }
    public ArrayList<Doce> selectIngrediente(String ing) throws SQLException{
        String sql="select * from doces dc where dc.ingredientes like '%'||?||'%' order by id_doce";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, ing);
        return returnSelect(statement);
    }
    public boolean novo(Doce doc) throws SQLException{
        String sql="select * from doces where nome_doce=?";
        PreparedStatement statement=connection.prepareStatement(sql);
        statement.setString(1, doc.getNomedoce());
        ResultSet resultSet=statement.executeQuery();
        if(resultSet.isBeforeFirst()){
            return false;
        }else{
            return true;
        }
    }
    public boolean exist(Doce doc) throws SQLException{
        String sql="select * from doces where id_doce=?";
        PreparedStatement statement=connection.prepareStatement(sql);
        statement.setInt(1, doc.getId());
        ResultSet resultSet=statement.executeQuery();
        if(resultSet.isBeforeFirst()){
            return true;
        }else{
            return false;
        }
    }
}