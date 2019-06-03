package empresa;

import java.util.Random;

public class Ingeniero extends Empleado implements ManejadorOrdenador,Arreglador{

	public Ingeniero(String nombre, String apellido, int edad, Dni dni,double sueldo) {
		super(nombre, apellido, edad, dni, sueldo);

	}
	
	
	void Ingerniero(){
		
	}


	@Override
	public void arreglar() {
		
	}

	@Override
	public void teclear() {
	
		
	}
	@Override
	public void trabajar() {
	
		
	}
	

public double obtenersueldo() {
	  double valorEntero = (int) Math.floor(Math.random()*(0-20+1)+20);
	  double nuevosueldo= sueldo*valorEntero/100;
	  
	  double sueldofinal=sueldo+nuevosueldo;
	  
	  sueldo=sueldofinal;
	
	return sueldo;
}

static void disenyar() {
}

}
