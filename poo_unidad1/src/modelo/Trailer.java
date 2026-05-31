package modelo;

public class Trailer extends ContenidoAudiovisual {
      private String  pelicula;
      private String fechaLanzamiento;
      private int numVisualizacion;
      
	  public Trailer(String titulo, int duracionEnMinutos, String genero, String pelicula, String fechaLanzamiento,
			int numvisualizaciones) {
		super(titulo, duracionEnMinutos, genero);
		this.pelicula = pelicula;
		this.fechaLanzamiento = fechaLanzamiento;
		this.numVisualizacion = numvisualizaciones;
	  }

	  public String getPelicula() {
		  return pelicula;
	  }

	  public void setPelicula(String pelicula) {
		  this.pelicula = pelicula;
	  }

	  public String getFechaLanzamiento() {
		  return fechaLanzamiento;
	  }

	  public void setFechaLanzamiento(String fechaLanzamiento) {
		  this.fechaLanzamiento = fechaLanzamiento;
	  }

	  public int getNumVisualizacion() {
		  return numVisualizacion;
	  }

	  public void setNumVisualizacion(int numvisualizaciones) {
		  this.numVisualizacion = numvisualizaciones;
	  }

	  @Override
	    public String toString() {
	        return "=== Trailer ===\n" +
	               " ID: " + getId() + "\n" +
	               " Titulo: " + getTitulo() + "\n" +
	               " Pelicula promocionada: " + pelicula + "\n" +
	               " Fecha de lanzamiento: " + fechaLanzamiento + "\n" +
	               " Visualizaciones: " + numVisualizacion + "\n" +
	               " Duracion: " + getDuracionEnMinutos() + " minutos \n" +
	               " Genero: " + getGenero() + "\n";
	        
	    }
}
