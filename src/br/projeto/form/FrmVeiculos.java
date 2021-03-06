/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.projeto.form;

import br.projeto.DAO.VeiculoDAO;
import br.projeto.data.Cliente;
import br.projeto.data.Veiculo;
import java.awt.HeadlessException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Igor
 */
public class FrmVeiculos extends javax.swing.JFrame {

    /**
     * Creates new form FrmVeiculos
     */
    public FrmVeiculos() {
        initComponents();
        listaCliente();
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        frmPlaca = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        frmModelo = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        frmMarca = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        frmCor = new javax.swing.JTextField();
        Cadastrar = new javax.swing.JButton();
        LimparCampos = new javax.swing.JButton();
        AbrirOS = new javax.swing.JButton();
        Pesquisar = new javax.swing.JButton();
        Fechar = new javax.swing.JButton();
        frmCliente = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jLabel2.setText("Placa");

        jLabel4.setText("Modelo");

        jLabel5.setText("Marca");

        jLabel6.setText("Cor");

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

        AbrirOS.setText("Abrir OS");
        AbrirOS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AbrirOSActionPerformed(evt);
            }
        });

        Pesquisar.setText("Pesquisar");
        Pesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PesquisarActionPerformed(evt);
            }
        });

        Fechar.setText("Fechar");
        Fechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FecharActionPerformed(evt);
            }
        });

        frmCliente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        frmCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                frmClienteActionPerformed(evt);
            }
        });

        jLabel7.setText("Dono do veículo");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Cadastrar)
                        .addGap(18, 18, 18)
                        .addComponent(AbrirOS)
                        .addGap(18, 18, 18)
                        .addComponent(Pesquisar)
                        .addGap(182, 182, 182)
                        .addComponent(LimparCampos))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(frmModelo)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(frmCliente, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(frmMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel6)
                                .addComponent(frmCor, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2)
                                .addComponent(frmPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Fechar))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(frmPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(frmModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(frmMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(frmCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(frmCor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(48, 48, 48)
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

    private void CadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadastrarActionPerformed
        Veiculo vei = new Veiculo(); // instancia a classe de dados do veículo
        VeiculoDAO vDAO = new VeiculoDAO(); // instancia o veículo DAO

        //faz os testes de validação
        if (frmModelo.getText().isEmpty() || frmMarca.getText().isEmpty() || frmPlaca.getText().isEmpty() || frmCor.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Preencha todos os campos.", "Cadastro de Veículos", JOptionPane.WARNING_MESSAGE);
        } else if (frmCliente.getSelectedItem().equals("--ESCOLHA O CLIENTE--")) {
            JOptionPane.showMessageDialog(this, "Escolha o dono deste veículo.", "Cadastro de Veículos", JOptionPane.WARNING_MESSAGE);
        } else { 
            try {
                String idString = frmCliente.getSelectedItem().toString(); // pega o item selecionado do JComboBox e colona em uma String
                String[] idsplit = idString.split("---"); // separa o ID do usuário e o nome do usuário em uma array
                int id = Integer.parseInt(idsplit[0]); // coloca o ID do cliente em uma variável int
                
                // pega os dados dos campos e os coloca nas variáveis desejadas
                vei.setModelo_veiculo(frmModelo.getText());
                vei.setMarca_veiculo(frmMarca.getText());
                vei.setCor_veiculo(frmCor.getText());
                vei.setPlaca_veiculo(frmPlaca.getText().trim().toUpperCase());
                vei.setId_cliente(id);

                vDAO.inserir(vei); // faz a inserção no BD dos dados que agora estão nas variáveis

                try {
                    if (vDAO.verificaPlaca(vei)) { // verifica se a placa do veículo cadastrado está inserida no banco de dados
                        JOptionPane.showMessageDialog(this, "Cadastro efetuado com sucesso!", "Cadastro de Veículos", JOptionPane.INFORMATION_MESSAGE);
                        // limpa os campos
                        frmCor.setText("");
                        frmMarca.setText("");
                        frmModelo.setText("");
                        frmPlaca.setText("");
                    }
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(this, "Erro no processo!\n" + ex.getMessage(), "Cadastro de Veículos", JOptionPane.ERROR);
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, "Erro no processo!\n" + ex.getMessage(), "Cadastro de veículos", JOptionPane.ERROR);
            }
        }
    }//GEN-LAST:event_CadastrarActionPerformed

    private void LimparCamposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LimparCamposActionPerformed
        frmCor.setText("");
        frmMarca.setText("");
        frmModelo.setText("");
        frmPlaca.setText("");
        listaCliente(); // lista novamente os clientes disponíveis
    }//GEN-LAST:event_LimparCamposActionPerformed

    private void FecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FecharActionPerformed
        this.dispose();
    }//GEN-LAST:event_FecharActionPerformed

    private void frmClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_frmClienteActionPerformed

    }//GEN-LAST:event_frmClienteActionPerformed

    private void AbrirOSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AbrirOSActionPerformed
        FrmOS os = new FrmOS();
        os.setVisible(true);
    }//GEN-LAST:event_AbrirOSActionPerformed

    private void PesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PesquisarActionPerformed
        
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
            java.util.logging.Logger.getLogger(FrmVeiculos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmVeiculos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmVeiculos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmVeiculos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmVeiculos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AbrirOS;
    private javax.swing.JButton Cadastrar;
    private javax.swing.JButton Fechar;
    private javax.swing.JButton LimparCampos;
    private javax.swing.JButton Pesquisar;
    private javax.swing.JComboBox<String> frmCliente;
    private javax.swing.JTextField frmCor;
    private javax.swing.JTextField frmMarca;
    private javax.swing.JTextField frmModelo;
    private javax.swing.JTextField frmPlaca;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    // End of variables declaration//GEN-END:variables
public final void listaCliente() {
        VeiculoDAO vDAO = new VeiculoDAO(); // instancia o veículo DAO
        
        frmCliente.removeAllItems(); // remove todos os itens do JComboBox antes de inserir novos
        int id;
        String nome;
        try {
            ArrayList<Cliente> todosf = vDAO.consultaCliente(); // instancia o método em uma arraylist
            frmCliente.addItem("--ESCOLHA O CLIENTE--"); // adiciona o item que será a seleção "padrão"
            for (int i = 0; i < todosf.size(); i++) {
                // loop que pega os dados e insere no JComboBox

                id = todosf.get(i).getId_cliente(); // pega o ID do cliente
                nome = todosf.get(i).getNome_cliente(); // pega o nome do cliente

                frmCliente.addItem(id + "---" + nome); // insere uma linha nova no JComboBox a cada item disponível no BD
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Erro no processo!\n" + ex.getMessage(), "Consulta", JOptionPane.ERROR_MESSAGE);
        } catch (Exception ex) {
            Logger.getLogger(FrmPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
