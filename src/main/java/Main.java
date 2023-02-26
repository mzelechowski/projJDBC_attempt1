import java.sql.ResultSet;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        MenuProvider menu = new MenuProvider();
        menu.start();


//        QueryExecutor.executeQuery("INSERT INTO users  (name, surname, age, salary) VALUES "
//                        + "('Rafał','Bydgoszcz', 26, 15000 ),"
//                        + "('Ola','Wrocław', 15, 17000 )" );
//                ResultSet resultSet = QueryExecutor.executeSelect("SELECT * FROM users;");
//        try {
//            while (resultSet.next()) {
//                int id = resultSet.getInt("id");
//                String name = resultSet.getString("name");
//                String surname = resultSet.getString("surname");
//                int salary = resultSet.getInt("salary");
//                System.out.println("id: " + id + " name: " + name + " surname: " + surname + " salary: " + salary);
//            }
//        } catch (SQLException throwables) {
//            throwables.printStackTrace();
//        }

    }
}
