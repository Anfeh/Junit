package prueba2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {
    @Test
    public void test(){

        Calculadora calculadora = new Calculadora();
        assertEquals(5,calculadora.sumar(2,3));
        assertEquals(5,calculadora.restar(10,5));
        assertEquals(10,calculadora.multiplicar(2,5));
        assertEquals(4,calculadora.dividir(8,2));

    }



}