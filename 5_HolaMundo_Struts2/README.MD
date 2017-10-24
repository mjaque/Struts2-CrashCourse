# Hola Mundo con Struts2
Struts2 nos facilita el trabajo. Pero hay que estudiárselo. Vamos a lo más fácil.

Referencias: http://struts.apache.org/

Struts2 sigue el patrón **MVC (Modelo-Vista-Controlador)**, solo que a los controladores los llama *Acciones* (Actions). Las acciones son "como los Servlets" que hemos visto. Vamos a crear una que nos diga "¡Hola Mundo!".

1. Crea el fichero <dir_proyecto>/src/Accion1.java. Fíjate en los comentarios para enterder lo que hace.
2. Compila Accion1:
	1. Struts2 necesita varias librerías. Así que primero crea el directorio <dir_proyecto>/webapps/HolaMundoStruts2/WEB-INF/lib y descarga en él las siguientes librerías (archivos .jar): struts2-core, ognl, commons-fileupload, commons-io, commons-lang3, freemarker, javaassist, log4j-api y log4j-core. Y asegúrate de que son las versiones compatibles respectivamente... Como esto es un petardo, la próxima vez utilizaremos **maven** para que haga el trabajo duro.
	2. Compila Accion1 con el comando "javac -classpath <dir_proyecto>/webapps/HolaMundoStruts2/WEB-INF/lib/\* Accion1.java". Aparecerá Accion1.class.	
3. Crea el directorio <dir_proyecto>/webapps/HolaMundo_Struts2/WEB-INF/classes y mueve Accion1.class al directorio que acabas de crear.
4. Crea el fichero <dir_proyecto>/webapps/HolaMundoStruts2/index.html.
5. Crea el fichero <dir_proyecto>/webapps/HolaMundoStruts2/jsp/pag1.jsp.
6. Crea el fichero <dir_proyecto>/webapps/HolaMundoStruts2/web.xml.
7. Crea el fichero <dir_proyecto>/webapps/HolaMundoStruts2/WEB-INF/classes/struts.xml.
8. Crea el fichero <dir_proyecto>/webapps/HolaMundoStruts2/WEB-INF/classes/logging.properties.
9. Publica el Proyecto: Para ello, copia <dir_proyecto>/webapps/HolaMundoStruts2 al directorio **<dir_tomcat>/webapps/**.
10. Reinicia Apache Tomcat. Para ello, desde el directorio <dir_tomcat>/bin lanza los comandos ./shutdown.sh y ./startup.sh.
11. Comprueba el funcionamiento del Servlet navegando a la URL **http://localhost:8080/HolaMundoStruts2**. Debe aparecer el mensaje la página de bienvenida que has creado.

