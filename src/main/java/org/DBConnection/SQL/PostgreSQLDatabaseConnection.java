package org.DBConnection.SQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class PostgreSQLDatabaseConnection {
    public static void main(String[] args) {
        String jdbcUrl = "jdbc:postgresql://172.16.2.17:5432/masquerader";
        String username = "fynd_masquerader_write";
        String password = "fynd_masquerader_write!2022";

        Connection connection = null;

        try {
            // Load the PostgreSQL JDBC driver
            Class.forName("org.postgresql.Driver");

            // Establish the connection
            connection = DriverManager.getConnection(jdbcUrl, username, password);
            System.out.println("Connected to the PostgreSQL database successfully!");

        } catch (ClassNotFoundException e) {
            System.err.println("PostgreSQL JDBC Driver not found. Include the correct library in your classpath.");
            e.printStackTrace();
        } catch (SQLException e) {
            System.err.println("Connection to the PostgreSQL database failed.");
            System.err.println("SQL State: " + e.getSQLState());
            System.err.println("Error Code: " + e.getErrorCode());
            System.err.println("Message: " + e.getMessage());
            e.printStackTrace();
        } finally {
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
