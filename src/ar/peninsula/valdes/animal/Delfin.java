package ar.peninsula.valdes.animal;

import ar.peninsula.valdes.ecosistema.Acuatico;
import ar.peninsula.valdes.reproduccion.Viviparo;

public class Delfin extends Viviparo implements Acuatico{
	public static final float velProm= 8;

	public Delfin(String nombre, int periodoCrecimiento, float promedioCrecimientoAnual, int tiempoGestacion) {
		super(nombre, periodoCrecimiento, promedioCrecimientoAnual, tiempoGestacion);
		// TODO Auto-generated constructor stub
	}

	@Override
	public float nadar(int tiempoMinuto) {
		float nadar= ((tiempoMinuto*velProm)/100);
		return nadar;
	}

	@Override
	public float desplazarse(int tiempoMinuto) {
		float desplazamiento= this.nadar(tiempoMinuto);
		return desplazamiento;
		
	}

	@Override
	public void calcularTamanio(int edadMeses) {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
	}
	
	

