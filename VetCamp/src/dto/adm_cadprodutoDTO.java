
package dto;

public class adm_cadprodutoDTO {

    /*Variaveis privadas, podendo trabalhar com elas através dew getters e setters, sendo getters para retornar o valor que foi pelo pelo setters e armazenado na variavel local*/
    
    private int id_produto;
    private int fk_fornecedor;
    private String nome_produto;
    private String quantidade_produto;
    private String validade_produto;
    private String preco_unitario;
    private String preco_venda;
    private String data;
    
    public int getId_produto() {
        return id_produto;
    }

    
    
    public void setId_produto(int id_produto) {
        this.id_produto = id_produto;
    }

    
    
    public int getFk_fornecedor() {
        return fk_fornecedor;
    }

    
    
    public void setFk_fornecedor(int fk_fornecedor) {
        this.fk_fornecedor = fk_fornecedor;
    }

    
    public String getNome_produto() {
        return nome_produto;
    }

    
    public void setNome_produto(String nome_produto) {
        this.nome_produto = nome_produto;
    }

    
    public String getQuantidade_produto() {
        return quantidade_produto;
    }

    
    public void setQuantidade_produto(String quantidade_produto) {
        this.quantidade_produto = quantidade_produto;
    }

    
    public String getValidade_produto() {
        return validade_produto;
    }

    
    public void setValidade_produto(String validade_produto) {
        this.validade_produto = validade_produto;
    }

    
    public String getPreco_unitario() {
        return preco_unitario;
    }

    
    public void setPreco_unitario(String preco_unitario) {
        this.preco_unitario = preco_unitario;
    }

    
    public String getPreco_venda() {
        return preco_venda;
    }

   
    public void setPreco_venda(String preco_venda) {
        this.preco_venda = preco_venda;
    }

    
    public String getData() {
        return data;
    }

    
    public void setData(String data) {
        this.data = data;
    }



}
