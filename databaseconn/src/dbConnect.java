import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

// Add 'public' here to make the class accessible from other files
public class dbConnect {
    private static Connection mycon = null;

    // Ensure getConnection is also public
    public static Connection getConnection() throws ClassNotFoundException, SQLException {
        String db = "studata", user = "root", pass = "root@123";
        String url = "jdbc:mysql://localhost:3306/" + db;
        Class.forName("com.mysql.cj.jdbc.Driver");
        if (mycon == null) {
            mycon = DriverManager.getConnection(url, user, pass);
        }
        return mycon;
    }
}
