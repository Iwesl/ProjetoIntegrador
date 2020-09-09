package br.projeto.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import br.projeto.bd.Conect;
import br.projeto.form.Login;
import br.projeto.data.Usuario;

public class UsuarioDAO {

    Login login = new Login();
    private final Conect C = new Conect();
    private Connection conn = null;
    private PreparedStatement pstm = null;

    private boolean resultadoLogin, resultadoNome, resultadoSenha;

    public void inserir(Usuario user) {

        String sql = "INSERT INTO usuarios(login,senha) VALUES(?,?)";

        try {
            //Cria uma conexão com o banco
            conn = C.createConnectionToMySQL();

            //Cria um PreparedStatment, classe usada para executar a query
            pstm = conn.prepareStatement(sql);
            //pstm.setInt(1, user.getId());
            //Adiciona o valor do primeiro parâmetro da sql
            pstm.setString(1, user.getNome());
            //Adicionar o valor do segundo parâmetro da sql
            pstm.setString(2, user.getPassword());
            //Adiciona o valor do terceiro parâmetro da sql

            //Executa a sql para inserção dos dados
            pstm.execute();

        } catch (Exception e) {

            e.printStackTrace();
        } finally {

            //Fecha as conexões
            try {
                if (pstm != null) {

                    pstm.close();
                }

                if (conn != null) {
                    conn.close();
                }

            } catch (Exception e) {

                e.printStackTrace();
            }
        }
    }

    public void Alterar(int id) {

    }

    public void Excluir(Usuario user) {

    }

    public Usuario Consultar(int Codigo) {
        
        
        
        return null;
    }

    public boolean verificaNome(Usuario user) {

        
        ResultSet rs;

        try {

            String sqlNome = "SELECT login FROM usuarios WHERE login = ?";
            conn = C.createConnectionToMySQL();
            pstm = conn.prepareStatement(sqlNome);
            pstm.setString(1, user.getNome());
            rs = pstm.executeQuery();
            if (rs.next()) {
                resultadoNome = true;
            } else {
                
                System.out.println("ERRO! \nEste usuário não existe!\n");
                resultadoNome = false;
            }

        } catch (Exception e) {
            e.printStackTrace();

        } finally {
            try {
                if (pstm != null) {
                    pstm.close();
                }
                if (conn != null) {
                    conn.close();
                }

            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        return resultadoNome;

    }

    public boolean verificaSenha(Usuario user) {

        ResultSet rs;

        try {

            String sqlSenha = "SELECT login, senha FROM usuarios WHERE login = '"
                              + user.getNome() + "' AND senha = '" + user.getPassword() +"'";
            conn = C.createConnectionToMySQL();
            //pstm.setString(1, user.getPassword());
            pstm = conn.prepareStatement(sqlSenha);
            rs = pstm.executeQuery();
            if (rs.next()) {
                resultadoSenha = true;
            } else {
                System.out.println("ERRO! \nDigite novamente sua senha.\n");
                resultadoSenha = false;
            }

        } catch (Exception e) {
            e.printStackTrace();

        } finally {
            try {
                if (pstm != null) {
                    pstm.close();
                }
                if (conn != null) {
                    conn.close();
                }

            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        return resultadoSenha;

    }

    public boolean verificaLogin() {

        this.resultadoLogin = resultadoNome && resultadoSenha;
        return this.resultadoLogin;

    }

}
