package modelos;
import java.sql.Date;

public class Venda {
    private int idPedido, idVenda, idCliente, idUsuario;
    private Date dataVenda;
    private double valorBruto, desconto;
    private String status;
    private MetodoPagamento metPag;

    public Venda(int idPedido, int idVenda, int idCliente, int idUsuario, Date dataVenda, double valorBruto, double desconto, String status, MetodoPagamento metPag) {
        this.idPedido = idPedido;
        this.idVenda = idVenda;
        this.idCliente = idCliente;
        this.idUsuario = idUsuario;
        this.dataVenda = dataVenda;
        this.valorBruto = valorBruto;
        this.desconto = desconto;
        this.status = status;
        this.metPag = metPag;
    }

    public Venda(int idPedido, int idCliente, Date dataVenda, double valorBruto, double desconto) {
        this.idPedido = idPedido;
        this.idCliente = idCliente;
        this.dataVenda = dataVenda;
        this.valorBruto = valorBruto;
        this.desconto = desconto;
    }

    public Venda(int idVenda) {
        this.idVenda = idVenda;
    }

    public Venda(int idPedido, int idVenda, int idCliente, Date dataVenda, double valorBruto, double desconto, String status, MetodoPagamento metPag) {
        this.idPedido = idPedido;
        this.idVenda = idVenda;
        this.idCliente = idCliente;
        this.dataVenda = dataVenda;
        this.valorBruto = valorBruto;
        this.desconto = desconto;
        this.status = status;
        this.metPag = metPag;
    }

    public Venda(int idPedido, int idVenda, int idCliente, int idUsuario) {
        this.idPedido = idPedido;
        this.idVenda = idVenda;
        this.idCliente = idCliente;
        this.idUsuario = idUsuario;
    }

    public Venda() {
    }

    public int getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    public int getIdVenda() {
        return idVenda;
    }

    public void setIdVenda(int idVenda) {
        this.idVenda = idVenda;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Date getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(Date dataVenda) {
        this.dataVenda = dataVenda;
    }

    public double getValorBruto() {
        return valorBruto;
    }

    public void setValorBruto(double valorBruto) {
        this.valorBruto = valorBruto;
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public MetodoPagamento getMetPag() {
        return metPag;
    }

    public void setMetPag(MetodoPagamento metPag) {
        this.metPag = metPag;
    }

    @Override
    public String toString() {
        return "Venda{" + "idPedido=" + idPedido + ", idVenda=" + idVenda + ", idCliente=" + idCliente + ", idUsuario=" + idUsuario + ", dataVenda=" + dataVenda + ", valorBruto=" + valorBruto + ", desconto=" + desconto + ", status=" + status + ", metPag=" + metPag + '}';
    }

     
}
