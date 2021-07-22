package com.test;

import java.sql.*;

public class TestJdbc {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        String url = "jdbc:mysql://127.0.0.1:3306/jdbc-demo?useUnicode=true&characterEncoding=utf-8&useSSL=true&serverTimezone=UTC";
        String username = "root";
        String password = "1231";

        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection connection = DriverManager.getConnection(url, username, password);
        Statement statement = connection.createStatement();

//        String sql = "select * from employees;";
//        ResultSet resultSet = statement.executeQuery(sql);

        String sql = "insert into employees(id, email, first_name, last_name) values (?, ?, ?, ?);";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setInt(1, 9);
        preparedStatement.setString(2, "boccelli.andrea@foo.com");
        preparedStatement.setString(3, "Andrea");
        preparedStatement.setString(4, "Boccelli");

        // close
//        resultSet.close();
        statement.close();
        connection.close();
    }
}
