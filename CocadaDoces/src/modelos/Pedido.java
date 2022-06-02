package modelos;

public class Pedido {
    private int idPedido, idDoce, qntDoce;

    public Pedido(int idPedido, int idDoce, int qntDoce) {
        this.idPedido = idPedido;
        this.idDoce = idDoce;
        this.qntDoce = qntDoce;
    }

    public Pedido(int idPedido, int idDoce) {
        this.idPedido = idPedido;
        this.idDoce = idDoce;
    }
    
    public Pedido(int idPedido) {
        this.idPedido = idPedido;
    }

    public Pedido() {
    }

    public int getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    public int getIdDoce() {
        return idDoce;
    }

    public void setIdDoce(int idDoce) {
        this.idDoce = idDoce;
    }

    public int getQntDoce() {
        return qntDoce;
    }

    public void setQntDoce(int qntDoce) {
        this.qntDoce = qntDoce;
    }
}
