package dao;

import dto.adm_cadfornecedorDTO;
import dto.adm_cadprodutoDTO;
import dto.adm_cadusuarioDTO;
import dto.adm_controlDTO;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class admDAO {

    Connection conn;/*Trabalhar com a variavél connection*/
    PreparedStatement pstm;/*Ela prepara a conexão*/
    ResultSet rs;/*O rs trabalha com ResultSet trazendo informaçõ do banco de dados*/
    
    /*o ArrayList é uma classe genérica que prepara uma lista de informações do banco de dados*/
    ArrayList<adm_cadusuarioDTO> lista = new ArrayList<>();
    ArrayList<adm_cadfornecedorDTO> listaf = new ArrayList<>();
    ArrayList<adm_cadprodutoDTO> listap = new ArrayList<>();
    ArrayList<adm_cadprodutoDTO> listae = new ArrayList<>();
    ArrayList<adm_cadprodutoDTO> listaes = new ArrayList<>();
    ArrayList<adm_controlDTO> listac = new ArrayList<>();
    
    /*É um metodo que faz a inserção de dados do cadastro do usuário na tabela adm_usuario*/
    public void cadusuarioDAO(adm_cadusuarioDTO objcadusuariodto) {

        String sql = "insert into adm_usuario (nome_usuario, cpf_usuario, endereco_usuario, telefone_usuario, login_usuario, login_senha, fk_cargo) values (?,?,?,?,?,?,?)";
        conn = new conexaoDAO().conectaBD();

        try {

            pstm = conn.prepareStatement(sql);
            pstm.setString(1, objcadusuariodto.getNome());
            pstm.setString(2, objcadusuariodto.getCpf());
            pstm.setString(3, objcadusuariodto.getEndereco());
            pstm.setString(4, objcadusuariodto.getTelefone());
            pstm.setString(5, objcadusuariodto.getUsuario());
            pstm.setString(6, objcadusuariodto.getSenha());
            pstm.setInt(7, objcadusuariodto.getFkcargo());

            pstm.execute();
            pstm.close();

            JOptionPane.showMessageDialog(null, "CADASTRO CONCLUÍDO!");

        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "admDAO - cadusuarioDAO: " + erro);
        }

    }
    
    /*É um método que traz a informações dos cargos através do ResultSet*/
    public ResultSet listarCargo() {

        conn = new conexaoDAO().conectaBD();
        String sql = "SELECT * FROM adm_cargo ORDER BY descricao;";

        try {

            pstm = conn.prepareStatement(sql);
            return pstm.executeQuery();

        } catch (SQLException erro) {

            JOptionPane.showMessageDialog(null, "admDAO - listarCargo: " + erro.getMessage());
            return null;

        }

    }
    
    /*O ArrayList é uma classe genérica que prepara uma lista de informações do usuário cadastrado*/
    public ArrayList<adm_cadusuarioDTO> pesquisarUsuario(){
        
        String sql = "SELECT * FROM adm_usuario";
        conn = new conexaoDAO().conectaBD();
        
        try {
            
            pstm = conn.prepareStatement(sql);
            rs = pstm.executeQuery();
            
            while(rs.next()){
                
                adm_cadusuarioDTO objcadusuariodto = new adm_cadusuarioDTO();
                objcadusuariodto.setId_usuario(rs.getInt("id_usuario"));
                objcadusuariodto.setNome(rs.getString("nome_usuario"));
                objcadusuariodto.setCpf(rs.getString("cpf_usuario"));
                objcadusuariodto.setEndereco(rs.getString("endereco_usuario"));
                objcadusuariodto.setTelefone(rs.getString("telefone_usuario"));
                objcadusuariodto.setUsuario(rs.getString("login_usuario"));
                objcadusuariodto.setSenha(rs.getString("login_senha"));
                objcadusuariodto.setFkcargo(rs.getInt("fk_cargo"));
                
                lista.add(objcadusuariodto);
                
            }
            
        } catch (SQLException erro) {
            
            JOptionPane.showMessageDialog(null, "admDAO - pesquisarUsuario: " + erro);
        }
        
        return lista;
        
    }
    
    /*É um método que altera informações da tabela adm_usuario*/
    public void alterarUsuario(adm_cadusuarioDTO objcadusuariodto){
        
        String sql = "UPDATE adm_usuario SET nome_usuario = ?, cpf_usuario = ? , endereco_usuario = ?, telefone_usuario = ?, login_usuario = ?, login_senha = ?, fk_cargo = ? where id_usuario = ?";
        conn = new conexaoDAO().conectaBD();
        
        try {
            
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, objcadusuariodto.getNome());
            pstm.setString(2, objcadusuariodto.getCpf());
            pstm.setString(3, objcadusuariodto.getEndereco());
            pstm.setString(4, objcadusuariodto.getTelefone());
            pstm.setString(5, objcadusuariodto.getUsuario());
            pstm.setString(6, objcadusuariodto.getSenha());
            pstm.setInt(7, objcadusuariodto.getFkcargo());
            pstm.setInt(8, objcadusuariodto.getId_usuario());
            
            
            pstm.execute();
            pstm.close();
            
            JOptionPane.showMessageDialog(null, "ALTERAÇÃO CONCLUÍDA!");
            
        } catch (SQLException erro) {
            
            JOptionPane.showInternalMessageDialog(null, "admDAO - alterarUsuario: " + erro);
            
        }
    
    }
    
    /*É um método que deleta um registro da tabela adm_usuario*/
    public void deletarUsuario(adm_cadusuarioDTO objcadusuariodto){
        
        String sql = "DELETE FROM adm_usuario where id_usuario = ?";
        
        conn = new conexaoDAO().conectaBD();
        
        try {
            
            pstm = conn.prepareStatement(sql);
      
            pstm.setInt(1, objcadusuariodto.getId_usuario());
            
            pstm.execute();
            pstm.close();
            
            JOptionPane.showMessageDialog(null, "REGISTRO DELETADO!");
            
        } catch (Exception erro) {
            
            JOptionPane.showInternalMessageDialog(null, "admDAO - deletarUsuario: " + erro);
            
        }
        
    }
    
    //-----
    
    /*É um metodo que faz a inserção de dados do cadastro do fornecedor na tabela adm_fornecedor*/
    public void cadfornecedorDAO(adm_cadfornecedorDTO objcadfornecedordto) {

        String sql = "insert into adm_fornecedor (nome_fornecedor, cnpj_fornecedor, endereco_fornecedor, telefone_fornecedor, email_fornecedor) values (?,?,?,?,?)";
        conn = new conexaoDAO().conectaBD();

        try {

            pstm = conn.prepareStatement(sql);
            pstm.setString(1, objcadfornecedordto.getNome());
            pstm.setString(2, objcadfornecedordto.getCnpj());
            pstm.setString(3, objcadfornecedordto.getEndereco());
            pstm.setString(4, objcadfornecedordto.getTelefone());
            pstm.setString(5, objcadfornecedordto.getEmail());

            pstm.execute();
            pstm.close();

            JOptionPane.showMessageDialog(null, "CADASTRO CONCLUÍDO!");

        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "admDAO - cadfornecedorDAO: " + erro);
        }

    }
    
    /*O ArrayList é uma classe genérica que prepara uma lista de informações do fornecedor cadastrado*/
    public ArrayList<adm_cadfornecedorDTO> pesquisarFornecedor(){
        
        String sql = "SELECT * FROM adm_fornecedor";
        conn = new conexaoDAO().conectaBD();
        
        try {
            
            pstm = conn.prepareStatement(sql);
            rs = pstm.executeQuery();
            
            while(rs.next()){
                
                adm_cadfornecedorDTO objcadfornecedordto = new adm_cadfornecedorDTO();
                objcadfornecedordto.setId_fornecedor(rs.getInt("id_fornecedor"));
                objcadfornecedordto.setNome(rs.getString("nome_fornecedor"));
                objcadfornecedordto.setCnpj(rs.getString("cnpj_fornecedor"));
                objcadfornecedordto.setEndereco(rs.getString("endereco_fornecedor"));
                objcadfornecedordto.setTelefone(rs.getString("telefone_fornecedor"));
                objcadfornecedordto.setEmail(rs.getString("email_fornecedor"));
                
                listaf.add(objcadfornecedordto);
                
            }
            
        } catch (SQLException erro) {
            
            JOptionPane.showMessageDialog(null, "admDAO - pesquisarFornecedor: " + erro);
        }
        
        return listaf;
        
    }
    
    /*É um método que altera informações da tabela adm_fornecedor*/
    public void alterarFornecedor(adm_cadfornecedorDTO objcadfonecedordto){
        
        String sql = "UPDATE adm_fornecedor SET nome_fornecedor = ?, cnpj_fornecedor = ? , endereco_fornecedor = ?, telefone_fornecedor = ?, email_fornecedor = ? where id_fornecedor = ?";
        conn = new conexaoDAO().conectaBD();
        
        try {
            
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, objcadfonecedordto.getNome());
            pstm.setString(2, objcadfonecedordto.getCnpj());
            pstm.setString(3, objcadfonecedordto.getEndereco());
            pstm.setString(4, objcadfonecedordto.getTelefone());
            pstm.setString(5, objcadfonecedordto.getEmail());
            pstm.setInt(6, objcadfonecedordto.getId_fornecedor());
       
            
            pstm.execute();
            pstm.close();
            
            JOptionPane.showMessageDialog(null, "ALTERAÇÃO CONCLUÍDA!");
            
        } catch (SQLException erro) {
            
            JOptionPane.showInternalMessageDialog(null, "admDAO - alterarFornecedor: " + erro);
            
        }
    
    }
    
    /*É um método que deleta um registro da tabela adm_fornecedor*/
    public void deletarFornecedor(adm_cadfornecedorDTO objcadfornecedordto){
        
        String sql = "DELETE FROM adm_fornecedor where id_fornecedor = ?";
        
        conn = new conexaoDAO().conectaBD();
        
        try {
            
            pstm = conn.prepareStatement(sql);
      
            pstm.setInt(1, objcadfornecedordto.getId_fornecedor());
            
            pstm.execute();
            pstm.close();
            
            JOptionPane.showMessageDialog(null, "REGISTRO DELETADO!");
            
        } catch (Exception erro) {
            
            JOptionPane.showInternalMessageDialog(null, "admDAO - deletarFornecedor: " + erro);
            
        }
        
    }
    
    //-----
    
    /*É um metodo que faz a inserção de dados do cadastro do produto na tabela adm_produto*/
    public void cadprodutoDAO(adm_cadprodutoDTO objcadprodutodto) {

        String sql = "insert into adm_produto (nome_produto, quantidade_produto, validade_produto, preco_unitario, preco_venda, fk_fornecedor) values (?,?,?,?,?,?)";
        conn = new conexaoDAO().conectaBD();

        try {

            pstm = conn.prepareStatement(sql);
            pstm.setString(1, objcadprodutodto.getNome_produto());
            pstm.setString(2, objcadprodutodto.getQuantidade_produto());
            pstm.setString(3, objcadprodutodto.getValidade_produto());
            pstm.setString(4, objcadprodutodto.getPreco_unitario());
            pstm.setString(5, objcadprodutodto.getPreco_venda());
            pstm.setInt(6, objcadprodutodto.getFk_fornecedor());

            pstm.execute();
            pstm.close();

            JOptionPane.showMessageDialog(null, "CADASTRO CONCLUÍDO!");

        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "admDAO - cadprodutoDAO: " + erro);
        }
        
        String sqle = " insert into adm_est(data_est, produto_est, quantidade) values (?,?,?)"; 
        conn = new conexaoDAO().conectaBD();
        try {
            pstm = conn.prepareStatement(sqle);
            pstm.setString(1, objcadprodutodto.getData());
            pstm.setString(2, objcadprodutodto.getNome_produto());
            pstm.setString(3, objcadprodutodto.getQuantidade_produto());
            pstm.execute();
            pstm.close();
            
        } catch (Exception erro) {
            
            JOptionPane.showMessageDialog(null, "admDAO - cadprodutoDAO: " + erro);
        }
    }
    
    
    /*É um método que traz a informações do fornecedor através do ResultSet*/
    public ResultSet listarFornecedor() {

        conn = new conexaoDAO().conectaBD();
        String sql = "SELECT id_fornecedor, nome_fornecedor FROM adm_fornecedor ORDER BY nome_fornecedor;";

        try {

            pstm = conn.prepareStatement(sql);
            return pstm.executeQuery();

        } catch (SQLException erro) {

            JOptionPane.showMessageDialog(null, "admDAO - listarFornecedor: " + erro.getMessage());
            return null;

        }

    }
    
    /*O ArrayList é uma classe genérica que prepara uma lista de informações do produto cadastrado*/
    public ArrayList<adm_cadprodutoDTO> pesquisarProduto(){
        
        String sql = "SELECT * FROM adm_produto";
        conn = new conexaoDAO().conectaBD();
        
        try {
            
            pstm = conn.prepareStatement(sql);
            rs = pstm.executeQuery();
            
            while(rs.next()){
                
                adm_cadprodutoDTO objcadprodutodto = new adm_cadprodutoDTO();
                objcadprodutodto.setId_produto(rs.getInt("id_produto"));
                objcadprodutodto.setNome_produto(rs.getString("nome_produto"));
                objcadprodutodto.setQuantidade_produto(rs.getString("quantidade_produto"));
                objcadprodutodto.setValidade_produto(rs.getString("validade_produto"));
                objcadprodutodto.setPreco_unitario(rs.getString("preco_unitario"));
                objcadprodutodto.setPreco_venda(rs.getString("preco_venda"));
                objcadprodutodto.setFk_fornecedor(rs.getInt("fk_fornecedor"));
                
                listap.add(objcadprodutodto);
                
            }
            
        } catch (SQLException erro) {
            
            JOptionPane.showMessageDialog(null, "admDAO - pesquisarProduto: " + erro);
        }
        
        return listap;
        
    }
    
    /*O ArrayList é uma classe genérica que prepara uma lista de informações do estoque*/
    public ArrayList<adm_cadprodutoDTO> pesquisarEstoque(){
        
        String sql = "SELECT data_est, produto_est, quantidade FROM adm_est";
        conn = new conexaoDAO().conectaBD();
        
        try {
            
            pstm = conn.prepareStatement(sql);
            rs = pstm.executeQuery();
            
            while(rs.next()){
                
                adm_cadprodutoDTO objcadprodutodto = new adm_cadprodutoDTO();
                objcadprodutodto.setNome_produto(rs.getString("produto_est"));
                objcadprodutodto.setQuantidade_produto(rs.getString("quantidade"));
                objcadprodutodto.setData(rs.getString("data_est"));
                
                
                listae.add(objcadprodutodto);
                
            }
            
        } catch (SQLException erro) {
            
            JOptionPane.showMessageDialog(null, "admDAO - pesquisarEstoque: " + erro);
        }
        
        return listae;
        
    }
    
    /*O ArrayList é uma classe genérica que prepara uma lista de informações de estoque(saída)*/
    public ArrayList<adm_cadprodutoDTO> pesquisarEstoqueSaida(){
        
        String sql = "SELECT data_est, prod_est, quant_est FROM adm_estsaida";
        conn = new conexaoDAO().conectaBD();
        
        try {
            
            pstm = conn.prepareStatement(sql);
            rs = pstm.executeQuery();
            
            while(rs.next()){
                
                adm_cadprodutoDTO objcadprodutodto = new adm_cadprodutoDTO();
                objcadprodutodto.setNome_produto(rs.getString("prod_est"));
                objcadprodutodto.setQuantidade_produto(rs.getString("quant_est"));
                objcadprodutodto.setData(rs.getString("data_est"));
                
                
                listaes.add(objcadprodutodto);
                
            }
            
        } catch (SQLException erro) {
            
            JOptionPane.showMessageDialog(null, "admDAO - pesquisarEstoqueSaida: " + erro);
        }
        
        return listaes;
        
    }
    
    /*É um método que altera informações da tabela adm_produto*/
    public void alterarProduto(adm_cadprodutoDTO objcadprodutodto){
        
        String sql = "UPDATE adm_produto SET nome_produto = ?, quantidade_produto = ? , validade_produto = ?, preco_unitario = ?, preco_venda = ?, fk_fornecedor = ? where id_produto = ?";
        conn = new conexaoDAO().conectaBD();
        
        try {
            
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, objcadprodutodto.getNome_produto());
            pstm.setString(2, objcadprodutodto.getQuantidade_produto());
            pstm.setString(3, objcadprodutodto.getValidade_produto());
            pstm.setString(4, objcadprodutodto.getPreco_unitario());
            pstm.setString(5, objcadprodutodto.getPreco_venda());
            pstm.setInt(6, objcadprodutodto.getFk_fornecedor());
            pstm.setInt(7, objcadprodutodto.getId_produto());
            
            
            
            pstm.execute();
            pstm.close();
            
            JOptionPane.showMessageDialog(null, "ALTERAÇÃO CONCLUÍDA!");
            
        } catch (SQLException erro) {
            
            JOptionPane.showInternalMessageDialog(null, "admDAO - alterarProduto: " + erro);
            
        }
    
    }
    
    /*É um método que deleta um registro da tabela adm_produto*/
    public void deletarProduto(adm_cadprodutoDTO objcadprodutodto){
        
        String sql = "DELETE FROM adm_produto where id_produto = ?";
        
        conn = new conexaoDAO().conectaBD();
        
        try {
            
            pstm = conn.prepareStatement(sql);
      
            pstm.setInt(1, objcadprodutodto.getId_produto());
            
            pstm.execute();
            pstm.close();
            
            JOptionPane.showMessageDialog(null, "REGISTRO DELETADO!");
            
        } catch (Exception erro) {
            
            JOptionPane.showInternalMessageDialog(null, "admDAO - deletarProduto: " + erro);
            
        }
        
    }
    
    /*O ArrayList é uma classe genérica que prepara uma lista de informações de controle de caixa*/
    public ArrayList<adm_controlDTO> pesquisarControl(){
        
        String sql = "SELECT data_control, tipo_control, descricao_control, valor_control, funcionario_control FROM adm_control";
        conn = new conexaoDAO().conectaBD();
        
        try {
            
            pstm = conn.prepareStatement(sql);
            rs = pstm.executeQuery();
            
            while(rs.next()){
                
                adm_controlDTO objcontrol = new adm_controlDTO();
                objcontrol.setData(rs.getString("data_control"));
                objcontrol.setTipo(rs.getString("tipo_control"));
                objcontrol.setDescricao(rs.getString("descricao_control"));
                objcontrol.setValor(rs.getString("valor_control"));
                objcontrol.setFuncionario(rs.getString("funcionario_control"));
                
                
                listac.add(objcontrol);
                
            }
            
        } catch (SQLException erro) {
            
            JOptionPane.showMessageDialog(null, "admDAO - pesquisarControl: " + erro);
        }
        
        return listac;
        
    }
    
}
