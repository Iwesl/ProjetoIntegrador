package br.projeto.DAO;

import br.projeto.bd.Conect;
import br.projeto.data.OS;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class ServicoDAO {

    public void incluir(OS os) {

    }

    public void alterar(int Numero_OS) {

    }

    public void apagar(int Numero_OS) {

    }

    public ArrayList<OS> consultaTodasOs() throws SQLException {
        final Conect C = new Conect(); // instancia o método de conexão
        Connection conn = null; // cria uma nova variável de método Connection
        PreparedStatement pstm = null; // cria uma nova variável de método PreparedStatement
        String sql = "SELECT * FROM os";
        ArrayList<OS> ordems = new ArrayList<>();
        //  List<Contato> contatos = new ArrayList<Contato>();
        ResultSet rset = null;

        try {
            conn = C.createConnectionToMySQL();

            pstm = conn.prepareStatement(sql);

            rset = pstm.executeQuery();

            //Enquanto existir dados no banco de dados, faça
            while (rset.next()) {
                OS cl = new OS();
                //Recupera o id do banco e atribui ele ao objeto

                cl.setNumero_OS(rset.getInt("id_os"));
                //Recupera o nome do banco e atribui ele ao objeto
                cl.setDefeito_OS(rset.getString("defeito_os"));
                //Recupera a idade do banco e atribui ele ao objeto
                cl.setStatus_OS(rset.getString("status_os"));
                //Recupera a data do banco e atribui ela ao objeto
                cl.setDataAbertura_OS(rset.getDate("data_abertura"));

                cl.setDataFechamento_OS(rset.getDate("data_fechamento"));

                ordems.add(cl);

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

            return ordems;
        }
    }

    public ArrayList<OS> consultaTodasPorOS(int os) throws SQLException {
        final Conect C = new Conect(); // instancia o método de conexão
        Connection conn = null; // cria uma nova variável de método Connection
        PreparedStatement pstm = null; // cria uma nova variável de método PreparedStatement
        String sql = "SELECT * FROM os";
        ArrayList<OS> ordems = new ArrayList<>();
        //  List<Contato> contatos = new ArrayList<Contato>();
        ResultSet rset = null;

        try {
            conn = C.createConnectionToMySQL();

            pstm = conn.prepareStatement(sql);

            rset = pstm.executeQuery();

            //Enquanto existir dados no banco de dados, faça
            while (rset.next()) {
                OS cl = new OS();
                //Recupera o id do banco e atribui ele ao objeto
                if (rset.getInt("id_os") == os) {

                    cl.setNumero_OS(rset.getInt("id_os"));
                    //Recupera o nome do banco e atribui ele ao objeto
                    cl.setDefeito_OS(rset.getString("defeito_os"));
                    //Recupera a idade do banco e atribui ele ao objeto
                    cl.setStatus_OS(rset.getString("status_os"));
                    //Recupera a data do banco e atribui ela ao objeto
                    cl.setDataAbertura_OS(rset.getDate("data_abertura"));

                    cl.setDataFechamento_OS(rset.getDate("data_fechamento"));

                    ordems.add(cl);
                }
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

            return ordems;
        }
    }

    public ArrayList<OS> consultaTodasOsPlus() throws SQLException {
        final Conect C = new Conect(); // instancia o método de conexão
        Connection conn = null; // cria uma nova variável de método Connection
        PreparedStatement pstm = null; // cria uma nova variável de método PreparedStatement
        String sql = "SELECT os.*, usuarios.login_usuarios, clientes.nome_cliente, pecas.nome_pecas\n"
                + "FROM os, usuarios, clientes, pecas\n"
                + "WHERE os.id_usuario = usuarios.id_usuarios\n"
                + "AND os.id_clientes = clientes.id_clientes\n"
                + "AND os.id_pecas = pecas.id_pecas";
        ArrayList<OS> ordems = new ArrayList<>();
        //  List<Contato> contatos = new ArrayList<Contato>();
        ResultSet rset = null;

        try {
            conn = C.createConnectionToMySQL();

            pstm = conn.prepareStatement(sql);

            rset = pstm.executeQuery();

            //Enquanto existir dados no banco de dados, faça
            while (rset.next()) {
                OS cl = new OS();
                //Recupera o id do banco e atribui ele ao objeto

                cl.setNumero_OS(rset.getInt("id_os"));
                //Recupera o nome do banco e atribui ele ao objeto
                cl.setDefeito_OS(rset.getString("defeito_os"));
                //Recupera a idade do banco e atribui ele ao objeto
                cl.setStatus_OS(rset.getString("status_os"));
                //Recupera a data do banco e atribui ela ao objeto
                cl.setDataAbertura_OS(rset.getDate("data_abertura"));

                cl.setDataFechamento_OS(rset.getDate("data_fechamento"));

                cl.setNomeUsuario_OS(rset.getString("login_usuarios"));

                cl.setNomeCliente_OS(rset.getString("nome_cliente"));

                cl.setNomePeca_OS(rset.getString("nome_pecas"));

                ordems.add(cl);

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

            return ordems;
        }
    }

    public ArrayList<OS> consultaTodasPorOSPlus(int os) throws SQLException {
        final Conect C = new Conect(); // instancia o método de conexão
        Connection conn = null; // cria uma nova variável de método Connection
        PreparedStatement pstm = null; // cria uma nova variável de método PreparedStatement
        String sql = "SELECT os.*, usuarios.login_usuarios, clientes.nome_cliente, pecas.nome_pecas\n"
                + "FROM os, usuarios, clientes, pecas\n"
                + "WHERE os.id_usuario = usuarios.id_usuarios\n"
                + "AND os.id_clientes = clientes.id_clientes\n"
                + "AND os.id_pecas = pecas.id_pecas";
        ArrayList<OS> ordems = new ArrayList<>();
        //  List<Contato> contatos = new ArrayList<Contato>();
        ResultSet rset = null;

        try {
            conn = C.createConnectionToMySQL();

            pstm = conn.prepareStatement(sql);

            rset = pstm.executeQuery();

            //Enquanto existir dados no banco de dados, faça
            while (rset.next()) {
                OS cl = new OS();
                //Recupera o id do banco e atribui ele ao objeto
                if (rset.getInt("id_os") == os) {

                    cl.setNumero_OS(rset.getInt("id_os"));
                    //Recupera o nome do banco e atribui ele ao objeto
                    cl.setDefeito_OS(rset.getString("defeito_os"));
                    //Recupera a idade do banco e atribui ele ao objeto
                    cl.setStatus_OS(rset.getString("status_os"));
                    //Recupera a data do banco e atribui ela ao objeto
                    cl.setDataAbertura_OS(rset.getDate("data_abertura"));

                    cl.setDataFechamento_OS(rset.getDate("data_fechamento"));

                    cl.setNomeUsuario_OS(rset.getString("login_usuarios"));

                    cl.setNomeCliente_OS(rset.getString("nome_cliente"));

                    cl.setNomePeca_OS(rset.getString("nome_pecas"));

                    ordems.add(cl);
                }
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

            return ordems;
        }
    }

    public ArrayList<OS> consultaTodasPorNome(String nome) throws SQLException {
        final Conect C = new Conect(); // instancia o método de conexão
        Connection conn = null; // cria uma nova variável de método Connection
        PreparedStatement pstm = null; // cria uma nova variável de método PreparedStatement
        String sql = "SELECT os.*, usuarios.login_usuarios, clientes.nome_cliente, pecas.nome_pecas\n"
                + "FROM os, usuarios, clientes, pecas\n"
                + "WHERE os.id_usuario = usuarios.id_usuarios\n"
                + "AND os.id_clientes = clientes.id_clientes\n"
                + "AND os.id_pecas = pecas.id_pecas";
        ArrayList<OS> ordems = new ArrayList<>();
        //  List<Contato> contatos = new ArrayList<Contato>();
        ResultSet rset = null;

        try {
            conn = C.createConnectionToMySQL();

            pstm = conn.prepareStatement(sql);

            rset = pstm.executeQuery();

            //Enquanto existir dados no banco de dados, faça
            while (rset.next()) {
                OS cl = new OS();
                //Recupera o id do banco e atribui ele ao objeto
                if (rset.getString("nome_cliente").contains(nome)) {
                
                cl.setNumero_OS(rset.getInt("id_os"));
                //Recupera o nome do banco e atribui ele ao objeto
                cl.setDefeito_OS(rset.getString("defeito_os"));
                //Recupera a idade do banco e atribui ele ao objeto
                cl.setStatus_OS(rset.getString("status_os"));
                //Recupera a data do banco e atribui ela ao objeto
                cl.setDataAbertura_OS(rset.getDate("data_abertura"));

                cl.setDataFechamento_OS(rset.getDate("data_fechamento"));

                cl.setNomeUsuario_OS(rset.getString("login_usuarios"));

                cl.setNomeCliente_OS(rset.getString("nome_cliente"));

                cl.setNomePeca_OS(rset.getString("nome_pecas"));

                ordems.add(cl);
                }

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

            return ordems;
        }
    }

    public ArrayList<OS> consultaTodasPorNomePlus(String nome) throws SQLException {
        final Conect C = new Conect(); // instancia o método de conexão
        Connection conn = null; // cria uma nova variável de método Connection
        PreparedStatement pstm = null; // cria uma nova variável de método PreparedStatement
        String sql = "SELECT os.*, usuarios.login_usuarios, clientes.nome_cliente, pecas.nome_pecas\n"
                + "FROM os, usuarios, clientes, pecas\n"
                + "WHERE os.id_usuario = usuarios.id_usuarios\n"
                + "AND os.id_clientes = clientes.id_clientes\n"
                + "AND os.id_pecas = pecas.id_pecas";
        ArrayList<OS> ordems = new ArrayList<>();
        //  List<Contato> contatos = new ArrayList<Contato>();
        ResultSet rset = null;

        try {
            conn = C.createConnectionToMySQL();

            pstm = conn.prepareStatement(sql);

            rset = pstm.executeQuery();

            //Enquanto existir dados no banco de dados, faça
            while (rset.next()) {
                OS cl = new OS();
                //Recupera o id do banco e atribui ele ao objeto
                if (rset.getString("nome_cliente").contains(nome)) {

                    cl.setNumero_OS(rset.getInt("id_os"));
                    //Recupera o nome do banco e atribui ele ao objeto
                    cl.setDefeito_OS(rset.getString("defeito_os"));
                    //Recupera a idade do banco e atribui ele ao objeto
                    cl.setStatus_OS(rset.getString("status_os"));
                    //Recupera a data do banco e atribui ela ao objeto
                    cl.setDataAbertura_OS(rset.getDate("data_abertura"));

                    cl.setDataFechamento_OS(rset.getDate("data_fechamento"));

                    cl.setNomeUsuario_OS(rset.getString("login_usuarios"));

                    cl.setNomeCliente_OS(rset.getString("nome_cliente"));

                    cl.setNomePeca_OS(rset.getString("nome_pecas"));

                    ordems.add(cl);
                }
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

            return ordems;
        }
    }

}
