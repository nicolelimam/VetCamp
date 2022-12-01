

package dto;


public class atn_cadclienteDTO {
    
    /*Variaveis privadas, podendo trabalhar com elas através dew getters e setters, sendo getters para retornar o valor que foi pelo pelo setters e armazenado na variavel local*/
    private String nome;
    private String cpf;
    private String endereco;
    private String telefone;
    private int id_cliente;

    
    
    public String getNome() {
        return nome;
    }

    
    public void setNome(String nome) {
        this.nome = nome;
    }

  
    public String getCpf() {
        return cpf;
    }

    
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    
    public String getEndereco() {
        return endereco;
    }

    
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    
    public String getTelefone() {
        return telefone;
    }

    
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    
    public int getId_cliente() {
        return id_cliente;
    }

    
    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }
    
}
