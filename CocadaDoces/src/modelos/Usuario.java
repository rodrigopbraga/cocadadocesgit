package modelos;
public class Usuario {
    private int id, lv;
    private String usuario, senha, func;

    public Usuario(int id, String usuario, String senha, String func) {
        this.id = id;
        this.usuario = usuario;
        this.senha = senha;
        this.func = func;
    }

    public Usuario(int id, String usuario, String func) {
        this.id = id;
        this.usuario = usuario;
        this.func = func;
    }
    
    public Usuario(String usuario, String senha, String func) {
        this.usuario = usuario;
        this.senha = senha;
        this.func=func;
    }

    public Usuario(String usuario, String senha) {
        this.usuario = usuario;
        this.senha = senha;
    }

    public Usuario(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getFunc() {
        return func;
    }

    public void setFunc(String func) {
        this.func = func;
    }

    public int getLv() {
        return lv;
    }

    public void setLv(int lv) {
        this.lv = lv;
    }

    @Override
    public String toString() {
        return "Usuario{" + "id=" + id + ", lv=" + lv + ", usuario=" + usuario + ", senha=" + senha + ", func=" + func + '}';
    }
    
    
}