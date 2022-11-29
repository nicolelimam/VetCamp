package dao;

import dto.adm_cadusuarioDTO;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

public class loginDAO {

    Connection conn;
    PreparedStatement pstm;
    ResultSet rs;

    public ResultSet autenticacaoUsuario(adm_cadusuarioDTO obj) {
        conn = new conexaoDAO().conectaBD();

        try {

            String sql = "Select fk_cargo from adm_usuario where login_usuario = ? and login_senha = ? ";
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, obj.getUsuario());
            pstm.setString(2, obj.getSenha());
            rs = pstm.executeQuery();
            return rs;

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "loginDAO - autenticacaoUsuario: " + erro);
            return null;
        }
    }

}
