package ar.peninsula.valdes.animal;

import ar.peninsula.valdes.ecosistema.Acuatico;
import ar.peninsula.valdes.ecosistema.Terrestre;
import ar.peninsula.valdes.reproduccion.Oviparo;

public class Pinguino extends Oviparo implements Acuatico, Terrestre {

	public float  velocidadAgua, velocidadTierra; 
	public Pinguino(String nombre, int periodoCrecimiento, float promedioCrecimientoAnual, int tiempoIncubacion, int velocidadAgua, int velocidadTierra) {
		super(nombre, periodoCrecimiento, promedioCrecimientoAnual, tiempoIncubacion);
		// TODO Auto-generated constructor stub
		this.velocidadAgua=velocidadAgua;
		this.velocidadTierra=velocidadTierra;
	}

	@Override
	public float nadar(int tiempoMinuto) {
		float tiempoDesplazamiento= (tiempoMinuto * velocidadAgua)/60;
		return tiempoDesplazamiento;
	}

	@Override
	public float desplazarse(int tiempoMinuto) {
		// Velocidad desplazamiento en agua = 12 km/h 
		// Velocidad desplazamiento en tierra = 4 km/h
		float tiempoDesplazamiento= (nadar(tiempoMinuto)*0.30f)+(caminar(tiempoMinuto)*0.70f);
		return tiempoDesplazamiento;
	}

	@Override
	public void calcularTamanio(int edadMeses) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public float caminar(int tiempoMinuto) {
		float tiempoDesplazamiento= (tiempoMinuto * velocidadTierra)/60;
		return tiempoDesplazamiento;
	}

}
