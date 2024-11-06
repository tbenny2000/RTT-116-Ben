package org.example;

import java.sql.*;

public class JDBCExample {

    public static void main(String[] args) throws ClassNotFoundException {
        String dburl = "jdbc:mysql://localhost:3306/classic_models";
        String user = "root";
        String password = "root";
        System.out.println("-------- MySQL JDBC Connection Demo ------------");
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(dburl, user, password);

            // these 3 lines of code are using a regular Statement to execute the query.
            // String SelectSQL = "Select * FROM employees where id = 1056";
            // Statement stmt = connection.createStatement();
            // ResultSet result = stmt.executeQuery(SelectSQL);

            // whe we have variables we want to use a PrepareStatement
            // in general we want to use a preparedStatement for everything !!!!!! as a best practice
            // primary for security reason around SQL Injection attacks
            String selectSQL = "Select * FROM employees where id = ?";
            PreparedStatement pstmt = connection.prepareStatement(selectSQL);
            pstmt.setInt(1, 1056);

             ResultSet result = pstmt.executeQuery();
            //ResultSet result = null;

            while (result.next()) {
                String EmployeeID = result.getString("id");
                String fname = result.getString("firstname");
                String lname = result.getString("lastname");
                String email = result.getString("email");
                System.out.println(EmployeeID + " | " + fname + "|" + lname + "|" + email);
            }
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
