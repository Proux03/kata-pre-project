package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
    // реализуйте настройку соеденения с БД
    private static final String urlJDBC = "jdbc:mysql://localhost:3306/users";
    private static final String userName = "Proux";
    private static final String userPassword = "12345678";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(urlJDBC, userName, userPassword);
    }
}