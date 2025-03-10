package org.example.loginproject;

import org.example.dao.DBConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Employee {
    private String full_name;
    private String username;
    private String phone_number;
    private String Password;
public Employee() {

}
public Employee(String full_name, String username, String phone_number, String Password) {
    this.full_name = full_name;
    this.username = username;
    this.phone_number = phone_number;
    this.Password = Password;

}

    public String getFull_name() {
        return full_name;
    }

    public void setFull_name(String full_name) {
        this.full_name = full_name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "full_name='" + full_name + '\'' +
                ", username='" + username + '\'' +
                ", phone_number='" + phone_number + '\'' +
                ", Password='" + Password + '\'' +
                '}';
    }

    public void save_DB(Employee employee) {
        Connection conn = DBConnection.getConnection();
        if(conn != null) { String sql = "insert into employees values(?,?,?,?);";
            try (PreparedStatement ps = conn.prepareStatement(sql)){
                ps.setString(1, employee.getFull_name());
                ps.setString(2, employee.getUsername());
                ps.setString(3,employee.getPhone_number());
                ps.setString(4, employee.getPassword());

                ps.executeUpdate();

            } catch (SQLException e) {
                e.printStackTrace();
            }
            finally {
                try {
                    conn.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }

        }
        else {
            return;
        }


    }




}
