package ar.peninsula.valdes.animal;
public abstract class Animal implements Comparable<Animal> {

	protected int periodoCrecimiento;
	protected float promedioCrecimientoAnual;
	protected String nombre;
	protected float tamanioInicial;
	protected float tamanioActual;

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
			tamanio = getAnios(edadMeses) * this.getPromedioCrecimientoAnual();
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


	@Override
	public int compareTo(Animal animal2) {

		if(this.tamanioActual == animal2.tamanioActual){
			return 0;
		}else if(this.tamanioActual < animal2.tamanioActual){
			return -1;
		}else {
			return 1;
		}

	}

	public float getTamanioInicial() {
		return tamanioInicial;
	}

	public void setTamanioInicial(float tamanioInicial) {
		this.tamanioInicial = tamanioInicial;
	}

	public float getTamanioActual() {
		return tamanioActual;
	}

	public void setTamanioActual(float tamanioActual) {
		this.tamanioActual = tamanioActual;
	}

}
