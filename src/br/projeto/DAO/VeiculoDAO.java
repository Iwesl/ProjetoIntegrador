/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.projeto.DAO;

import br.projeto.bd.Conect;
import br.projeto.data.Cliente;
import br.projeto.data.Veiculo;
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
public class VeiculoDAO {

    private final Conect C = new Conect();
    private Connection conn = null;
    private PreparedStatement pstm = null;

    private boolean resultado;

    public void inserir(Veiculo vei) throws SQLException {

        String sql = "INSERT INTO veiculos(modelo_veiculo, marca_veiculo, cor_veiculo, placa_veiculo, id_clientes) VALUES(?,?,?,?,?)";

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

    public ArrayList<Cliente> consultaCliente() throws SQLException {
        ArrayList<Cliente> clientes = new ArrayList<>();

        ResultSet rset;

        try {

            String sqlNome = "SELECT id_clientes, nome_cliente FROM clientes";
            conn = C.createConnectionToMySQL();
            pstm = conn.prepareStatement(sqlNome);
            rset = pstm.executeQuery();

            while (rset.next()) {
                Cliente cl = new Cliente();
                //Veiculo v = new Veiculo();
                //Recupera o id do banco e atribui ele ao objeto
                cl.setId_cliente(rset.getInt("id_clientes"));
                //Recupera o nome do banco e atribui ele ao objeto
                cl.setNome_cliente(rset.getString("nome_cliente"));
                //Recupera a idade do banco e atribui ele ao objeto

                clientes.add(cl);

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
                JOptionPane.showMessageDialog(null, "Falha no processo!\nErro: " + ex.getMessage(), "Cadastro de Veículos", JOptionPane.ERROR_MESSAGE);

            }
        }
        return clientes;
    }

    public ArrayList<Cliente> consultaClienteOSPlaca(String placa) throws SQLException {
        ArrayList<Cliente> clientes = new ArrayList<>();

        ResultSet rset;

        try {

            String sqlNome = "SELECT * FROM clientes, veiculos WHERE veiculos.id_clientes = clientes.id_clientes AND veiculos.placa_veiculo = ?";
            conn = C.createConnectionToMySQL();
            pstm = conn.prepareStatement(sqlNome);
            pstm.setString(1, placa);
            rset = pstm.executeQuery();
            
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

                    cl.setModelo_veiculo(rset.getString("modelo_veiculo"));

                    clientes.add(cl);
                
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Falha no processo!\nErro: " + ex.getMessage(), "Consulta de Veículos", JOptionPane.ERROR_MESSAGE);

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
                JOptionPane.showMessageDialog(null, "Falha no processo!\nErro: " + ex.getMessage(), "Consulta de Veículos", JOptionPane.ERROR_MESSAGE);

            }
        }
        return clientes;
    }
    
     public ArrayList<Veiculo> consultaVeiculoByID(int id) throws SQLException {
        ArrayList<Veiculo> veiculos = new ArrayList<>();

        ResultSet rset;

        try {

            String sqlNome = "SELECT clientes.id_clientes, veiculos.* FROM clientes, veiculos WHERE veiculos.id_clientes = clientes.id_clientes AND veiculos.id_veiculo = ?";
            conn = C.createConnectionToMySQL();
            pstm = conn.prepareStatement(sqlNome);
            pstm.setInt(1, id);
            rset = pstm.executeQuery();
            
            while (rset.next()) {
                Veiculo v = new Veiculo();
                    //Recupera o id do banco e atribui ele ao objeto
                    v.setId_veiculo(rset.getInt("id_veiculo"));
                    //Recupera o nome do banco e atribui ele ao objeto
                    v.setModelo_veiculo(rset.getString("modelo_veiculo"));
                    //Recupera a idade do banco e atribui ele ao objeto
                    v.setMarca_veiculo(rset.getString("marca_veiculo"));
                    //Recupera a data do banco e atribui ela ao objeto
                    v.setCor_veiculo(rset.getString("cor_veiculo"));

                    v.setPlaca_veiculo(rset.getString("placa_veiculo"));

                    v.setId_cliente(rset.getInt("id_clientes"));

                    veiculos.add(v);
                
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Falha no processo!\nErro: " + ex.getMessage(), "Consulta de Veículos", JOptionPane.ERROR_MESSAGE);

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
                JOptionPane.showMessageDialog(null, "Falha no processo!\nErro: " + ex.getMessage(), "Consulta de Veículos", JOptionPane.ERROR_MESSAGE);

            }
        }
        return veiculos;
    }
     
     public void removeVeiculoByID(int id) throws SQLException {
        ArrayList<Veiculo> veiculos = new ArrayList<>();

        ResultSet rset;

        try {

            String sqlNome = "DELETE FROM veiculos WHERE id_veiculo = ?";
            conn = C.createConnectionToMySQL();
            pstm = conn.prepareStatement(sqlNome);
            pstm.setInt(1, id);
            rset = pstm.executeQuery();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Falha no processo!\nErro: " + ex.getMessage(), "Remoção de Veículos", JOptionPane.ERROR_MESSAGE);

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
                JOptionPane.showMessageDialog(null, "Falha no processo!\nErro: " + ex.getMessage(), "Remoção de Veículos", JOptionPane.ERROR_MESSAGE);

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
                JOptionPane.showMessageDialog(null, "Falha no cadastro!", "Cadastro de Veículos", JOptionPane.WARNING_MESSAGE);
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
