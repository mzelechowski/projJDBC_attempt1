import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnector {
    private static String URL = "jdbc:mysql://127.0.0.1:3306/";
    private static String DbNAME = "attempt_1";
    private static String USER = "root";
    private static String PASSWORD = "";

    public static Connection connect() {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(URL+DbNAME, USER, PASSWORD);
            System.out.println("Connected to the database: " +DbNAME);
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("NOT Connected to the database");
        } finally {
            try {
                connection.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return connection;
    }
}
