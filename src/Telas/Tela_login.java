/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Telas;

import dao.UsuarioDao;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author Israel
 */
public class Tela_login extends javax.swing.JFrame {

    /**
     * Creates new form Tela_login
     */
    public Tela_login() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField_login = new javax.swing.JTextField();
        jPasswordField_senha = new javax.swing.JPasswordField();
        conectar = new javax.swing.JButton();
        sair_principal = new javax.swing.JButton();
        icone_cadeado_login = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tela Login");

        jLabel1.setText("Login:");

        jLabel2.setText("Senha:");

        jTextField_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_loginActionPerformed(evt);
            }
        });
        jTextField_login.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField_loginKeyPressed(evt);
            }
        });

        jPasswordField_senha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jPasswordField_senhaKeyPressed(evt);
            }
        });

        conectar.setText("Conectar");
        conectar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                conectarActionPerformed(evt);
            }
        });

        sair_principal.setText("Sair");
        sair_principal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sair_principalActionPerformed(evt);
            }
        });

        icone_cadeado_login.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/login.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField_login))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(conectar, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(sair_principal, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jPasswordField_senha, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(196, 196, 196)
                        .addComponent(icone_cadeado_login)))
                .addContainerGap(88, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(icone_cadeado_login, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField_login, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jPasswordField_senha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(conectar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sair_principal, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(73, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(488, 416));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void limpaTela(){
        jTextField_login.setText("");
        jPasswordField_senha.setText("");
    }
    
    private void conectarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_conectarActionPerformed
        
        if(jTextField_login.getText().equals("")|| jPasswordField_senha.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Preencha os campos obrigatórios!");
        }
        else
        {
            String login = jTextField_login.getText();
            String senha = jPasswordField_senha.getText();
            
            UsuarioDao ud = new UsuarioDao();
            
            boolean testeConexao = ud.login(login, senha);
            
            if(testeConexao == true){
                Principal principal = new Principal();
                principal.setVisible(true);
                principal.setExtendedState(Principal.MAXIMIZED_BOTH);
                dispose();
            }
            else
            {
                limpaTela();
                JOptionPane.showMessageDialog(null, "Usuário ou senha inválidos.\nTente novamente!");
            }
        }
    }//GEN-LAST:event_conectarActionPerformed

    private void sair_principalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sair_principalActionPerformed
        
        System.exit(0);
    }//GEN-LAST:event_sair_principalActionPerformed

    private void jPasswordField_senhaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPasswordField_senhaKeyPressed
       
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){ 
        
            if(jTextField_login.getText().equals("")|| jPasswordField_senha.getText().equals("")){
                JOptionPane.showMessageDialog(this, "Preencha os campos obrigatórios!");
            }
            else
            {
            String login = jTextField_login.getText();
            String senha = jPasswordField_senha.getText();
            
            UsuarioDao ud = new UsuarioDao();
            
            boolean testeConexao = ud.login(login, senha);
            
                if(testeConexao == true){
                    Principal principal = new Principal();
                    principal.setVisible(true);
                    principal.setExtendedState(Principal.MAXIMIZED_BOTH);
                    dispose();
                }
                else
                {
                    limpaTela();
                    JOptionPane.showMessageDialog(null, "Usuário ou senha inválidos.\nTente novamente!");
                }  
            }
        } 
    }//GEN-LAST:event_jPasswordField_senhaKeyPressed

    private void jTextField_loginKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_loginKeyPressed
        
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){ 
        
            if(jTextField_login.getText().equals("")|| jPasswordField_senha.getText().equals("")){
                JOptionPane.showMessageDialog(this, "Preencha os campos obrigatórios!");
            }
            else
            {
                String login = jTextField_login.getText();
                String senha = jPasswordField_senha.getText();
            
                UsuarioDao ud = new UsuarioDao();
            
                boolean testeConexao = ud.login(login, senha);
            
                if(testeConexao == true){
                    Principal principal = new Principal();
                    principal.setVisible(true);
                    principal.setExtendedState(Principal.MAXIMIZED_BOTH);
                    dispose();
                }
                else
                {
                    limpaTela();
                    /*JOptionPane.showMessageDialog(null, "Usuário ou senha inválidos.\nTente novamente!");*/
                }
            }  
        } 
    }//GEN-LAST:event_jTextField_loginKeyPressed

    private void jTextField_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_loginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_loginActionPerformed

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
            java.util.logging.Logger.getLogger(Tela_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela_login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton conectar;
    private javax.swing.JLabel icone_cadeado_login;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPasswordField jPasswordField_senha;
    private javax.swing.JTextField jTextField_login;
    private javax.swing.JButton sair_principal;
    // End of variables declaration//GEN-END:variables
}
