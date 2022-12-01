
package dto;


public class atn_cadanimalDTO {
    
    /*Variaveis privadas, podendo trabalhar com elas através dew getters e setters, sendo getters para retornar o valor que foi pelo pelo setters e armazenado na variavel local*/
    
    private String nome;
    private String idade;
    private String sexo;
    private String descricao;
    private String categoria;
    private int id_animal;
    private int fk_cliente;
    

    
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

    
    public String getDescricao() {
        return descricao;
    }

    
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    
    public int getId_animal() {
        return id_animal;
    }

    
    public void setId_animal(int id_animal) {
        this.id_animal = id_animal;
    }

    
    public int getFk_cliente() {
        return fk_cliente;
    }

    
    public void setFk_cliente(int fk_cliente) {
        this.fk_cliente = fk_cliente;
    }

    
    public String getCategoria() {
        return categoria;
    }

    
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    
    
    
}
