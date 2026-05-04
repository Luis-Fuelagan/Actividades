package poo;
import uni1a.*;

public class PruebaAudioVisual {
	public static void main(String[] args) {
        System.out.println("Hello from Eclipse!");
        
        // Pelicula con actores
        Pelicula pelicula = new Pelicula("Avatar",125, "Accion", "20th Century Studios");
        pelicula.agregarActor(new Actor("Luis Perez", 35));
        pelicula.agregarActor(new Actor("Fernando Fuelagan", 25) );
        
        // Serie con temporadas
        SerieDeTV serie = new SerieDeTV("Game of Thrones", 60,"Fantasia", 8);
        serie.agregarTemporadas(new Temporada(2, 20, 2005));
        serie.agregarTemporadas(new Temporada(1, 8, 2012));
        
        // Documental con investigadores
        Documental doc = new Documental("Cosmos", 45,"Ciencia", "Astronomia");
        doc.agregarLista(new Investigador("Carlos Juarez","Astrofisica","Universidad Politecnica"));
        doc.agregarLista(new Investigador("Nelson Fuentes","Astrofisica","Universidad Politecnica"));
        
        // Nuevas subclases 
        Podcast pod = new Podcast("Lo que deberias saber", 15, "Educativo", "Marco Torres", "YouTube");
        Trailer trai = new Trailer("El tragico suceso del mundo", 120, "Accion", "EL Abismo", "2007", 500);
        
        // Mostrar
        pelicula.mostrarDetalles();
        System.out.println("Actores:");
        for(Actor a : pelicula.getActores()) 
        	a.mostararInform();
        
        serie.mostrarDetalles();
        System.out.println("Temporadas:");
        for(Temporada tem : serie.getlistaTemporada()) 
        	tem.mostrarDetalles();
        
        doc.mostrarDetalles();
        System.out.println("Investigadores:");
        for (Investigador inv : doc.getlistaInvestigadores()) 
        	inv.mostrarDetalles();
        
        pod.mostrarDetalles();
        trai.mostrarDetalles();
    }
}