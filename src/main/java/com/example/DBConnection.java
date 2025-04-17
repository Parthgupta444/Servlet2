package com.example;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * Utility class for establishing a connection to the database.
 */
public class DBConnection {

    /**
     * Returns a Connection object for the configured database.
     *
     * @return Connection to the MySQL database
     */
    public static Connection getConnection() {
        Connection connection = null;
        try {
            // Load the MySQL JDBC driver
            Class.forName("com.mysql.jdbc.Driver");

            // Attempt to establish a connection
            connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/javaProject", 
                "root", 
                "12345678"
            );
        } catch (Exception ex) {
            // Print the exception if any occurs
            ex.printStackTrace();
        }
        return connection;
    }
}
