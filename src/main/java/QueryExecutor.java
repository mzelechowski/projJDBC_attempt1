import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class QueryExecutor {
    public static ResultSet executeSelect(String selectQuery) {
        Connection connection = null;
        try {
            connection = DbConnector.connect();
            Statement statement = connection.createStatement();
            return statement.executeQuery(selectQuery);
        } catch (SQLException e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    public static void executeQuery(String query) {
        try {
            Connection connection = DbConnector.connect();
            Statement statement = connection.createStatement();
            statement.execute(query);
        } catch (SQLException e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    public static void printQuerySeleet(String selectQuery) {
        ResultSet resultSet = executeSelect(selectQuery);
        try {
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String surname = resultSet.getString("surname");
                int age = resultSet.getInt("age");
                int salary = resultSet.getInt("salary");
                System.out.println("id: " + id + " name: " + name + " surname: "
                        + surname + " age: " + age + " salary: " + salary);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public static void enterNewRecord() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj imie: ");
        String name = scanner.nextLine();
        System.out.println("Podaj nazwisko: ");
        String surname = scanner.nextLine();
        System.out.println("Podaj wiek: ");
        int age = scanner.nextInt();
        System.out.println("Podaj pensje: ");
        int salary = scanner.nextInt();
        String query = "INSERT INTO users  (name, surname, age, salary) VALUES ('"
                + name + "','" + surname + "'," + age + "," + salary + ")";
        executeQuery(query);
        System.out.println("Dodano rekord: ");
        printQuerySeleet("SELECT * FROM users WHERE name LIKE '" + name +"' AND surname LIKE '"
                + surname +"'" );
    }
    public static void  dropRecord(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj numer rekorud do usuniecia: ");
        int id = scanner.nextInt();
        String query = "DELETE FROM users WHERE id="+id;
        executeQuery(query);

    }
}


