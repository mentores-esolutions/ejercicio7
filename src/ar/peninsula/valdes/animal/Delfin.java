package ar.peninsula.valdes.animal;

import ar.peninsula.valdes.ecosistema.Acuatico;
import ar.peninsula.valdes.reproduccion.Viviparo;

public class Delfin extends Viviparo implements Acuatico {

	public Delfin(String nombre, int periodoCrecimiento, float promedioCrecimientoAnual, int tiempoGestacion) {
		super(nombre, periodoCrecimiento, promedioCrecimientoAnual, tiempoGestacion);
		// TODO Auto-generated constructor stub
	}

	@Override
	public float desplazarse(int tiempoMinuto) {
		// Velocidad promedio desplazamiento en agua = 8 km/h
		return nadar(tiempoMinuto);
	}

	@Override
	public void calcularTamanio(int edadMeses) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public float nadar(int tiempoMinuto) {
		float velocidad = 8;
		float tiempoDesplazamiento= (tiempoMinuto * velocidad)/60;
		return tiempoDesplazamiento;
	}

	

}
