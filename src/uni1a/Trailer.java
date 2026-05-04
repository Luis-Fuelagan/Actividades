package uni1a;

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
	  public void mostrarDetalles() {
		  System.out.println("=== Trailer ===");
			 System.out.println(" ID: " + getId());
			 System.out.println(" Titulo: " + getTitulo());
			 System.out.println(" Pelicula promocionadad: " + pelicula);
			 System.out.println(" Fecha de lanzamiento: " + fechaLanzamiento);
			 System.out.println(" Visualizaciones: " + numVisualizacion);
			 System.out.println(" Duracion: " + getDuracionEnMinutos() + " minutos ");
			 System.out.println(" Genero: " + getGenero());
		
	  }
}
