package prueba5;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.SQLException;

import static org.junit.jupiter.api.Assertions.*;

class GestorDeConexionTest {

    private static GestorDeConexion gestorDeConexion;
    private static Connection conexion;

    @BeforeAll
    public static void setUp() {
        gestorDeConexion = new GestorDeConexion();
        try {
            conexion = gestorDeConexion.abrirConexion();
        } catch (SQLException e) {
            System.err.println("Error al establecer la conexión: " + e.getMessage());
        }
    }

    @AfterAll
    public static void tearDown() {
        gestorDeConexion.cerrarConexion(conexion);
    }

    @Test
    public void testConexionExitosa() {
        assertEquals(true, conexion != null);
    }
}