
package dto;

public class vet_atendimentoDTO {
    
    /*Variaveis privadas, podendo trabalhar com elas através dew getters e setters, sendo getters para retornar o valor que foi pelo pelo setters e armazenado na variavel local*/
    
    private String nome;
    private String idade;
    private String sexo;
    private String categoria;
    private String descricao;
    private String prescricao;
    private int id;

    
    public String getNome() {
        return nome;
    }

    
    public void setNome(String nome) {
        this.nome = nome;
        
    }

  
    public String getIdade() {
        return idade;
    }

    
    public void setIdade(String idade) {
        this.idade = idade;
    }

    
    public String getSexo() {
        return sexo;
    }

   
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    
    public String getCategoria() {
        return categoria;
    }

   
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    
    public String getDescricao() {
        return descricao;
    }

    
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

   
    public String getPrescricao() {
        return prescricao;
    }

    
    public void setPrescricao(String prescricao) {
        this.prescricao = prescricao;
    }

   
    public int getId() {
        return id;
    }

    
    public void setId(int id) {
        this.id = id;
    }
}
