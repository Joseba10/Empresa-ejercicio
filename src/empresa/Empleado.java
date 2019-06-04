package empresa;

public abstract class Empleado extends Persona {

	private int codEmpleado;
	private static int numEmpleados = 0;
	private double sueldo;

	public Empleado(String nombre, String apellido, int edad, Dni dni, double sueldo) {
		super(nombre, apellido, edad, dni);

		this.sueldo = sueldo;

		numEmpleados++;
		this.codEmpleado = numEmpleados;

	}

	void Empleado() {
	
		numEmpleados++;
		this.codEmpleado=numEmpleados;
	}

	// Metodos

	void trabajar() {

	}

	public double obtenersueldo() {

		return sueldo;
	}

//Metodo GETTER

	public int getCodEmpleado() {
		return codEmpleado;
	}

	@Override
	public String toString() {
		return "Empleado [codEmpleado=" + codEmpleado + ", numEmpleados=" + numEmpleados + "Nombre "+getNombre()+ " Apellido "+ getApellido()+" Edad "+getEdad()+" , sueldo=" + sueldo + "]";
	}

}
