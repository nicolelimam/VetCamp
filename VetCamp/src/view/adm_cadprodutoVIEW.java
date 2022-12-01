/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import dao.admDAO;
import dto.adm_cadprodutoDTO;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author nanabe
 */
public class adm_cadprodutoVIEW extends javax.swing.JFrame {

    /**
     * Creates new form adm_cadprodutoVIEW
     */
    public adm_cadprodutoVIEW() {
        initComponents();
        setLocationRelativeTo(null);
        txtId.setVisible(false);
        dadosComboBox();
        listarProduto();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel_dados = new javax.swing.JPanel();
        lblData = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtQuantidade = new javax.swing.JTextField();
        cbxFornecedor = new javax.swing.JComboBox<>();
        txtpVenda = new javax.swing.JTextField();
        txtValidade = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtpUnit = new javax.swing.JTextField();
        txtId = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtData = new javax.swing.JTextField();
        txtProduto = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelaProduto = new javax.swing.JTable();
        btncarregarCampo = new javax.swing.JButton();
        btnCadastrar = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Produto");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel_dados.setBackground(new java.awt.Color(255, 255, 255));
        jPanel_dados.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Dialog", 0, 12))); // NOI18N
        jPanel_dados.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblData.setFont(new java.awt.Font("Liberation Sans", 1, 13)); // NOI18N
        lblData.setText("Data:");
        jPanel_dados.add(lblData, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 30, 50, -1));

        jLabel2.setFont(new java.awt.Font("Liberation Sans", 1, 13)); // NOI18N
        jLabel2.setText("Produto:");
        jPanel_dados.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));

        jLabel3.setFont(new java.awt.Font("Liberation Sans", 1, 13)); // NOI18N
        jLabel3.setText("Quantidade:");
        jPanel_dados.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));

        jLabel4.setFont(new java.awt.Font("Liberation Sans", 1, 13)); // NOI18N
        jLabel4.setText("Validade:");
        jPanel_dados.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, -1, -1));

        jLabel5.setFont(new java.awt.Font("Liberation Sans", 1, 13)); // NOI18N
        jLabel5.setText("Preço Venda:");
        jPanel_dados.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 280, -1, -1));
        jPanel_dados.add(txtQuantidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 250, 30));

        cbxFornecedor.setFont(new java.awt.Font("Liberation Sans", 1, 13)); // NOI18N
        cbxFornecedor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione" }));
        jPanel_dados.add(cbxFornecedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 130, 30));
        jPanel_dados.add(txtpVenda, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 300, 110, 30));
        jPanel_dados.add(txtValidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 250, 30));

        jLabel6.setFont(new java.awt.Font("Liberation Sans", 1, 13)); // NOI18N
        jLabel6.setText("Preço Unit.:");
        jPanel_dados.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, -1, -1));
        jPanel_dados.add(txtpUnit, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 110, 30));

        txtId.setEditable(false);
        txtId.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel_dados.add(txtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 20, 40, -1));

        jLabel7.setFont(new java.awt.Font("Liberation Sans", 1, 13)); // NOI18N
        jLabel7.setText("Fornecedor:");
        jPanel_dados.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        txtData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDataActionPerformed(evt);
            }
        });
        jPanel_dados.add(txtData, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 50, 110, 30));
        jPanel_dados.add(txtProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 250, 30));

        getContentPane().add(jPanel_dados, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 300, 360));

        tabelaProduto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Fornecedor", "Produto", "Quantidade", "Validade", "Preço Unit.", "Preço Venda"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tabelaProduto);
        if (tabelaProduto.getColumnModel().getColumnCount() > 0) {
            tabelaProduto.getColumnModel().getColumn(0).setResizable(false);
            tabelaProduto.getColumnModel().getColumn(0).setPreferredWidth(10);
            tabelaProduto.getColumnModel().getColumn(1).setResizable(false);
            tabelaProduto.getColumnModel().getColumn(2).setResizable(false);
            tabelaProduto.getColumnModel().getColumn(3).setResizable(false);
            tabelaProduto.getColumnModel().getColumn(4).setResizable(false);
            tabelaProduto.getColumnModel().getColumn(5).setResizable(false);
        }

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 80, 580, 430));

        btncarregarCampo.setBackground(new java.awt.Color(255, 255, 255));
        btncarregarCampo.setFont(new java.awt.Font("Liberation Sans", 1, 13)); // NOI18N
        btncarregarCampo.setText("Carregar Campos");
        btncarregarCampo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncarregarCampoActionPerformed(evt);
            }
        });
        getContentPane().add(btncarregarCampo, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 520, 150, 35));

        btnCadastrar.setBackground(new java.awt.Color(0, 204, 51));
        btnCadastrar.setFont(new java.awt.Font("Liberation Sans", 1, 13)); // NOI18N
        btnCadastrar.setForeground(new java.awt.Color(255, 255, 255));
        btnCadastrar.setText("Salvar");
        btnCadastrar.setBorder(null);
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCadastrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 460, 80, 35));

        btnAlterar.setBackground(new java.awt.Color(255, 255, 255));
        btnAlterar.setFont(new java.awt.Font("Liberation Sans", 1, 13)); // NOI18N
        btnAlterar.setText("Editar");
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });
        getContentPane().add(btnAlterar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 460, 80, 35));

        btnExcluir.setBackground(new java.awt.Color(255, 51, 51));
        btnExcluir.setFont(new java.awt.Font("Liberation Sans", 1, 13)); // NOI18N
        btnExcluir.setForeground(new java.awt.Color(255, 255, 255));
        btnExcluir.setText("Excluir");
        btnExcluir.setBorder(null);
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });
        getContentPane().add(btnExcluir, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 460, 80, 35));

        btnLimpar.setBackground(new java.awt.Color(255, 255, 255));
        btnLimpar.setFont(new java.awt.Font("Liberation Sans", 1, 13)); // NOI18N
        btnLimpar.setText("Limpar");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });
        getContentPane().add(btnLimpar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 510, 80, 35));

        btnSair.setBackground(new java.awt.Color(255, 255, 255));
        btnSair.setFont(new java.awt.Font("Liberation Sans", 1, 13)); // NOI18N
        btnSair.setText("Sair");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });
        getContentPane().add(btnSair, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 510, 80, 35));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/template.png"))); // NOI18N
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 960, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btncarregarCampoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncarregarCampoActionPerformed
        carregarCampos();
    }//GEN-LAST:event_btncarregarCampoActionPerformed

    private void txtDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDataActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDataActionPerformed

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        cadastrarProduto();
        limparCampos();
        listarProduto();
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        alterarDados();
        limparCampos();
        listarProduto();
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        deletarDados();
        limparCampos();
        listarProduto();
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        limparCampos();
    }//GEN-LAST:event_btnLimparActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        dispose();
    }//GEN-LAST:event_btnSairActionPerformed

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
            java.util.logging.Logger.getLogger(adm_cadprodutoVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(adm_cadprodutoVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(adm_cadprodutoVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(adm_cadprodutoVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new adm_cadprodutoVIEW().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnSair;
    private javax.swing.JButton btncarregarCampo;
    private javax.swing.JComboBox<String> cbxFornecedor;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel_dados;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblData;
    private javax.swing.JTable tabelaProduto;
    private javax.swing.JTextField txtData;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtProduto;
    private javax.swing.JTextField txtQuantidade;
    private javax.swing.JTextField txtValidade;
    private javax.swing.JTextField txtpUnit;
    private javax.swing.JTextField txtpVenda;
    // End of variables declaration//GEN-END:variables

    private void cadastrarProduto() {

        String nome, quantidade, validade, punit, pvenda, data;
        int fk_fornecedor;

        nome = txtProduto.getText();
        quantidade = txtQuantidade.getText();
        validade = txtValidade.getText();
        punit = txtpUnit.getText();
        pvenda = txtpVenda.getText();
        fk_fornecedor = id_fornecedor.get(cbxFornecedor.getSelectedIndex()-1);
        data = txtData.getText();

        adm_cadprodutoDTO objcadprodutodto = new adm_cadprodutoDTO();

        objcadprodutodto.setNome_produto(nome);
        objcadprodutodto.setQuantidade_produto(quantidade);
        objcadprodutodto.setValidade_produto(validade);
        objcadprodutodto.setPreco_unitario(punit);
        objcadprodutodto.setPreco_venda(pvenda);
        objcadprodutodto.setFk_fornecedor(fk_fornecedor);
        objcadprodutodto.setData(data);

        admDAO objadmdao = new admDAO();
        objadmdao.cadprodutoDAO(objcadprodutodto);

    }

    Vector<Integer> id_fornecedor = new Vector<Integer>();

    public void dadosComboBox() {

        try {

            admDAO objadmdao = new admDAO();
            ResultSet rs = objadmdao.listarFornecedor();

            while (rs.next()) {

                id_fornecedor.addElement(rs.getInt(1));
                cbxFornecedor.addItem(rs.getString(2));

            }
        } catch (SQLException erro) {

            JOptionPane.showMessageDialog(null, "adm_cadprodutoVIEW - dadosComboBox: " + erro);
        }

    }

    private void limparCampos() {

        txtId.setText("");
        txtData.setText("");
        txtData.setVisible(true);
        lblData.setVisible(true);
        txtProduto.setText("");
        txtQuantidade.setText("");
        txtValidade.setText("");
        txtpUnit.setText("");
        txtpVenda.setText("");
        cbxFornecedor.setSelectedIndex(0);

    }

    private void listarProduto() {

        try {

            admDAO objadmdao = new admDAO();

            DefaultTableModel model = (DefaultTableModel) tabelaProduto.getModel();
            model.setNumRows(0);

            ArrayList<adm_cadprodutoDTO> listap = objadmdao.pesquisarProduto();

            for (int num = 0; num < listap.size(); num++) {

                model.addRow(new Object[]{
                    listap.get(num).getId_produto(),
                    listap.get(num).getFk_fornecedor(),
                    listap.get(num).getNome_produto(),
                    listap.get(num).getQuantidade_produto(),
                    listap.get(num).getValidade_produto(),
                    listap.get(num).getPreco_unitario(),
                    listap.get(num).getPreco_venda()

                });
            }

        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "adm_cadprodutoVIEW - listarProduto: " + erro);
        }
    }

    private void alterarDados() {

        String nome_produto, quantidade_produto, validade_produto, preco_unitario, preco_venda;
        int fk_fornecedor, id_produto;

        id_produto = Integer.parseInt(txtId.getText());
        nome_produto = txtProduto.getText();
        quantidade_produto = txtQuantidade.getText();
        validade_produto = txtValidade.getText();
        preco_unitario = txtpUnit.getText();
        preco_venda = txtpVenda.getText();
        fk_fornecedor = id_fornecedor.get(cbxFornecedor.getSelectedIndex() - 1);

        adm_cadprodutoDTO objcadprodutodto = new adm_cadprodutoDTO();
        objcadprodutodto.setId_produto(id_produto);
        objcadprodutodto.setNome_produto(nome_produto);
        objcadprodutodto.setQuantidade_produto(quantidade_produto);
        objcadprodutodto.setValidade_produto(validade_produto);
        objcadprodutodto.setPreco_unitario(preco_unitario);
        objcadprodutodto.setPreco_venda(preco_venda);
        objcadprodutodto.setFk_fornecedor(fk_fornecedor);

        admDAO objadmdao = new admDAO();
        objadmdao.alterarProduto(objcadprodutodto);
    }

    private void carregarCampos() {

        int setar = tabelaProduto.getSelectedRow();
        
        txtData.setVisible(false);
        lblData.setVisible(false);
        txtId.setText(tabelaProduto.getModel().getValueAt(setar, 0).toString());
        String fornecedor = (tabelaProduto.getModel().getValueAt(setar, 1).toString());
        cbxFornecedor.setSelectedIndex(Integer.parseInt(fornecedor));
        txtProduto.setText(tabelaProduto.getModel().getValueAt(setar, 2).toString());
        txtQuantidade.setText(tabelaProduto.getModel().getValueAt(setar, 3).toString());
        txtValidade.setText(tabelaProduto.getModel().getValueAt(setar, 4).toString());
        txtpUnit.setText(tabelaProduto.getModel().getValueAt(setar, 5).toString());
        txtpVenda.setText(tabelaProduto.getModel().getValueAt(setar, 6).toString());

    }

    private void deletarDados() {

        int id_produto;

        id_produto = Integer.parseInt(txtId.getText());

        adm_cadprodutoDTO objcadprodutodto = new adm_cadprodutoDTO();
        objcadprodutodto.setId_produto(id_produto);

        admDAO objadmdao = new admDAO();
        objadmdao.deletarProduto(objcadprodutodto);

    }
}
