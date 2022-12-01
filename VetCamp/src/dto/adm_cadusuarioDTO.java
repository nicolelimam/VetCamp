
package dto;


public class adm_cadusuarioDTO {
    
    /*Variaveis privadas, podendo trabalhar com elas através dew getters e setters, sendo getters para retornar o valor que foi pelo pelo setters e armazenado na variavel local*/
    
    private String nome;
    private String cpf;
    private String endereco;
    private String telefone;
    private String usuario;
    private String senha;
    private int fkcargo, id_usuario;
    

    
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

    
    public String getUsuario() {
        return usuario;
    }

    
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    
    public String getSenha() {
        return senha;
    }

    
    public void setSenha(String senha) {
        this.senha = senha;
    }

    
    public int getFkcargo() {
        return fkcargo;
    }

   
    public void setFkcargo(int fkcargo) {
        this.fkcargo = fkcargo;
    }

    
    public int getId_usuario() {
        return id_usuario;
    }

    
    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }
    
}
