package prueba6;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculadoraAvanzadaTest {


    @Test
    public void pruebaRaizCuadrada() {
        CalculadoraAvanzada calculadora = new CalculadoraAvanzada();
        assertEquals(6.0, calculadora.raizCuadrada(36));

    }
    @Disabled("Pendiente de hacer")
    @Test
    public void pruebaFactorial() {

    }

    @Disabled("Pendiente de hacer")
    @Test
    public void pruebaLogaritmoNatural() {
    }
}