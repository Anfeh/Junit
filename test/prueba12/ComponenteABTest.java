package prueba12;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ComponenteABTest {
    @Tag("ComponenteA")
    @Test
    public void testOperacionA() {
        assertEquals("Resultado de operación A",ComponenteA.operacionA());
    }

    @Tag("ComponenteB")
    @Test
    public void testOperacionB() {
        assertEquals(42, ComponenteB.operacionB());
    }
}