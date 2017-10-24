/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.escueladeprogramacion.struts2login;

/**
 *
 * @author mjaque
 */
public class LoginFormBean {
    private String nombre;
    private String clave;
    private String error;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    @Override
    public String toString() {
        return "LoginFormBean{" + "nombre=" + nombre + ", clave=" + clave + ", error=" + error + '}';
    }
    
    
}
