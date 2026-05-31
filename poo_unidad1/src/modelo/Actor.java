package modelo;

public class Actor {
     private String nombre;
     private int edad;
     
	 public Actor(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	 }

	 public String getNombre() {
		 return nombre;
	 }

	 public void setNombre(String nombre) {
		 this.nombre = nombre;
	 }

	 public int getEdad() {
		 return edad;
	 }

	 public void setEdad(int edad) {
		 this.edad = edad;
	 } 
	 //Eliminamos el System.out.println para que la clase no interactue con la consola.
	 @Override
     public String toString() {
         return "Actor: " + nombre + " | Edad: " + edad + " años";
     }
}



