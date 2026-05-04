package uni1a;

public class Podcast extends ContenidoAudiovisual {
     String presentador;
     String plataforma;
     
	 public Podcast(String titulo, int duracionEnMinutos, String genero, String presentador, String plataforma) {
		super(titulo, duracionEnMinutos, genero);
		this.presentador = presentador;
		this.plataforma = plataforma;
	 }
	 
	 public String getPresentador() {
		return presentador;
	}
	 
	 public void setPresentador(String presentador) {
		 this.presentador = presentador;
	 }

	 public String getPlataforma() {
		 return plataforma;
	 }


	 public void setPlataforma(String plataforma) {
		 this.plataforma = plataforma;
	 }


	 @Override
	 public void mostrarDetalles() {
		 System.out.println("=== PODCAST ===");
		 System.out.println(" ID: " + getId());
		 System.out.println(" Titulo: " + getTitulo());
		 System.out.println(" Presentador: " + presentador);
		 System.out.println(" Plataforma: " + plataforma);
		 System.out.println(" Duracion: " + getDuracionEnMinutos() + " minutos ");
		 System.out.println(" Genero: " + getGenero());
	 } 
}
