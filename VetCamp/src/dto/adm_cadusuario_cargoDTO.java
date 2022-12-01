
package dto;


public class adm_cadusuario_cargoDTO {

    /*Variaveis privadas, podendo trabalhar com elas através dew getters e setters, sendo getters para retornar o valor que foi pelo pelo setters e armazenado na variavel local*/

    private int id_cargo;
    private String descricao;

    
    public int getId_cargo() {
        return id_cargo;
    }

    
    public void setId_cargo(int id_cargo) {
        this.id_cargo = id_cargo;
    }

    
    public String getDescricao() {
        return descricao;
    }

   
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }


    
}
