# Struts2 con Maven
A partir de aquí utilizaremos Maven para organizar las dependencias del proyecto y para compilarlo.

Referencias: http://maven.apache.org/

1. Crea el fichero <dir_proyecto>/pom.xml. Fíjate en los comentarios para enterder lo que hace.
2. Crea el fichero <dir_proyecto>/src/main/java/es/escueladeprogramacion/acciones/Accion1.java. La estructura de directorios /src/main/java es la que espera encontrar Maven. Y hemos aprovechado para estructurar nuestro proyecto en paquetes. Revisa el contenido del fichero porque hemos hecho algunos cambios importantes.
3. Crea el directorio <dir_proyecto>/src/main/webapp. (¡En singular!) En él pondremos los ficheros que habitualmente poníamos:   páginas estáticas (index.html), directorio WEB-INF (con el fichero web.xml), directorios de jsp, de js, de css... No es necesario crear los directorios WEB-INF/classes ni WEB-INF/lib. Maven se encargará de ello.
3. Crea el fichero <dir_proyecto>/src/main/resources/struts.xml. El directorio src/main/resources es donde Maven buscará los ficheros de configuración.
4. Compila el Proyecto. Para eso, desde el <dir_proyecto> ejecuta el comando *"mvn clean package"*. Aparecerá un directorio target con un archivo con extensión *war* (Web Application Archive) y otras cosas. Puedes descomprimirlo para ver qué ha hecho Maven.
5. Publica el Proyecto: Copia el archivo war a <dir_tomcat>/webapps. (¡En plural!).
6. Reinicia Apache Tomcat. Para ello, desde el directorio <dir_tomcat>/bin lanza los comandos ./shutdown.sh y ./startup.sh. Al reiniciar, Apache Tomcat encontrará el war y lo instalará. Verás aparecer el directorio en <dir_tomcat>/webapps.
11. Comprueba el funcionamiento del Proyecto navegando a la URL **http://localhost:8080/Struts2Maven**. Debe aparecer el mensaje la página de bienvenida que has creado.

