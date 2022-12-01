/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import dao.atnDAO;
import dto.adm_cadprodutoDTO;
import java.awt.Dimension;
import java.text.DecimalFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author nanabe
 */
public class adm_relvendasVIEW extends javax.swing.JFrame {

    /**
     * Creates new form adm_relvendasVIEW
     */
    public adm_relvendasVIEW() {
        initComponents();
        Dimension dim = this.getToolkit().getScreenSize();      
	      int x = (int) (dim.getWidth()  - this.getSize().getWidth() ) / 2;
	      int y = (int) (dim.getHeight() - this.getSize().getHeight()) / 2;
	      this.setLocation(x,y);
              
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        paineltotal = new javax.swing.JPanel();
        saldoTotal = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaVendas = new javax.swing.JTable();
        btnPesquisar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Vendas");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        paineltotal.setBackground(new java.awt.Color(255, 255, 255));
        paineltotal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        saldoTotal.setBackground(new java.awt.Color(255, 255, 255));
        saldoTotal.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        saldoTotal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        saldoTotal.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        paineltotal.add(saldoTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 280, 30));

        getContentPane().add(paineltotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, 280, 30));

        tabelaVendas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tabelaVendas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome do Produto", "Preço Unitário", "Quant. de Produto", "Data"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabelaVendas);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 47, 640, 250));

        btnPesquisar.setBackground(new java.awt.Color(241, 255, 129));
        btnPesquisar.setFont(new java.awt.Font("Liberation Sans", 1, 12)); // NOI18N
        btnPesquisar.setText("GERAR RELATÓRIO");
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });
        getContentPane().add(btnPesquisar, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 310, -1, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/BACKGROUND-3.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 740, 380));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        // TODO add your handling code here:
        relatVenda();
        calcularSaldo();
    }//GEN-LAST:event_btnPesquisarActionPerformed

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
            java.util.logging.Logger.getLogger(adm_relvendasVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(adm_relvendasVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(adm_relvendasVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(adm_relvendasVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new adm_relvendasVIEW().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel paineltotal;
    private javax.swing.JLabel saldoTotal;
    private javax.swing.JTable tabelaVendas;
    // End of variables declaration//GEN-END:variables

 private void relatVenda() {

        try {

            atnDAO objatnDAO = new atnDAO();

            DefaultTableModel model = (DefaultTableModel) tabelaVendas.getModel();
            model.setNumRows(0);

            ArrayList<adm_cadprodutoDTO> listaRe = objatnDAO.relatorioVendas();

            for (int num = 0; num < listaRe.size(); num++) {

                model.addRow(new Object[]{
                    listaRe.get(num).getNome_produto(),
                    listaRe.get(num).getPreco_venda(),
                    listaRe.get(num).getQuantidade_produto(),
                    listaRe.get(num).getData()

                });

            }

        } catch (Exception erro) {

            JOptionPane.showMessageDialog(null, "Lista de clientes VIEW não está funcionando corretamente" + erro);

        }

    }

    public void calcularSaldo() {

        double soma = 0;

        for (int i = 0; i < tabelaVendas.getRowCount(); i++) {
            soma = soma + Double.parseDouble(tabelaVendas.getValueAt(i, 1).toString());
        }
        
       DecimalFormat formatador = new DecimalFormat("0.00");
       saldoTotal.setText("SALDO TOTAL:   R$" + formatador.format(soma));
       //saldoTotal.setText("SALDO TOTAL: " + Double.toString(soma));
        

    }


}
