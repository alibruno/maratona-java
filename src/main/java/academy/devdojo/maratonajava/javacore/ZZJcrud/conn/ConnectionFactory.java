package academy.devdojo.maratonajava.javacore.ZZJcrud.conn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
    public static Connection getConnection() throws SQLException {
        String url = "jdbc:postgresql://localhost:5432/anime_store";
        String user = "postgres";
        String password = "admin";
        return DriverManager.getConnection(url, user, password);
    }
}
