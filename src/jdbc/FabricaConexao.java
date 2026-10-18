package jdbc;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class FabricaConexao {

    public static Connection getConexao() {
        try {
            Properties properties = getProperties();
            final String url = properties.getProperty("base.url");
            final String user = properties.getProperty("base.user");
            final String pass = properties.getProperty("base.password");

            return DriverManager.getConnection(url, user, pass);
        } catch (SQLException | IOException e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    private static Properties getProperties() throws IOException {
        Properties properties = new Properties();
        String path = "/connection.properties";
        properties.load(FabricaConexao.class.getResourceAsStream(path));

        return properties;
    }

}
