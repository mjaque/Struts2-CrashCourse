# Aplicación Tomcat
Vamos a crear una aplicación en Tomcat. Aunque solo tendrá una simple página HTML.

Referencia: http://tomcat.apache.org/

1. Instala el **Servidor de Aplicaciones Apache Tomcat**: Ahora mismo (2017) está en https://tomcat.apache.org/download-80.cgi. Pero si no aparece busca "Apache Tomcat download". Bájalo y descomprímelo en un directorio (que llamaremos <dir_tomcat>).
2. **Arranca Apache Tomcat**: Desde el directorio <dir_tomcat>/bin ejecuta el comando "./startup.sh" (en Linux). Si usas Windows... piénsatelo. 
3. **Comprueba Apache Tomcat**: Conéctate con tu navegador a la URL http://localhost:8080. Debe aparecer la página de inicio de Apache Tomcat.
4. **Crea un Proyecto en Apache Tomcat**: Para ello, 
	1. En <dir_tomcat>/webapps crea un directorio con el nombre "HolaMundo".
	2. Crea el fichero <dir_proyecto>/HolaMundo/index.html (tendrás que crear los directorios correspondientes). Haz una página HTML bonita :)
	4. Copia el directorio <dir_proyecto>/tomcat/webapps/HolaMundo a <dir_tomcat>/webapps.
	5. Reinicia Apache Tomcat. Para ello, desde el directorio <dir_tomcat>/bin lanza los comandos ./shutdown.sh y ./startup.sh.
	6. Con el navegador, ve a la URL http://localhost:8080/EjemploHTML. Debes ver tu página index.html.
