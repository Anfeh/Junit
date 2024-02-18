package prueba3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidadorTest {

    @Test
    public void test(){
        Validador validador = new Validador();

        try {
            assertEquals("",validador.validarTexto(null));
        } catch (TextoInvalidoException e) {
            throw new RuntimeException(e);
        }


    }

}