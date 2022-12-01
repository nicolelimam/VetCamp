/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import dao.conexaoDAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author nanabe
 */
public class adm_fincontrolecaixawndVIEW extends javax.swing.JFrame {

    /**
     * Creates new form adm_fincontrolecaixawndVIEW
     */
    public adm_fincontrolecaixawndVIEW() {
        initComponents();
        setLocationRelativeTo(null);
    }
    
    Connection conn;
    PreparedStatement pstm;
    ResultSet rs;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel_Dados = new javax.swing.JLabel();
        jLabel_Descricao = new javax.swing.JLabel();
        jLabel_Tipo = new javax.swing.JLabel();
        jLabel_Data = new javax.swing.JLabel();
        txtData = new javax.swing.JTextField();
        txtDescricao = new javax.swing.JTextField();
        txtTipo = new javax.swing.JTextField();
        txtValor = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();
        btnVoltar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Controle de Caixa");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel_Dados.setFont(new java.awt.Font("Liberation Sans", 1, 13)); // NOI18N
        jLabel_Dados.setForeground(new java.awt.Color(0, 0, 0));
        jLabel_Dados.setText("Valor:");
        getContentPane().add(jLabel_Dados, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 100, -1, -1));

        jLabel_Descricao.setFont(new java.awt.Font("Liberation Sans", 1, 13)); // NOI18N
        jLabel_Descricao.setForeground(new java.awt.Color(0, 0, 0));
        jLabel_Descricao.setText("Descrição:");
        getContentPane().add(jLabel_Descricao, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 84, -1));

        jLabel_Tipo.setFont(new java.awt.Font("Liberation Sans", 1, 13)); // NOI18N
        jLabel_Tipo.setForeground(new java.awt.Color(0, 0, 0));
        jLabel_Tipo.setText("Tipo:");
        getContentPane().add(jLabel_Tipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 30, -1, -1));

        jLabel_Data.setFont(new java.awt.Font("Liberation Sans", 1, 13)); // NOI18N
        jLabel_Data.setForeground(new java.awt.Color(0, 0, 0));
        jLabel_Data.setText("Data:");
        getContentPane().add(jLabel_Data, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        txtData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDataActionPerformed(evt);
            }
        });
        getContentPane().add(txtData, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 100, 30));

        txtDescricao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDescricaoActionPerformed(evt);
            }
        });
        getContentPane().add(txtDescricao, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 290, 30));

        txtTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTipoActionPerformed(evt);
            }
        });
        getContentPane().add(txtTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 50, 170, 30));

        txtValor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtValorActionPerformed(evt);
            }
        });
        getContentPane().add(txtValor, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 120, 90, 30));

        btnAdd.setBackground(new java.awt.Color(241, 255, 129));
        btnAdd.setFont(new java.awt.Font("Liberation Sans", 1, 13)); // NOI18N
        btnAdd.setForeground(new java.awt.Color(0, 0, 0));
        btnAdd.setText("Adicionar");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        getContentPane().add(btnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, -1, 40));

        btnLimpar.setBackground(new java.awt.Color(241, 255, 129));
        btnLimpar.setFont(new java.awt.Font("Liberation Sans", 1, 13)); // NOI18N
        btnLimpar.setForeground(new java.awt.Color(0, 0, 0));
        btnLimpar.setText("Limpar");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });
        getContentPane().add(btnLimpar, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 180, 90, 40));

        btnVoltar.setBackground(new java.awt.Color(241, 255, 129));
        btnVoltar.setFont(new java.awt.Font("Liberation Sans", 1, 13)); // NOI18N
        btnVoltar.setForeground(new java.awt.Color(0, 0, 0));
        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });
        getContentPane().add(btnVoltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 180, 90, 41));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/BACKGROUND-3.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 450, 250));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDataActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDataActionPerformed

    private void txtDescricaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDescricaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDescricaoActionPerformed

    private void txtTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTipoActionPerformed

    private void txtValorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtValorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtValorActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        controleCaixa();
        limparCampos();
        dispose();
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        limparCampos();
    }//GEN-LAST:event_btnLimparActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed

        dispose();
    }//GEN-LAST:event_btnVoltarActionPerformed

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
            java.util.logging.Logger.getLogger(adm_fincontrolecaixawndVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(adm_fincontrolecaixawndVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(adm_fincontrolecaixawndVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(adm_fincontrolecaixawndVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new adm_fincontrolecaixawndVIEW().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel_Dados;
    private javax.swing.JLabel jLabel_Data;
    private javax.swing.JLabel jLabel_Descricao;
    private javax.swing.JLabel jLabel_Tipo;
    private javax.swing.JTextField txtData;
    private javax.swing.JTextField txtDescricao;
    private javax.swing.JTextField txtTipo;
    private javax.swing.JTextField txtValor;
    // End of variables declaration//GEN-END:variables

private void controleCaixa() {

        String usuario;

        LoginVIEW objlogin = new LoginVIEW();

        usuario = objlogin.user;

        String sql = "Insert into adm_control(data_control, tipo_control, descricao_control, valor_control, funcionario_control) values(?,?,?,?,?)";
        conn = new conexaoDAO().conectaBD();

        try {

            pstm = conn.prepareStatement(sql);

            pstm.setString(1, txtData.getText());
            pstm.setString(2, txtTipo.getText());
            pstm.setString(3, txtDescricao.getText());
            pstm.setString(4, txtValor.getText());
            pstm.setString(5, usuario);

            pstm.execute();
            pstm.close();
            

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "adm_fincontrolecaixawndVIEW - controleCaixa: " + e);
        }

    }

private void limparCampos(){
    
    txtData.setText("");
    txtDescricao.setText("");
    txtTipo.setText("");
    txtValor.setText("");
    
    txtData.requestFocus();
    
    adm_fincontrolecaixaVIEW objcontrole = new adm_fincontrolecaixaVIEW();
    objcontrole.listarControl();
}



}
