package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class UpdatePeople2 {

    public static void main(String[] args) throws SQLException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o código da pessoa: ");
        int id = sc.nextInt();

        String select = "SELECT id, name FROM pessoas WHERE id = ?";
        String update = "UPDATE pessoas SET name = ? WHERE id = ?";
        Connection connection = FabricaConexao.getConexao();
        PreparedStatement stmt = connection.prepareStatement(select);
        stmt.setInt(1, id);
        ResultSet r = stmt.executeQuery();

        if (r.next()) {
            People p = new People(r.getInt(1), r.getString(2));
            System.out.println("O nome atual é " + p.getName());
            sc.nextLine();
            System.out.println("Informe o novo nome: ");
            String newName = sc.nextLine();

            stmt.close();
            stmt = connection.prepareStatement(update);
            stmt.setString(1, newName);
            stmt.setInt(2, id);
            stmt.execute();

            System.out.println("Pessoa alterada com sucesso!");
        } else {
            System.out.println("Pessoa não encontrada!");
        }
    }

}
