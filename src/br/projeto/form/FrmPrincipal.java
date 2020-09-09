/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.projeto.form;

import javax.swing.JOptionPane;

/**
 *
 * @author Igor - Davi *
 */
public class FrmPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form FrmPrincipal
     */
    public FrmPrincipal() {
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

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mnCliente = new javax.swing.JMenuItem();
        mnUsuario = new javax.swing.JMenuItem();
        mnTecnico = new javax.swing.JMenuItem();
        mnEquipamento = new javax.swing.JMenuItem();
        mnModeloEq = new javax.swing.JMenuItem();
        mnServicos = new javax.swing.JMenuItem();
        mnPecas = new javax.swing.JMenuItem();
        mnStatus = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 204));
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        setName("framePrincipal"); // NOI18N
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jMenu1.setText("Cadastros");

        mnCliente.setText("Cliente");
        mnCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnClienteActionPerformed(evt);
            }
        });
        jMenu1.add(mnCliente);

        mnUsuario.setText("Usuario");
        mnUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnUsuarioActionPerformed(evt);
            }
        });
        jMenu1.add(mnUsuario);

        mnTecnico.setText("Técnico");
        mnTecnico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnTecnicoActionPerformed(evt);
            }
        });
        jMenu1.add(mnTecnico);

        mnEquipamento.setText("Equipamentos");
        mnEquipamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnEquipamentoActionPerformed(evt);
            }
        });
        jMenu1.add(mnEquipamento);

        mnModeloEq.setText("Modelos de Equipamentos");
        mnModeloEq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnModeloEqActionPerformed(evt);
            }
        });
        jMenu1.add(mnModeloEq);

        mnServicos.setText("Serviços");
        mnServicos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnServicosActionPerformed(evt);
            }
        });
        jMenu1.add(mnServicos);

        mnPecas.setText("Peças");
        mnPecas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnPecasActionPerformed(evt);
            }
        });
        jMenu1.add(mnPecas);

        mnStatus.setText("Status da OS");
        mnStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnStatusActionPerformed(evt);
            }
        });
        jMenu1.add(mnStatus);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 279, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void mnClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnClienteActionPerformed
        FrmClientes frmClientes = new FrmClientes();
        frmClientes.setVisible(true);

    }//GEN-LAST:event_mnClienteActionPerformed

    private void mnStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnStatusActionPerformed
        FrmStatus frmStatus = new FrmStatus();
        frmStatus.setVisible(true);

    }//GEN-LAST:event_mnStatusActionPerformed

    private void mnUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnUsuarioActionPerformed
        FrmUsuarios frmUser = new FrmUsuarios();
        frmUser.setVisible(true);
    }//GEN-LAST:event_mnUsuarioActionPerformed

    private void mnEquipamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnEquipamentoActionPerformed
        FrmEquipamento frmEquipamento = new FrmEquipamento();
        frmEquipamento.setVisible(true);
    }//GEN-LAST:event_mnEquipamentoActionPerformed

    private void mnModeloEqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnModeloEqActionPerformed
        FrmModelosEq frmModelosEq = new FrmModelosEq();
        frmModelosEq.setVisible(true);
    }//GEN-LAST:event_mnModeloEqActionPerformed

    private void mnServicosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnServicosActionPerformed
        FrmServicos frmServicos = new FrmServicos();
        frmServicos.setVisible(true);
    }//GEN-LAST:event_mnServicosActionPerformed

    private void mnPecasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnPecasActionPerformed
        FrmPecas frmPecas = new FrmPecas();
        frmPecas.setVisible(true);
    }//GEN-LAST:event_mnPecasActionPerformed

    private void mnTecnicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnTecnicoActionPerformed
        FrmTecnico frmTecnico = new FrmTecnico();
        frmTecnico.setVisible(true);
    }//GEN-LAST:event_mnTecnicoActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        //JOptionPane.showConfirmDialog(jMenu1, evt, "ATENÇÃO\n\nVocê quer fechar esta aplicação?", JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
    }//GEN-LAST:event_formWindowClosing

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
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem mnCliente;
    private javax.swing.JMenuItem mnEquipamento;
    private javax.swing.JMenuItem mnModeloEq;
    private javax.swing.JMenuItem mnPecas;
    private javax.swing.JMenuItem mnServicos;
    private javax.swing.JMenuItem mnStatus;
    private javax.swing.JMenuItem mnTecnico;
    private javax.swing.JMenuItem mnUsuario;
    // End of variables declaration//GEN-END:variables
}
