package dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import modelos.MaisVendidos;
import modelos.VendasFaturamento;

public class RelatorioDAO {

    private final Connection connection;

    public RelatorioDAO(Connection connection) {
        this.connection = connection;
    }

    public void beginDao() throws SQLException {
        String sql = "begin;";
        PreparedStatement statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
        statement.execute();
    }

    public void rollbackDao() throws SQLException {
        String sql = "rollback;";
        PreparedStatement statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
        statement.execute();
    }

    public void commitDao() throws SQLException {
        String sql = "commit;";
        PreparedStatement statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
        statement.execute();
    }

    public ArrayList<MaisVendidos> selectDocesVendidosQuant(int quantRel) throws SQLException, IndexOutOfBoundsException {
        String sql = "select * from setquantdocevendido(?) order by quant_doce desc";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setInt(1, quantRel);
        ResultSet resultset = statement.executeQuery();
        ArrayList<MaisVendidos> mvList = new ArrayList();
        int idD, quantD;
        while (resultset.next()) {
            idD = resultset.getInt("id_doce");
            quantD = resultset.getInt("quant_doce");
            MaisVendidos mvX = new MaisVendidos(idD, quantD);
            mvList.add(mvX);
        }
        return mvList;
    }
    
    public ArrayList<VendasFaturamento> selectVendasUsuarioAny() throws SQLException, IndexOutOfBoundsException {
        String sql = "select * from setvendasusuario()";
        PreparedStatement statement = connection.prepareStatement(sql);
        ResultSet resultset = statement.executeQuery();
        ArrayList<VendasFaturamento> mvList = new ArrayList();
        int idU, qntD;
        double vVendido, vDesconto;
        while (resultset.next()) {
            idU = resultset.getInt("id_usuario");
            qntD = resultset.getInt("quant_doces");
            vVendido = resultset.getDouble("valor_vendido");
            vDesconto = resultset.getDouble("valor_desconto");
            VendasFaturamento mvX = new VendasFaturamento(idU, qntD, vVendido, vDesconto);
            mvList.add(mvX);
        }
        return mvList;
    }
    
    public ArrayList<MaisVendidos> selectDocesVendidosQuantPeriodo(int quantRel, Date dataI, Date dataF) throws SQLException, IndexOutOfBoundsException {//in dev
        String sql = "select ped.id_doce, sum(ped.quant_doce) as quantidade from pedidos ped, vendas ven"
                + "	where ven.id_pedido=ped.id_pedido"
                + "		and ven.status='VENDIDO'"
                + "		AND ven.data BETWEEN ? AND ?"
                + "		group by ped.id_doce order by quantidade desc;";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setDate(1, dataI);
        statement.setDate(2, dataF);
        ResultSet resultset = statement.executeQuery();
        ArrayList<MaisVendidos> mvList = new ArrayList();
        int idD, quantD;
        while (resultset.next()) {
            idD = resultset.getInt("id_doce");
            quantD = resultset.getInt("quant_doce");
            MaisVendidos mvX = new MaisVendidos(idD, quantD);
            mvList.add(mvX);
        }
        return mvList;
    }

    public MaisVendidos selectDoceVendido(int idD) throws SQLException, IndexOutOfBoundsException {
        String sql = "select * from setdocevendido(?)";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setInt(1, idD);
        ResultSet resultset = statement.executeQuery();
        int quantD;
        resultset.next();
        idD = resultset.getInt("id_doce");
        quantD = resultset.getInt("quant_doce");
        MaisVendidos mvX = new MaisVendidos(idD, quantD);
        return mvX;
    }
    
    public VendasFaturamento selectVendasUsuarioU(int idU) throws SQLException, IndexOutOfBoundsException {
        String sql = "select * from setvendasporusuario(?)";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setInt(1, idU);
        ResultSet resultset = statement.executeQuery();
        int qntD;
        double vVendido, vDesconto;
        resultset.next();
        idU = resultset.getInt("id_usuario");
        qntD = resultset.getInt("quant_doces");
        vVendido = resultset.getDouble("valor_vendido");
        vDesconto = resultset.getDouble("valor_desconto");
        VendasFaturamento mvX = new VendasFaturamento(idU, qntD, vVendido, vDesconto);
        return mvX;
    }
}
