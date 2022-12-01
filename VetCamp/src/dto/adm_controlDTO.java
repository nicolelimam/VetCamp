
package dto;


public class adm_controlDTO {
    
    /*Variaveis privadas, podendo trabalhar com elas através dew getters e setters, sendo getters para retornar o valor que foi pelo pelo setters e armazenado na variavel local*/
   
    private String data;
    private String tipo;
    private String descricao;
    private String valor;
    private String funcionario;

    
    public String getData() {
        return data;
    }

    
    
    public void setData(String data) {
        this.data = data;
    }

   
    public String getTipo() {
        return tipo;
    }

    
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    
    public String getDescricao() {
        return descricao;
    }

    
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    
    public String getValor() {
        return valor;
    }

    
    public void setValor(String valor) {
        this.valor = valor;
    }

    
    public String getFuncionario() {
        return funcionario;
    }

   
    public void setFuncionario(String funcionario) {
        this.funcionario = funcionario;
    }
    
}
