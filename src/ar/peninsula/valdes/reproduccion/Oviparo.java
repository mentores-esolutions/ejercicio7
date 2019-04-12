package ar.peninsula.valdes.reproduccion;
import ar.peninsula.valdes.animal.Animal;

public abstract class Oviparo extends Animal {
	/*
	 * Un ovíparo es un animal que nace a partir de un huevo dejado por la
	 * madre. Son animales ovíparos muchos insectos, peces, anfibios y reptiles.
	 * También lo son todas las aves. Entre los animales mamíferos, únicamente
	 * son ovíparos el ornitorrinco y los equidnas.
	 */

	private int tiempoIncubacion;

	public Oviparo(String nombre, int periodoCrecimiento, float promedioCrecimientoAnual, int tiempoIncubacion) {
		super(nombre, periodoCrecimiento, promedioCrecimientoAnual);
		this.tiempoIncubacion = tiempoIncubacion;
	}
	
	public int getTiempoIncubacion() {
		return tiempoIncubacion;
	}

	public void setTiempoIncubacion(int tiempoIncubacion) {
		this.tiempoIncubacion = tiempoIncubacion;
	}
	
	public boolean estaIncubando (int edadMeses) {
		if(tiempoIncubacion<edadMeses) {
			return false;
		}
		else {
			return true;	
		}
	}
}