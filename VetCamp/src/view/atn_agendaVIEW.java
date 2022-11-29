package view;

import dao.atnDAO;
import dao.conexaoDAO;
import dto.atn_agendaDTO;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class atn_agendaVIEW extends javax.swing.JFrame {

    public atn_agendaVIEW() {
        initComponents();
        setLocationRelativeTo(null);
        txtIDAgenda.setVisible(false);
        txtNome.setEnabled(false);
        txtSexo.setEnabled(false);
        txtCategoria.setEnabled(false);
        txtDescricao.setEnabled(false);
        listarAgenda();
    }

    Connection conn;
    PreparedStatement pstm;
    ResultSet rs;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel_cadcliente = new javax.swing.JLabel();
        jPanel_dados = new javax.swing.JPanel();
        txtVeterinario = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtCategoria = new javax.swing.JTextField();
        txtData = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtDescricao = new javax.swing.JTextField();
        txtIDAgenda = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtSexo = new javax.swing.JTextField();
        txtNome = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtTipo = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        btnCadastrar = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btncarregarCampo = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaAgenda = new javax.swing.JTable();
        btnLimpar = new javax.swing.JButton();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel_cadcliente.setFont(new java.awt.Font("SansSerif", 1, 30)); // NOI18N
        jLabel_cadcliente.setForeground(new java.awt.Color(244, 249, 252));
        jLabel_cadcliente.setText("Agenda");
        getContentPane().add(jLabel_cadcliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 10, -1, 40));

        jPanel_dados.setBackground(new java.awt.Color(255, 251, 251));
        jPanel_dados.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)), "Dados", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Dialog", 0, 12), new java.awt.Color(51, 51, 51))); // NOI18N
        jPanel_dados.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtVeterinario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtVeterinarioKeyPressed(evt);
            }
        });
        jPanel_dados.add(txtVeterinario, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 45, 120, 25));

        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Horario");
        jPanel_dados.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, -1));

        jLabel8.setForeground(new java.awt.Color(51, 51, 51));
        jLabel8.setText("Descrição");
        jPanel_dados.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 90, -1, -1));

        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Categoria");
        jPanel_dados.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 90, -1, -1));
        jPanel_dados.add(txtCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 105, 110, 25));
        jPanel_dados.add(txtData, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 45, 90, 25));

        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("ID");
        jPanel_dados.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, -1));

        txtID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtIDKeyPressed(evt);
            }
        });
        jPanel_dados.add(txtID, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 105, 30, 25));

        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("Nome");
        jPanel_dados.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, -1, -1));
        jPanel_dados.add(txtDescricao, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 105, 320, 25));
        jPanel_dados.add(txtIDAgenda, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 45, 30, 25));

        jLabel9.setForeground(new java.awt.Color(51, 51, 51));
        jLabel9.setText("Veterinário");
        jPanel_dados.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 30, -1, -1));
        jPanel_dados.add(txtSexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 105, 110, 25));
        jPanel_dados.add(txtNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 105, 150, 25));

        jLabel10.setForeground(new java.awt.Color(51, 51, 51));
        jLabel10.setText("Sexo");
        jPanel_dados.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 90, -1, -1));
        jPanel_dados.add(txtTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 45, 120, 25));

        jLabel11.setForeground(new java.awt.Color(51, 51, 51));
        jLabel11.setText("Tipo");
        jPanel_dados.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 30, -1, -1));

        getContentPane().add(jPanel_dados, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 790, 140));

        btnCadastrar.setText("Agendar");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCadastrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 80, 90, 35));

        btnAlterar.setText("Editar");
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });
        getContentPane().add(btnAlterar, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 120, 90, 35));

        btncarregarCampo.setText("Carregar");
        btncarregarCampo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncarregarCampoActionPerformed(evt);
            }
        });
        getContentPane().add(btncarregarCampo, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 200, 90, 35));

        tabelaAgenda.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "DATA", "TIPO", "VETERINÁRIO", "ID ANIMAL", "NOME", "SEXO", "CATEGORIA", "DESCRIÇÃO"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabelaAgenda);
        if (tabelaAgenda.getColumnModel().getColumnCount() > 0) {
            tabelaAgenda.getColumnModel().getColumn(0).setPreferredWidth(10);
        }

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 251, 930, 380));

        btnLimpar.setText("Limpar");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });
        getContentPane().add(btnLimpar, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 160, 90, 35));
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 960, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtIDKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIDKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {

            int cod = Integer.parseInt(txtID.getText());
            String sql = "Select nome_animal, sexo_animal, categoria_animal, descricao_animal from atn_animal where id_animal = ?";
            conn = new conexaoDAO().conectaBD();

            try {

                pstm = conn.prepareStatement(sql);
                pstm.setInt(1, cod);
                rs = pstm.executeQuery();

                if (rs.next() == false) {
                    JOptionPane.showMessageDialog(null, "Cadastro do animal não encontrado!");
                } else {

                    String nome, sexo, categoria, descricao;

                    nome = rs.getString("nome_animal");
                    sexo = rs.getString("sexo_animal");
                    categoria = rs.getString("categoria_animal");
                    descricao = rs.getString("descricao_animal");

                    txtNome.setText(nome.trim());
                    txtSexo.setText(sexo.trim());
                    txtCategoria.setText(categoria.trim());
                    txtDescricao.setText(descricao.trim());
                }

            } catch (Exception e) {

                JOptionPane.showMessageDialog(null, "atn_agendaVIEW - KeyPressed: " + e);
            }
        }
    }//GEN-LAST:event_txtIDKeyPressed

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        Agendar();
        limparCampos();
        listarAgenda();
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void btncarregarCampoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncarregarCampoActionPerformed
        carregarCampos();
    }//GEN-LAST:event_btncarregarCampoActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        AlterarAgenda();
        limparCampos();
        listarAgenda();
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void txtVeterinarioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtVeterinarioKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {

            String sql = "SELECT nome_usuario from adm_usuario where fk_cargo = 3 and nome_usuario like '" + txtVeterinario.getText() + "%'";
            conn = new conexaoDAO().conectaBD();

            try {
                pstm = conn.prepareStatement(sql);
                rs = pstm.executeQuery();

                if (rs.next() == false) {
                    JOptionPane.showMessageDialog(null, "Veterinário não encontrado!");
                } else {

                    String vet;

                    txtVeterinario.setText("");
                    vet = rs.getString("nome_usuario");
                    txtVeterinario.setText(vet.trim());

                }
            } catch (Exception e) {

                JOptionPane.showMessageDialog(null, "atn_agendaVIEW - KeyPressed: ");
            }
        }
    }//GEN-LAST:event_txtVeterinarioKeyPressed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        limparCampos();
    }//GEN-LAST:event_btnLimparActionPerformed

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
            java.util.logging.Logger.getLogger(atn_agendaVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(atn_agendaVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(atn_agendaVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(atn_agendaVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new atn_agendaVIEW().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btncarregarCampo;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel_cadcliente;
    private javax.swing.JPanel jPanel_dados;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelaAgenda;
    private javax.swing.JTextField txtCategoria;
    private javax.swing.JTextField txtData;
    private javax.swing.JTextField txtDescricao;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtIDAgenda;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtSexo;
    private javax.swing.JTextField txtTipo;
    private javax.swing.JTextField txtVeterinario;
    // End of variables declaration//GEN-END:variables

    private void Agendar() {

        String data, tipo, sexo, categoria, descricao, nome_animal, vet;
        int id_animal;

        data = txtData.getText();
        tipo = txtTipo.getText();
        sexo = txtSexo.getText();
        categoria = txtCategoria.getText();
        descricao = txtDescricao.getText();
        nome_animal = txtNome.getText();
        id_animal = Integer.parseInt(txtID.getText());
        vet = txtVeterinario.getText();

        atn_agendaDTO objagenda = new atn_agendaDTO();

        objagenda.setData_agenda(data);
        objagenda.setTipo_agenda(tipo);
        objagenda.setSexo_agenda(sexo);
        objagenda.setCategoria_agenda(categoria);
        objagenda.setDescricao_agenda(descricao);
        objagenda.setNome_animal(nome_animal);
        objagenda.setFk_animal(id_animal);
        objagenda.setVeterinario(vet);

        atnDAO objatn = new atnDAO();
        objatn.agendaDAO(objagenda);

    }

    private void limparCampos() {

        txtVeterinario.setEnabled(true);
        txtID.setEnabled(true);

        txtData.setText("");
        txtVeterinario.setText("");
        txtID.setText("");
        txtNome.setText("");
        txtIDAgenda.setText("");
        txtSexo.setText("");
        txtTipo.setText("");
        txtVeterinario.setText("");
        txtCategoria.setText("");
        txtDescricao.setText("");
        txtData.requestFocus();
    }

    private void listarAgenda() {

        try {

            atnDAO objatn = new atnDAO();

            DefaultTableModel model = (DefaultTableModel) tabelaAgenda.getModel();
            model.setNumRows(0);

            ArrayList<atn_agendaDTO> listag = objatn.pesquisarAgenda();

            for (int num = 0; num < listag.size(); num++) {

                model.addRow(new Object[]{
                    listag.get(num).getId_agenda(),
                    listag.get(num).getData_agenda(),
                    listag.get(num).getTipo_agenda(),
                    listag.get(num).getVeterinario(),
                    listag.get(num).getFk_animal(),
                    listag.get(num).getNome_animal(),
                    listag.get(num).getSexo_agenda(),
                    listag.get(num).getCategoria_agenda(),
                    listag.get(num).getDescricao_agenda()
                });
            }

        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "atn_agendaVIEW - listarAgenda: " + erro);
        }
    }

    private void carregarCampos() {

        int setar = tabelaAgenda.getSelectedRow();

        txtVeterinario.setEnabled(false);
        txtID.setEnabled(false);

        txtIDAgenda.setText(tabelaAgenda.getModel().getValueAt(setar, 0).toString());
        txtData.setText(tabelaAgenda.getModel().getValueAt(setar, 1).toString());
        txtTipo.setText(tabelaAgenda.getModel().getValueAt(setar, 2).toString());
        txtVeterinario.setText(tabelaAgenda.getModel().getValueAt(setar, 3).toString());
        txtID.setText(tabelaAgenda.getModel().getValueAt(setar, 4).toString());
        txtNome.setText(tabelaAgenda.getModel().getValueAt(setar, 5).toString());
        txtSexo.setText(tabelaAgenda.getModel().getValueAt(setar, 6).toString());
        txtCategoria.setText(tabelaAgenda.getModel().getValueAt(setar, 7).toString());
        txtDescricao.setText(tabelaAgenda.getModel().getValueAt(setar, 8).toString());
    }

    private void AlterarAgenda() {

        String data, tipo;
        int id_agenda;

        id_agenda = Integer.parseInt(txtIDAgenda.getText());
        data = txtData.getText();
        tipo = txtTipo.getText();

        atn_agendaDTO objagenda = new atn_agendaDTO();

        objagenda.setId_agenda(id_agenda);
        objagenda.setData_agenda(data);
        objagenda.setTipo_agenda(tipo);

        atnDAO objatn = new atnDAO();
        objatn.alterarAgenda(objagenda);

    }

}
