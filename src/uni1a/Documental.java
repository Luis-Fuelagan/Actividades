/**
 * Class Documental
 */
package uni1a;

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
    public void agregarLista(Investigador inv) {
    	listaInvestigadores.add(inv);
    }
    public List<Investigador> getlistaInvestigadores () {
    	return listaInvestigadores;
    }
    
    @Override
    public void mostrarDetalles() {
        System.out.println(" Detalles de la película: ");
        System.out.println(" ID: " + getId());
        System.out.println(" Título: " + getTitulo());
        System.out.println(" Duración en minutos: " + getDuracionEnMinutos());
        System.out.println(" Género: " + getGenero());
        System.out.println(" Tema: " + this.tema);
        System.out.println();
        
    }
}