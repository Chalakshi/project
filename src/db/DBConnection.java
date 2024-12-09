/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package db;


import java.sql.*;


public class DBConnection {
 

public static Connection createDBConnection() throws SQLException, ClassNotFoundException {
        String url = "jdbc:mysql://localhost:3306/ead_cw";
        String username = "root";
        String password = "hiru@chala137%";

        Class.forName("com.mysql.cj.jdbc.Driver");
        return DriverManager.getConnection(url, username, password);
    }

}
