package ar.peninsula.valdes.animal;

import java.text.DecimalFormat;


import ar.peninsula.valdes.ecosistema.Acuatico;
import ar.peninsula.valdes.ecosistema.Terrestre;
import ar.peninsula.valdes.reproduccion.Oviparo;

public class Pinguino extends Oviparo implements Acuatico, Terrestre {

	public float  velocidadAgua, velocidadTierra; 
	public Pinguino(String nombre, int periodoCrecimiento, float promedioCrecimientoAnual, float tamanio, int tiempoIncubacion, int velocidadAgua, int velocidadTierra) {
		super(nombre, periodoCrecimiento, promedioCrecimientoAnual,tamanio, tiempoIncubacion);
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
		DecimalFormat formato = new DecimalFormat("0.00");
		if (!super.estaIncubando(edadMeses)) 
		{
			calcularTamaño(edadMeses);
			System.out.println("El tamaño de un Pinguino de "+edadMeses+" meses es:"+ formato.format(tamanio)+" metros.");
		}
		else 
		{
			tamanio=0;
			System.out.println("El tamaño del Pinguino no se puede definir porque esta incubando con " + edadMeses + " meses de edad.");
		}
		
	}

	public float calcularTamaño (int edadMeses) {
		//float crecimientoMesual=promedioCrecimientoAnual/12;
		//tamanio=0.7f+(crecimientoMesual*(edadMeses - getTiempoIncubacion()));
		tamanio=getTamanio(edadMeses);
		setTamanio(tamanio);
		return tamanio;
		
	}
	public float getVelocidadAgua() {
		return velocidadAgua;
	}

	public void setVelocidadAgua(float velocidadAgua) {
		this.velocidadAgua = velocidadAgua;
	}

	public float getVelocidadTierra() {
		return velocidadTierra;
	}

	public void setVelocidadTierra(float velocidadTierra) {
		this.velocidadTierra = velocidadTierra;
	}


	@Override
	public float caminar(int tiempoMinuto) {
		float tiempoDesplazamiento= (tiempoMinuto * velocidadTierra)/60;
		return tiempoDesplazamiento;
	}






}
