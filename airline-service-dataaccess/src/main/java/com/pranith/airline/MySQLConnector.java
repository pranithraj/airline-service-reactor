package com.pranith.airline;

import java.sql.Connection;
import java.sql.DriverManager;

public class MySQLConnector {

    static Connection conn = null;
    private static final String db = "jdbc:mysql://database-1.c2hoic9c280y.us-east-2.rds.amazonaws.com:3306/airline_service";
    private static final String user = "root";
    private static final String pass = "Pranith77";

    public static Connection getConnection() {
        if (conn != null) {
            return conn;
        }
        return getConnection(db, user, pass);
    }

    private static Connection getConnection(String db, String user, String pass) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(db + "?user=" + user + "&password=" + pass);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return conn;
    }
}
