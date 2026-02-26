package academy.devdojo.maratonajava.javacore.ZZIjdbc.conn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
    //java.sql = Connection, Statement, ResultSet, DriveManager
    public static Connection getConnection() throws SQLException {
        String url = "jdbc:postgresql://localhost:5432/anime_store";
        String user = "postgres";
        String password = "admin";
        return DriverManager.getConnection(url, user, password);
    }
}
