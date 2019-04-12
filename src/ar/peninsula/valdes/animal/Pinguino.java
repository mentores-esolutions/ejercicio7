package ar.peninsula.valdes.animal;

import ar.peninsula.valdes.ecosistema.Acuatico;
import ar.peninsula.valdes.ecosistema.Terrestre;
import ar.peninsula.valdes.reproduccion.Oviparo;

public class Pinguino extends Oviparo implements Acuatico, Terrestre{
	private static float velPromAgua;
	private static float velPromTierra;
	
	public Pinguino(String nombre, int periodoCrecimiento, float promedioCrecimientoAnual, int tiempoIncubacion, float velPromAgua, float velPromTierra) {
		super(nombre, periodoCrecimiento, promedioCrecimientoAnual, tiempoIncubacion);
		
		this.velPromAgua= velPromAgua;
		this.velPromTierra= velPromTierra;
	}

	@Override
	public float caminar(int tiempoMinuto) {
		float tiempoCaminar= (tiempoMinuto*70)/100; 
		float despCaminar= tiempoCaminar*velPromTierra;
		return despCaminar;
		
	}

	@Override
	public float nadar(int tiempoMinuto) {
		float tiempoNadar= (tiempoMinuto*30)/100; 
		float despNadar= tiempoNadar*velPromAgua;
		return despNadar;
	}

	@Override
	public float desplazarse(int tiempoMinuto) {
	float desplazamientoTotal= this.nadar(tiempoMinuto) + this.caminar(tiempoMinuto);
		
	return desplazamientoTotal;
	}

	@Override
	public void calcularTamanio(int edadMeses) {
		// TODO Auto-generated method stub
		
	}

	public float getVelPromAgua() {
		return velPromAgua;
	}

	public void setVelPromAgua(float velPromAgua) {
		this.velPromAgua = velPromAgua;
	}

	public float getVelPromTierra() {
		return velPromTierra;
	}

	public void setVelPromTierra(float velPromTierra) {
		this.velPromTierra = velPromTierra;
	}

	
}
