package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TesteConexao {
    public static void main(String[] args) throws SQLException {
        final String url = "jdbc:mysql://localhost?verifyServerCertificate=false&useSSL=true";
        final String user = "root";
        final String pass = "root";

        Connection conexao = DriverManager.getConnection(url, user, pass);
        System.out.println("Conexão efetuada com sucesso!");

        conexao.close();
    }
}
