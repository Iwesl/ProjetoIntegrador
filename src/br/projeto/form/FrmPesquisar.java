/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.projeto.form;

import br.projeto.DAO.ClienteDAO;
import br.projeto.DAO.PesquisaDAO;
import br.projeto.data.Cliente;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Igor
 */
public class FrmPesquisar extends javax.swing.JFrame {

    /**
     * Creates new form FrmClientes
     */
    public FrmPesquisar() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        frmCPFcliente = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        AbrirOS = new javax.swing.JButton();
        PesquisarTudo = new javax.swing.JButton();
        Fechar = new javax.swing.JButton();
        Cadastrar = new javax.swing.JButton();
        LimparCampos = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        PesquisarComVeiculo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("CPF");

        jScrollPane1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "CPF", "Celular 1", "Celular 2", "Endereço", "Data Entrada", "Veículo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        AbrirOS.setText("Abrir OS");
        AbrirOS.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        AbrirOS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AbrirOSActionPerformed(evt);
            }
        });

        PesquisarTudo.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        PesquisarTudo.setText("Pesquisar");
        PesquisarTudo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        PesquisarTudo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PesquisarTudoActionPerformed(evt);
            }
        });

        Fechar.setText("Fechar");
        Fechar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Fechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FecharActionPerformed(evt);
            }
        });

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

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Obs: deixe o campo vazio e clique em Pesquisar para listar todos");

        PesquisarComVeiculo.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        PesquisarComVeiculo.setText("Pesquisar (com veículo)");
        PesquisarComVeiculo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        PesquisarComVeiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PesquisarComVeiculoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(frmCPFcliente, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jScrollPane1)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Cadastrar)
                .addGap(18, 18, 18)
                .addComponent(AbrirOS)
                .addGap(18, 18, 18)
                .addComponent(PesquisarTudo)
                .addGap(18, 18, 18)
                .addComponent(PesquisarComVeiculo)
                .addGap(18, 18, 18)
                .addComponent(LimparCampos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 170, Short.MAX_VALUE)
                .addComponent(Fechar)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(33, 33, 33))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(7, 7, 7)
                .addComponent(frmCPFcliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Fechar)
                    .addComponent(PesquisarTudo)
                    .addComponent(AbrirOS)
                    .addComponent(Cadastrar)
                    .addComponent(LimparCampos)
                    .addComponent(PesquisarComVeiculo))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void FecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FecharActionPerformed
        this.dispose();
    }//GEN-LAST:event_FecharActionPerformed

    private void CadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadastrarActionPerformed
         String[] options = {"Clientes", "Peças", "Veículos", "Usuários"};
        int cadastrar = JOptionPane.showOptionDialog(this, "Que tipo de cadastro deseja fazer?", "ATENÇÃO", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);

        switch (cadastrar + 1) {
            case 1:
                FrmClientes cl = new FrmClientes();
                cl.setVisible(true);
                break;
            case 2:
                FrmPecas p = new FrmPecas();
                p.setVisible(true);
                break;
            case 3:
                FrmVeiculos v = new FrmVeiculos();
                v.setVisible(true);
                break;
            case 4:
                FrmUsuarios u = new FrmUsuarios();
                u.setVisible(true);
                break;
            default:
                // não faz nada
        }
    }//GEN-LAST:event_CadastrarActionPerformed

    private void LimparCamposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LimparCamposActionPerformed
        frmCPFcliente.setText("");
        DefaultTableModel modeloTabela = (DefaultTableModel) jTable1.getModel();
            // coloca a tabela em uma variável do tipo DefaultTableModel, que permite a modelagem dos dados da tabela

            for (int i = modeloTabela.getRowCount() - 1; i >= 0; i--) {
                modeloTabela.removeRow(i);
                // loop que limpa a tabela antes de ser atualizada
            }
    }//GEN-LAST:event_LimparCamposActionPerformed

    private void PesquisarTudoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PesquisarTudoActionPerformed
        if (frmCPFcliente.getText().isEmpty()) {
            try {
                buscaTodosClientes();
            } catch (Exception ex) {
                Logger.getLogger(FrmPesquisar.class.getName()).log(Level.SEVERE, null, ex);
            } 
        } else {
            buscaTodosClientesPorCPF();
        } 
    }//GEN-LAST:event_PesquisarTudoActionPerformed

    private void PesquisarComVeiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PesquisarComVeiculoActionPerformed
        if (frmCPFcliente.getText().isEmpty()) {
            try {
                buscaTodosClientesComVeiculo();
            } catch (Exception ex) {
                Logger.getLogger(FrmPesquisar.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            buscaTodosClientesComVeiculoPorCPF();
        }
    }//GEN-LAST:event_PesquisarComVeiculoActionPerformed

    private void AbrirOSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AbrirOSActionPerformed
        FrmOS os = new FrmOS();
        os.setVisible(true);
    }//GEN-LAST:event_AbrirOSActionPerformed

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
            java.util.logging.Logger.getLogger(FrmPesquisar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmPesquisar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmPesquisar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmPesquisar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmPesquisar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AbrirOS;
    private javax.swing.JButton Cadastrar;
    private javax.swing.JButton Fechar;
    private javax.swing.JButton LimparCampos;
    private javax.swing.JButton PesquisarComVeiculo;
    private javax.swing.JButton PesquisarTudo;
    private javax.swing.JTextField frmCPFcliente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
public void buscaTodosClientes() {
        try {
            PesquisaDAO pDAO = new PesquisaDAO(); // instancia a classe ProdutoDB()
            ArrayList<Cliente> cl = pDAO.consultaTodos(); // coloca o método dentro da variável
            

            DefaultTableModel modeloTabela = (DefaultTableModel) jTable1.getModel();
            // coloca a tabela em uma variável do tipo DefaultTableModel, que permite a modelagem dos dados da tabela

            for (int i = modeloTabela.getRowCount() - 1; i >= 0; i--) {
                modeloTabela.removeRow(i);
                // loop que limpa a tabela antes de ser atualizada
            }

            for (int i = 0; i < cl.size(); i++) {
                // loop que pega os dados e insere na tabela
                Object[] dados = new Object[7]; // instancia os objetos. Cada objeto representa um atributo 
                dados[0] = cl.get(i).getId_cliente();
                dados[1] = cl.get(i).getNome_cliente();
                dados[2] = cl.get(i).getCpf_cliente();
                dados[3] = cl.get(i).getCelular1_cliente();
                dados[4] = cl.get(i).getCelular2_cliente();
                dados[5] = cl.get(i).getEndereco_cliente();
                dados[6] = cl.get(i).getDataEntrada_cliente();
                // pega os dados salvos do banco de dados (que estão nas variáveis) e os coloca nos objetos definidos

                modeloTabela.addRow(dados); // insere uma linha nova a cada item novo encontrado na tabela do BD
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Falha na operação.\nErro: " + ex.getMessage());
        } catch (Exception ex) {
            Logger.getLogger(FrmPesquisar.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
public void buscaTodosClientesPorCPF() {
        try {
            PesquisaDAO pDAO = new PesquisaDAO(); // instancia a classe ProdutoDB()
            ArrayList<Cliente> cl = pDAO.consultaTodosPorCPF(Long.parseLong(frmCPFcliente.getText().trim())); // coloca o método dentro da variável
            

            DefaultTableModel modeloTabela = (DefaultTableModel) jTable1.getModel();
            // coloca a tabela em uma variável do tipo DefaultTableModel, que permite a modelagem dos dados da tabela

            for (int i = modeloTabela.getRowCount() - 1; i >= 0; i--) {
                modeloTabela.removeRow(i);
                // loop que limpa a tabela antes de ser atualizada
            }

            for (int i = 0; i < cl.size(); i++) {
                // loop que pega os dados e insere na tabela
                Object[] dados = new Object[7]; // instancia os objetos. Cada objeto representa um atributo 
                dados[0] = cl.get(i).getId_cliente();
                dados[1] = cl.get(i).getNome_cliente();
                dados[2] = cl.get(i).getCpf_cliente();
                dados[3] = cl.get(i).getCelular1_cliente();
                dados[4] = cl.get(i).getCelular2_cliente();
                dados[5] = cl.get(i).getEndereco_cliente();
                dados[6] = cl.get(i).getDataEntrada_cliente();
                // pega os dados salvos do banco de dados (que estão nas variáveis) e os coloca nos objetos definidos

                modeloTabela.addRow(dados); // insere uma linha nova a cada item novo encontrado na tabela do BD
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Erro no processo!\n" + ex.getMessage(), "Consultas", JOptionPane.ERROR_MESSAGE);
        } catch (Exception ex) {
            Logger.getLogger(FrmPesquisar.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
public void buscaTodosClientesComVeiculo() {
        try {
            PesquisaDAO pDAO = new PesquisaDAO(); // instancia a classe ProdutoDB()
            ArrayList<Cliente> cl = pDAO.consultaTodosComCarro(); // coloca o método dentro da variável
            

            DefaultTableModel modeloTabela = (DefaultTableModel) jTable1.getModel();
            // coloca a tabela em uma variável do tipo DefaultTableModel, que permite a modelagem dos dados da tabela

            for (int i = modeloTabela.getRowCount() - 1; i >= 0; i--) {
                modeloTabela.removeRow(i);
                // loop que limpa a tabela antes de ser atualizada
            }

            for (int i = 0; i < cl.size(); i++) {
                // loop que pega os dados e insere na tabela
                Object[] dados = new Object[8]; // instancia os objetos. Cada objeto representa um atributo 
                dados[0] = cl.get(i).getId_cliente();
                dados[1] = cl.get(i).getNome_cliente();
                dados[2] = cl.get(i).getCpf_cliente();
                dados[3] = cl.get(i).getCelular1_cliente();
                dados[4] = cl.get(i).getCelular2_cliente();
                dados[5] = cl.get(i).getEndereco_cliente();
                dados[6] = cl.get(i).getDataEntrada_cliente();
                dados[7] = cl.get(i).getModelo_veiculo();
                // pega os dados salvos do banco de dados (que estão nas variáveis) e os coloca nos objetos definidos

                modeloTabela.addRow(dados); // insere uma linha nova a cada item novo encontrado na tabela do BD
            }
             
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Erro no processo!\n" + ex.getMessage(), "Consultas", JOptionPane.ERROR_MESSAGE);
        } catch (Exception ex) {
            Logger.getLogger(FrmPesquisar.class.getName()).log(Level.SEVERE, null, ex);
        }  
    }
public void buscaTodosClientesComVeiculoPorCPF() {
        try {
            PesquisaDAO pDAO = new PesquisaDAO(); // instancia a classe ProdutoDB()
            ArrayList<Cliente> cl = pDAO.consultaTodosComCarroPorCPF(Long.parseLong(frmCPFcliente.getText().trim())); // coloca o método dentro da variável
            

            DefaultTableModel modeloTabela = (DefaultTableModel) jTable1.getModel();
            // coloca a tabela em uma variável do tipo DefaultTableModel, que permite a modelagem dos dados da tabela

            for (int i = modeloTabela.getRowCount() - 1; i >= 0; i--) {
                modeloTabela.removeRow(i);
                // loop que limpa a tabela antes de ser atualizada
            }

            for (int i = 0; i < cl.size(); i++) {
                // loop que pega os dados e insere na tabela
                Object[] dados = new Object[8]; // instancia os objetos. Cada objeto representa um atributo 
                dados[0] = cl.get(i).getId_cliente();
                dados[1] = cl.get(i).getNome_cliente();
                dados[2] = cl.get(i).getCpf_cliente();
                dados[3] = cl.get(i).getCelular1_cliente();
                dados[4] = cl.get(i).getCelular2_cliente();
                dados[5] = cl.get(i).getEndereco_cliente();
                dados[6] = cl.get(i).getDataEntrada_cliente();
                dados[7] = cl.get(i).getModelo_veiculo();
                // pega os dados salvos do banco de dados (que estão nas variáveis) e os coloca nos objetos definidos

                modeloTabela.addRow(dados); // insere uma linha nova a cada item novo encontrado na tabela do BD
            }
             
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Erro no processo!\n" + ex.getMessage(), "Consultas", JOptionPane.ERROR_MESSAGE);
        } catch (Exception ex) {
            Logger.getLogger(FrmPesquisar.class.getName()).log(Level.SEVERE, null, ex);
        }  
    }
}
