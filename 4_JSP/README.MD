# JSP
Si tuviéramos que generar cada respuesta HTML "a pelo", tendríamos demasiado trabajo. Para poder utilizar archivos con sintaxis HTML, recurrimos a JSP (JavaServer Pages).

Referencia: http://www.oracle.com/technetwork/java/jsp-138432.html

1. Crea el fichero <dir_proyecto>/src/Servlet1.java.
2. Compila el Servlet que has creado. Pero utiliza las librerías de Apache Tomcat. Para ello, desde <dir_proyecto>/src/ ejecuta el comando "javac -classpath <dir_tomcat>/lib/servlet-api.jar Servlet1.java". Aparecerá Servlet1.class.
4. Crea los directorios: <dir_proyecto>/webapps/HolaMundoJSP/WEB-INF/classes.
5. Mueve Servlet1.class al directorio que acabas de crear.
6. Crea la página de bienvenida en <dir_proyecto>/webapps/HolaMundoJSP/index.html. Esta será la página que se muestre cuando no se pida ninguna. Mira los comentarios del fichero.
7. Crea el JSP en <dir_proyecto>/webapps/HolaMundoJSP/jsp/pag1.jsp. Mira los comentarios del fichero para ver qué hace.
8. Crea el fichero <dir_proyecto>/webapps/HolaMundoJSP/WEB-INF/web.xml. Mira los comentarios del fichero para enteder lo que hace.
9. **Publica el Servlet**: Para ello, copia <dir_proyecto>/webapps/HolaMundoJSP al directorio **<dir_tomcat>/webapps/**.
10. Reinicia Apache Tomcat. Para ello, desde el directorio <dir_tomcat>/bin lanza los comandos ./shutdown.sh y ./startup.sh.
11. Comprueba el funcionamiento del Servlet navegando a la URL **http://localhost:8080/HolaMundoJSP**. Debe aparecer el mensaje la página de bienvenida que has creado.

