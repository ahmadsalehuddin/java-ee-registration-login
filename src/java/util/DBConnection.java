package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    public static Connection connection;
    public static String driver = "org.apache.derby.jdbc.ClientDriver";
    public static String connectionURL = "jdbc:derby://localhost:1527/customers";
    public static String user = "app";
    public static String password = "app";
    
    public static Connection createConnection() {
        try {
            Class.forName(driver);
            connection = DriverManager.getConnection(connectionURL, user, password);
        } catch(ClassNotFoundException | SQLException exception) {
            System.out.println(exception);
        }
        
        return connection;
    }
}
