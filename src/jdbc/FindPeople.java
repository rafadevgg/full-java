package jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindPeople {

    public static void main(String[] args) throws SQLException {
        Connection connection = FabricaConexao.getConexao();
        String sql = "SELECT * FROM pessoas";

        Statement stmt = connection.createStatement();
        ResultSet result = stmt.executeQuery(sql);

        List<People> peoples = new ArrayList<>();
        while(result.next()) {
            int id = result.getInt("id");
            String name = result.getString("name");
            peoples.add(new People(id, name));
        }

        for(People p : peoples) {
            System.out.println(p.getId() + " ==> " + p.getName());
        }

        stmt.close();
        connection.close();
    }

}
