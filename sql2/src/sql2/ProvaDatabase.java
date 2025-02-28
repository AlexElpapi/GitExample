package sql2;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;

public class ProvaDatabase{
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/world";
        String username = "root";
        String password = "Alexescorpio123!";

        String query = "SELECT * FROM persone"; 

        try (Connection connection = DriverManager.getConnection(url, username, password);
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(query)) {

           
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String nome = resultSet.getString("nome");
                String cognome = resultSet.getString("cognome");
                String email = resultSet.getString("email");
                String dataNascita = resultSet.getString("data_nascita");

                System.out.println("ID: " + id + ", Nome: " + nome + ", Cognome: " + cognome + ", Email: " + email + ", Data di Nascita: " + dataNascita);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
