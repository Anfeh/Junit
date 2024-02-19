package prueba16;

import static org.junit.Assert.*;
import org.junit.Test;

public class GeneradorNumerosTest {

    GeneradorNumeros generador = new GeneradorNumeros();

    @Test
    public void testGenerarNumeroAleatorioEnRango() {
        // Prueba con múltiples rangos aleatorios
        for (int i = 0; i < 100; i++) {
            int min = generador.generarNumeroAleatorioEnRango(-100, 100);
            int max = generador.generarNumeroAleatorioEnRango(min + 1, 200);
            int randomNumber = generador.generarNumeroAleatorioEnRango(min, max);
            assertTrue("El número aleatorio generado no está dentro del rango",
                    randomNumber >= min && randomNumber <= max);
        }
    }

    @Test
    public void testEsPar() {
        // Prueba con números aleatorios
        for (int i = 0; i < 100; i++) {
            int randomNumber = generador.generarNumeroAleatorioEnRango(0, 100);
            boolean expected = randomNumber % 2 == 0;
            assertEquals("El método esPar no retorna el valor esperado para " + randomNumber,
                    expected, generador.esPar(randomNumber));
        }
    }

}
