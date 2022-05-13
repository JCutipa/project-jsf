/**
 * 
 */
package com.devjose.projectjsf.controllers;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import com.devjose.projectjsf.dto.UsuarioDTO;

/**
 * @author Jose Cutipa
 * Clase que se encarga de mantener la informacion del usuario que ingresa al aplicativo en sesion
 */

@ManagedBean
@SessionScoped
public class SessionController {
	
	/**
	 * usuario que se mantendra en sesion
	 */
	
	private UsuarioDTO usuarioDTO;
	
	/**
	 * Inicializa la sesion del usuario
	 */
	
	@PostConstruct
	public void init() {
		System.out.println("cargando informacion del usuario en sesion... ");
		
	}

	/**
	 * @return the usuarioDTO
	 */
	public UsuarioDTO getUsuarioDTO() {
		return usuarioDTO;
	}

	/**
	 * @param usuarioDTO the usuarioDTO to set
	 */
	public void setUsuarioDTO(UsuarioDTO usuarioDTO) {
		this.usuarioDTO = usuarioDTO;
	}

}
