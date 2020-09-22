package br.projeto.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import br.projeto.bd.Conect;
import br.projeto.data.Usuario;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class UsuarioDAO {

    private final Conect C = new Conect();
    private Connection conn = null;
    private PreparedStatement pstm = null;

    private boolean resultadoLogin, resultadoCpf, resultadoSenha;
    private String nome;

    public void inserir(Usuario user) throws SQLException {

        String sql = "INSERT INTO usuarios(login_usuarios,cpf_usuarios,senha_usuarios) VALUES(?,?,?)";

        try {
            //Cria uma conexão com o banco
            conn = C.createConnectionToMySQL();

            //Cria um PreparedStatment, classe usada para executar a query
            pstm = conn.prepareStatement(sql);
            //pstm.setInt(1, user.getId());

            pstm.setString(1, user.getNome_usuario());

            pstm.setLong(2, user.getCpf_usuario());
            
            pstm.setString(3, user.getPassword_usuario());
            //Adiciona o valor do terceiro parâmetro da sql

            //Executa a sql para inserção dos dados
            pstm.execute();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Falha no processo!\nErro: " + ex.getMessage(), "Cadastro de Funcionários", JOptionPane.ERROR_MESSAGE);

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
            JOptionPane.showMessageDialog(null, "Falha no processo!\nErro: " + ex.getMessage(), "Cadastro de Funcionários", JOptionPane.ERROR_MESSAGE);

            }
        }
    }

    public void Alterar(int id) {

    }

    public void Excluir(Usuario user) {

    }

    public ArrayList<Usuario> consultaTodos() throws SQLException {
        final Conect C = new Conect(); // instancia o método de conexão
        Connection conn = null; // cria uma nova variável de método Connection
        PreparedStatement pstm = null; // cria uma nova variável de método PreparedStatement
        String sql = "SELECT * FROM usuarios";
        ArrayList<Usuario> usuarios = new ArrayList<>();
        //  List<Contato> contatos = new ArrayList<Contato>();
        ResultSet rset = null;

        try {
            conn = C.createConnectionToMySQL();

            pstm = conn.prepareStatement(sql);

            rset = pstm.executeQuery();

            //Enquanto existir dados no banco de dados, faça
            while (rset.next()) {
                Usuario usr = new Usuario();
                //Recupera o id do banco e atribui ele ao objeto
                usr.setId_usuario(rset.getInt("id_usuarios"));
                //Recupera o nome do banco e atribui ele ao objeto
                usr.setNome_usuario(rset.getString("login_usuarios"));
                //Recupera a idade do banco e atribui ele ao objeto
                usr.setCpf_usuario(rset.getLong("cpf_usuarios"));
                //Recupera a data do banco e atribui ela ao objeto

                usuarios.add(usr);

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

            return usuarios;
        }
    }

    public boolean verificaCpf(Usuario user) throws SQLException {

        
        ResultSet rs;

        try {

            String sqlNome = "SELECT cpf_usuarios FROM usuarios WHERE cpf_usuarios = ?";
            conn = C.createConnectionToMySQL();
            pstm = conn.prepareStatement(sqlNome);
            pstm.setLong(1, user.getCpf_usuario());
            rs = pstm.executeQuery();
            if (rs.next()) {
                resultadoCpf = true;
            } else {
                JOptionPane.showMessageDialog(null, "Falha no login!\nEste CPF não está cadastrado!","Login",JOptionPane.WARNING_MESSAGE);
                System.out.println("ERRO! \nEste usuário não existe!\n");
                resultadoCpf = false;
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Falha no processo!\nErro: " + ex.getMessage(), "Login", JOptionPane.ERROR_MESSAGE);

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
            JOptionPane.showMessageDialog(null, "Falha no processo!\nErro: " + ex.getMessage(), "Login", JOptionPane.ERROR_MESSAGE);

            }
        }

        return resultadoCpf;

    }
    public String verificaNome(Usuario user) throws SQLException {
        ResultSet rs;

        try {

            String sqlNome = "SELECT login_usuarios FROM usuarios WHERE cpf_usuarios = '"+user.getCpf_usuario()+"'";
            conn = C.createConnectionToMySQL();
            pstm = conn.prepareStatement(sqlNome);
            rs = pstm.executeQuery();
            if (rs.next()) {
                user.setNome_usuario(rs.getString("login_usuarios"));
                 nome = user.getNome_usuario();
                 nomeFinal(nome);
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Falha no processo!\nErro: " + ex.getMessage(), "Login", JOptionPane.ERROR_MESSAGE);

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
            JOptionPane.showMessageDialog(null, "Falha no processo!\nErro: " + ex.getMessage(), "Login", JOptionPane.ERROR_MESSAGE);
            }
        }
        return nome;
    }
    public final String nomeFinal(String n){
        
        return n;
    }
    
    public boolean verificaSenha(Usuario user) throws SQLException {

        ResultSet rs;

        try {

            String sqlSenha = "SELECT senha_usuarios, cpf_usuarios FROM usuarios WHERE senha_usuarios = '"
                              + user.getPassword_usuario() + "' AND cpf_usuarios = '" + user.getCpf_usuario() +"'";
            conn = C.createConnectionToMySQL();
            //pstm.setString(1, user.getPassword());
            pstm = conn.prepareStatement(sqlSenha);
            rs = pstm.executeQuery();
            if (rs.next()) {
                resultadoSenha = true;
            } else {
                System.out.println("ERRO! \nDigite novamente sua senha.\n");
                JOptionPane.showMessageDialog(null, "Falha no login!\nSenha não confere!","Login",JOptionPane.WARNING_MESSAGE);
                resultadoSenha = false;
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Falha no processo!\nErro: " + ex.getMessage(), "Login", JOptionPane.ERROR_MESSAGE);

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
            JOptionPane.showMessageDialog(null, "Falha no processo!\nErro: " + ex.getMessage(), "Login", JOptionPane.ERROR_MESSAGE);

            }
        }

        return resultadoSenha;

    }

    public boolean verificaLogin() {

        this.resultadoLogin = resultadoCpf && resultadoSenha;
        return this.resultadoLogin;

    }

    

}
