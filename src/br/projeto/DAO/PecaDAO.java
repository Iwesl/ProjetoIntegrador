package br.projeto.DAO;

import br.projeto.bd.Conect;
import br.projeto.data.Contato;
import br.projeto.data.Peca;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class PecaDAO {

    private final Conect C = new Conect(); // instancia o método de conexão
    private Connection conn = null; // cria uma nova variável de método Connection
    private PreparedStatement pstm = null; // cria uma nova variável de método PreparedStatement

    private boolean resultado;
    
    public void inserir(Peca pc) throws SQLException {

        String sql = "INSERT INTO pecas(nome_pecas, quantidade_pecas, valor_precas) VALUES(?,?,?)";

        try {
            //Cria uma conexão com o banco
            conn = C.createConnectionToMySQL();

            //Cria um PreparedStatment, classe usada para executar a query
            pstm = conn.prepareStatement(sql);
            //pstm.setInt(1, user.getId());

            pstm.setString(1, pc.getNome_pecas());

            pstm.setInt(2, pc.getQuantidade_pecas());
            
            pstm.setDouble(3, pc.getValor_pecas());            

            //Executa a sql para inserção dos dados
            pstm.execute();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Falha no processo!\nErro: " + ex.getMessage(), "Cadastro de Peças", JOptionPane.ERROR_MESSAGE);

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
            JOptionPane.showMessageDialog(null, "Falha no processo!\nErro: " + ex.getMessage(), "Cadastro de Peças", JOptionPane.ERROR_MESSAGE);

            }
        }
    }
    
    public boolean verificaNomePeca(Peca pc) throws SQLException {

        
        ResultSet rs;

        try {

            String sqlNome = "SELECT nome_pecas FROM pecas WHERE nome_pecas = ?";
            conn = C.createConnectionToMySQL();
            pstm = conn.prepareStatement(sqlNome);
            pstm.setString(1, pc.getNome_pecas());
            rs = pstm.executeQuery();
            if (rs.next()) {
                resultado = true;
            } else {
                JOptionPane.showMessageDialog(null, "Falha no cadastro!","Cadastro de Peças",JOptionPane.WARNING_MESSAGE);
                resultado = false;
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Falha no processo!\nErro: " + ex.getMessage(), "Cadastro de Peças", JOptionPane.ERROR_MESSAGE);

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
            JOptionPane.showMessageDialog(null, "Falha no processo!\nErro: " + ex.getMessage(), "Cadastro de Peças", JOptionPane.ERROR_MESSAGE);

            }
        }

        return resultado;
     }

    public void removerByName(String nome_pecas) {

    }

    public void alterar(Peca pecas) {

    }

    public ArrayList<Peca> consultaTodasPecas() throws Exception {

        String sqlSelect = "SELECT * FROM pecas"; // coloca o comando SQL em uma variável String
        ArrayList<Peca> produtos = new ArrayList<>();

        try {
            conn = C.createConnectionToMySQL(); // faz a conexão e repassa o status para a nova variável
            pstm = conn.prepareStatement(sqlSelect);
            // prepara a conexão com o banco de dados colocando o comando SQL desejado, e o guardando em uma variável nova
            ResultSet rs = pstm.executeQuery();
            // executa o comando SQL no banco de dados e guarda o resultado em uma variável do tipo ResultSet
            while (rs.next()) {
                // loop para pegar todos os itens da tabela
                Peca p = new Peca();
                p.setNome_pecas(rs.getString("nome_pecas"));
                p.setQuantidade_pecas(rs.getInt("quantidade_pecas"));
                p.setValor_pecas(rs.getDouble("valor_precas"));
                // preenche as variáveis com os dados dos itens da tabela no banco de dados

                produtos.add(p); // salva os dados

            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Falha no processo!\nErro: " + ex.getMessage(), "Conexão ao BD", JOptionPane.ERROR_MESSAGE);
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
                JOptionPane.showMessageDialog(null, "Falha no processo!\nErro: " + ex.getMessage(), "Conexão ao BD", JOptionPane.ERROR_MESSAGE);
            }
        }
        return produtos;
    }
    
    public ArrayList<Peca> consultaValorPecas(String nome) throws SQLException, Exception {

        String sqlSelect = "SELECT * FROM pecas"; // coloca o comando SQL em uma variável String
        ArrayList<Peca> produtos = new ArrayList<>();

        try {
            conn = C.createConnectionToMySQL(); // faz a conexão e repassa o status para a nova variável
            pstm = conn.prepareStatement(sqlSelect);
            // prepara a conexão com o banco de dados colocando o comando SQL desejado, e o guardando em uma variável nova
            ResultSet rs = pstm.executeQuery();
            // executa o comando SQL no banco de dados e guarda o resultado em uma variável do tipo ResultSet
            while (rs.next()) {
                // loop para pegar todos os itens da tabela
                Peca p = new Peca();
                
                if(rs.getString("nome_pecas").contains(nome)){
                p.setId_pecas(rs.getInt("id_pecas"));
                p.setNome_pecas(rs.getString("nome_pecas"));
                p.setQuantidade_pecas(rs.getInt("quantidade_pecas"));
                p.setValor_pecas(rs.getDouble("valor_precas"));
                // preenche as variáveis com os dados dos itens da tabela no banco de dados

                produtos.add(p); // salva os dados
                }
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Falha no processo!\nErro: " + ex.getMessage(), "Conexão ao BD", JOptionPane.ERROR_MESSAGE);
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
                JOptionPane.showMessageDialog(null, "Falha no processo!\nErro: " + ex.getMessage(), "Conexão ao BD", JOptionPane.ERROR_MESSAGE);
            }
        }
        return produtos;
    }

    public Peca consultaPecas(int id_pecas) {
        return null;
    }

}
