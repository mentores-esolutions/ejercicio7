package ar.peninsula.valdes.animal;

import ar.peninsula.valdes.ecosistema.Acuatico;
import ar.peninsula.valdes.ecosistema.Terrestre;
import ar.peninsula.valdes.reproduccion.Oviparo;

public class Pinguino extends Oviparo implements Acuatico, Terrestre {
	private float velDesplazamientoAguaEnKmH;
	private float velDesplazamientoTierraEnKmH;
	

	public Pinguino(String nombre, int periodoCrecimiento, float promedioCrecimientoAnual, int tiempoIncubacion,
			float velDesplAgua, float velDesplTierra) {
		super(nombre, periodoCrecimiento, promedioCrecimientoAnual, tiempoIncubacion);
		this.velDesplazamientoAguaEnKmH = velDesplAgua;
		this.velDesplazamientoTierraEnKmH = velDesplTierra;
		
		this.tamanioInicialMts = 0.1f;
	}

	@Override
	public float caminar(int tiempoMinuto) {
		return velDesplazamientoTierraEnKmH * getTiempoHs(tiempoMinuto);
	}

	@Override
	public float nadar(int tiempoMinuto) {
		return velDesplazamientoAguaEnKmH * getTiempoHs(tiempoMinuto);
	}

	private float getTiempoHs(int tiempoMinuto) {
		return (float) tiempoMinuto/60;
	}

	@Override
	public float desplazarse(int tiempoMinuto) {
		final double proporcionTiempoEnAgua = 0.3;
		
		int tiempoAgua = (int) (tiempoMinuto * proporcionTiempoEnAgua);
		int tiempoTierra = tiempoMinuto - tiempoAgua;
		
		return nadar(tiempoAgua) + caminar(tiempoTierra);
	}

	@Override
	public void calcularTamanio(int edadMeses) {
		if(estaIncubando(edadMeses)){
			this.tamanioActual = 0;
		}else{
			if(edadMeses > periodoCrecimiento) {
				edadMeses = periodoCrecimiento - getTiempoIncubacion();
			}
			
			this.tamanioActual = tamanioInicialMts + edadMeses * (promedioCrecimientoAnual/12);
		}
	}

}
