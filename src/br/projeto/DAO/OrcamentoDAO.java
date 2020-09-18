package br.projeto.DAO;

import br.projeto.bd.Conect;
import br.projeto.data.Peca;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class OrcamentoDAO {
    
    private final Conect C = new Conect(); // instancia o método de conexão
    private Connection conn = null; // cria uma nova variável de método Connection
    private PreparedStatement pstm = null; // cria uma nova variável de método PreparedStatement
    
    public ArrayList<Peca> orçamentoValorPecas(String nome) throws SQLException, Exception {
        
        

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

}
