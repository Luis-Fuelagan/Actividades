package vista;

import java.util.Scanner;
import controlador.ContenidoControlador;
import modelo.*;

public class PruebaAudioVisual {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        // 1. Instanciamos el controlador para cargar los datos al iniciar
        ContenidoControlador control = new ContenidoControlador();
        
        int opcion = 0;
        
        do {
        	
        	System.out.println("-------------------------------------------------");
            System.out.println("  SISTEMA DE GESTION AUDIOVISUAL MVC ");
            System.out.println("-------------------------------------------------");
            System.out.println("1. Mostrar todos los contenidos audiovisuales");
            System.out.println("2. Registrar una nueva Pelicula con Actor");
            System.out.println("3. Registrar una nueva Serie de TV con Temporada");
            System.out.println("4. Registrar un nuevo Documental con Investigador");
            System.out.println("5. Registrar un nuevo Podcast");
            System.out.println("6. Registrar un nuevo Trailer");
            System.out.println("7. GUARDAR TODOS  los archivos CSV");
            System.out.println("8. Salir del programa");
            System.out.print("Seleccione una opcion: ");
            
            try {
                opcion = Integer.parseInt(teclado.nextLine());
                
                switch (opcion) {
                    case 1:
                        System.out.println("\n--- LISTA GENERAL DE CONTENIDOS ---");
                        if (control.getListaContenidos().isEmpty()) {
                            System.out.println("No hay contenidos registrados en el sistema.");
                        } else {
                            for (ContenidoAudiovisual contenido : control.getListaContenidos()) {
                            	
                            	System.out.println(contenido);
                                
                                // Logica de la Vista para mostrar relaciones si aplican
                                if (contenido instanceof Pelicula) {
                                    System.out.println("Actores asignados:");
                                    for (Actor actor : ((Pelicula) contenido).getActores()) {
                                        System.out.println("  -> " + actor);
                                    }
                                } else if (contenido instanceof SerieDeTV) {
                                    System.out.println("Temporadas:");
                                    for (Temporada temporada : ((SerieDeTV) contenido).getlistaTemporada()) {
                                        System.out.println("  -> " + temporada);
                                    }
                                } else if (contenido instanceof Documental) {
                                    System.out.println("Investigadores asociados:");
                                    for (Investigador investigador : ((Documental) contenido).getlistaInvestigadores()) {
                                        System.out.println("  -> " + investigador);
                                    }
                                }
                                System.out.println("---------------------------------------------");
                            }
                        }
                        break;
                        
                    case 2:
                        System.out.println("\n--- REGISTRAR PELICULA ---");
                        System.out.print("Titulo: "); 
                        String titulo = teclado.nextLine();
                        System.out.print("Duracion minutos: "); 
                        int duracion = Integer.parseInt(teclado.nextLine());
                        System.out.print("Genero: "); 
                        String genero = teclado.nextLine();
                        System.out.print("Estudio cinematografico: "); 
                        String estudio = teclado.nextLine();
                        
                        Pelicula nuevaPelicula = new Pelicula(titulo, duracion, genero, estudio);
                        
                        // Añadir un actor de forma inmediata para demostrar la Agregación
                        System.out.println("\nAsignar Actor Principal:");
                        System.out.print("Nombre del actor: "); 
                        String nombre = teclado.nextLine();
                        System.out.print("Edad del actor: "); 
                        int edad = Integer.parseInt(teclado.nextLine());
                        
                        Actor nuevoActor = new Actor(nombre, edad);
                        
                        nuevaPelicula.agregarActor(nuevoActor);
                        
                        // Enviamos los datos al controlador
                        control.registrarContenido(nuevaPelicula);
                        control.registrarActor(nuevoActor);
                        System.out.println("Pelicula y Actor registrados");
                        break;
                        
                    case 3:
                        System.out.println("\n--- REGISTRAR SERIE DE TV ---");
                        System.out.print("Titulo de la serie: "); 
                        String tituloSerie = teclado.nextLine();
                        System.out.print("Duracion total en minutos: "); 
                        int duracionSerie = Integer.parseInt(teclado.nextLine());
                        System.out.print("Genero: "); 
                        String generoSerie = teclado.nextLine();
                        System.out.print("Numero de temporadas: "); 
                        int numTemporadaSerie = Integer.parseInt(teclado.nextLine());
                        
                        SerieDeTV nuevaSerie = new SerieDeTV(tituloSerie, duracionSerie, generoSerie, numTemporadaSerie);
                        
                        // Añadir una temporada para demostrar la Composición
                        System.out.println("\nCrear Primera Temporada:");
                        System.out.print("Numero de la temporada: "); 
                        int numTemporada = Integer.parseInt(teclado.nextLine());
                        System.out.print("Cantidad de episodios: "); 
                        int cantEpisodio = Integer.parseInt(teclado.nextLine());
                        System.out.print("Año de lanzamiento: "); 
                        int añoLanzamiento = Integer.parseInt(teclado.nextLine());
                        
                        nuevaSerie.crearYAgregarTemporadas(numTemporada, cantEpisodio, añoLanzamiento);
                        
                        // Avisamos al controlador de la serie y de sus temporadas
                        control.registrarContenido(nuevaSerie);

                        System.out.println("Serie de TV y Temporada guardadas");
                        break;
                        
                    case 4:
                        System.out.println("\n--- REGISTRAR DOCUMENTAL ---");
                        System.out.print("Titulo: "); 
                        String tituloDocumental = teclado.nextLine();
                        System.out.print("Duracion en minutos: "); 
                        int duracionDocumental = Integer.parseInt(teclado.nextLine());
                        System.out.print("Genero: "); 
                        String generoDocumental = teclado.nextLine();
                        System.out.print("Tema: "); 
                        String temaDocumental = teclado.nextLine();
                        
                        Documental nuevoDocumental = new Documental(tituloDocumental, duracionDocumental, generoDocumental, temaDocumental);
                        
                        // Añadir un investigador para demostrar la Asociación
                        System.out.println("\nAsociar Investigador:");
                        System.out.print("Nombre: "); 
                        String nombreInvestigador = teclado.nextLine();
                        System.out.print("Especialidad: "); 
                        String especialidadInvestigador = teclado.nextLine();
                        System.out.print("Institucion: "); 
                        String institucionInvestigador = teclado.nextLine();
                        
                        Investigador nuevoInvestigador = new Investigador(nombreInvestigador, especialidadInvestigador, institucionInvestigador);
                        
                        nuevoDocumental.agregarInvestigador(nuevoInvestigador);
                        
                        control.registrarContenido(nuevoDocumental);
                        control.registrarInvestigador(nuevoInvestigador);
                        System.out.println("Documental e Investigador registrados");
                        break;
                        
                    case 5:
                        System.out.println("\n--- REGISTRAR PODCAST ---");
                        System.out.print("Titulo: "); 
                        String tituloPodcast = teclado.nextLine();
                        System.out.print("Duracion en minutos: "); 
                        int duracionPodcast = Integer.parseInt(teclado.nextLine());
                        System.out.print("Genero: "); 
                        String generoPodcast = teclado.nextLine();
                        System.out.print("Presentador: "); 
                        String presentadorPodcast = teclado.nextLine();
                        System.out.print("Plataforma: "); 
                        String plataformaPodcast = teclado.nextLine();
                        
                        control.registrarContenido(new Podcast(tituloPodcast, duracionPodcast, generoPodcast, presentadorPodcast, plataformaPodcast));
                        System.out.println("Podcast registrado con exito");
                        break;
                        
                    case 6:
                        System.out.println("\n--- REGISTRAR TRAILER ---");
                        System.out.print("Titulo del trailer: "); 
                        String tituloTrailer = teclado.nextLine();
                        System.out.print("Duracion en minutos: "); 
                        int duracionTrailer = Integer.parseInt(teclado.nextLine());
                        System.out.print("Genero: "); 
                        String generoTrailer = teclado.nextLine();
                        System.out.print("Pelicula que promociona: "); 
                        String peliculaTraieler = teclado.nextLine();
                        System.out.print("Fecha de lanzamiento: "); 
                        String fechaLanzamientoTrailer = teclado.nextLine();
                        System.out.print("Número inicial de visualizaciones: "); 
                        int visitasTrailer = Integer.parseInt(teclado.nextLine());
                        
                        control.registrarContenido(new Trailer(tituloTrailer, duracionTrailer, generoTrailer, peliculaTraieler, fechaLanzamientoTrailer, visitasTrailer));
                        System.out.println("Trailer registrado con exito");
                        break;
                        
                    case 7:
                        // La Vista ordena guardar, el controlador ejecuta los repositorios CSV
                        System.out.println("\nGuardando datos en el disco");
                        control.guardarTodo();
                        break;
                        
                    case 8:
                        System.out.println("\nGuardando antes de salir");
                        control.guardarTodo();
                        System.out.println("Gracias por utilizar el sistema");
                        break;
                        
                    default:
                        System.out.println("Opcion invalida, intente un numero del 1 al 8");
                        break;
                }
            } catch (NumberFormatException e) {
                System.err.println("Error de entrada: por favor introduzca un dato numerico valido.");
            } catch (Exception e) {
                System.err.println("Ocurrio un error inesperado en la interfaz: " + e.getMessage());
            }
            
        } while (opcion != 8);
        
        teclado.close();
    }
}



