package poo;
import uni1a.*;

public class PruebaAudioVisual {
	public static void main(String[] args) {
        System.out.println("--Sistema de Contenido Audiovisual--");
        
        // Pelicula con actores(Agregacion)
        Pelicula pelicula = new Pelicula("Avatar",125, "Accion", "20th Century Studios");
        pelicula.agregarActor(new Actor("Luis Perez", 35));
        pelicula.agregarActor(new Actor("Fernando Fuelagan", 25) );
        
        // Serie con temporadas(Composicion)
        SerieDeTV serie = new SerieDeTV("Game of Thrones", 60,"Fantasia", 2);
        serie.crearYAgregarTemporadas(1, 20, 2005);
        serie.crearYAgregarTemporadas(2, 8, 2012);
        
        // Documental con investigadores(Asociacion)
        Documental doc = new Documental("Cosmos", 45,"Ciencia", "Astronomia");
        doc.agregarInvestigador(new Investigador("Carlos Juarez","Astrofisica","Universidad Politecnica"));
        doc.agregarInvestigador(new Investigador("Nelson Fuentes","Astrofisica","Universidad Politecnica"));
        
        // Nuevas subclases 
        Podcast pod = new Podcast("Lo que deberias saber", 15, "Educativo", "Marco Torres", "YouTube");
        Trailer trai = new Trailer("El tragico suceso del mundo", 120, "Accion", "EL Abismo", "2007", 500);
        
        // Mostrar
        pelicula.mostrarDetalles();
        System.out.println("Actores en la pelicula:");
        for(Actor a : pelicula.getActores()) {
        	a.mostararInformacion();
        }
        System.out.println("-----------------------");
        
        serie.mostrarDetalles();
        System.out.println("Temporadas:");
        for(Temporada tem : serie.getlistaTemporada()) {
        	tem.mostrarDetalles(); 
        }
        System.out.println("-----------------------");
        
        doc.mostrarDetalles();
        System.out.println("Investigadores:");
        for (Investigador inv : doc.getlistaInvestigadores()) {
        	inv.mostrarDetalles();
        }
        System.out.println("-----------------------");
        
        pod.mostrarDetalles();
        System.out.println("-----------------------");
        
        trai.mostrarDetalles();
        System.out.println("-----------------------");
    }
}