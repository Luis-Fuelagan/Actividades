package uni1a;

public class Temporada {
      private int numeroTemporada;
      private int cantidadEpisodio;
      private int añoLanzamiento;
      
	  public Temporada(int numeroTemporada, int cantidadEpisodio, int añoLanzamiento) {
		super();
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
      public void mostrarDetalles() {
    	  System.out.println(" Temporada: " + numeroTemporada + " Episodio: " + cantidadEpisodio + " Año: " + añoLanzamiento);
      }
}
 