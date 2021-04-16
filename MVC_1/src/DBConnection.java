

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;

public class DBConnection {

    //  Database credentials
    static final String DB_URL = "jdbc:postgresql://127.0.0.1:5432/test_1";
    static final String USER = "Volks";
    static final String PASS = "";
    public static void main(String[] args) {
        System.out.println("Testing connection to PostgreSQL JDBC");

        System.out.println("PostgreSQL JDBC Driver successfully connected");
        DBConnection connection = null;

        try {
            connection = (DBConnection) DriverManager.getConnection(DB_URL, USER, PASS);

        } catch (SQLException e) {
            System.out.println("Connection Failed");
            e.printStackTrace();
            return;
        }

        if (connection != null) {
            System.out.println("You successfully connected to database now");
        } else {
            System.out.println("Failed to make connection to database");
        }
    }
}
