package ar.peninsula.valdes.animal;

public abstract class Animal  {

	protected int periodoCrecimiento;
	protected float promedioCrecimientoAnual;
	protected String nombre;
    protected float tamanio;
	public Animal(String nombre, int periodoCrecimiento, float promedioCrecimientoAnual,float tamanio) {
		this.nombre = nombre;
		this.periodoCrecimiento = periodoCrecimiento;
		this.promedioCrecimientoAnual = promedioCrecimientoAnual;
		this.tamanio=tamanio;
	}

	public float getTamanio(int edadMeses) {
		
		if (getAnios(edadMeses) > this.getPeriodoCrecimiento()) {
			this.tamanio = this.getPeriodoCrecimiento() * this.getPromedioCrecimientoAnual();
			setTamanio(tamanio);
			
		} else {
			this.tamanio = getAnios(edadMeses) * this.getPromedioCrecimientoAnual();
			setTamanio(tamanio);
		}
		return this.tamanio;
	}
	
	public float getTamanio() {
		return tamanio;
	}

	public void setTamanio(float tamanio) {
		this.tamanio=tamanio;
	}
	
	
	public abstract float desplazarse(int tiempoMinuto);


	public abstract void calcularTamanio(int edadMeses);
	
	public abstract float calcularTamaño (int edadMeses);

	
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

	@Override
	public String toString() {
		return "Animal [nombre=" + nombre + ", tamanio=" + tamanio + "]";
	}
	
}
