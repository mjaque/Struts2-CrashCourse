/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.escueladeprogramacion.struts2login;

import com.opensymphony.xwork2.ActionSupport;
import org.ietf.jgss.GSSException;

/**
 *
 * @author mjaque
 */
public class LoginAccion extends ActionSupport {

    private static final long serialVersionUID = 1L;
    
    private LoginFormBean loginFormBean;
    
    static{
        System.out.println("TRON: Iniciando LoginAccion");
    }

    @Override
    public String execute() throws Exception {
        System.out.println("TRON: LoginAccion.execute()");
        if (loginFormBean == null)
            return LOGIN;
        else{
            System.out.println("TRON: LoginAccion.loginFormBean.nombre = " + loginFormBean.getNombre());
            System.out.println("TRON: LoginAccion.loginFormBean = " + loginFormBean);
            return SUCCESS;
            //return ERROR;
        }
    }
    
    public LoginFormBean getLoginFormBean() {
        return loginFormBean;
    }

    public void setLoginFormBean(LoginFormBean loginFormBean) {
        this.loginFormBean = loginFormBean;
    }

}
