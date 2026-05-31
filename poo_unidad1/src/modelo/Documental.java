/**
 * Class Documental
 */
package modelo;

import java.util.ArrayList;
import java.util.List;

// Subclase Documental que extiende de ContenidoAudiovisual
public class Documental extends ContenidoAudiovisual {
    private String tema;
    
    //Asociacion
    private List<Investigador> listaInvestigadores;

    public Documental(String titulo, int duracionEnMinutos, String genero, String tema) {
        super(titulo, duracionEnMinutos, genero);
        this.tema = tema;
        this.listaInvestigadores = new ArrayList<>();
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }
    public void agregarInvestigador(Investigador inv) {
    	listaInvestigadores.add(inv);
    }
    public List<Investigador> getlistaInvestigadores () {
    	return listaInvestigadores;
    }
    
    @Override
    public String toString() {
        return " Detalles del Documental: \n" +
               " ID: " + getId() + "\n" +
               " Título: " + getTitulo() + "\n" +
               " Duración en minutos: " + getDuracionEnMinutos() + "\n" +
               " Género: " + getGenero() + "\n" +
               " Tema: " + tema + "\n";
        
        
    }
}