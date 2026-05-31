package controlador;

import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import modelo.ContenidoAudiovisual;
import modelo.Pelicula;

class ContenidoAudioVisualRepositorioTest {

    @Test
    void testGuardarYCargarPelicula() {

        ContenidoAudioVisualRepositorio repositorio = new ContenidoAudioVisualRepositorio();

        List<ContenidoAudiovisual> contenidos = new ArrayList<>();

        contenidos.add(new Pelicula("Avatar", 162, "Ciencia Ficcion", "Disney"));

        repositorio.guardarContenidoAudioVisual(contenidos);

        List<ContenidoAudiovisual> resultado = repositorio.cargarContenidoAudioVisual();


        assertEquals(1, resultado.size());

        Pelicula pelicula = (Pelicula) resultado.get(0);

        assertEquals("Avatar", pelicula.getTitulo());
        assertEquals(162, pelicula.getDuracionEnMinutos());
        assertEquals("Ciencia Ficcion", pelicula.getGenero());
        assertEquals("Disney", pelicula.getEstudio());
    }
}
