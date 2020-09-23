/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.projeto.form;

import br.projeto.DAO.PecaDAO;
import br.projeto.data.Peca;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Igor
 */
public class FrmPecas extends javax.swing.JFrame {

    /**
     * Creates new form FrmPecas
     */
    public FrmPecas() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        fmrPeca = new javax.swing.JTextField();
        fmrQuantidade = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        fmrValor = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        AbrirOS = new javax.swing.JButton();
        Pesquisar = new javax.swing.JButton();
        Fechar = new javax.swing.JButton();
        Cadastrar = new javax.swing.JButton();
        LimparCampos = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jLabel2.setText("Peça");

        jLabel3.setText("Quantidade");

        jLabel4.setText("Valor");

        AbrirOS.setText("Abrir OS");
        AbrirOS.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        AbrirOS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AbrirOSActionPerformed(evt);
            }
        });

        Pesquisar.setText("Pesquisar");
        Pesquisar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Pesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PesquisarActionPerformed(evt);
            }
        });

        Fechar.setText("Fechar");
        Fechar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Fechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FecharActionPerformed(evt);
            }
        });

        Cadastrar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Cadastrar.setText("Cadastrar");
        Cadastrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Cadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadastrarActionPerformed(evt);
            }
        });

        LimparCampos.setText("Limpar Campos");
        LimparCampos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        LimparCampos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LimparCamposActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(fmrPeca, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(fmrValor, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                                .addComponent(fmrQuantidade, javax.swing.GroupLayout.Alignment.LEADING)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(Cadastrar)
                        .addGap(18, 18, 18)
                        .addComponent(AbrirOS)
                        .addGap(18, 18, 18)
                        .addComponent(Pesquisar)
                        .addGap(18, 18, 18)
                        .addComponent(LimparCampos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 170, Short.MAX_VALUE)
                        .addComponent(Fechar)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fmrPeca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fmrQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fmrValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Fechar)
                    .addComponent(Pesquisar)
                    .addComponent(AbrirOS)
                    .addComponent(Cadastrar)
                    .addComponent(LimparCampos))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void FecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FecharActionPerformed
        this.dispose();
    }//GEN-LAST:event_FecharActionPerformed

    private void CadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadastrarActionPerformed
        Peca pc = new Peca();
        PecaDAO pDAO = new PecaDAO();

        if (fmrPeca.getText().isEmpty() || fmrQuantidade.getText().isEmpty() || fmrValor.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Preencha todos os campos.", "Cadastro de Peças", JOptionPane.WARNING_MESSAGE);
        } else { // pega os dados dos campos e os coloca nas variáveis desejadas
            try {
                pc.setNome_pecas(fmrPeca.getText());
                pc.setQuantidade_pecas(Integer.parseInt(fmrQuantidade.getText().trim()));
                pc.setValor_pecas(Double.parseDouble(fmrValor.getText().trim()));

                pDAO.inserir(pc); // faz a inserção no banco de dados dos dados que agora estão nas variáveis

                try {
                    if (pDAO.verificaNomePeca(pc)) {
                        JOptionPane.showMessageDialog(this, "Cadastro efetuado com sucesso!", "Cadastro de Peças", JOptionPane.INFORMATION_MESSAGE);
                    }
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(this, "Erro no processo!\n" + ex.getMessage(), "Cadastro de Peças", JOptionPane.ERROR_MESSAGE);
                }

                {

                }
                // limpa os campos
                fmrPeca.setText("");
                fmrQuantidade.setText("");
                fmrValor.setText("");

            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, "Erro no processo!\n" + ex.getMessage(), "Cadastro de Peças", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_CadastrarActionPerformed

    private void LimparCamposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LimparCamposActionPerformed
        fmrPeca.setText("");
        fmrQuantidade.setText("");
        fmrValor.setText("");
    }//GEN-LAST:event_LimparCamposActionPerformed

    private void AbrirOSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AbrirOSActionPerformed
        FrmOS os = new FrmOS();
        os.setVisible(true);
    }//GEN-LAST:event_AbrirOSActionPerformed

    private void PesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PesquisarActionPerformed
        FrmOS os = new FrmOS();
        os.setVisible(true);
    }//GEN-LAST:event_PesquisarActionPerformed

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
            java.util.logging.Logger.getLogger(FrmPecas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmPecas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmPecas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmPecas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmPecas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AbrirOS;
    private javax.swing.JButton Cadastrar;
    private javax.swing.JButton Fechar;
    private javax.swing.JButton LimparCampos;
    private javax.swing.JButton Pesquisar;
    private javax.swing.JTextField fmrPeca;
    private javax.swing.JTextField fmrQuantidade;
    private javax.swing.JTextField fmrValor;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
