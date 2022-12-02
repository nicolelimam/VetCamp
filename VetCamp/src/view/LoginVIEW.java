
package view;

import dao.loginDAO;
import dto.adm_cadusuarioDTO;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import java.sql.SQLException;
import view.adm_telaprincipalVIEW;
import view.atn_telaprincipalVIEW;
import view.vet_telaprincipalVIEW;


public class LoginVIEW extends javax.swing.JFrame {

    
    public LoginVIEW() {
        initComponents();
        setLocationRelativeTo(null); /*Configuração para abertura da janela no centro da tela*/
    }

    /*Criação da variavel global do tipo String*/
    public static String user;

    
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
        setTitle("Login");
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

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Group 12 (1).png"))); // NOI18N
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 480, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntrarActionPerformed
        /*Chamada de métodos*/
        Login();

    }//GEN-LAST:event_btnEntrarActionPerformed

    public static void main(String args[]) {
       
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
    
    /*Método privado do tipo void, para fazer o login do usuario no sistema*/
    private void Login() {

        try {
            
            /*Criação das variaveis do tipo String*/
            String nome, senha;

            nome = txtUsuario.getText();
            senha = jpSenha.getText();

            /*Instanciando a classe adm_cadusuarioDTO*/
            adm_cadusuarioDTO obj = new adm_cadusuarioDTO();
            /*Passando o objeto obj por parametro com seus respectivos dados*/
            obj.setUsuario(nome);
            obj.setSenha(senha);

            /*Instanciando a classe loginDAO*/
            loginDAO objlogin = new loginDAO();
            /*Esperando o retorno do resultado sql através do método autenticacaoUsuario */
            ResultSet rslogin = objlogin.autenticacaoUsuario(obj);
            
            /*Se existir usuario e senha correspondente, el e entra no if, se não ele exibe um JOptionPane com a mensagem "usuario ou senha invalido"*/
            if (rslogin.next()) {
                
                /*a variavel user armazena o usuario, que será usada em outras classes*/
                user = txtUsuario.getText();
                
                /*Criação das variaveis do tipo Int*/
                int cargo;

                /*coleta o dado referente ao cargo e verifica o nivel do cargo*/
                cargo = rslogin.getInt("fk_cargo");
                
                /*Se o cargo for ==1, ele chama a tela do administrador*/
                if (cargo == 1) {

                    adm_telaprincipalVIEW objadm = new adm_telaprincipalVIEW();
                    objadm.setVisible(true);

                }
                /*Se o cargo for ==2, ele chama a tela do atendente*/
                if (cargo == 2) {

                    atn_telaprincipalVIEW objatn = new atn_telaprincipalVIEW();
                    objatn.setVisible(true);

                }
                /*Se o cargo for ==3, ele chama a tela do veterinario*/
                if (cargo == 3) {

                    vet_telaprincipalVIEW objvet = new vet_telaprincipalVIEW();
                    objvet.setVisible(true);
                }
                
                /*limpa os campos*/
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
