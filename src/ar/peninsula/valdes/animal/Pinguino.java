package ar.peninsula.valdes.animal;

import ar.peninsula.valdes.ecosistema.Acuatico;
import ar.peninsula.valdes.ecosistema.Terrestre;
import ar.peninsula.valdes.reproduccion.Oviparo;

public class Pinguino extends Oviparo implements Terrestre, Acuatico  {
	

	public int velocidadEnAgua= 12;
	public int velocidadEnTierra = 4;
	

	
	public Pinguino(String nombre, int periodoCrecimiento, float promedioCrecimientoAnual, int tiempoIncubacion, int velocidadEnAgua, int velocidadEnTierra) {
		super(nombre, periodoCrecimiento, promedioCrecimientoAnual, tiempoIncubacion);
		this.velocidadEnAgua=velocidadEnAgua;
		this.velocidadEnTierra=velocidadEnTierra;
	}
	public int getVelocidadEnAgua() {
		return velocidadEnAgua;
	}
	public void setVelocidadEnAgua(int velocidadEnAgua) {
		this.velocidadEnAgua = velocidadEnAgua;
	}
	public int getVelocidadEnTierra() {
		return velocidadEnTierra;
	}
	public void setVelocidadEnTierra(int velocidadEnTierra) {
		this.velocidadEnTierra = velocidadEnTierra;
	}
	@Override
	public float caminar(int tiempoMinuto) {
		float setenta = ((tiempoMinuto*70)/100);

		return setenta;
	}
	@Override
	public float desplazarse(int tiempoMinuto) {
		
		return caminar(tiempoMinuto) + nadar(tiempoMinuto);
	}
	@Override
	public void calcularTamanio(int edadMeses) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public float nadar(int tiempoMinuto) {
		float treinta = ((tiempoMinuto*30)/100);
		return treinta;
	}
	@Override
	public boolean estaGestando() {
		// TODO Auto-generated method stub
		return false;
	}
	
	

}
