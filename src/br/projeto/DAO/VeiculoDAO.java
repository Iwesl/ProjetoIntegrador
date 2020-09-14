/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.projeto.DAO;

import br.projeto.bd.Conect;
import br.projeto.data.Veiculo;
import br.projeto.form.FrmLogin;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Igor
 */
public class VeiculoDAO {
    
    private final Conect C = new Conect();
    private Connection conn = null;
    private PreparedStatement pstm = null;
    
    private boolean resultado;
    
    public void inserir(Veiculo vei) throws SQLException {

        String sql = "INSERT INTO veiculos(modelo_veiculo, marca_veiculo, cor_veiculo, placa_veiculo, id_cliente) VALUES(?,?,?,?,?)";

        try {
            //Cria uma conexão com o banco
            conn = C.createConnectionToMySQL();

            //Cria um PreparedStatment, classe usada para executar a query
            pstm = conn.prepareStatement(sql);
            //pstm.setInt(1, user.getId());

            pstm.setString(1, vei.getModelo_veiculo());

            pstm.setString(2, vei.getMarca_veiculo());
            
            pstm.setString(3, vei.getCor_veiculo());
            
            pstm.setString(4, vei.getPlaca_veiculo());
            
            pstm.setInt(5, vei.getId_cliente());
            //Executa a sql para inserção dos dados
            pstm.execute();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Falha no processo!\nErro: " + ex.getMessage(), "Cadastro de Veículos", JOptionPane.ERROR_MESSAGE);

        } catch (Exception ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {

            //Fecha as conexões
            try {
                if (pstm != null) {

                    pstm.close();
                }

                if (conn != null) {
                    conn.close();
                }

            } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Falha no processo!\nErro: " + ex.getMessage(), "Cadastro de Veículos", JOptionPane.ERROR_MESSAGE);

            }
        }
    }
    
     public boolean verificaPlaca(Veiculo vei) throws SQLException {

        
        ResultSet rs;

        try {

            String sqlNome = "SELECT placa_veiculo FROM veiculos WHERE placa_veiculo = ?";
            conn = C.createConnectionToMySQL();
            pstm = conn.prepareStatement(sqlNome);
            pstm.setString(1, vei.getPlaca_veiculo());
            rs = pstm.executeQuery();
            if (rs.next()) {
                resultado = true;
            } else {
                JOptionPane.showMessageDialog(null, "Falha no cadastro!","Cadastro de Veículos",JOptionPane.WARNING_MESSAGE);
                resultado = false;
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Falha no processo!\nErro: " + ex.getMessage(), "Cadastro de Veículos", JOptionPane.ERROR_MESSAGE);

        } catch (Exception ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if (pstm != null) {
                    pstm.close();
                }
                if (conn != null) {
                    conn.close();
                }

            } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Falha no processo!\nErro: " + ex.getMessage(), "Cadastro de Funcionários", JOptionPane.ERROR_MESSAGE);

            }
        }

        return resultado;
     }
}
