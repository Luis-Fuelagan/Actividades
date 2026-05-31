package modelo;

public class Temporada {
      private int numeroTemporada;
      private int cantidadEpisodio;
      private int añoLanzamiento;
      
	  public Temporada(int numeroTemporada, int cantidadEpisodio, int añoLanzamiento) {
		  
		this.numeroTemporada = numeroTemporada;
		this.cantidadEpisodio = cantidadEpisodio;
		this.añoLanzamiento = añoLanzamiento;
	  }

	  public int getNumeroTemporada() {
		  return numeroTemporada;
	  }

	  public void setNumeroTemporada(int numeroTemporada) {
		  this.numeroTemporada = numeroTemporada;
	  }

	  public int getCantidadEpisodio() {
		  return cantidadEpisodio;
	  }

	  public void setCantidadEpisodio(int cantidadEpisodio) {
		  this.cantidadEpisodio = cantidadEpisodio;
	  }

	  public int getAñoLanzamiento() {
		  return añoLanzamiento;
	  }

	  public void setAñoLanzamiento(int añoLanzamiento) {
		  this.añoLanzamiento = añoLanzamiento;
	  }

	  @Override
	  public String toString() {
		return "Numero de temporadas: " + numeroTemporada + "| Cantidad de Episodios: " + cantidadEpisodio + "| Año de Lanzamieneto: " + añoLanzamiento;
	  }
	  
}
 