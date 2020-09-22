/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.projeto.form;

import br.projeto.DAO.UsuarioDAO;
import br.projeto.data.Usuario;
import java.awt.Dialog;
import java.awt.HeadlessException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JRootPane;

/**
 *
 * @author Igor
 */
public class FrmLoginJPanel extends javax.swing.JDialog {
    
    private static boolean rs;
    /**
     * Creates new form FrmLoginJPanel
     * @param parent
     * @param modal
     */
    public FrmLoginJPanel(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        //setUndecorated(true);
        //getRootPane().setWindowDecorationStyle(JRootPane.NONE);
        initComponents();
               
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialogCadastro = new javax.swing.JDialog();
        jPanel2 = new javax.swing.JPanel();
        frmCadNomeUsuario = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        frmCadCPFusuario = new javax.swing.JTextField();
        Cadastrar = new javax.swing.JButton();
        LimparCampos = new javax.swing.JButton();
        Fechar2 = new javax.swing.JButton();
        frmCadSenhaUsuario = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        TelaCadastro = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Campo1 = new javax.swing.JTextField();
        Campo2 = new javax.swing.JPasswordField();
        confirma = new javax.swing.JButton();
        fechar1 = new javax.swing.JButton();

        jDialogCadastro.setMinimumSize(new java.awt.Dimension(330, 350));
        jDialogCadastro.setModalExclusionType(java.awt.Dialog.ModalExclusionType.APPLICATION_EXCLUDE);
        jDialogCadastro.setModalityType(java.awt.Dialog.ModalityType.APPLICATION_MODAL);
        jDialogCadastro.setPreferredSize(new java.awt.Dimension(330, 322));
        jDialogCadastro.setResizable(false);

        frmCadNomeUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                frmCadNomeUsuarioActionPerformed(evt);
            }
        });

        jLabel3.setText("Senha");

        jLabel4.setText("CPF");

        frmCadCPFusuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                frmCadCPFusuarioActionPerformed(evt);
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

        Fechar2.setText("Fechar");
        Fechar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Fechar2ActionPerformed(evt);
            }
        });

        frmCadSenhaUsuario.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        frmCadSenhaUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                frmCadSenhaUsuarioActionPerformed(evt);
            }
        });

        jLabel5.setText("Nome");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 303, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                            .addComponent(Cadastrar)
                            .addGap(18, 18, 18)
                            .addComponent(LimparCampos)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Fechar2))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(11, 11, 11)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(frmCadNomeUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel4)
                                .addComponent(jLabel5)
                                .addComponent(jLabel3)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(frmCadSenhaUsuario, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(frmCadCPFusuario, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(45, 45, 45)))
                    .addContainerGap()))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 255, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel5)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(frmCadNomeUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(jLabel4)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(frmCadCPFusuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(jLabel3)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(frmCadSenhaUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Fechar2)
                        .addComponent(Cadastrar)
                        .addComponent(LimparCampos))
                    .addContainerGap()))
        );

        javax.swing.GroupLayout jDialogCadastroLayout = new javax.swing.GroupLayout(jDialogCadastro.getContentPane());
        jDialogCadastro.getContentPane().setLayout(jDialogCadastroLayout);
        jDialogCadastroLayout.setHorizontalGroup(
            jDialogCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialogCadastroLayout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jDialogCadastroLayout.setVerticalGroup(
            jDialogCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialogCadastroLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jDialogCadastro.getAccessibleContext().setAccessibleParent(TelaCadastro);

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setResizable(false);
        setType(java.awt.Window.Type.POPUP);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        TelaCadastro.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        TelaCadastro.setText("Cadastrar");
        TelaCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TelaCadastroActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("CPF:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Senha:");

        Campo1.setName("Usuario"); // NOI18N

        confirma.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        confirma.setText("Logar");
        confirma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmaActionPerformed(evt);
            }
        });

        fechar1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        fechar1.setForeground(new java.awt.Color(51, 51, 51));
        fechar1.setText("Sair");
        fechar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fechar1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(87, 87, 87)
                                .addComponent(confirma))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(Campo1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Campo2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(44, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(TelaCadastro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(fechar1)
                        .addGap(26, 26, 26))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(Campo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(Campo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(confirma)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TelaCadastro)
                    .addComponent(fechar1))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void TelaCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TelaCadastroActionPerformed
        jDialogCadastro.setLocationRelativeTo(null);
        jDialogCadastro.setVisible(true);
    }//GEN-LAST:event_TelaCadastroActionPerformed

    private void confirmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmaActionPerformed
        
        Usuario Usuario = new Usuario();
        UsuarioDAO Usr = new UsuarioDAO();
        
        if (Campo1.getText().isEmpty() || Campo2.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Preencha os campos!","Login",JOptionPane.WARNING_MESSAGE);
        } else {
            try {
                Usuario.setCpf_usuario(Long.parseLong(Campo1.getText().trim()));
                if (Usr.verificaCpf(Usuario)) {
                    Usuario.setPassword_usuario(Campo2.getText());
                    Usr.verificaSenha(Usuario);
                    Usr.verificaNome(Usuario);
                    if (Usr.verificaLogin()) {
                        JOptionPane.showMessageDialog(this, "Bem vindo " + Usuario.getNome_usuario() + "!","Login",JOptionPane.INFORMATION_MESSAGE);
                        setRs(true);
                        //FrmPrincipal p = new FrmPrincipal();
                        //p.getjMenuUsuario().setText(Usuario.getNome_usuario());
                        this.dispose();
                    }
                }

            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, "Erro no processo!\n"+ex.getMessage(), "Login", JOptionPane.ERROR);
            } catch (HeadlessException | NumberFormatException ex) {
                Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_confirmaActionPerformed

    private void fechar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fechar1ActionPerformed
        if(isRs()){
            this.dispose();
        } else {
            System.exit(0);
        }
        
    }//GEN-LAST:event_fechar1ActionPerformed

    private void frmCadSenhaUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_frmCadSenhaUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_frmCadSenhaUsuarioActionPerformed

    private void Fechar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Fechar2ActionPerformed
        jDialogCadastro.dispose();
    }//GEN-LAST:event_Fechar2ActionPerformed

    private void LimparCamposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LimparCamposActionPerformed
        frmCadNomeUsuario.setText("");
        frmCadCPFusuario.setText("");
        frmCadSenhaUsuario.setText("");
    }//GEN-LAST:event_LimparCamposActionPerformed

    private void CadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadastrarActionPerformed
        Usuario usr = new Usuario();
        UsuarioDAO usrDAO = new UsuarioDAO();

        // abre o if, para caso algum campo esteja vazio
        if (frmCadNomeUsuario.getText().isEmpty() || frmCadCPFusuario.getText().isEmpty() || frmCadSenhaUsuario.getText().isEmpty()) {
            JOptionPane.showMessageDialog(jDialogCadastro, "Preencha todos os campos.", "Cadastro de Funcionários", JOptionPane.WARNING_MESSAGE);
        } else if ((!frmCadCPFusuario.getText().matches("[0-9]+"))) {
            // caso os campos de Double sejam inválidos
            JOptionPane.showMessageDialog(jDialogCadastro, "Erro: apenas caractéres numéricos são válidos no campo CPF", "Cadastro de Funcionários", JOptionPane.WARNING_MESSAGE);
        } else { // pega os dados dos campos e os coloca nas variáveis desejadas
            try {
                usr.setNome_usuario(frmCadNomeUsuario.getText().trim());
                usr.setCpf_usuario(Long.parseLong(frmCadCPFusuario.getText().trim()));
                usr.setPassword_usuario(frmCadSenhaUsuario.getText().trim().toUpperCase());

                usrDAO.inserir(usr); // faz a inserção no banco de dados dos dados que agora estão nas variáveis

                try {
                    if (usrDAO.verificaCpf(usr) && usrDAO.verificaSenha(usr)) {
                        JOptionPane.showMessageDialog(jDialogCadastro, "Cadastro efetuado com sucesso!", "Cadastro de Funcionários", JOptionPane.INFORMATION_MESSAGE);
                    }
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(jDialogCadastro, "Erro no processo!\n" + ex.getMessage(), "Cadastro de Funcionários", JOptionPane.ERROR);
                } catch (HeadlessException | NumberFormatException ex) {
                    Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
                }

                {

                }
                // limpa os campos
                frmCadNomeUsuario.setText("");
                frmCadCPFusuario.setText("");
                frmCadSenhaUsuario.setText("");

            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(jDialogCadastro, "Erro no processo!\n" + ex.getMessage(), "Cadastro de Funcionários", JOptionPane.ERROR);
            } catch (HeadlessException | NumberFormatException ex) {
                Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_CadastrarActionPerformed

    private void frmCadCPFusuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_frmCadCPFusuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_frmCadCPFusuarioActionPerformed

    private void frmCadNomeUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_frmCadNomeUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_frmCadNomeUsuarioActionPerformed

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
            java.util.logging.Logger.getLogger(FrmLoginJPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmLoginJPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmLoginJPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmLoginJPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FrmLoginJPanel dialog = new FrmLoginJPanel(new javax.swing.JFrame(), true);
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
    private javax.swing.JTextField Campo1;
    private javax.swing.JPasswordField Campo2;
    private javax.swing.JButton Fechar2;
    private javax.swing.JButton LimparCampos;
    private javax.swing.JButton TelaCadastro;
    private javax.swing.JButton confirma;
    private javax.swing.JButton fechar1;
    private javax.swing.JTextField frmCadCPFusuario;
    private javax.swing.JTextField frmCadNomeUsuario;
    private javax.swing.JPasswordField frmCadSenhaUsuario;
    private javax.swing.JDialog jDialogCadastro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
public boolean Logado(){
    return isRs();
}

    /**
     * @return the rs
     */
    public static boolean isRs() {
        return rs;
    }

    /**
     * @param aRs the rs to set
     */
    public static void setRs(boolean aRs) {
        rs = aRs;
    }
}
