package ar.peninsula.valdes.animal;

import ar.peninsula.valdes.ecosistema.Acuatico;
import ar.peninsula.valdes.reproduccion.Viviparo;

public class Delfin extends Viviparo implements Acuatico {
	
	private static final float VEL_PROM_DESPLAZAMIENTO_EN_KM_H = 8;

	public Delfin(String nombre, int periodoCrecimiento, float promedioCrecimientoAnual, int tiempoGestacion) {
		super(nombre, periodoCrecimiento, promedioCrecimientoAnual, tiempoGestacion);
		
		this.tamanioInicialMts = 0.7f;
	}

	@Override
	public float nadar(int tiempoMinuto) {
		float tiempoHs = (float) tiempoMinuto/60;
		return tiempoHs * VEL_PROM_DESPLAZAMIENTO_EN_KM_H;
	}

	@Override
	public float desplazarse(int tiempoMinuto) {
		return nadar(tiempoMinuto);
	}

	@Override
	public void calcularTamanio(int edadMeses) {
		if(estaGestando(edadMeses)){
			this.tamanioActual = 0;
		}else{
			if(edadMeses > periodoCrecimiento) {
				edadMeses = periodoCrecimiento - getTiempoGestacion();
			}
			
			this.tamanioActual = tamanioInicialMts + edadMeses * (promedioCrecimientoAnual/12);
		}
	}

}
