 
package ui;

import java.sql.*;



public class dbconnection {
    
    public static  Connection connection;
         // Private constructor to prevent instantiation
         private dbconnection() {}

    // Method to get the single instance of the connection
    public static Connection getConnection() throws SQLException {
        if (connection == null || connection.isClosed()) {
            String url = "jdbc:mysql://localhost:3306/ead_cw";
            String user = "root";
            String password = "hiru@chala137%";
            connection = DriverManager.getConnection(url, user, password);
        }
        return connection;
    }
}
