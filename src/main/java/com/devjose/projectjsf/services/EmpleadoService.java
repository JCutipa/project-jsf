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
		
		Empleado empleadoNeflix=  new Empleado();
		Empleado empleadoAmazon = new Empleado();
		Empleado empleadoHP = new Empleado();
		
		Empleado empleadoOracle=  new Empleado();
		Empleado empleadoDeloite = new Empleado();
		Empleado empleadoDisney = new Empleado();
		
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
		
		empleadoNeflix.setNombre("Pablo");
		empleadoNeflix.setPrimerApellido("ipa");
		empleadoNeflix.setSegundoApellido("azona");
		empleadoNeflix.setPuesto("CEO");
		empleadoNeflix.setEstatus(true);
		
		empleadoAmazon.setNombre("Pablo");
		empleadoAmazon.setPrimerApellido("ipa");
		empleadoAmazon.setSegundoApellido("azona");
		empleadoAmazon.setPuesto("CEO");
		empleadoAmazon.setEstatus(true);
		
		empleadoHP.setNombre("Pablo");
		empleadoHP.setPrimerApellido("ipa");
		empleadoHP.setSegundoApellido("azona");
		empleadoHP.setPuesto("CEO");
		empleadoHP.setEstatus(true);
		
		empleadoOracle.setNombre("Pablo");
		empleadoOracle.setPrimerApellido("ipa");
		empleadoOracle.setSegundoApellido("azona");
		empleadoOracle.setPuesto("CEO");
		empleadoOracle.setEstatus(true);
		
		empleadoDeloite.setNombre("Pablo");
		empleadoDeloite.setPrimerApellido("ipa");
		empleadoDeloite.setSegundoApellido("azona");
		empleadoDeloite.setPuesto("CEO");
		empleadoDeloite.setEstatus(true);
		
		empleadoDisney.setNombre("Pablo");
		empleadoDisney.setPrimerApellido("ipa");
		empleadoDisney.setSegundoApellido("azona");
		empleadoDisney.setPuesto("CEO");
		empleadoDisney.setEstatus(true);
		
		
		empleados.add(empleadoIBM);
		empleados.add(empleadoMicrosoft);
		empleados.add(empleadoApple);
		
		empleados.add(empleadoNeflix);
		empleados.add(empleadoAmazon);
		empleados.add(empleadoHP);
		
		empleados.add(empleadoOracle);
		empleados.add(empleadoDeloite);
		empleados.add(empleadoDisney);
		return empleados;
		
		
	}

}
