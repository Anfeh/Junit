package prueba18;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProcesadorTareasPesadasTest {
    private static final int TIEMPO_MAXIMO = 1000; // Tiempo máximo permitido en milisegundos

    @Test
    public void testRealizarOperacionIntensiva() {
        ProcesadorTareasPesadas procesador = new ProcesadorTareasPesadas();

        long tiempoInicio = System.currentTimeMillis();
        procesador.realizarOperacionIntensiva();
        long tiempoFin = System.currentTimeMillis();

        long tiempoTranscurrido = tiempoFin - tiempoInicio;
        System.out.println("Tiempo transcurrido: " + tiempoTranscurrido + " ms");

        assertTrue(tiempoTranscurrido <= TIEMPO_MAXIMO,
                "La operación intensiva tardó más tiempo del esperado");
    }

}