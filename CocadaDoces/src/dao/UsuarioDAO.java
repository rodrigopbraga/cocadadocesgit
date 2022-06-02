package dao;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import modelos.Usuario;
import telas.Notificacao;

public class UsuarioDAO {

    private final Connection connection;

    public UsuarioDAO(Connection connection) {
        this.connection = connection;
    }

    public Usuario insert(Usuario user) throws SQLException, IOException {
        String sql = "insert into usuarios (usuario, senha, func) values (?, ?, ?)";
        PreparedStatement statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
        statement.setString(1, user.getUsuario());
        statement.setString(2, user.getSenha());
        statement.setString(3, user.getFunc());
        statement.execute();
        ResultSet resultSet = statement.getGeneratedKeys();
        int id = 0;
        if (resultSet.next()) {
            id = resultSet.getInt("id_usuario");
            user.setId(id);
        }
        Socket s;
        try {
            s = new Socket("localhost", 5432);
            ObjectOutputStream dos = new ObjectOutputStream(s.getOutputStream());
            //ObjectInputStream dis = new ObjectInputStream(s.getInputStream());
            Notificacao notify = new Notificacao("Bem vindo!\nUsuario de ID " + id + " criado com sucesso!");
            //dos.writeObject(notify);
            dos.flush();
        } catch (IOException iOException) {
            System.out.println("erro socket: "+iOException.getMessage());
        } finally {
            //s.close();
        }
        return user;
    }

    public void update(Usuario user) throws SQLException {
        String sql = "update usuarios set usuario=?, func=? where id_usuario=?";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, user.getUsuario());
        statement.setString(2, user.getFunc());
        statement.setInt(3, user.getId());
        statement.execute();
    }

    public void updateSenha(Usuario user) throws SQLException {
        String sql = "update usuarios set senha=? where id_usuario=?";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, user.getSenha());
        statement.setInt(2, user.getId());
        statement.execute();
    }

    public void delete(Usuario user) throws SQLException {
        String sql = "delete from usuarios where id_usuario=?";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setInt(1, user.getId());
        statement.execute();
    }

    public ArrayList<Usuario> selectAny() throws SQLException {
        String sql = "select * from get_user_data()";
        PreparedStatement statement = connection.prepareStatement(sql);
        return returnSelectFromView(statement);
    }

    public ArrayList<Usuario> returnSelect(PreparedStatement statement) throws SQLException {
        ArrayList<Usuario> userList = new ArrayList();
        ResultSet resultSet = statement.executeQuery();
        int id;
        String user, password, func;
        while (resultSet.next()) {
            id = resultSet.getInt("id_usuario");
            user = resultSet.getString("usuario");
            password = resultSet.getString("senha");
            func = resultSet.getString("func");
            Usuario userX = new Usuario(id, user, password, func);
            userList.add(userX);
        }
        return userList;
    }

    public ArrayList<Usuario> returnSelectFromView(PreparedStatement statement) throws SQLException {
        ArrayList<Usuario> userList = new ArrayList();
        ResultSet resultSet = statement.executeQuery();
        int id;
        String user, func;
        while (resultSet.next()) {
            id = resultSet.getInt("id_usuario");
            user = resultSet.getString("usuario");
            func = resultSet.getString("func");
            Usuario userX = new Usuario(id);
            userX.setUsuario(user);
            userX.setFunc(func);
            userList.add(userX);
        }
        return userList;
    }

    public Usuario selectId(Usuario user) throws SQLException, IndexOutOfBoundsException {
        String sql = "select * from usuarios where id_usuario=?";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setInt(1, user.getId());
        return returnSelect(statement).get(0);
    }

    public Usuario selectIdView(Usuario user) throws SQLException, IndexOutOfBoundsException {
        String sql = "select * from get_user_data() ud where ud.id_usuario=?";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setInt(1, user.getId());
        return returnSelectFromView(statement).get(0);
    }

    public boolean auteUser(Usuario auteUser) throws SQLException {
        String sql = "select * from usuarios where usuario=? and senha=?";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, auteUser.getUsuario());
        statement.setString(2, auteUser.getSenha());
        ResultSet resultSet = statement.executeQuery();
        return resultSet.next();
    }
    
    public boolean jaExiste(Usuario auteUser) throws SQLException {
        String sql = "select * from get_user_data() ud where ud.usuario=?";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, auteUser.getUsuario());
        ResultSet resultSet = statement.executeQuery();
        return resultSet.next();
    }

    public Usuario selectUserPass(Usuario auteUser) throws SQLException {
        String sql = "select * from usuarios where usuario=? and senha=?";
        PreparedStatement statement = connection.prepareStatement(sql);

        statement.setString(1, auteUser.getUsuario());
        statement.setString(2, auteUser.getSenha());
        return returnSelect(statement).get(0);
    }

    public boolean novo(int idU) throws SQLException {
        String sql = "select * from usuarios where id_usuario=?";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setLong(1, idU);
        ResultSet resultSet = statement.executeQuery();
        if (resultSet.isBeforeFirst()) {
            System.out.println("Existe");
            return false;
        } else {
            System.out.println("Nao existe");
            return true;
        }
    }

    public int getUserLevel(Usuario user) throws SQLException {
        int lv = 0;
        System.out.println(user.getFunc());
        user = selectId(user);
        switch (user.getFunc()) {
            case "DEV":
                lv = 5;
                break;
            case "GERENTE":
                lv = 4;
                break;
            case "COORDENADOR":
                lv = 3;
                break;
            case "CAIXA":
                lv = 2;
                break;
            case "COZINHA":
                lv = 1;
                break;
        }
        return lv;
    }

    public ArrayList<Usuario> selectUsuario(String usuario) throws SQLException {
        String sql = "select * from get_user_data() ud where ud.usuario like '%'||?||'%' order by id_usuario";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, usuario);
        return returnSelectFromView(statement);
    }

    public ArrayList<Usuario> selectFuncao(String func) throws SQLException {
        String sql = "select * from get_user_data() ud where ud.func=? order by id_usuario";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, func);
        return returnSelectFromView(statement);
    }

    /*public boolean existeC(int idC) throws SQLException {
    String sql = "select * from usuarios where id_cliente=?";
    PreparedStatement statement = connection.prepareStatement(sql);
    statement.setLong(1, idC);
    ResultSet resultSet = statement.executeQuery();
    if (resultSet.isBeforeFirst()) {
    System.out.println("Existe");
    return true;
    } else {
    System.out.println("Nao existe");
    return false;
    }
    }*/
}
