/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connection;

import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Miguel
 */
public class Connection {

    private final String DRIVER = "com.mysql.jdbc.Driver";
    private final String URL = "jdbc:mysql://localhost:3306/";
    private final String BD = "dbtest";
    private final String USER = "miguel";
    private final String PASSWORD = "admin";
    public java.sql.Connection conexion = null;

    public Connection() {
        try {
            Class.forName(DRIVER);
            conexion = DriverManager.getConnection(URL + BD, USER, PASSWORD);
            if (conexion != null) {
                System.out.println("successful connection");
            }
        } catch (ClassNotFoundException | SQLException e) {}
    }

    public Connection getConexion() {
        return (Connection) conexion;
    }
}
