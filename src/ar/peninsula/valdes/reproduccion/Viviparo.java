package ar.peninsula.valdes.reproduccion;

import ar.peninsula.valdes.animal.Animal;

public abstract class Viviparo extends Animal {
	/*
	 * Se llama vivíparo a todo aquel animal cuyo embrión se desarrolla, después
	 * de la fecundación, en una estructura especializada dentro del vientre de
	 * la hembra
	 * 
	 */

	private int tiempoGestacion;

	public Viviparo(String nombre, int periodoCrecimiento, float promedioCrecimientoAnual, int tiempoGestacion) {
		super(nombre, periodoCrecimiento, promedioCrecimientoAnual);
		this.tiempoGestacion = tiempoGestacion;
	}

	public int getTiempoGestacion() {
		return tiempoGestacion;
	}

	public void setTiempoGestacion(int tiempoGestacion) {
		this.tiempoGestacion = tiempoGestacion;
	}

}