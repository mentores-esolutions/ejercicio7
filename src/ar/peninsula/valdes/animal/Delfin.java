package ar.peninsula.valdes.animal;

import java.text.DecimalFormat;

import ar.peninsula.valdes.ecosistema.Acuatico;
import ar.peninsula.valdes.reproduccion.Viviparo;

public class Delfin extends Viviparo implements Acuatico {

	public float tamanio;
	public Delfin(String nombre, int periodoCrecimiento, float promedioCrecimientoAnual,float tamanio, int tiempoGestacion) {
		super(nombre, periodoCrecimiento, promedioCrecimientoAnual,tamanio, tiempoGestacion);
	}

	@Override
	public float desplazarse(int tiempoMinuto) {
		// Velocidad promedio desplazamiento en agua = 8 km/h
		return nadar(tiempoMinuto);
	}

	@Override
	public void calcularTamanio(int edadMeses) {
		// TODO Auto-generated method stub
		//a.	En cada método hay que considerar que si la edad es menor al tiempo de 
		//incubación/gestación el tamaño debe ser cero. Caso contrario calcular el
		//tamaño según la proporción de crecimiento anual
		DecimalFormat formato = new DecimalFormat("0.00");
		
		
		if (!super.estaGestando(edadMeses)) 
		{
			calcularTamaño(edadMeses);
			System.out.println("El tamaño de un delfin de "+edadMeses+" meses es:"+ formato.format(tamanio)+" metros.");
		}
		else 
		{
			tamanio=0;
			setTamanio(tamanio);
			System.out.println("El tamaño del delfin no se puede definir porque esta gestandose con " + edadMeses + " meses de edad.");
		}
		
		
	}
	
	
	public float calcularTamaño (int edadMeses) {
		//float crecimientoMesual=promedioCrecimientoAnual/12;
		//tamanio=0.7f+(crecimientoMesual*(edadMeses - getTiempoGestacion()));
		tamanio=getTamanio(edadMeses);
		setTamanio(tamanio);
		return tamanio;
		
	}


	@Override
	public float nadar(int tiempoMinuto) {
		float velocidad = 8;
		float tiempoDesplazamiento= (tiempoMinuto * velocidad)/60;
		return tiempoDesplazamiento;
	}



	

}
