package ar.peninsula.valdes.animal;

import ar.peninsula.valdes.ecosistema.Acuatico;
import ar.peninsula.valdes.reproduccion.Viviparo;

public class Delfin extends Viviparo implements Acuatico {

	public final static float velocidadAgua=12;
	public Delfin(String nombre, int periodoCrecimiento, float promedioCrecimientoAnual, int tiempoGestacion) {
		super(nombre, periodoCrecimiento, promedioCrecimientoAnual, tiempoGestacion);
		// TODO Auto-generated constructor stub
	}

	@Override
	public float nadar(int tiempoMinuto) {
		// TODO Auto-generated method stub
		float kilometros= (velocidadAgua*tiempoMinuto)/60;
		return kilometros;
	}

	@Override
	public float desplazarse(int tiempoMinuto) {
		// TODO Auto-generated method stub
		return nadar(tiempoMinuto);
	}

	@Override
	public void calcularTamanio(int edadMeses) {
		// TODO Auto-generated method stub
		
	}

}
