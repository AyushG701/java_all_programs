import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        try {
            // Get a connection from dbConnect
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = dbConnect.getConnection();
            System.out.println("Connection established successfully!");

            // Example: Perform a simple query to fetch data
            String query = "SELECT * FROM student"; // Replace with your table name
            try (PreparedStatement stmt = connection.prepareStatement(query);
                 ResultSet rs = stmt.executeQuery()) {

                // Process the result set
                while (rs.next()) {
                    // Example: Assuming your table has a column named 'columnName'
                    String data = rs.getString("first_name");
                    System.out.println("Data: " + data);
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
            System.out.println("Connection failed.");
        }

    }
}
