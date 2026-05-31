package controlador;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import modelo.Temporada;

public class TemporadaRepositorio {
	
	private static final String NOMBRE_ARCHIVO = "temporadas.csv";
	
	public void agregarTemporada(List<Temporada> listaTemporadas) {
		
		try (PrintWriter writer = new PrintWriter(NOMBRE_ARCHIVO)) {
			
			for (Temporada temporada : listaTemporadas) {
				writer.println(temporada.getNumeroTemporada() + "," + temporada.getCantidadEpisodio() + "," + temporada.getAñoLanzamiento());
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
    public List<Temporada> cargarTemporada() {
		
		List<Temporada> listaTemporada = new ArrayList<Temporada>();
		File archivo = new File(NOMBRE_ARCHIVO);
		
		if (!archivo.exists()) {
			return listaTemporada;
		}
		try (BufferedReader reader = new BufferedReader(new FileReader(archivo))) {
			String linea;
			
			while ((linea = reader.readLine()) != null) {
				
                if (linea.trim().isEmpty()) {
                    continue; 
                }
                String[] datos = linea.split(",");
                
                int numTemporada = Integer.parseInt(datos[0].trim());
                int cantidadEpisodio = Integer.parseInt(datos[1].trim()); 
                int añoLanzamiento = Integer.parseInt(datos[2].trim());
                
                Temporada temporada = new Temporada(numTemporada, cantidadEpisodio, añoLanzamiento);
                listaTemporada.add(temporada);
			}
			
		} catch (IOException e) {
			System.err.println("Error al leer el archivo CSV: " + e.getMessage());
		}
		return listaTemporada;
	}
}
