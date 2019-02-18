/*
 *Porpuse:
 *Clase conexión la cúal permitira la conexión a la Base de datos.
 */
package connection;

import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @since 18/02/2019
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
        } catch (ClassNotFoundException | SQLException e) {}
    }

    /**
     * 
     * Method that returns a connection object
     * @return Connection
     */
    public Connection getConexion() {
        return  (Connection) conexion;
    }
}
