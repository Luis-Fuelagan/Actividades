package controlador;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import modelo.Actor;

public class ActorRepositorio {
	
	private static final String NOMBRE_ARCHIVO = "actores.csv";
	
	public void agregarActor(List<Actor> listaActores) {
		
		try (PrintWriter writer = new PrintWriter(NOMBRE_ARCHIVO) ) {
		
			for (Actor actor : listaActores) {
				writer.println(actor.getNombre() + "," + actor.getEdad());
			}
		} catch (IOException e ) {
			e.printStackTrace();
		}
	}
    public List<Actor> cargarActor() {
		
		List<Actor> listaActores = new ArrayList<Actor>();
		File archivo = new File(NOMBRE_ARCHIVO);
		
		if (!archivo.exists()) {
			return listaActores;
		}
		try (BufferedReader reader = new BufferedReader(new FileReader(archivo))) {
			String linea;
			
			while ((linea = reader.readLine()) != null) {
				
                if (linea.trim().isEmpty()) {
                    continue; 
                }
                String[] datos = linea.split(",");
                
                String nombre = datos[0];
                int edad = Integer.parseInt(datos[1].trim());
                
                Actor actor = new Actor(nombre, edad);
                listaActores.add(actor);
			}
			
		} catch (IOException e) {
			System.err.println("Error al leer el archivo CSV: " + e.getMessage());
		}
		return listaActores;
	}
}
