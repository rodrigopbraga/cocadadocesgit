package dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import modelos.Venda;
import modelos.MetodoPagamento;
import modelos.Usuario;

public class VendaDAO {
    private final Connection connection;

    public VendaDAO(Connection connection) {
        this.connection = connection;
    }
    
    public void beginDao() throws SQLException{
        String sql="begin";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.execute();
    }
    public void rollbackDao() throws SQLException{
        String sql="rollback";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.execute();
    }
    public void commitDao() throws SQLException{
        String sql="commit";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.execute();
    }
    
    public Venda insert(Venda vend) throws SQLException{
        PreparedStatement statement=null;
        if(vend.getIdCliente()==0){
            String sql="insert into vendas (id_pedido, data, bruto, desconto, id_usuario) values (?, ?, ?, ?, ?)";
            statement = connection.prepareStatement(sql);
            statement.setInt(1, vend.getIdPedido());
            statement.setDate(2, vend.getDataVenda());
            statement.setDouble(3, vend.getValorBruto());
            statement.setDouble(4, vend.getDesconto());
            statement.setInt(5, vend.getIdUsuario());
        }else{
            String sql="insert into vendas (id_pedido, id_cliente, data, bruto, desconto, id_usuario) values (?, ?, ?, ?, ?, ?)";
            statement = connection.prepareStatement(sql);
            statement.setInt(1, vend.getIdPedido());
            statement.setInt(2, vend.getIdCliente());
            statement.setDate(3, vend.getDataVenda());
            statement.setDouble(4, vend.getValorBruto());
            statement.setDouble(5, vend.getDesconto());
            statement.setInt(6, vend.getIdUsuario());
        }
        statement.execute();
        ResultSet resultSet=statement.getGeneratedKeys();
        if(resultSet.next()){
            int id=resultSet.getInt("id_venda");
            vend.setIdVenda(id);
            System.out.println("Venda de ID "+id+" efetuada com sucesso!");
        }
        return vend;
    }
    
    public void update(Venda vend) throws SQLException{
        String sql="update vendas set id_cliente=?, data=?, bruto=?, desconto=? where id_pedido=?";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setInt(1, vend.getIdCliente());
        statement.setDate(2, vend.getDataVenda());
        statement.setDouble(3, vend.getValorBruto());
        statement.setDouble(4, vend.getDesconto());
        statement.setInt(5, vend.getIdPedido());
        statement.execute();
    }
    
    public void updateC(int idP, int idC) throws SQLException{
        PreparedStatement statement;
        if(idC!=0){
            String sql="update vendas set id_cliente=? where id_pedido=?";
            statement = connection.prepareStatement(sql);
            statement.setInt(1, idC);
            statement.setInt(2, idP);
        }else{
            String sql="update vendas set id_cliente=null where id_pedido=?";
            statement = connection.prepareStatement(sql);
            statement.setInt(1, idP);
        }
        statement.execute();
    }
    
    public MetodoPagamento updateMP(int mp, int idP) throws SQLException{
        String sql="update vendas set cod_metodo=? where id_pedido=?";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setInt(1, mp);
        statement.setInt(2, idP);
        statement.execute();
        return selectMP(mp);
    }
    
    public void updateStatusPronto(int idP) throws SQLException{//old build
        String sql="update vendas set status='PRONTO' where id_pedido=?";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setInt(1, idP);
        statement.execute();
    }
    
    public void updateStatusConcluido(int idV, Usuario user) throws SQLException{
        String sql="update vendas set status='VENDIDO', id_usuario=? where id_venda=?";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setInt(1, user.getId());
        statement.setInt(2, idV);
        statement.execute();
    }
    
    public void cancelaP(int idP) throws SQLException{
        String sql="update vendas set status='CANCELADO' where id_pedido=?";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setInt(1, idP);
        statement.execute();
    }
    
    public void delete(Venda vend) throws SQLException{
        String sql="delete from vendas where id_venda=?";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setInt(1, vend.getIdVenda());
        statement.execute();
    }
    

    public ArrayList<Venda> returnSelect(PreparedStatement statement) throws SQLException{
        ArrayList<Venda> vendList=new ArrayList();
        ResultSet resultSet = statement.executeQuery();
        int idV, idP, idC, idU;
        double bruto, desc;
        Date data;
        String status;
        MetodoPagamento metPag;
        while(resultSet.next()){
            idV=resultSet.getInt("id_venda");
            idU=resultSet.getInt("id_usuario");
            idP=resultSet.getInt("id_pedido");
            idC=resultSet.getInt("id_cliente");
            data=resultSet.getDate("data");
            bruto=resultSet.getDouble("bruto");
            desc=resultSet.getInt("desconto");
            status=resultSet.getString("status");
            metPag=selectMPIdV(idV);
            Venda vendX=new Venda(idP, idV, idC, idU, data, bruto, desc, status, metPag);
            vendList.add(vendX);
        }
        return vendList;
    }
    
    public ArrayList<MetodoPagamento> returnSelectMP(PreparedStatement statement) throws SQLException{
        ArrayList<MetodoPagamento> mpList=new ArrayList();
        statement.execute();
        ResultSet resultSet = statement.executeQuery();
        int codMetodo;
        String descMetodo;
        while(resultSet.next()){
            codMetodo=resultSet.getInt("cod_metodo");
            descMetodo=resultSet.getString("desc_metodo");
            MetodoPagamento mpX=new MetodoPagamento(codMetodo, descMetodo);
            mpList.add(mpX);
        }
        return mpList;
    }
    
    public MetodoPagamento selectMP(int codMetodo) throws SQLException, IndexOutOfBoundsException{
        String sql="select * from metodos_pagamento where cod_metodo=?";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setInt(1, codMetodo);
        ResultSet resultSet=statement.executeQuery();
        resultSet.next();
        String descMetodo=resultSet.getString("desc_metodo");
        MetodoPagamento fid=new MetodoPagamento(codMetodo, descMetodo);
        return fid;
    }
    public MetodoPagamento selectMPIdV(int idV) throws SQLException, IndexOutOfBoundsException{
        String sql="select cod_metodo from vendas where id_venda=?";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setInt(1, idV);
        ResultSet resultSet=statement.executeQuery();
        resultSet.next();
        int codMetodo=resultSet.getInt("cod_metodo");
        sql="select * from metodos_pagamento where cod_metodo=?";
        statement = connection.prepareStatement(sql);
        statement.setInt(1, codMetodo);
        resultSet=statement.executeQuery();
        resultSet.next();
        String descMetodo=resultSet.getString("desc_metodo");
        MetodoPagamento fid=new MetodoPagamento(codMetodo, descMetodo);
        return fid;
    }
    
    
    public ArrayList<Venda> selectAny() throws SQLException{
        String sql="select * from vendas order by id_venda order by id_venda";
        PreparedStatement statement = connection.prepareStatement(sql);
        return returnSelect(statement);
    }
    
    public Venda selectId(int idV) throws SQLException, IndexOutOfBoundsException{
        String sql="select * from vendas where id_venda=?";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setInt(1, idV);
        return returnSelect(statement).get(0);
    }
    
    public Venda selectIdP(int idP) throws SQLException, IndexOutOfBoundsException{
        String sql="select * from vendas where id_pedido=?";
        PreparedStatement statement = connection.prepareStatement(sql
                , ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE
        );
        statement.setInt(1, idP);
        return returnSelect(statement).get(0);
    }
    
    public ArrayList<MetodoPagamento> selectAnyMP() throws SQLException{
        String sql="select * from metodos_pagamento where cod_metodo>0";
        PreparedStatement statement=connection.prepareStatement(sql);
        return returnSelectMP(statement);
    }
    
    public ArrayList<Venda> selectAnyAberto() throws SQLException{
        String sql="select distinct on (id_pedido) * from vendas where status='PRONTO' order by id_pedido";
        PreparedStatement statement = connection.prepareStatement(sql);
        return returnSelect(statement);
    }
    
    public ArrayList<Venda> selectAnyVendido() throws SQLException{
        String sql="select * from vendas where status='VENDIDO' order by id_venda";
        PreparedStatement statement = connection.prepareStatement(sql);
        return returnSelect(statement);
    }
    
    public ArrayList<Venda> selectIdC(int idC) throws SQLException, IndexOutOfBoundsException{
        String sql="select * from vendas where id_cliente=? order by id_venda";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setInt(1, idC);
        return returnSelect(statement);
    }
    
    public boolean pronto(int idP) throws SQLException{
        String sql="select * from vendas where id_pedido=? and status='PRONTO'";
        PreparedStatement statement=connection.prepareStatement(sql);
        statement.setInt(1, idP);
        ResultSet resultSet=statement.executeQuery();
        return resultSet.isBeforeFirst();
    }
}