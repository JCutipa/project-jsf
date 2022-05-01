/**
 * 
 */
package com.devjose.projectjsf.controllers;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import com.devjose.projectjsf.entity.Empleado;
import com.devjose.projectjsf.services.EmpleadoService;

/**
 * @author Jose Cutipa
 *Clase controller que se encarga de procesar la informacion para la pantalla principal
 */
@ManagedBean
@ViewScoped
public class PrincipalController {
	/**
	 * Lista de empleados para la tabla
	 */
	private List<Empleado> empleados;
	
	/**
	 * Servicio con los metodos que realizan la logica de negocio de empleados..
	 */
	
	private EmpleadoService empleadoService = new EmpleadoService();
	
	
	/**
	 * metodo que se encarga de inicializar la informacion de la pantalla principal
	 */
	@PostConstruct
	public void init() {
		this.consultarEmpleado();
		
	}
	/**
	 * metodo que consulta la lista de empleados.
	 */
	
	public void consultarEmpleado() {
		
		this.empleados=this.empleadoService.consultarEmpleados();
		
	}

	/**
	 * @return the empleados
	 */
	public List<Empleado> getEmpleados() {
		return empleados;
	}

	/**
	 * @param empleados the empleados to set
	 */
	public void setEmpleados(List<Empleado> empleados) {
		this.empleados = empleados;
	}

}
