package vista;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PruebaAudioVisualTest2 {

	@Test
    void testOpcionMenuInvalida() {

        assertThrows(NumberFormatException.class, () -> {
            Integer.parseInt("abc");
        });
    }

    @Test
    void testDuracionInvalida() {

        assertThrows(NumberFormatException.class, () -> {
            Integer.parseInt("duracion");
        });
    }

}
