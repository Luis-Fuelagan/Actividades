Sistema de Gestión Audiovisual (MVC)

Este proyecto es una aplicación de consola desarrollada en Java que permite gestionar diferentes tipos de contenidos audiovisuales (Películas, Series de TV, Documentales, Podcasts y Trailers) utilizando programación orientada a objetos. El sistema implementa la persistencia de datos de forma local mediante archivos planos en formato CSV y sigue estrictamente la arquitectura Modelo-Vista-Controlador (MVC) y los principios SOLID.

Características y Cambios Realizados (Unidad 4)

En esta etapa del proyecto, se paso de un enfoque estructurado monolítico a un solido software, realizando los siguientes cambios clave:

separación de Responsabilidades (MVC): Se aisló por completo la lógica de presentación (interfaz de consola) de la lógica de negocio y de los datos.
Desacoplamiento del Modelo (Código Limpio): Se eliminaron todas las instrucciones System.out.println de las clases del modelo (Pelicula, SerieDeTV). Ahora las clases implementan el método estándar @Override public String toString() para formatear sus datos sin interactuar con la consola.
Persistencia en Archivos CSV: Se diseñó un mecanismo de lectura y escritura de archivos planos (contenidos.csv, actores.csv, temporadas.csv, investigadores.csv) centralizado en el controlador.

Estructura del Código

El código fuente se encuentra organizado dentro del directorio src bajo paquetes específicos que delimitan sus responsabilidades:

poo_unidad1
src

modelo           
ContenidoAudiovisual.java (Clase Abstracta)
Pelicula.java
SerieDeTV.java
Documental.java
Podcast.java
Trailer.java
Actor.java
Temporada.java
Investigador.java

controlador     # Coordinador entre la Vista y el Modelo. 
ContenidoContador.java

vista            # Interfaz de usuario. Captura entradas de teclado y muestra información.
PruebaAudioVisual.java


Ejecución del Proyecto
Para correr la aplicación desde su IDE:

Navega en el explorador de paquetes hasta src/vista/PruebaAudioVisual.java.

Haga clic derecho sobre el archivo y selecciona Run As -> Java Application.

Al ejecutarlo, se desplegará un menú interactivo en la consola que le permitirá registrar contenidos, listarlos en tiempo real y guardarlos en el disco duro.

Nota: Los archivos .csv se generarán automáticamente en la raíz de su proyecto la primera vez que selecciones la opción de Guardar en el menú o al salir del sistema.

Ejecución de Pruebas

Las pruebas unitarias del proyecto están diseñadas utilizando el framework JUnit. Estas pruebas validan de forma automatizada los métodos de crear, agregar y pruebas de excepciones de los diferentes datos.

Desde el IDE (Eclipse):
Haga clic derecho sobre la clase de pruebas específica.

Selecciona Run As -> JUnit Test.

La pestaña flotante de JUnit te mostrará la barra verde indicando que todos los métodos cumplen con el comportamiento esperado.
