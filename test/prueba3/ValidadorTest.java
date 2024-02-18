package prueba3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidadorTest {

    @Test
    public void test(){
        Validador validador = new Validador();
        String texto = "El texto no puede ser nulo ni vacío";
        try {
            validador.validarTexto("");
        } catch (TextoInvalidoException e) {
            assertEquals(texto,e.getMessage());
        }


    }

}