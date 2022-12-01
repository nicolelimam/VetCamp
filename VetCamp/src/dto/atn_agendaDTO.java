
package dto;


public class atn_agendaDTO {
    
    /*Variaveis privadas, podendo trabalhar com elas através dew getters e setters, sendo getters para retornar o valor que foi pelo pelo setters e armazenado na variavel local*/
   
    private String data_agenda;
    private String tipo_agenda;
    private String sexo_agenda;
    private String categoria_agenda;
    private String descricao_agenda;
    private String nome_animal;
    private String veterinario;
    private int fk_animal;
    private int id_agenda;

    
    public String getData_agenda() {
        return data_agenda;
    }

    
    public void setData_agenda(String data_agenda) {
        this.data_agenda = data_agenda;
    }

    
    public String getTipo_agenda() {
        return tipo_agenda;
    }

    
    public void setTipo_agenda(String tipo_agenda) {
        this.tipo_agenda = tipo_agenda;
    }

    public String getSexo_agenda() {
        return sexo_agenda;
    }

    
    public void setSexo_agenda(String sexo_agenda) {
        this.sexo_agenda = sexo_agenda;
    }

    
    public String getCategoria_agenda() {
        return categoria_agenda;
    }

    
    public void setCategoria_agenda(String categoria_agenda) {
        this.categoria_agenda = categoria_agenda;
    }

    
    public String getDescricao_agenda() {
        return descricao_agenda;
    }

    
    public void setDescricao_agenda(String descricao_agenda) {
        this.descricao_agenda = descricao_agenda;
    }

    
    public String getNome_animal() {
        return nome_animal;
    }

    
    public void setNome_animal(String nome_animal) {
        this.nome_animal = nome_animal;
    }

    
    public int getFk_animal() {
        return fk_animal;
    }

    
    public void setFk_animal(int fk_animal) {
        this.fk_animal = fk_animal;
    }

    
    public int getId_agenda() {
        return id_agenda;
    }

    
    public void setId_agenda(int id_agenda) {
        this.id_agenda = id_agenda;
    }

    
    public String getVeterinario() {
        return veterinario;
    }

    /
    public void setVeterinario(String veterinario) {
        this.veterinario = veterinario;
    }
    
}
