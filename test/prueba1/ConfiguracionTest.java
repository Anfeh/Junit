package prueba1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConfiguracionTest {



    @Test
    public void test(){
        Configuracion configuracion = new Configuracion(5);
        assertEquals(25,configuracion.numeroCuadrado());

    }

}