package ar.peninsula.valdes.animal;
public abstract class Animal implements Comparable<Animal> {

	protected int periodoCrecimiento;
	protected float promedioCrecimientoAnual;
	protected String nombre;
	
	protected float tamanioInicialMts;
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

	@Override
	public int compareTo(Animal a) {
		float dif = this.tamanioActual - a.tamanioActual;
		if(dif > 0){
			return 1;
		} else if(dif < 0){
			return -1;
		} else{
			return 0;
		}
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		result = prime * result + periodoCrecimiento;
		result = prime * result + Float.floatToIntBits(promedioCrecimientoAnual);
		result = prime * result + Float.floatToIntBits(tamanioActual);
		result = prime * result + Float.floatToIntBits(tamanioInicialMts);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Animal other = (Animal) obj;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		if (periodoCrecimiento != other.periodoCrecimiento)
			return false;
		if (Float.floatToIntBits(promedioCrecimientoAnual) != Float.floatToIntBits(other.promedioCrecimientoAnual))
			return false;
		if (Float.floatToIntBits(tamanioActual) != Float.floatToIntBits(other.tamanioActual))
			return false;
		if (Float.floatToIntBits(tamanioInicialMts) != Float.floatToIntBits(other.tamanioInicialMts))
			return false;
		return true;
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

	public float getTamanioActual() {
		return tamanioActual;
	}

	public void setTamanioActual(float tamanioActual) {
		this.tamanioActual = tamanioActual;
	}
}
