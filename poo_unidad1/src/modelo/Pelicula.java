/**
 * Class Pelicula
 */
package modelo;

import java.util.ArrayList;
import java.util.List;

// Subclase Pelicula que extiende de ContenidoAudiovisual
public class Pelicula extends ContenidoAudiovisual {
    private String estudio;
    
    // Agragacion
    private List<Actor> actores;

    public Pelicula(String titulo, int duracionEnMinutos, String genero, String estudio) {
        super(titulo, duracionEnMinutos, genero);
        this.estudio = estudio;
        this.actores = new  ArrayList<Actor>();
    }

    public String getEstudio() {
        return estudio;
    }

    public void setEstudio(String estudio) {
        this.estudio = estudio;
    }
    public void agregarActor(Actor actor) {
    	actores.add(actor);
    }
    public List<Actor> getActores(){
    	return actores;
    } 
    
    @Override
    public String toString() {
        return " Detalles de la película: \n" +
               " ID: " + getId() + "\n" +
               " Título: " + getTitulo() + "\n" +
               " Duración en minutos: " + getDuracionEnMinutos() + "\n" +
               " Género: " + getGenero() + "\n" +
               " Estudio: " + estudio + "\n";
        
    }
}