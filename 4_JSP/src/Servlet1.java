//Importamos las clases que utilizamos
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletConfig;

public class Servlet1 extends HttpServlet{
	
	@Override
	public void init(ServletConfig config) throws ServletException {
		super.init(config);
		System.out.println("Inicializando el Servlet.");
	}
	
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
		
		//Podemos obtener/calcular parámetros y ponerlos en el request para que los lea el JSP
		request.setAttribute("mensaje", "¡Hola Mundo!");
		request.setAttribute("valorEntero", 37);
		
		//Redirigimos la salida al jsp
		request.getRequestDispatcher("/jsp/pag1.jsp").forward(request, response);
	}
}