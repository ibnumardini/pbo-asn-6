/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package asn6.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author ibnumardini
 */
public class Database {

    private static Connection link = null;
    private final static String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    private final static String DB_URI = "jdbc:mysql://localhost:8025/pbo_asn6_kendaraan";
    private final static String DB_USER = "root";
    private final static String DB_PASS = "root";

    public static Connection getConnection() {
        if (link == null) {
            try {
                Class.forName(JDBC_DRIVER);

                link = DriverManager.getConnection(DB_URI, DB_USER, DB_PASS);
            } catch (ClassNotFoundException | SQLException e) {
                System.out.println(e);
            }
        }

        return link;
    }

    public static void closeConnection() {
        try {
            link.close();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
}
