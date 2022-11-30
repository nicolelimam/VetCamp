
package dao;

import dto.vet_atendimentoDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import view.vet_consultaFichaVIEW;


public class vetDAO {
    
    Connection conn;
    PreparedStatement pstm;
    ResultSet rs;
    ArrayList<vet_atendimentoDTO> listahc = new ArrayList<>();
    
    // método para inserir os valores da tabelaFicha
    public void cadFicha(vet_atendimentoDTO objatendimento) {

        String sql = "insert into vet_ficha (nome_ficha, idade_ficha, sexo_ficha, categoria_ficha, descricao_ficha, prescricao_ficha) values (?,?,?,?,?,?)";
        conn = new conexaoDAO().conectaBD();

        try {

            pstm = conn.prepareStatement(sql);
            pstm.setString(1, objatendimento.getNome());
            pstm.setString(2, objatendimento.getIdade());
            pstm.setString(3, objatendimento.getSexo());
            pstm.setString(4, objatendimento.getCategoria());
            pstm.setString(5, objatendimento.getDescricao());
            pstm.setString(6, objatendimento.getPrescricao());

            pstm.execute();
            pstm.close();

            JOptionPane.showMessageDialog(null, "ATENDIMENTO FINALIZADO!");

        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "vetDAO - cadFicha: " + erro);
        }

    }
   // Está trazendo os registros do banco de dados para a tabela de consulta
    public ArrayList<vet_atendimentoDTO> pesquisarConsulta() {

        vet_consultaFichaVIEW objvetconsulta = new vet_consultaFichaVIEW();

        String sql = "SELECT id_ficha, nome_ficha, idade_ficha, sexo_ficha, categoria_ficha from vet_ficha where nome_ficha like '" + objvetconsulta.print + "%'";
        conn = new conexaoDAO().conectaBD();

        try {

            pstm = conn.prepareStatement(sql);
            rs = pstm.executeQuery();
            
                while (rs.next()) {
                    
                    vet_atendimentoDTO objvet = new vet_atendimentoDTO();
                    objvet.setId(rs.getInt("id_ficha"));
                    objvet.setNome(rs.getString("nome_ficha"));
                    objvet.setIdade(rs.getString("idade_ficha"));
                    objvet.setSexo(rs.getString("sexo_ficha"));
                    objvet.setCategoria(rs.getString("categoria_ficha"));

                    listahc.add(objvet);
                    
                }
            
           
            

        } catch (SQLException erro) {

            JOptionPane.showMessageDialog(null, "atnDAO - pesquisarConsultar: " + erro);
        }

        return listahc;

    }
}
