package controlador;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import modelo.Actor;

class ActorRepositorioTest {

    @Test
    void testAgregarYCargarActor() {

        ActorRepositorio repositorio = new ActorRepositorio();

        List<Actor> actores = new ArrayList<>();
        actores.add(new Actor("Juan", 25));

        repositorio.agregarActor(actores);

        List<Actor> resultado = repositorio.cargarActor();

        assertEquals(1, resultado.size());
        assertEquals("Juan", resultado.get(0).getNombre());
        assertEquals(25, resultado.get(0).getEdad());
    }
}