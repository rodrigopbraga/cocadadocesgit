package modelos;

public class MetodoPagamento {
    private int codMetodo;
    private String descMetodo;

    public MetodoPagamento(int codMetodo, String descMetodo) {
        this.codMetodo = codMetodo;
        this.descMetodo = descMetodo;
    }

    public MetodoPagamento(int codMetodo) {
        this.codMetodo = codMetodo;
    }

    public int getCodMetodo() {
        return codMetodo;
    }

    public void setCodMetodo(int codMetodo) {
        this.codMetodo = codMetodo;
    }

    public String getDescMetodo() {
        return descMetodo;
    }

    public void setDescMetodo(String descMetodo) {
        this.descMetodo = descMetodo;
    }
    
    
}
