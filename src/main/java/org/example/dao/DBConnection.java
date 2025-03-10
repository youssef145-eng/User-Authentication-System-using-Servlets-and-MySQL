package org.example.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    // when use final use uppercase variables
    private static final String  HOST = "localhost";
    private static final int  PORT = 3306;
    private static final String  DATABASE = "employee";
    private static final String  USERNAME = "root";
    private static final String  PASSWORD = "";
    public static Connection connection;
    public static Connection getConnection() {
        try {
           Class.forName("com.mysql.cj.jdbc.Driver");

            connection = DriverManager.getConnection(
                    String.format("jdbc:mysql://%s:%d/%s", HOST, PORT, DATABASE),
                    USERNAME,
                    PASSWORD
            );



        }
        catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return connection;
    }
}
