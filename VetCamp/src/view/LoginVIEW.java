/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import dao.loginDAO;
import dto.adm_cadusuarioDTO;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import java.sql.SQLException;
import view.adm_telaprincipalVIEW;
import view.atn_telaprincipalVIEW;
import view.vet_telaprincipalVIEW;

/**
 *
 * @author nanabe
 */
public class LoginVIEW extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public LoginVIEW() {
        initComponents();
        setLocationRelativeTo(null);
    }

    public static String user;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpSenha = new javax.swing.JPasswordField();
        btnEntrar = new javax.swing.JButton();
        txtUsuario = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle(" ");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jpSenha.setBackground(new java.awt.Color(255, 255, 255));
        jpSenha.setFont(new java.awt.Font("Liberation Sans", 1, 13)); // NOI18N
        jpSenha.setForeground(new java.awt.Color(0, 0, 0));
        jpSenha.setAlignmentX(0.0F);
        jpSenha.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(203, 222, 51)));
        jpSenha.setCaretColor(new java.awt.Color(0, 0, 0));
        getContentPane().add(jpSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 330, 280, 40));

        btnEntrar.setBackground(new java.awt.Color(241, 255, 129));
        btnEntrar.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        btnEntrar.setForeground(new java.awt.Color(0, 0, 0));
        btnEntrar.setText("ENTRAR");
        btnEntrar.setAlignmentY(1.0F);
        btnEntrar.setBorder(null);
        btnEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnEntrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 390, 160, 60));

        txtUsuario.setBackground(new java.awt.Color(255, 255, 255));
        txtUsuario.setFont(new java.awt.Font("Liberation Sans", 1, 13)); // NOI18N
        txtUsuario.setForeground(new java.awt.Color(0, 0, 0));
        txtUsuario.setAlignmentX(0.0F);
        txtUsuario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(203, 222, 51)));
        txtUsuario.setCaretColor(new java.awt.Color(0, 0, 0));
        getContentPane().add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 260, 280, 40));

        jLabel1.setFont(new java.awt.Font("Liberation Sans", 1, 13)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Usuário:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 240, -1, 20));

        jLabel2.setFont(new java.awt.Font("Liberation Sans", 1, 13)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Senha:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 310, -1, -1));

        background.setIcon(new javax.swing.ImageIcon("/home/linguini/Downloads/Group 12 (1).png")); // NOI18N
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 480, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntrarActionPerformed

        Login();

    }//GEN-LAST:event_btnEntrarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LoginVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginVIEW().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JButton btnEntrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPasswordField jpSenha;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables

    private void Login() {

        try {

            String nome, senha;

            nome = txtUsuario.getText();
            senha = jpSenha.getText();

            adm_cadusuarioDTO obj = new adm_cadusuarioDTO();
            obj.setUsuario(nome);
            obj.setSenha(senha);

            loginDAO objlogin = new loginDAO();
            ResultSet rslogin = objlogin.autenticacaoUsuario(obj);

            if (rslogin.next()) {

                user = txtUsuario.getText();

                int cargo;

                cargo = rslogin.getInt("fk_cargo");

                if (cargo == 1) {

                    adm_telaprincipalVIEW objadm = new adm_telaprincipalVIEW();
                    objadm.setVisible(true);

                }
                if (cargo == 2) {

                    atn_telaprincipalVIEW objatn = new atn_telaprincipalVIEW();
                    objatn.setVisible(true);

                }
                if (cargo == 3) {

                    vet_telaprincipalVIEW objvet = new vet_telaprincipalVIEW();
                    objvet.setVisible(true);
                }

                txtUsuario.setText("");
                jpSenha.setText("");

                dispose();

            } else {
                JOptionPane.showMessageDialog(null, "Usuário ou senha inválida!");
            }

        } catch (SQLException erro) {

            JOptionPane.showMessageDialog(null, "Login - Login: " + erro);

        }

    }
}
