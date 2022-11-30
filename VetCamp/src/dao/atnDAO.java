package dao;

import dto.adm_cadprodutoDTO;
import dto.atn_agendaDTO;
import dto.atn_cadanimalDTO;
import dto.atn_cadclienteDTO;
import dto.vet_atendimentoDTO;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import view.vet_consultaFichaVIEW;

public class atnDAO {

    Connection conn;/*Trabalhar com a variavél connection*/
    PreparedStatement pstm;/*Ela prepara a conexão*/
    ResultSet rs;/*O rs trabalha com ResultSet trazendo informaçõ do banco de dados*/
    /*o ArrayList é uma classe genérica que prepara uma lista de informações do banco de dados*/
    ArrayList<atn_cadclienteDTO> lista = new ArrayList<>();
    ArrayList<atn_cadanimalDTO> listaa = new ArrayList<>();
    ArrayList<atn_agendaDTO> listag = new ArrayList<>();
    ArrayList<adm_cadprodutoDTO> listaRe = new ArrayList<>();
    
    /*É um metodo que faz a inserção de dados na tabela atn_cliente*/
    public void cadclienteDAO(atn_cadclienteDTO objcadcliente) {

        String sql = "insert into atn_cliente (nome_cliente, cpf_cliente, endereco_cliente, telefone_cliente) values (?,?,?,?)";
        conn = new conexaoDAO().conectaBD();

        try {

            pstm = conn.prepareStatement(sql);
            pstm.setString(1, objcadcliente.getNome());
            pstm.setString(2, objcadcliente.getCpf());
            pstm.setString(3, objcadcliente.getEndereco());
            pstm.setString(4, objcadcliente.getTelefone());

            pstm.execute();
            pstm.close();

            JOptionPane.showMessageDialog(null, "CADASTRO CONCLUÍDO!");

        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "atmDAO - cadclienteDAO: " + erro);
        }

    }
    /*Esse método ele faz uma lista de registros da tabela atn_cliente*/
    public ArrayList<atn_cadclienteDTO> pesquisarCliente() {

        String sql = "SELECT * FROM atn_cliente";
        conn = new conexaoDAO().conectaBD();

        try {

            pstm = conn.prepareStatement(sql);
            rs = pstm.executeQuery();

            while (rs.next()) {

                atn_cadclienteDTO objcadclientedto = new atn_cadclienteDTO();
                objcadclientedto.setId_cliente(rs.getInt("id_cliente"));
                objcadclientedto.setNome(rs.getString("nome_cliente"));
                objcadclientedto.setCpf(rs.getString("cpf_cliente"));
                objcadclientedto.setEndereco(rs.getString("endereco_cliente"));
                objcadclientedto.setTelefone(rs.getString("telefone_cliente"));

                lista.add(objcadclientedto);

            }

        } catch (SQLException erro) {

            JOptionPane.showMessageDialog(null, "atnDAO - pesquisarCliente: " + erro);
        }

        return lista;

    }
    /*É um método que altera informações da tabela atn_cliente*/
    public void alterarCliente(atn_cadclienteDTO objcadclientedto) {

        String sql = "UPDATE atn_cliente SET nome_cliente = ?, cpf_cliente = ? , endereco_cliente = ?, telefone_cliente = ? where id_cliente = ?";
        conn = new conexaoDAO().conectaBD();

        try {

            pstm = conn.prepareStatement(sql);
            pstm.setString(1, objcadclientedto.getNome());
            pstm.setString(2, objcadclientedto.getCpf());
            pstm.setString(3, objcadclientedto.getEndereco());
            pstm.setString(4, objcadclientedto.getTelefone());
            pstm.setInt(5, objcadclientedto.getId_cliente());

            pstm.execute();
            pstm.close();

            JOptionPane.showMessageDialog(null, "ALTERAÇÃO CONCLUÍDA!");

        } catch (SQLException erro) {

            JOptionPane.showInternalMessageDialog(null, "atnDAO - alterarCliente: " + erro);

        }

    }
    /*É um método que deleta um registro da tabela atn_cliente*/
    public void deletarCliente(atn_cadclienteDTO objcadclientedto) {

        String sql = "DELETE FROM atn_cliente where id_cliente = ?";

        conn = new conexaoDAO().conectaBD();

        try {

            pstm = conn.prepareStatement(sql);

            pstm.setInt(1, objcadclientedto.getId_cliente());

            pstm.execute();
            pstm.close();

            JOptionPane.showMessageDialog(null, "REGISTRO DELETADO!");

        } catch (Exception erro) {

            JOptionPane.showInternalMessageDialog(null, "atnDAO - deletarCliente: " + erro);

        }

    }

    //-----
    /*É um método que traz a informações dos clientes através do ResultSet*/
    public ResultSet listarCliente() {

        conn = new conexaoDAO().conectaBD();
        String sql = "SELECT id_cliente, nome_cliente FROM atn_cliente ORDER BY nome_cliente;";

        try {

            pstm = conn.prepareStatement(sql);
            return pstm.executeQuery();

        } catch (SQLException erro) {

            JOptionPane.showMessageDialog(null, "atnDAO - listarCliente: " + erro.getMessage());
            return null;

        }

    }
    /*É um método que traz a informações das categorias através do ResultSet*/
    public ResultSet listarCategoria() {

        conn = new conexaoDAO().conectaBD();
        String sql = "SELECT id_categoria, descricao FROM atn_categoria ORDER BY descricao;";

        try {

            pstm = conn.prepareStatement(sql);
            return pstm.executeQuery();

        } catch (SQLException erro) {

            JOptionPane.showMessageDialog(null, "atnDAO - listarCategoria: " + erro.getMessage());
            return null;

        }

    }
    /*É um metodo que faz a inserção de dados na tabela atn_animal*/
    public void cadAnimalDAO(atn_cadanimalDTO objcadanimaldto) {

        String sql = "insert into atn_animal (nome_animal, idade_animal, sexo_animal, descricao_animal, categoria_animal, fk_cliente) values (?,?,?,?,?,?)";
        conn = new conexaoDAO().conectaBD();

        try {

            pstm = conn.prepareStatement(sql);
            pstm.setString(1, objcadanimaldto.getNome());
            pstm.setString(2, objcadanimaldto.getIdade());
            pstm.setString(3, objcadanimaldto.getSexo());
            pstm.setString(4, objcadanimaldto.getDescricao());
            pstm.setString(5, objcadanimaldto.getCategoria());
            pstm.setInt(6, objcadanimaldto.getFk_cliente());

            pstm.execute();
            pstm.close();

            JOptionPane.showMessageDialog(null, "CADASTRO CONCLUÍDO!");

        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "atnDAO - cadAnimalDAO: " + erro);
        }

    }
    /*O ArrayList é uma classe genérica que prepara uma lista de informações dos animais*/
    public ArrayList<atn_cadanimalDTO> pesquisarAnimais() {

        String sql = "SELECT * FROM atn_animal";
        conn = new conexaoDAO().conectaBD();

        try {

            pstm = conn.prepareStatement(sql);
            rs = pstm.executeQuery();

            while (rs.next()) {

                atn_cadanimalDTO objcadanimaldto = new atn_cadanimalDTO();
                objcadanimaldto.setId_animal(rs.getInt("id_animal"));
                objcadanimaldto.setNome(rs.getString("nome_animal"));
                objcadanimaldto.setIdade(rs.getString("idade_animal"));
                objcadanimaldto.setSexo(rs.getString("sexo_animal"));
                objcadanimaldto.setDescricao(rs.getString("descricao_animal"));
                objcadanimaldto.setFk_cliente(rs.getInt("fk_cliente"));
                objcadanimaldto.setCategoria(rs.getString("categoria_animal"));

                listaa.add(objcadanimaldto);

            }

        } catch (SQLException erro) {

            JOptionPane.showMessageDialog(null, "atnDAO - pesquisarAnimais: " + erro);
        }

        return listaa;

    }
    /*É um método que altera informações da tabela atn_animal*/
    public void alterarAnimal(atn_cadanimalDTO objcadanimaldto) {

        String sql = "UPDATE atn_animal SET nome_animal = ?, idade_animal = ? , sexo_animal = ?, descricao_animal = ?, fk_cliente = ?, categoria_animal = ? where id_animal = ?";
        conn = new conexaoDAO().conectaBD();

        try {

            pstm = conn.prepareStatement(sql);
            pstm.setString(1, objcadanimaldto.getNome());
            pstm.setString(2, objcadanimaldto.getIdade());
            pstm.setString(3, objcadanimaldto.getSexo());
            pstm.setString(4, objcadanimaldto.getDescricao());
            pstm.setInt(5, objcadanimaldto.getFk_cliente());
            pstm.setString(6, objcadanimaldto.getCategoria());
            pstm.setInt(7, objcadanimaldto.getId_animal());

            pstm.execute();
            pstm.close();

            JOptionPane.showMessageDialog(null, "ALTERAÇÃO CONCLUÍDA!");

        } catch (SQLException erro) {

            JOptionPane.showInternalMessageDialog(null, "atnDAO - alterarAnimal: " + erro);

        }

    }
    /*É um método que deleta um registro da tabela atn_animal*/
    public void deletarAnimal(atn_cadanimalDTO objcadanimaldto) {

        String sql = "DELETE FROM atn_animal where id_animal = ?";

        conn = new conexaoDAO().conectaBD();

        try {

            pstm = conn.prepareStatement(sql);

            pstm.setInt(1, objcadanimaldto.getId_animal());

            pstm.execute();
            pstm.close();

            JOptionPane.showMessageDialog(null, "REGISTRO DELETADO!");

        } catch (Exception erro) {

            JOptionPane.showInternalMessageDialog(null, "atnDAO - deletarAnimal: " + erro);

        }

    }
    /*É um metodo que faz a inserção de dados na tabela atn_agenda*/
    public void agendaDAO(atn_agendaDTO objagenda) {

        String sql = "insert into atn_agenda (data_agenda, tipo_agenda, sexo_agenda, categoria_agenda, descricao_agenda, nome_animal, fk_animal, vet_agenda) values (?,?,?,?,?,?,?,?)";
        conn = new conexaoDAO().conectaBD();

        try {

            pstm = conn.prepareStatement(sql);
            pstm.setString(1, objagenda.getData_agenda());
            pstm.setString(2, objagenda.getTipo_agenda());
            pstm.setString(3, objagenda.getSexo_agenda());
            pstm.setString(4, objagenda.getCategoria_agenda());
            pstm.setString(5, objagenda.getDescricao_agenda());
            pstm.setString(6, objagenda.getNome_animal());
            pstm.setInt(7, objagenda.getFk_animal());
            pstm.setString(8, objagenda.getVeterinario());

            pstm.execute();
            pstm.close();

            JOptionPane.showMessageDialog(null, "CADASTRO CONCLUÍDO!");

        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "atnDAO - cagendaDAO: " + erro);
        }

    }
    /*O ArrayList é uma classe genérica que prepara uma lista de informações da agenda*/
    public ArrayList<atn_agendaDTO> pesquisarAgenda() {

        String sql = "SELECT * FROM atn_agenda";
        conn = new conexaoDAO().conectaBD();

        try {

            pstm = conn.prepareStatement(sql);
            rs = pstm.executeQuery();

            while (rs.next()) {

                atn_agendaDTO objagenda = new atn_agendaDTO();
                objagenda.setId_agenda(rs.getInt("id_agenda"));
                objagenda.setData_agenda(rs.getString("data_agenda"));
                objagenda.setTipo_agenda(rs.getString("tipo_agenda"));
                objagenda.setSexo_agenda(rs.getString("sexo_agenda"));
                objagenda.setCategoria_agenda(rs.getString("categoria_agenda"));
                objagenda.setDescricao_agenda(rs.getString("descricao_agenda"));
                objagenda.setNome_animal(rs.getString("nome_animal"));
                objagenda.setFk_animal(rs.getInt("fk_animal"));
                objagenda.setVeterinario(rs.getString("vet_agenda"));

                listag.add(objagenda);

            }

        } catch (SQLException erro) {

            JOptionPane.showMessageDialog(null, "atnDAO - pesquisarAgenda: " + erro);
        }

        return listag;

    }
    /*É um método que altera informações da tabela atn_agenda*/
    public void alterarAgenda(atn_agendaDTO objagenda) {

        String sql = "UPDATE atn_agenda SET data_agenda = ?, tipo_agenda = ? where id_agenda = ?";
        conn = new conexaoDAO().conectaBD();

        try {

            pstm = conn.prepareStatement(sql);
            pstm.setString(1, objagenda.getData_agenda());
            pstm.setString(2, objagenda.getTipo_agenda());
            pstm.setInt(3, objagenda.getId_agenda());

            pstm.execute();
            pstm.close();

            JOptionPane.showMessageDialog(null, "DADOS DA CONSULTA ALTERADO!");

        } catch (SQLException erro) {

            JOptionPane.showInternalMessageDialog(null, "atnDAO - alterarAgenda: " + erro);

        }

    }
    /*O ArrayList é uma classe genérica que prepara uma lista de informações dos produtos*/
    public ArrayList<adm_cadprodutoDTO> relatorioVendas() {

        conn = new conexaoDAO().conectaBD();
        String sql = "select * from atn_vendas";

        try {

            pstm = conn.prepareStatement(sql);
            rs = pstm.executeQuery();

            while (rs.next()) {

                adm_cadprodutoDTO objadm_cadprodutoDTO = new adm_cadprodutoDTO();
                objadm_cadprodutoDTO.setId_produto(rs.getInt("id_venda"));
                objadm_cadprodutoDTO.setNome_produto(rs.getString("prod_venda"));
                objadm_cadprodutoDTO.setPreco_venda(rs.getString("valor_venda"));
                objadm_cadprodutoDTO.setQuantidade_produto(rs.getString("quant_venda"));
                objadm_cadprodutoDTO.setData(rs.getString("data_venda"));

                listaRe.add(objadm_cadprodutoDTO);
            }

        } catch (SQLException erro) {

            JOptionPane.showMessageDialog(null, "atnDAO - relatorioVendas: " + erro.getMessage());
            return null;

        }

        return listaRe;

    }

    
}
