package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FindPeopleByName {

    public static void main(String[] args) throws SQLException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe dados da busca pelo nome: ");
        String name = sc.nextLine();

        String sql = "SELECT * FROM pessoas WHERE name like ?";
        Connection connection = FabricaConexao.getConexao();
        PreparedStatement stmt = connection.prepareStatement(sql);
        stmt.setString(1, "%" + name + "%");
        ResultSet result = stmt.executeQuery();

        List<People> peoples = new ArrayList<>();
        while(result.next()) {
            int i = result.getInt("id");
            String n = result.getString("name");
            peoples.add(new People(i, n));
        }

        for(People p : peoples) {
            System.out.println(p.getId() + " ==> " + p.getName());
        }

        stmt.close();
        connection.close();
        sc.close();
    }

}
