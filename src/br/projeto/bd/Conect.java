package br.projeto.bd;



import java.sql.DriverManager;
import java.sql.Connection;

/**
 *
 *  *
 *  * @author Igor
 *
 */
public class Conect {

    private static final String USERNAME = "u453492576_entregador";

    private static final String PASSWORD = "3Macacos";

    private static final String DATABASE_URL = "jdbc:mysql://sql396.main-hosting.eu/u453492576_os";

    /**
     *
     *      * Cria uma conexão com o banco de dados MySQL utilizando o nome de
     * usuário e senha fornecidos
     *
     *      * @param username
     *      * @param senha
     *      * @return uma conexão com o banco de dados
     *      * @throws Exception *
     *
     */
    public Connection createConnectionToMySQL() throws Exception {
        Class.forName("com.mysql.jdbc.Driver"); //Faz com que a classe seja carregada pela JVM

        //Cria a conexão com o banco de dados
        Connection connection = DriverManager.getConnection(DATABASE_URL, USERNAME, PASSWORD);

        return connection;
    }
}
