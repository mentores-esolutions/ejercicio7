package ar.peninsula.valdes.animal;

import ar.peninsula.valdes.ecosistema.Acuatico;
import ar.peninsula.valdes.reproduccion.Viviparo;

public class Delfin extends Viviparo implements Acuatico {
	
	
	public static final float velocidadPromedio=8;
	
	public Delfin(String nombre, int periodoCrecimiento, float promedioCrecimientoAnual, int tiempoGestacion) {
		super(nombre, periodoCrecimiento, promedioCrecimientoAnual, tiempoGestacion);
	}
	
	@Override
	public float nadar(int tiempoMinuto) {
		float n=0;
		
		return n;
	}
	
	@Override
	public float desplazarse(int tiempoMinuto) {
		
		float calculo= (tiempoMinuto * velocidadPromedio) / 100;
		return calculo;
	}
	
	@Override
	public void calcularTamanio(int edadMeses) {
	
		
	}

	@Override
	public boolean estaIncubando() {
		// TODO Auto-generated method stub
		return false;
	}
	
	

}
