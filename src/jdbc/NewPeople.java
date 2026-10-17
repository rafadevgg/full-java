package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class NewPeople {

    public static void main(String[] args) throws SQLException {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o nome: ");
        String name = sc.nextLine();

        String sql = "INSERT INTO pessoas (name) VALUES (?)";
        Connection connection = FabricaConexao.getConexao();
        PreparedStatement stmt = connection.prepareStatement(sql);
        stmt.setString(1, name);
        stmt.execute();

        System.out.println("Pessoa incluída com sucesso!");
        sc.close();
    }

}
