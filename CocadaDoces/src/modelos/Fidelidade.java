package modelos;

public class Fidelidade {
    private int codFidelidade, pontos, bonus, resgates;

    public Fidelidade(int codFidelidade, int pontos, int bonus, int resgates) {
        this.codFidelidade = codFidelidade;
        this.pontos = pontos;
        this.bonus = bonus;
        this.resgates = resgates;
    }

    public Fidelidade(int codFidelidade) {
        this.codFidelidade = codFidelidade;
    }

    public Fidelidade() {
    }

    public int getCodFidelidade() {
        return codFidelidade;
    }

    public void setCodFidelidade(int codFidelidade) {
        this.codFidelidade = codFidelidade;
    }

    public int getPontos() {
        return pontos;
    }

    public void setPontos(int pontos) {
        this.pontos = pontos;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    public int getResgates() {
        return resgates;
    }

    public void setResgates(int resgates) {
        this.resgates = resgates;
    }
    
    
}