/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.projeto.form;

import br.projeto.DAO.UsuarioDAO;
import br.projeto.data.Usuario;
import java.awt.HeadlessException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Igor
 */
public class FrmUsuariosJPanel extends javax.swing.JDialog {

    /**
     * Creates new form FrmUsuariosJPanel
     */
    public FrmUsuariosJPanel(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        frmNomeUsuario = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        frmCPFusuario = new javax.swing.JTextField();
        Cadastrar = new javax.swing.JButton();
        LimparCampos = new javax.swing.JButton();
        Fechar = new javax.swing.JButton();
        frmSenhaUsuario = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jLabel2.setText("Nome");

        frmNomeUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                frmNomeUsuarioActionPerformed(evt);
            }
        });

        jLabel3.setText("Senha");

        jLabel4.setText("CPF");

        frmCPFusuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                frmCPFusuarioActionPerformed(evt);
            }
        });

        Cadastrar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Cadastrar.setText("Cadastrar");
        Cadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadastrarActionPerformed(evt);
            }
        });

        LimparCampos.setText("Limpar Campos");
        LimparCampos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LimparCamposActionPerformed(evt);
            }
        });

        Fechar.setText("Fechar");
        Fechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FecharActionPerformed(evt);
            }
        });

        frmSenhaUsuario.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        frmSenhaUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                frmSenhaUsuarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Cadastrar)
                .addGap(18, 18, 18)
                .addComponent(LimparCampos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Fechar)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(frmNomeUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(frmSenhaUsuario, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(frmCPFusuario, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(frmNomeUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(frmCPFusuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(frmSenhaUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 93, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Fechar)
                    .addComponent(Cadastrar)
                    .addComponent(LimparCampos))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void frmNomeUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_frmNomeUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_frmNomeUsuarioActionPerformed

    private void frmCPFusuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_frmCPFusuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_frmCPFusuarioActionPerformed

    private void CadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadastrarActionPerformed
        Usuario usr = new Usuario();
        UsuarioDAO usrDAO = new UsuarioDAO();

        // abre o if, para caso algum campo esteja vazio
        if (frmNomeUsuario.getText().isEmpty() || frmCPFusuario.getText().isEmpty() || frmSenhaUsuario.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Preencha todos os campos.", "Cadastro de Funcionários", JOptionPane.WARNING_MESSAGE);
        } else if ((!frmCPFusuario.getText().matches("[0-9]+"))) {
            // caso os campos de Double sejam inválidos
            JOptionPane.showMessageDialog(this, "Erro: apenas caractéres numéricos são válidos no campo CPF", "Cadastro de Funcionários", JOptionPane.WARNING_MESSAGE);
        } else { // pega os dados dos campos e os coloca nas variáveis desejadas
            try {
                usr.setNome_usuario(frmNomeUsuario.getText().trim());
                usr.setCpf_usuario(Long.parseLong(frmCPFusuario.getText().trim()));
                usr.setPassword_usuario(frmSenhaUsuario.getText().trim().toUpperCase());

                usrDAO.inserir(usr); // faz a inserção no banco de dados dos dados que agora estão nas variáveis

                try {
                    if (usrDAO.verificaCpf(usr) && usrDAO.verificaSenha(usr)) {
                        JOptionPane.showMessageDialog(this, "Cadastro efetuado com sucesso!", "Cadastro de Funcionários", JOptionPane.INFORMATION_MESSAGE);
                    }
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(this, "Erro no processo!\n" + ex.getMessage(), "Cadastro de Funcionários", JOptionPane.ERROR);
                } catch (HeadlessException | NumberFormatException ex) {
                    Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
                }

                {

                }
                // limpa os campos
                frmNomeUsuario.setText("");
                frmCPFusuario.setText("");
                frmSenhaUsuario.setText("");

            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, "Erro no processo!\n" + ex.getMessage(), "Cadastro de Funcionários", JOptionPane.ERROR);
            } catch (HeadlessException | NumberFormatException ex) {
                Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_CadastrarActionPerformed

    private void LimparCamposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LimparCamposActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LimparCamposActionPerformed

    private void FecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FecharActionPerformed
        this.dispose();
    }//GEN-LAST:event_FecharActionPerformed

    private void frmSenhaUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_frmSenhaUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_frmSenhaUsuarioActionPerformed

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
            java.util.logging.Logger.getLogger(FrmUsuariosJPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmUsuariosJPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmUsuariosJPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmUsuariosJPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FrmUsuariosJPanel dialog = new FrmUsuariosJPanel(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cadastrar;
    private javax.swing.JButton Fechar;
    private javax.swing.JButton LimparCampos;
    private javax.swing.JTextField frmCPFusuario;
    private javax.swing.JTextField frmNomeUsuario;
    private javax.swing.JPasswordField frmSenhaUsuario;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
