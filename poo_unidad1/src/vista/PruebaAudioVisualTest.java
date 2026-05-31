package vista;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PruebaAudioVisualTest {

	@Test
    void testEntradaNoNumerica() {

        assertThrows(NumberFormatException.class, () -> {
            Integer.parseInt("hola");
        });
    }
}
