package modelos;

public class VendasFaturamento {
    private int idUsuario, qntDoces;
    private double valorVendido, valorDesconto;

    public VendasFaturamento(int idUsuario, int qntDoces, double valorVendido, double valorDesconto) {
        this.idUsuario = idUsuario;
        this.qntDoces = qntDoces;
        this.valorVendido = valorVendido;
        this.valorDesconto = valorDesconto;
    }

    public VendasFaturamento() {
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public int getQntDoces() {
        return qntDoces;
    }

    public void setQntDoces(int qntDoces) {
        this.qntDoces = qntDoces;
    }

    public double getValorVendido() {
        return valorVendido;
    }

    public void setValorVendido(double valorVendido) {
        this.valorVendido = valorVendido;
    }

    public double getValorDesconto() {
        return valorDesconto;
    }

    public void setValorDesconto(double valorDesconto) {
        this.valorDesconto = valorDesconto;
    }
    
    
}
