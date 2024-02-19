package prueba5;

import java.sql.*;

public class GestorDeConexion {

    public static Connection abrirConexion() throws SQLException {
        Connection conexion = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conexion = DriverManager.getConnection("jdbc:mysql://localhost/bbddpokemon", "root", "");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException("Error al cargar el controlador JDBC", e);
        }
        return conexion;
    }

    public static void cerrarConexion(Connection conexion) {
        if (conexion != null) {
            try {
                conexion.close();
            } catch (SQLException e) {
                throw new RuntimeException("Error al cerrar la conexión", e);
            }
        }
    }

    // Métodos para cerrar recursos adicionales como Statement y ResultSet si es necesario
}