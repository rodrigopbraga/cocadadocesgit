package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import modelos.Pedido;

public class PedidoDAO {
    private final Connection connection;

    public PedidoDAO(Connection connection) {
        this.connection = connection;
    }
    
    public void beginDao() throws SQLException{
        String sql="begin";
        PreparedStatement statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
        statement.execute();
    }
    public void rollbackDao() throws SQLException{
        String sql="rollback";
        PreparedStatement statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
        statement.execute();
    }
    public void commitDao() throws SQLException{
        String sql="commit";
        PreparedStatement statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
        statement.execute();
    }
    
    public Pedido insert(Pedido pedi) throws SQLException{
        String sql="insert into pedidos (id_doce) values (?)";
        PreparedStatement statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
        statement.setInt(1, pedi.getIdDoce());
        statement.execute();
        ResultSet resultSet=statement.getGeneratedKeys();
        resultSet.next();
        int id=resultSet.getInt("id_pedido");
        pedi.setIdPedido(id);
        System.out.println("Pedido de ID "+id+" criado com sucesso!");
        return pedi;
    }
    
    public Pedido insertPedidoExistente(int idP, int idD) throws SQLException{
        String sql="insert into pedidos (id_pedido, id_doce) values (?, ?)";
        PreparedStatement statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
        statement.setInt(1, idP);
        statement.setInt(2, idD);
        statement.execute();
        Pedido pedi = new Pedido(idP, idD, 1);
        System.out.println("Pedido de ID "+idP+" atualizado com sucesso!");
        return pedi;
    }
    
    public void update(Pedido pedi) throws SQLException{
        String sql="update pedidos set quant_doce=? where id_pedido=? and id_doce=?";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setInt(1, pedi.getQntDoce());
        statement.setInt(2, pedi.getIdPedido());
        statement.setInt(3, pedi.getIdDoce());
        statement.execute();
    }
    
    public void deleteP(Pedido pedi) throws SQLException{
        String sql="delete from pedidos where id_pedido=?";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setInt(1, pedi.getIdPedido());
        statement.execute();
    }
    
    public void deleteD(Pedido pedi) throws SQLException{
        String sql="delete from pedidos where id_pedido=? and id_doce=?";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setInt(1, pedi.getIdPedido());
        statement.setInt(2, pedi.getIdDoce());
        statement.execute();
    }
    
    public ArrayList<Pedido> returnSelect(PreparedStatement statement) throws SQLException{
        ArrayList<Pedido> pediList=new ArrayList();
        ResultSet resultSet = statement.executeQuery();
        int idP, idD, quantD;
        while(resultSet.next()){
            idP=resultSet.getInt("id_pedido");
            idD=resultSet.getInt("id_doce");
            quantD=resultSet.getInt("quant_doce");
            Pedido pediX=new Pedido(idP, idD, quantD);
            pediList.add(pediX);
        }
        return pediList;
    }

    public ArrayList<Pedido> selectAny() throws SQLException{
        String sql="select * from pedidos order by id_pedido";
        //String sql="select distinct on (id_pedido) * from pedidos order by id_pedido";
        PreparedStatement statement = connection.prepareStatement(sql);
        return returnSelect(statement);
    }
    
    public ArrayList<Pedido> selectIdP(int idP) throws SQLException, IndexOutOfBoundsException{
        String sql="select * from pedidos where id_pedido=?";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setInt(1, idP);
        return returnSelect(statement);
    }
    
    public Pedido selectIdD(int idP, int idD) throws SQLException, IndexOutOfBoundsException{
        String sql="select * from pedidos where id_pedido=? and id_doce=?";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setInt(1, idP);
        statement.setInt(2, idD);
        return returnSelect(statement).get(0);
    }
    public ArrayList<Pedido> selectIdDAny(int idD) throws SQLException, IndexOutOfBoundsException{
        String sql="select * from pedidos where id_doce=?";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setInt(1, idD);
        return returnSelect(statement);
    }
    
    /*public double getValorBruto(int idP) throws SQLException, IndexOutOfBoundsException{
    String sql="select * from getvalorbruto(?)";
    PreparedStatement statement = connection.prepareStatement(sql);
    statement.setInt(1, idP);
    ResultSet resultSet=statement.executeQuery();
    
    double vb=0;
    while(resultSet.next()){
    vb=resultSet.getDouble("getvalorbruto");
    }
    return vb;
    }*/
    
    public boolean novoP(int idP) throws SQLException{
        String sql="select * from pedidos where id_pedido=?";
        PreparedStatement statement=connection.prepareStatement(sql);
        statement.setInt(1, idP);
        ResultSet resultSet=statement.executeQuery();
        if(resultSet.isBeforeFirst()){
            return false;
        }else{
            return true;
        }
    }
    public boolean novoD(Pedido pedi) throws SQLException{
        String sql="select * from pedidos where id_doce=? and id_pedido=?";
        PreparedStatement statement=connection.prepareStatement(sql);
        statement.setInt(1, pedi.getIdDoce());
        statement.setInt(2, pedi.getIdPedido());
        ResultSet resultSet=statement.executeQuery();
        if(resultSet.isBeforeFirst()){
            return false;
        }else{
            return true;
        }
    }
}