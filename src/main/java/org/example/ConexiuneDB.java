package org.example;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexiuneDB {

    public static Connection conexiune () throws SQLException {
        String url = "jdbc:mysql://localhost:3306/shopstore";
        String user = "root";
        String pass = "";

        return DriverManager.getConnection(url, user, pass);
    }

}
