package empresa;

public abstract class Empleado extends Persona {

	private int codEmpleado;
	static int numEmpleados = 0;
	protected double sueldo;

	public Empleado(String nombre, String apellido, int edad, Dni dni, double sueldo) {
		super(nombre, apellido, edad, dni);

		this.sueldo = sueldo;

		numEmpleados++;
		this.codEmpleado = numEmpleados;

	}

	void Empleado() {
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
		return "Empleado [codEmpleado=" + codEmpleado + ", numEmpleados=" + numEmpleados + ", sueldo=" + sueldo + "]";
	}

}
