package br.projeto.DAO;


import br.projeto.bd.Conect;
import java.util.List;
import br.projeto.data.Cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *  
 *  @author Igor
 * 
 */
public class ClienteDAO {

	private final Conect C = new Conect(); // instancia o método de conexão
    private Connection conn = null; // cria uma nova variável de método Connection
    private PreparedStatement pstm = null; // cria uma nova variável de método PreparedStatement

    private boolean resultado;
    
    public void inserir(Cliente cl) throws SQLException {

        String sql = "INSERT INTO clientes(nome_cliente, cpf_cliente, celular1_cliente, celular2_cliente, endereco_cliente, entrada_cliente) VALUES(?,?,?,?,?,?)";

        try {
            //Cria uma conexão com o banco
            conn = C.createConnectionToMySQL();

            //Cria um PreparedStatment, classe usada para executar a query
            pstm = conn.prepareStatement(sql);
            //pstm.setInt(1, user.getId());

            pstm.setString(1, cl.getNome_cliente());

            pstm.setLong(2, cl.getCpf_cliente());
            
            pstm.setLong(3, cl.getCelular1_cliente());
            
            pstm.setLong(4, cl.getCelular2_cliente()); 
            
            pstm.setString(5, cl.getEndereco_cliente());
            
            pstm.setDate(6, cl.getDataEntrada_cliente());

            //Executa a sql para inserção dos dados
            pstm.execute();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Falha no processo!\nErro: " + ex.getMessage(), "Cadastro de Clientes", JOptionPane.ERROR_MESSAGE);

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
            JOptionPane.showMessageDialog(null, "Falha no processo!\nErro: " + ex.getMessage(), "Cadastro de Clientes", JOptionPane.ERROR_MESSAGE);

            }
        }
    }
    public boolean verificaCliente(Cliente cl) throws SQLException {

        
        ResultSet rs;

        try {

            String sqlNome = "SELECT cpf_cliente FROM clientes WHERE cpf_cliente = ?";
            conn = C.createConnectionToMySQL();
            pstm = conn.prepareStatement(sqlNome);
            pstm.setLong(1, cl.getCpf_cliente());
            rs = pstm.executeQuery();
            if (rs.next()) {
                resultado = true;
            } else {
                JOptionPane.showMessageDialog(null, "Falha no cadastro!","Cadastro de Clientes",JOptionPane.WARNING_MESSAGE);
                resultado = false;
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Falha no processo!\nErro: " + ex.getMessage(), "Cadastro de Clientes", JOptionPane.ERROR_MESSAGE);

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

	public void removerById(int id) {

	}

	public void alterar(Cliente Cli) {

	}

	public List<Cliente> getClientes() {
		return null;
	}

	public Cliente getCliente(int codigo) {
		return null;
	}

	public Cliente setCliente(String Nome) {
		return null;
	}

}
