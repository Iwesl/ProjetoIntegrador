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

    public void inserir(OS os) throws SQLException {
        final Conect C = new Conect(); // instancia o método de conexão
        Connection conn = null; // cria uma nova variável de método Connection
        PreparedStatement pstm = null; // cria uma nova variável de método PreparedStatement

        String sql = "INSERT INTO os(defeito_os, obs_os, status_os, valor_os, data_abertura, data_fechamento, id_usuario, id_pecas, id_clientes) VALUES(?,?,?,?,?,?,?,?,?)";

        try {
            //Cria uma conexão com o banco
            conn = C.createConnectionToMySQL();

            //Cria um PreparedStatment, classe usada para executar a query
            pstm = conn.prepareStatement(sql);

            pstm.setString(1, os.getDefeito_OS());

            pstm.setString(2, os.getObs_OS());

            pstm.setString(3, os.getStatus_OS());

            pstm.setDouble(4, os.getValorTotal_OS());

            pstm.setDate(5, os.getDataAbertura_OS());

            pstm.setDate(6, os.getDataFechamento_OS());

            pstm.setInt(7, os.getIdUsuario_OS());

            pstm.setInt(8, os.getIdPeca_OS());

            pstm.setInt(9, os.getIdCliente_OS());

            //Executa a sql para inserção dos dados
            pstm.execute();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Falha no processo!\nErro: " + ex.getMessage(), "Cadastro de Ordem de Serviço", JOptionPane.ERROR_MESSAGE);

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
                JOptionPane.showMessageDialog(null, "Falha no processo!\nErro: " + ex.getMessage(), "Cadastro de Ordem de Serviço", JOptionPane.ERROR_MESSAGE);

            }
        }
    }

    public boolean verificaOS(OS os) throws SQLException {
        final Conect C = new Conect(); // instancia o método de conexão
        Connection conn = null; // cria uma nova variável de método Connection
        PreparedStatement pstm = null; // cria uma nova variável de método PreparedStatement
        boolean resultado = false;
        ResultSet rs;

        try {

            String sqlNome = "SELECT id_os FROM os WHERE id_os = '" + os.getNumero_OS() + "'";
            conn = C.createConnectionToMySQL();
            pstm = conn.prepareStatement(sqlNome);
            rs = pstm.executeQuery();
            if (rs.next()) {
                resultado = true;
            } else {
                resultado = false;
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Falha no processo!\nErro: " + ex.getMessage(), "Verificação da Ordem de Serviço", JOptionPane.ERROR_MESSAGE);

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
                JOptionPane.showMessageDialog(null, "Falha no processo!\nErro: " + ex.getMessage(), "Verificação da Ordem de Serviço", JOptionPane.ERROR_MESSAGE);

            }
        }

        return resultado;
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
                cl.setObs_OS(rset.getString("obs_os"));

                cl.setValorTotal_OS(rset.getDouble("valor_os"));
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
                    cl.setObs_OS(rset.getString("obs_os"));

                    cl.setValorTotal_OS(rset.getDouble("valor_os"));
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
                cl.setObs_OS(rset.getString("obs_os"));

                cl.setValorTotal_OS(rset.getDouble("valor_os"));

                cl.setDataAbertura_OS(rset.getDate("data_abertura"));

                cl.setDataFechamento_OS(rset.getDate("data_fechamento"));
                
                cl.setIdUsuario_OS(rset.getInt("id_usuario"));

                cl.setNomeUsuario_OS(rset.getString("login_usuarios"));
                
                cl.setIdCliente_OS(rset.getInt("id_clientes"));

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
                cl.setObs_OS(rset.getString("obs_os"));

                cl.setValorTotal_OS(rset.getDouble("valor_os"));

                cl.setDataAbertura_OS(rset.getDate("data_abertura"));

                cl.setDataFechamento_OS(rset.getDate("data_fechamento"));
                
                cl.setIdUsuario_OS(rset.getInt("id_usuario"));

                cl.setNomeUsuario_OS(rset.getString("login_usuarios"));
                
                cl.setIdCliente_OS(rset.getInt("id_clientes"));

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
                cl.setObs_OS(rset.getString("obs_os"));

                cl.setValorTotal_OS(rset.getDouble("valor_os"));

                cl.setDataAbertura_OS(rset.getDate("data_abertura"));

                cl.setDataFechamento_OS(rset.getDate("data_fechamento"));
                
                cl.setIdUsuario_OS(rset.getInt("id_usuario"));

                cl.setNomeUsuario_OS(rset.getString("login_usuarios"));
                
                cl.setIdCliente_OS(rset.getInt("id_clientes"));

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
                cl.setObs_OS(rset.getString("obs_os"));

                cl.setValorTotal_OS(rset.getDouble("valor_os"));

                cl.setDataAbertura_OS(rset.getDate("data_abertura"));

                cl.setDataFechamento_OS(rset.getDate("data_fechamento"));
                
                cl.setIdUsuario_OS(rset.getInt("id_usuario"));

                cl.setNomeUsuario_OS(rset.getString("login_usuarios"));
                
                cl.setIdCliente_OS(rset.getInt("id_clientes"));

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

    public final ArrayList<OS> getNumOS() {
        final Conect C = new Conect(); // instancia o método de conexão
        Connection conn = null; // cria uma nova variável de método Connection
        PreparedStatement pstm = null; // cria uma nova variável de método PreparedStatement
        String sql = "SELECT id_os FROM os";
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

        }
        return ordems;
    }

}
