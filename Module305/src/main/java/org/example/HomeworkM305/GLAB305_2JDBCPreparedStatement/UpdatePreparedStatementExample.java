package org.example.HomeworkM305.GLAB305_2JDBCPreparedStatement;

import java.sql.*;

public class UpdatePreparedStatementExample {

    public static void main(String[] args) {
        Connection con = null;
        PreparedStatement prepStmt = null;
        ResultSet rs = null;
        String dburl = "jdbc:mysql://localhost:3306/classic_models";
        String user= "root";
        String password = "root";
        try {
            con = DriverManager.getConnection(dburl, user, password);
            System.out.println("Connection established successfully!");
            String sql = "update employees set firstName=? , lastName=? where id = ?";

            prepStmt = con.prepareStatement(sql);
            prepStmt.setString(1, "Gary");
            prepStmt.setString(2, "Larson");
            prepStmt.setLong  (3, 0003);

            int rowsAffected = prepStmt.executeUpdate();

            prepStmt = con.prepareStatement("select * from employees where id=?");
            prepStmt.setInt(1, 1401);
            // execute select query
            rs = prepStmt.executeQuery();
            while (rs.next()) {
                // System.out.print(rs.getInt("lastName"));
                System.out.println(rs.getString("firstName"));
                System.out.println(rs.getString("lastname"));
                System.out.println(rs.getString("email"));
                System.out.println(rs.getString("office_id"));
            }
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
    }
}
