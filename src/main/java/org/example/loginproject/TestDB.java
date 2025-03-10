package org.example.loginproject;

import org.example.dao.DBConnection;

import java.sql.Connection;

public class TestDB {
    public static void main(String[] args) {
        try {
            Connection con = DBConnection.getConnection();
            if (con != null) {
                System.out.println("✅ Connection Successful!");
                con.close();
            } else {
                System.out.println("❌ Connection Failed!");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
