package App;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    
    public static Connection getConexion() {
        
        String db = "escuela";
        String url = "jdbc:mysql://localhost:3306/" + db;
        String user = "root";
        String pass = "";
        
        try {
            Connection conn = (Connection) DriverManager.getConnection(url, user, pass);
            return conn;
        } catch(SQLException e) {
            System.out.println(e.toString());
            return null;
        }
    }
    
}
