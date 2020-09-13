package br.projeto.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import br.projeto.bd.Conect;
import br.projeto.form.FrmLogin;
import br.projeto.data.Usuario;
import javax.swing.JOptionPane;

public class UsuarioDAO {

    FrmLogin login = new FrmLogin();
    private final Conect C = new Conect();
    private Connection conn = null;
    private PreparedStatement pstm = null;

    private boolean resultadoLogin, resultadoNome, resultadoSenha;

    public void inserir(Usuario user) {

        String sql = "INSERT INTO usuarios(login_usuarios,cpf_usuarios,senha_usuarios) VALUES(?,?,?)";

        try {
            //Cria uma conexão com o banco
            conn = C.createConnectionToMySQL();

            //Cria um PreparedStatment, classe usada para executar a query
            pstm = conn.prepareStatement(sql);
            //pstm.setInt(1, user.getId());

            pstm.setString(1, user.getNome_usuario());

            pstm.setInt(2, Integer.parseInt(user.getCpf_usuario()));
            
            pstm.setString(3, user.getPassword_usuario());
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

    public boolean verificaCpf(Usuario user) {

        
        ResultSet rs;

        try {

            String sqlNome = "SELECT cpf_usuarios FROM usuarios WHERE cpf_usuarios = ?";
            conn = C.createConnectionToMySQL();
            pstm = conn.prepareStatement(sqlNome);
            pstm.setLong(1, (user.getCpf_usuario()));
            rs = pstm.executeQuery();
            if (rs.next()) {
                resultadoNome = true;
            } else {
                JOptionPane.showMessageDialog(null, "Falha no login!\nEste usuário não existe!","Login",JOptionPane.WARNING_MESSAGE);
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
    public String verificaNome() {
        Usuario user = new Usuario();
        
        ResultSet rs;

        try {

            String sqlNome = "SELECT login_usuarios FROM usuarios WHERE cpf_usuarios = '"+user.getCpf_usuario()+"'";
            conn = C.createConnectionToMySQL();
            pstm = conn.prepareStatement(sqlNome);
            rs = pstm.executeQuery();
            if (rs.next()) {
                user.setNome_usuario(rs.getString(sqlNome));
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

        return user.getNome_usuario();

    }

    public boolean verificaSenha(Usuario user) {

        ResultSet rs;

        try {

            String sqlSenha = "SELECT senha_usuarios, cpf_usuarios FROM usuarios WHERE senha_usuarios = '"
                              + user.getPassword_usuario() + "' AND cpf_usuarios = '" + (user.getCpf_usuario()) +"'";
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
