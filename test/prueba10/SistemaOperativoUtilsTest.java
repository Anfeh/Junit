package prueba10;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledIf;

import static org.junit.jupiter.api.Assertions.*;

class SistemaOperativoUtilsTest {
    @Test
    public void testEsWindows() {
        assertTrue(SistemaOperativoUtils.esWindows());
    }
}