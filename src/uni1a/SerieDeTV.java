/**
 * Class SerieDeTV
 */
package uni1a;

import java.util.ArrayList;
import java.util.List;

// Subclase SerieDeTV que extiende de ContenidoAudiovisual
public class SerieDeTV extends ContenidoAudiovisual {
    private int temporadas;
    
    //En este caso es Composicion una Temporada no existe sin la Serie.
    private List<Temporada> listaTemporada;

    public SerieDeTV(String titulo, int duracionEnMinutos, String genero, int temporadas) {
        super(titulo, duracionEnMinutos, genero);
        this.temporadas = temporadas;
        this.listaTemporada = new ArrayList<Temporada>();
    }

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }
    public void agregarTemporadas(Temporada tempo) {
    	listaTemporada.add(tempo);
    }
    public List<Temporada> getlistaTemporada(){
    	return listaTemporada;
    }
    @Override
    public void mostrarDetalles() {
        System.out.println(" Detalles de la película: ");
        System.out.println(" ID: " + getId());
        System.out.println(" Título: " + getTitulo());
        System.out.println(" Duración en minutos: " + getDuracionEnMinutos());
        System.out.println(" Género: " + getGenero());
        System.out.println(" Temporadas: " + this.temporadas);
        System.out.println();
    }
}