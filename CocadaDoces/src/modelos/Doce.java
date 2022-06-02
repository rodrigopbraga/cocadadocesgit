package modelos;

public class Doce {
    private String nomedoce, ingredientes;
    private int id;
    private double pcusto, pvenda;

    public Doce(int id, String nomedoce, String ingredientes, double pcusto, double pvenda) {
        this.id = id;
        this.nomedoce = nomedoce;
        this.ingredientes = ingredientes;
        this.pcusto = pcusto;
        this.pvenda = pvenda;
    }

    public Doce(String nomedoce, String ingredientes, double pcusto) {
        this.nomedoce = nomedoce;
        this.ingredientes = ingredientes;
        this.pcusto=pcusto;
    }
    public Doce(String nomedoce, String ingredientes, double pcusto, double pvenda) {
        this.nomedoce = nomedoce;
        this.ingredientes = ingredientes;
        this.pcusto=pcusto;
        this.pvenda=pvenda;
    }

    public Doce(int id) {
        this.id=id;
    }

    public Doce(String nomedoce) {
        this.nomedoce = nomedoce;
    }

    public Doce() {
        
    }
    
    

    public String getNomedoce() {
        return nomedoce;
    }

    public void setNomedoce(String nomedoce) {
        this.nomedoce = nomedoce;
    }

    public String getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(String ingredientes) {
        this.ingredientes = ingredientes;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPcusto() {
        return pcusto;
    }

    public void setPcusto(double pcusto) {
        this.pcusto = pcusto;
    }

    public double getPvenda() {
        return pvenda;
    }

    public void setPvenda(double pvenda) {
        this.pvenda = pvenda;
    }
    
    
}
