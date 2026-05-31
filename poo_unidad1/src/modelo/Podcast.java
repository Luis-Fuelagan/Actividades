package modelo;

public class Podcast extends ContenidoAudiovisual {
     private String presentador;
     private String plataforma;
     
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
	    public String toString() {
	        return "=== PODCAST ===\n" +
	               " ID: " + getId() + "\n" +
	               " Titulo: " + getTitulo() + "\n" +
	               " Presentador: " + presentador + "\n" +
	               " Plataforma: " + plataforma + "\n" +
	               " Duracion: " + getDuracionEnMinutos() + " minutos \n" +
	               " Genero: " + getGenero() + "\n";
	    }
}
