/**
 * 
 */
package com.devjose.projectjsf.controllers;

import java.io.IOException;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;

/**
 * @author Jose Cutipa
 * Clase que se encarga de cerrar la sesion del usuario
 *
 */
@ManagedBean
public class SesionClosedController {
	
	@PostConstruct
	public void init() {
		System.out.println("cerrar sesion..");
		
	}
	/**
	 * metodo que permite cerrar la sesion del usuaruio y regresar a la pantalla de login.
	 */
	public void cerrarSesion() {
		
		ExternalContext externalContext = FacesContext.getCurrentInstance().getExternalContext();
		externalContext.invalidateSession();
		
		try {
			this.redireccionar("login.xhtml");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
			
	}
	/**
	 * metodo que permite redireccionar a una pantalla
	 * @param pagina {@link String} pagina a redireccionarse
	 * @throws IOException Excepcion en caso de error al encontrar la pagina.
	 */
	
	
	private void redireccionar(String pagina) throws IOException {
		ExternalContext ec= FacesContext.getCurrentInstance().getExternalContext();
		ec.redirect(pagina);
	}

}
