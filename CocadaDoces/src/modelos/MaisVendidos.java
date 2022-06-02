package modelos;

public class MaisVendidos {
    private int idDoce, qntDoce;

    public MaisVendidos(int idDoce, int qntDoce) {
        this.idDoce = idDoce;
        this.qntDoce = qntDoce;
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
