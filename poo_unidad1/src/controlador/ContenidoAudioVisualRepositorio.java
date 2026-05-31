package controlador;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import modelo.*;

public class ContenidoAudioVisualRepositorio {
	
    private static final String NOMBRE_ARCHIVO = "contenidos_audiovisuales.csv";
    
    public void guardarContenidoAudioVisual(List<ContenidoAudiovisual> listaContenidos) {
    	
        try (PrintWriter writer = new PrintWriter(NOMBRE_ARCHIVO)) {
            
            for (ContenidoAudiovisual contenido : listaContenidos) {
            	
            	//Identificamos el tipo de objeto usando "instanceof"
                // Evaluamos que subclase específica es para guardar sus atributos completos
                if (contenido instanceof Pelicula) {
                    Pelicula pelicula = (Pelicula) contenido;
                    writer.println("PELICULA," + pelicula.getTitulo() + "," + pelicula.getDuracionEnMinutos() + "," + pelicula.getGenero() + "," + pelicula.getEstudio());
                } 
                else if (contenido instanceof SerieDeTV) {
                    SerieDeTV serie = (SerieDeTV) contenido;
                    writer.println("SERIE," + serie.getTitulo() + "," + serie.getDuracionEnMinutos() + "," + serie.getGenero() + "," + serie.getTemporadas());
                } 
                else if (contenido instanceof Documental) {
                    Documental documental = (Documental) contenido;
                    writer.println("DOCUMENTAL," + documental.getTitulo() + "," + documental.getDuracionEnMinutos() + "," + documental.getGenero() + "," + documental.getTema());
                } 
                else if (contenido instanceof Podcast) {
                    Podcast pod = (Podcast) contenido;
                    writer.println("PODCAST," + pod.getTitulo() + "," + pod.getDuracionEnMinutos() + "," + pod.getGenero() + "," + pod.getPresentador() + "," + pod.getPlataforma());
                } 
                else if (contenido instanceof Trailer) {
                    Trailer trailer = (Trailer) contenido;
                    writer.println("TRAILER," + trailer.getTitulo() + "," + trailer.getDuracionEnMinutos() + "," + trailer.getGenero() + "," + trailer.getPelicula() + "," + trailer.getFechaLanzamiento() + "," + trailer.getNumVisualizacion());
                }
            }
            
        } catch (IOException e) {
            System.err.println("Error al guardar el archivo CSV: " + e.getMessage());
        }
    }
    public List<ContenidoAudiovisual> cargarContenidoAudioVisual() {
        List<ContenidoAudiovisual> listaContenidos = new ArrayList<>();
        File archivo = new File(NOMBRE_ARCHIVO);
        
        if (!archivo.exists()) {
            return listaContenidos;
        }
        
        try (BufferedReader reader = new BufferedReader(new FileReader(archivo))) {
            String linea;
            
            while ((linea = reader.readLine()) != null) {
                if (linea.trim().isEmpty()) {
                    continue; 
                }
                
                // Separamos la linea por comas
                String[] datos = linea.split(",");
                String tipo = datos[0]; // El primer elemento determina la subclase
                
                // Atributos comunes de la clase abstracta ContenidoAudiovisual
                String titulo = datos[1];
                int duracionMinutos = Integer.parseInt(datos[2].trim()); 
                String genero = datos[3];
                
                // Dependiendo del tipo, instanciamos la subclase correspondiente usando Polimorfismo
                switch (tipo) {
                    case "PELICULA":
                        String estudio = datos[4];
                        listaContenidos.add(new Pelicula(titulo, duracionMinutos, genero, estudio));
                        break;
                        
                    case "SERIE":
                        int temporadas = Integer.parseInt(datos[4].trim());
                        listaContenidos.add(new SerieDeTV(titulo, duracionMinutos, genero, temporadas));
                        break;
                        
                    case "DOCUMENTAL":
                        String tema = datos[4];
                        listaContenidos.add(new Documental(titulo, duracionMinutos, genero, tema));
                        break;
                        
                    case "PODCAST":
                        String presentador = datos[4];
                        String plataforma = datos[5];
                        listaContenidos.add(new Podcast(titulo, duracionMinutos, genero, presentador, plataforma));
                        break;
                        
                    case "TRAILER":
                        String peliculaPromocionada = datos[4];
                        String fechaLanzamiento = datos[5];
                        int numVisualizaciones = Integer.parseInt(datos[6].trim());
                        listaContenidos.add(new Trailer(titulo, duracionMinutos, genero, peliculaPromocionada, fechaLanzamiento, numVisualizaciones));
                        break;
                        
                    default:
                        System.err.println("Tipo de contenido desconocido en archivo: " + tipo);
                        break;
                }
            }
            
        } catch (IOException e) {
            System.err.println("Error al leer el archivo CSV: " + e.getMessage());
        } 
        
        return listaContenidos;
    }
}
