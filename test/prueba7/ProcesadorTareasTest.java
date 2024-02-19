package prueba7;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.*;

class ProcesadorTareasTest {
    @Test
    @Timeout(value = 4, unit = TimeUnit.SECONDS)
    public void TestEjecutarTareaLarga() throws InterruptedException {
        ProcesadorTareas.ejecutarTareaLarga(3000);
    }
}