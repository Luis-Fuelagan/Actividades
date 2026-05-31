package controlador;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import modelo.Investigador;


public class InvestigadorRepositorio {
	
	private static final String NOMBRE_ARCHIVO = "investigadores.csv";
	
	public void agregarInvestigador(List<Investigador> listaInvestigadores) {
		
		try (PrintWriter writer = new PrintWriter(NOMBRE_ARCHIVO)) {
			
			for (Investigador investigador : listaInvestigadores) {
				writer.println(investigador.getNombre() + "," + investigador.getEspecialidad() + "," + investigador.getInstitucion());
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
    public List<Investigador> cargarInvestigador() {
		
		List<Investigador> listaInvestigador = new ArrayList<Investigador>();
		File archivo = new File(NOMBRE_ARCHIVO);
		
		if (!archivo.exists()) {
			return listaInvestigador;
		}
		try (BufferedReader reader = new BufferedReader(new FileReader(archivo))) {
			String linea;
			
			while ((linea = reader.readLine()) != null) {
				
                if (linea.trim().isEmpty()) {
                    continue; 
                }
                String[] datos = linea.split(",");
                
                String nombre = datos[0];
                String especialidad = datos[1];
                String institucion = datos[2];
                
                Investigador investigador = new Investigador(nombre, especialidad, institucion);
                listaInvestigador.add(investigador);
			}
			
		} catch (IOException e) {
			System.err.println("Error al leer el archivo CSV: " + e.getMessage());
		}
		return listaInvestigador;
	}
}
