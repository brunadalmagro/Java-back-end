package Sistema;

/**
 *
 * @author bruna
 */

public class Cliente {
    private Long cpf;
    private String nome;
    private String sobrenome;
    private String telefone;
    private String endereco;
    private String cep;
    private String cidade;
    private String pais;

    public Cliente(Long cpf, String nome, String sobrenome, String telefone, String endereco, String cep, String cidade, String pais) {
        this.cpf = cpf;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.telefone = telefone;
        this.endereco = endereco;
        this.cep = cep;
        this.cidade = cidade;
        this.pais = pais;
    }

    public Cliente(String cpfCliente, String nomeCliente, String sobrenomeCliente, String telefoneCliente, String enderecoCliente, String cepCliente, String cidadeCliente, String paisCliente) {
        this.cpf = Long.valueOf(cpfCliente); 
        this.nome = nomeCliente;
        this.sobrenome = sobrenomeCliente;
        this.telefone = telefoneCliente;
        this.endereco = enderecoCliente;
        this.cep = cepCliente;
        this.cidade = cidadeCliente;
        this.pais = paisCliente;
    }

    //Métodos getters e setters 
    public Long getCpf() {
        return cpf;
    }

    public void setCpf(Long cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }
    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }


}
