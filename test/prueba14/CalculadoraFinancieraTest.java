package prueba14;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculadoraFinancieraTest {

    @Test
    public void testCalcularInteresCompuestoValoresNormales() {
        CalculadoraFinanciera calculadora = new CalculadoraFinanciera();
        double resultado = calculadora.calcularInteresCompuesto(1000, 0.05, 12, 5);
        assertEquals(1283.35, resultado, 0.01);
    }
    @Test
    public void testCalcularVPNValoresNormales() {
        CalculadoraFinanciera calculadora = new CalculadoraFinanciera();
        double[] flujosCaja = {-1000, 200, 300, 400, 500};
        double resultado = calculadora.calcularVPN(0.1, flujosCaja);
        assertEquals(71.78, resultado, 0.01);
    }



}