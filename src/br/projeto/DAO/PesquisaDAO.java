/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.projeto.DAO;

import br.projeto.bd.Conect;
import br.projeto.data.Cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Igor
 */
public class PesquisaDAO {

    private final Conect C = new Conect(); // instancia o método de conexão
    private Connection conn = null; // cria uma nova variável de método Connection
    private PreparedStatement pstm = null; // cria uma nova variável de método PreparedStatement

    public ArrayList<Cliente> consultaTodos() throws SQLException {
        String sql = "SELECT * FROM clientes";
        ArrayList<Cliente> clientes = new ArrayList<>();
        //  List<Contato> contatos = new ArrayList<Contato>();
        ResultSet rset = null;

        try {
            conn = C.createConnectionToMySQL();

            pstm = conn.prepareStatement(sql);

            rset = pstm.executeQuery();

            //Enquanto existir dados no banco de dados, faça
            while (rset.next()) {
                Cliente cl = new Cliente();
                //Recupera o id do banco e atribui ele ao objeto
                cl.setId_cliente(rset.getInt("id_clientes"));
                //Recupera o nome do banco e atribui ele ao objeto
                cl.setNome_cliente(rset.getString("nome_cliente"));
                //Recupera a idade do banco e atribui ele ao objeto
                cl.setCpf_cliente(rset.getLong("cpf_cliente"));
                //Recupera a data do banco e atribui ela ao objeto
                cl.setCelular1_cliente(rset.getLong("celular1_cliente"));

                cl.setCelular2_cliente(rset.getLong("celular2_cliente"));

                cl.setEndereco_cliente(rset.getString("endereco_cliente"));

                cl.setDataEntrada_cliente(rset.getDate("entrada_cliente"));
                
                clientes.add(cl);

            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Falha no processo!\nErro: " + ex.getMessage(), "Pesquisa", JOptionPane.ERROR_MESSAGE);

        } catch (Exception ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {

            try {

                if (rset != null) {

                    rset.close();
                }

                if (pstm != null) {

                    pstm.close();
                }

                if (conn != null) {
                    conn.close();
                }

            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Falha no processo!\nErro: " + ex.getMessage(), "Pesquisa", JOptionPane.ERROR_MESSAGE);

            } catch (Exception ex) {
                Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
            }

            return clientes;
        }
    }
}
