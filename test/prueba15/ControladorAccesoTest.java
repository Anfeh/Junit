package prueba15;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ControladorAccesoTest {

    @Test
    public void testVerificarAccesoAdmin() {
        ControladorAcceso controlador = new ControladorAcceso();
        controlador.asignarRolAUsuario("admin", "ADMIN");

        assertTrue(controlador.verificarAcceso("admin", "CONSULTA"));
        assertTrue(controlador.verificarAcceso("admin", "GESTION_USUARIOS"));
    }

    @Test
    public void testVerificarAccesoEditor() {
        ControladorAcceso controlador = new ControladorAcceso();
        controlador.asignarRolAUsuario("editor", "EDITOR");

        assertTrue(controlador.verificarAcceso("editor", "CONSULTA"));
        assertFalse(controlador.verificarAcceso("editor", "GESTION_USUARIOS"));
    }

    @Test
    public void testVerificarAccesoVisitante() {
        ControladorAcceso controlador = new ControladorAcceso();
        controlador.asignarRolAUsuario("visitor", "VISITANTE");

        assertTrue(controlador.verificarAcceso("visitor", "CONSULTA"));
        assertFalse(controlador.verificarAcceso("visitor", "GESTION_USUARIOS"));
    }

    @Test
    public void testVerificarAccesoSinAsignar() {
        ControladorAcceso controlador = new ControladorAcceso();

        assertFalse(controlador.verificarAcceso("sinAsignar", "CONSULTA"));
        assertFalse(controlador.verificarAcceso("sinAsignar", "GESTION_USUARIOS"));
    }

    @Test
    public void testVerificarAccesoRolDesconocido() {
        ControladorAcceso controlador = new ControladorAcceso();
        controlador.asignarRolAUsuario("desconocido", "INVALID_ROLE");

        assertFalse(controlador.verificarAcceso("desconocido", "CONSULTA"));
        assertFalse(controlador.verificarAcceso("desconocido", "GESTION_USUARIOS"));
        // Agrega aquí más pruebas para otras funcionalidades
    }
}