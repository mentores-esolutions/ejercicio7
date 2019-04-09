package ar.peninsula.valdes.animal;
public abstract class Animal {

	protected int periodoCrecimiento;
	protected float promedioCrecimientoAnual;
	protected String nombre;

	public Animal(String nombre, int periodoCrecimiento, float promedioCrecimientoAnual) {
		this.nombre = nombre;
		this.periodoCrecimiento = periodoCrecimiento;
		this.promedioCrecimientoAnual = promedioCrecimientoAnual;
	}

	public float getTamanio(int edadMeses) {
		float tamanio = 0;
		if (getAnios(edadMeses) > this.getPeriodoCrecimiento()) {
			tamanio = this.getPeriodoCrecimiento() * this.getPromedioCrecimientoAnual();
		} else {
			tamanio += getAnios(edadMeses) * this.getPromedioCrecimientoAnual();
		}
		return tamanio;
	}

	public abstract float desplazarse(int tiempoMinuto);

	public abstract void calcularTamanio(int edadMeses);

	public int getAnios(int edadMeses) {
		return edadMeses / 12;
	}
	
	public int getPeriodoCrecimiento() {
		return periodoCrecimiento;
	}

	public void setPeriodoCrecimiento(int periodoCrecimiento) {
		this.periodoCrecimiento = periodoCrecimiento;
	}

	public float getPromedioCrecimientoAnual() {
		return promedioCrecimientoAnual;
	}

	public void setPromedioCrecimientoAnual(float promedioCrecimientoAnual) {
		this.promedioCrecimientoAnual = promedioCrecimientoAnual;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
