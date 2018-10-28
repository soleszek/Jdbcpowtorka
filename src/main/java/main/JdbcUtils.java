package main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class JdbcUtils {
    private final static JdbcUtils instance = new JdbcUtils();
    private Connection connection;

    public static JdbcUtils getInstance() {
        return instance;
    }

    public Connection getConnection() {
        return connection;
    }

    private JdbcUtils() {
        String dbPassword = "Samsunge1080";
        String dbUser = "jdbcuser@localhost";
        String connectionString = "jdbc:mysql://localhost:3306/jdbc";
        String connectionOptions = "?serverTimezone=UTC&useSSL=false&createDatabaseIfNotExist=true&allowPublicKeyRetrieval=true";

        Properties prop = new Properties();
        prop.put("password", dbPassword);
        prop.put("user", dbUser);

        try {
            connection = DriverManager.getConnection(connectionString+connectionOptions, prop);
        } catch (SQLException e) {
            e.printStackTrace();
        }


    }
}
