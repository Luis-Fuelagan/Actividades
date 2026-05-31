package controlador;

import java.util.List;
import modelo.*;

public class ContenidoControlador {
    
    // Listas globales
    private List<ContenidoAudiovisual> listaContenidos;
    private List<Actor> listaActores;
    private List<Investigador> listaInvestigadores;
    private List<Temporada> listaTemporadas; 
    

    private ContenidoAudioVisualRepositorio repoContenidos;
    private ActorRepositorio repoActores;
    private InvestigadorRepositorio repoInvestigadores;
    private TemporadaRepositorio repoTemporadas; 

    //Inicializar repositorios y carga datos automaticamente
    public ContenidoControlador() {
        this.repoContenidos = new ContenidoAudioVisualRepositorio();
        this.repoActores = new ActorRepositorio();
        this.repoInvestigadores = new InvestigadorRepositorio();
        this.repoTemporadas = new TemporadaRepositorio();
        
        // Carga automatica desde los archivos CSV al iniciar
        this.listaContenidos = repoContenidos.cargarContenidoAudioVisual();
        this.listaActores = repoActores.cargarActor();
        this.listaInvestigadores = repoInvestigadores.cargarInvestigador();
        this.listaTemporadas = repoTemporadas.cargarTemporada(); 
    }

    // Metodos getters para que la vista acceda a las listas
    public List<ContenidoAudiovisual> getListaContenidos() {
        return listaContenidos;
    }

    public List<Actor> getListaActores() {
        return listaActores;
    }

    public List<Investigador> getListaInvestigadores() {
        return listaInvestigadores;
    }

    public List<Temporada> getListaTemporadas() { 
        return listaTemporadas;
    }

    // Metodos para registrar nuevos elementos
    public void registrarContenido(ContenidoAudiovisual contenido) {
        listaContenidos.add(contenido);
    }

    public void registrarActor(Actor actor) {
        listaActores.add(actor);
    }

    public void registrarInvestigador(Investigador investigador) {
        listaInvestigadores.add(investigador);
    }

    public void registrarTemporada(Temporada temporada) {
        listaTemporadas.add(temporada);
    }
    public void guardarTodo() {
        repoContenidos.guardarContenidoAudioVisual(listaContenidos);
        repoActores.agregarActor(listaActores);
        repoInvestigadores.agregarInvestigador(listaInvestigadores);
        repoTemporadas.agregarTemporada(listaTemporadas);
    }
}

