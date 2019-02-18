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

    private final String URL = "jdbc:mysql://localhost:3306/";
    private final String BD = "dbtest";
    private final String USER = "miguel";
    private final String PASSWORD = "admin";
    protected java.sql.Connection conexion = null;

    @SuppressWarnings("finally")
    public java.sql.Connection getConexion() throws SQLException {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conexion = DriverManager.getConnection(URL + BD, USER, PASSWORD);
            if (conexion != null) {
                System.out.println("hhhhh");
            }
        } catch (ClassNotFoundException | SQLException e) {
        }
        return conexion;
    }
}
