
package view;

import dao.admDAO;
import dao.conexaoDAO;
import dao.vetDAO;
import dto.adm_cadfornecedorDTO;
import dto.vet_atendimentoDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author nanabe
 */
public class vet_consultaFichaVIEW extends javax.swing.JFrame {

    /**
     * Creates new form vet_consultaFichaVIEW
     */
    public vet_consultaFichaVIEW() {
        initComponents();
    }
    
    Connection conn;
    PreparedStatement pstm;
    ResultSet rs;
    
    public static String print;
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelFicha = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        txtIdade = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtSexo = new javax.swing.JTextField();
        txtCategoria = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtDescricao = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtPrescricao = new javax.swing.JTextArea();
        txtNome = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaConsulta = new javax.swing.JTable();
        jLabelArgumento = new javax.swing.JLabel();
        btnVoltar = new javax.swing.JButton();
        txtPesq = new javax.swing.JTextField();
        btnPesquisar = new javax.swing.JButton();
        btnCarregar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelFicha.setBackground(new java.awt.Color(255, 255, 255));
        panelFicha.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panelFicha.setForeground(new java.awt.Color(255, 255, 255));
        panelFicha.setToolTipText("");
        panelFicha.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("Prescrição:");
        panelFicha.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 20, -1, -1));
        panelFicha.add(txtIdade, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 120, 30));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("Idade:");
        panelFicha.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setText("Sexo:");
        panelFicha.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 90, -1, -1));
        panelFicha.add(txtSexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 110, 120, 30));
        panelFicha.add(txtCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 250, 30));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setText("Categoria:");
        panelFicha.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setText("Descrição:");
        panelFicha.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, -1, -1));
        panelFicha.add(txtDescricao, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 250, 30));

        txtPrescricao.setColumns(20);
        txtPrescricao.setRows(5);
        txtPrescricao.setBorder(null);
        jScrollPane2.setViewportView(txtPrescricao);

        panelFicha.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 40, 260, 230));
        panelFicha.add(txtNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 250, 30));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel13.setText("Nome:");
        panelFicha.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        getContentPane().add(panelFicha, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 560, 300));

        tabelaConsulta.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tabelaConsulta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "NOME", "IDADE", "SEXO", "CATEGORIA"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabelaConsulta);
        if (tabelaConsulta.getColumnModel().getColumnCount() > 0) {
            tabelaConsulta.getColumnModel().getColumn(0).setResizable(false);
            tabelaConsulta.getColumnModel().getColumn(0).setPreferredWidth(3);
            tabelaConsulta.getColumnModel().getColumn(1).setResizable(false);
            tabelaConsulta.getColumnModel().getColumn(2).setResizable(false);
            tabelaConsulta.getColumnModel().getColumn(3).setResizable(false);
            tabelaConsulta.getColumnModel().getColumn(4).setResizable(false);
        }

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 30, 520, 360));

        jLabelArgumento.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelArgumento.setText("Argumento por consulta:");
        getContentPane().add(jLabelArgumento, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 160, -1));

        btnVoltar.setBackground(new java.awt.Color(255, 255, 255));
        btnVoltar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });
        getContentPane().add(btnVoltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 400, 110, 40));
        getContentPane().add(txtPesq, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 290, 30));

        btnPesquisar.setBackground(new java.awt.Color(255, 255, 255));
        btnPesquisar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnPesquisar.setText("Buscar");
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });
        getContentPane().add(btnPesquisar, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 40, -1, 30));

        btnCarregar.setBackground(new java.awt.Color(255, 255, 255));
        btnCarregar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnCarregar.setText("Carregar");
        btnCarregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCarregarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCarregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 400, 110, 40));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1140, 460));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        print = txtPesq.getText();
        listarConsulta();
    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void btnCarregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCarregarActionPerformed
        carregar();
    }//GEN-LAST:event_btnCarregarActionPerformed

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
            java.util.logging.Logger.getLogger(vet_consultaFichaVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(vet_consultaFichaVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(vet_consultaFichaVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(vet_consultaFichaVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new vet_consultaFichaVIEW().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCarregar;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelArgumento;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel panelFicha;
    private javax.swing.JTable tabelaConsulta;
    private javax.swing.JTextField txtCategoria;
    private javax.swing.JTextField txtDescricao;
    private javax.swing.JTextField txtIdade;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtPesq;
    private javax.swing.JTextArea txtPrescricao;
    private javax.swing.JTextField txtSexo;
    // End of variables declaration//GEN-END:variables

private void carregar(){
    
    int setar = tabelaConsulta.getSelectedRow();
    
    int pesq = Integer.parseInt(tabelaConsulta.getModel().getValueAt(setar, 0).toString());
    
    String sql = "SELECT nome_ficha, idade_ficha, sexo_ficha, categoria_ficha, descricao_ficha, prescricao_ficha from vet_ficha where id_ficha = ?";
            conn = new conexaoDAO().conectaBD();

            try {
                
                pstm = conn.prepareStatement(sql);
                pstm.setInt(1, pesq);
                rs = pstm.executeQuery();

                if (rs.next() == false) {
                    JOptionPane.showMessageDialog(null, "Erro ao exibir os dados!");
                } else {
                    
                    
                    String nome, idade, sexo, categoria, descricao, prescricao;

                    txtPesq.setText("");
                    
                    nome = rs.getString("nome_ficha");
                    idade = rs.getString("idade_ficha");
                    sexo = rs.getString("sexo_ficha");
                    categoria = rs.getString("categoria_ficha");
                    descricao = rs.getString("descricao_ficha");
                    prescricao = rs.getString("prescricao_ficha");
                    
                    
                    txtNome.setText(nome.trim());
                    txtIdade.setText(idade.trim());
                    txtSexo.setText(sexo.trim());
                    txtCategoria.setText(categoria.trim());
                    txtDescricao.setText(descricao.trim());
                    txtPrescricao.setText(prescricao.trim());
                    
                    

                }
            } catch (Exception e) {

                JOptionPane.showMessageDialog(null, "atn_ConsultarFichaVIEW - : " + e);
            }
        }
    private void listarConsulta() {

        try {
            
            vetDAO objvet = new vetDAO();

            DefaultTableModel model = (DefaultTableModel) tabelaConsulta.getModel();
            model.setNumRows(0);

            ArrayList<vet_atendimentoDTO> listahc = objvet.pesquisarConsulta();

            for (int num = 0; num < listahc.size(); num++) {

                model.addRow(new Object[]{
                    listahc.get(num).getId(),
                    listahc.get(num).getNome(),
                    listahc.get(num).getIdade(),
                    listahc.get(num).getSexo(),
                    listahc.get(num).getCategoria()
                    
                });
            }

        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "vet_consultaFichaVIEW - listarConsulta: " + erro);
        }
    }       


}


