package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class UpdatePeople {

    public static void main(String[] args) throws SQLException {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o código da pessoa que vc deseja atualizar: ");
        int id = sc.nextInt();
        System.out.println("Informe o novo nome da pessoa: ");
        String name = sc.nextLine();

        Connection connection = FabricaConexao.getConexao();
        String sql = "UPDATE pessoas SET name = ? WHERE id = ?";
        PreparedStatement stmt = connection.prepareStatement(sql);
        stmt.setString(1, name);
        stmt.setInt(2, id);
        stmt.execute();

        System.out.println("Nome da pessoa atualizado!");
        sc.close();
        connection.close();
        stmt.close();
    }

}
