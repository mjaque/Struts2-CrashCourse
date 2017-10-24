package es.escueladeprogramacion.acciones;

import com.opensymphony.xwork2.ActionSupport;

public class Accion1 extends ActionSupport{
//Accion1 deriva de la clase general de Struts2 de Acciones (ActionSupport)
//Ref: https://struts.apache.org/maven/struts2-core/apidocs/com/opensymphony/xwork2/ActionSupport.html

	private static final long serialVersionUID = 1L;	//Es serializable
	
	private String mensaje = "¡Hola Mundo!";
	
	static{
		System.out.println("TRON: Se ha instanciado la clase Accion1");
	}

	@Override
	//Método que, por defecto (CoC) se llama para ejecutar la acción
	public String execute() throws Exception {
		return SUCCESS;	//Constante de ActionSupport
	}
   
	public String getMensaje() {
		System.out.println("TRON: Accion1.getMensaje().");
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
}

