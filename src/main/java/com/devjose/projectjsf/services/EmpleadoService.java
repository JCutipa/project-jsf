/**
 * 
 */
package com.devjose.projectjsf.services;

import java.util.ArrayList;
import java.util.List;

import com.devjose.projectjsf.entity.Empleado;

/**
 * @author Jose Cutipa
 * Clase que permite realizar la logica del negocio para base ded datos
 */
public class EmpleadoService {
	
	/*
	 * metodo que permite consultar la lista de empleados de empresas de TI
	 * @return {
	 */
	
	public List<Empleado> consultarEmpleados() {
		
		//generar la lista de empleados a consultar
		List<Empleado> empleados = new ArrayList<Empleado>();
		
		Empleado empleadoIBM=  new Empleado();
		Empleado empleadoMicrosoft = new Empleado();
		Empleado empleadoApple = new Empleado();
		
		empleadoIBM.setNombre("Jose");
		empleadoIBM.setPrimerApellido("cutipa");
		empleadoIBM.setSegundoApellido("tarazona");
		empleadoIBM.setPuesto("Senior Developer Java");
		empleadoIBM.setEstatus(true);
		
		empleadoMicrosoft.setNombre("Diego");
		empleadoMicrosoft.setPrimerApellido("utipa");
		empleadoMicrosoft.setSegundoApellido("arazona");
		empleadoMicrosoft.setPuesto("Senior Developer Python");
		empleadoMicrosoft.setEstatus(true);
		
		empleadoApple.setNombre("Pablo");
		empleadoApple.setPrimerApellido("ipa");
		empleadoApple.setSegundoApellido("azona");
		empleadoApple.setPuesto("CEO");
		empleadoApple.setEstatus(true);
		
		empleados.add(empleadoIBM);
		empleados.add(empleadoMicrosoft);
		empleados.add(empleadoApple);
		
		return empleados;
		
		
	}

}
