# Login
Vamos a utilizar NetBeans para facilitarnos el trabajo. NetBeans es un IDE para desarrollo de proyectos Java (sobre todo Java, pero también vale para PHP y C).

1. Descarga e instala NetBeans. http://netbeans.org.
2. Primero vamos a configurar el Servidor de Aplicaciones. Para ello:
	1. Edita el fichero <dir_tomcat>/conf/tomcat.users.xml y dentro del elemento <tomcat-users> incluye las siguientes líneas:
	
		<role rolename="manager-gui"/>
		<user password="tomcat" roles="manager-gui,manager-script,admin" username="tomcat"/>
	
	Naturalmente puedes poner el nombre de usuario y la clave que quieras.
	
	2. En NetBeans, ve al menú Tools > Servers y pulsa "Add Server" y completa los datos de configuración de tu Apache Tomcat.

3. Ahora creamos el proyecto en Netbeans. Ve al menú File > New Project y elige la categoría "Maven". Y dentro de ella un proyecto de tipo "Web Application". Elige el nombre del proyecto y el directorio en el que se instalará el código (que, para nosotros, será <dir_proyecto>). Elige el Servidor de Aplicaciones Apache Tomcat que acabamos de configurar. Verás que NetBeans ha creado en <dir_proyecto> un fichero pom.xml y un directorio src con la estructura que utiliza Maven, incluyendo main/java/... y main/webapp.

4. Podríamos añadir (en las propiedades del proyecto) el framework de Struts. Pero la versión es bastante vieja (1.3). Así que lo haremos con Maven. Editamos el pom.xml (o con NetBeans) y añadimos las dependencias que necesitamos para Struts2 y Log4j.

5. Crea la página <dir_proyecto>/src/main/webapp/WEB-INF/jsp/login.jsp. Para ello, crea primero en NetBeans los directorios y luego, botón de la derecha sobre el proyecto, New > JSP. Crearemos los jsp en el directorio WEB-INF para que no sean directamente accesibles. NetBeans abre la plantilla de JSP que acaba de crear y la modificamos para incluir nuestro formulario de login.

6. Utiliza los tags de Struts. Queremos que nuestro formulario de login se envíe a la accion login (que programaremos). Y queremos que le llegue un JavaBean con los campos que ha introducido el usuario. Así que utilizaremos los tags de Struts:
	1. Añade **<%@ taglib prefix="s" uri="/struts-tags" %>** al principio de la página para asociar el espacio de nombres con los tags-html de Struts.
	2. Añade en pom.xml la dependencia para los tags de Struts2.
	3. En lugar de <form> utiliza **<s:form action="/login">**.
	4. En lugar de los <input type...> utiliza **<s:textfield property="nombre" />** **<s:password...>**.
	5. En lugar del <submit> utiliza **<s:submit>**.

7. Crea LoginFormBean en <dir_proyecto>/src/main/java/es/escueladeprogramacion/struts2login/LoginFormBean.java que será el bean que recibirá los datos del formulario.

8. Crea LoginAction en <dir_proyecto>/src/main/java/es/escueladeprogramacion/struts2login/LoginFormAction.java que será la acción.

9. Crear el fichero <dir_proyecto>/src/main/resources/struts.xml y el <dir_proyecto>/src/main/webapp/WEB-INF/web.xml.

10. Y por último crea las vistas <dir_proyecto>/src/main/webapp/index.html, <dir_proyecto>/src/main/webapp/WEB-INF/jsp/menuPpal.jsp.

11. Ya puedes ejecutar el proyecto.
	
	
	
	
Usar Message Resource con Login.properties
