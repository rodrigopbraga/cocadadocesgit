package modelos;

public class Cliente {
    private String nome, telefone;
    private long cpf;
    private int idCliente;
    private Fidelidade fid;

    public Cliente(int idCliente, long cpf,String nome, String telefone, Fidelidade fid) {
        this.idCliente = idCliente;
        this.nome = nome;
        this.telefone = telefone;
        this.cpf = cpf;
        this.fid = fid;
    }
    
    public Cliente(int idCliente, long cpf,String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
        this.cpf = cpf;
        this.idCliente = idCliente;
    }

    public Cliente(long cpf, String nome, String telefone) {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone=telefone;
    }

    public Cliente(String nome) {
        this.nome = nome;
    }

    public Cliente(long cpf) {
        this.cpf = cpf;
    }

    public Cliente(int idCliente) {
        this.idCliente = idCliente;
    }
    
    public Cliente(){
        
    }
    
    public String getPrimeiroNome() {
        String pnome="";
        for(int i=0;i<nome.length();i++){
            if(nome.charAt(i)!=' '){
                pnome+=nome.charAt(i);
            }else break;
        }
        return pnome;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome_cliente) {
        this.nome = nome_cliente;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public long getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public Fidelidade getFid() {
        return fid;
    }

    public void setFid(Fidelidade fid) {
        this.fid = fid;
    }
    
    
    
    public String imprime(long cpf){
        StringBuilder sb=new StringBuilder("\n");
        sb.append("Nome: ").append(this.nome).append("\nCPF: ");
        sb.append(this.cpf);
        return sb.toString();
    }
}
