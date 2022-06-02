package modelos;

public class Logradouro {
    private String endereco, num, complemento, bairro, cidade, uf, cep, pais;
    private int idLogradouro, idCliente;

    public Logradouro(String endereco, String num, String complemento, String bairro, String cidade, String uf, String cep, String pais, int idLogradouro, int idCliente) {
        this.endereco = endereco;
        this.num = num;
        this.complemento = complemento;
        this.bairro = bairro;
        this.cidade = cidade;
        this.uf = uf;
        this.cep = cep;
        this.pais = pais;
        this.idLogradouro = idLogradouro;
        this.idCliente = idCliente;
    }

    public Logradouro(String endereco, String num, String complemento, String bairro, String cidade, String uf, String cep, String pais, int idCliente) {
        this.endereco = endereco;
        this.num = num;
        this.complemento = complemento;
        this.bairro = bairro;
        this.cidade = cidade;
        this.uf = uf;
        this.cep = cep;
        this.pais = pais;
        this.idCliente=idCliente;
    }

    public Logradouro(int idLogradouro) {
        this.idLogradouro = idLogradouro;
    }

    
    public Logradouro() {
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public int getIdLogradouro() {
        return idLogradouro;
    }

    public void setIdLogradouro(int idLogradouro) {
        this.idLogradouro = idLogradouro;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }
}
