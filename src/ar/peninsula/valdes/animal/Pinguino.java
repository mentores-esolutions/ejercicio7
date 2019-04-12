package ar.peninsula.valdes.animal;

import ar.peninsula.valdes.ecosistema.Acuatico;
import ar.peninsula.valdes.ecosistema.Terrestre;
import ar.peninsula.valdes.reproduccion.Oviparo;

public class Pinguino extends Oviparo implements Acuatico, Terrestre {



	private float velocidadAgua;
	private float velocidadTierra;
	private float tamaño;

	public Pinguino(String nombre, int periodoCrecimiento, float promedioCrecimientoAnual, int tiempoIncubacion,
			float velocidadAgua, float velocidadTierra) {
		super(nombre, periodoCrecimiento, promedioCrecimientoAnual, tiempoIncubacion);
		this.velocidadAgua = velocidadAgua;
		this.velocidadTierra = velocidadTierra;
		
	}
	
	@Override
	public float caminar(int tiempoMinuto) {
		// TODO Auto-generated method stub
		float kilometros= ((velocidadTierra*tiempoMinuto)/60)*0.7f;
		return kilometros;
	}

	@Override
	public float nadar(int tiempoMinuto) {
		// TODO Auto-generated method stub
		float kilometros= ((velocidadAgua*tiempoMinuto)/60)*0.3f;
		return kilometros;
	}

	@Override
	public float desplazarse(int tiempoMinuto) {
		// TODO Auto-generated method stub
		return (nadar(tiempoMinuto)+caminar(tiempoMinuto));
	}

	@Override
	public void calcularTamanio(int edadMeses) {
		// TODO Auto-generated method stub
		if (!super.estaIncubando(edadMeses)) {
			 this.tamaño = super.getTamanio(edadMeses);
			 
			 
		}
		else {
			this.tamaño=0;
		}
	}

	public float getTamaño() {
		return tamaño;
	}

	public void setTamaño(float tamaño) {
		this.tamaño = tamaño;
	}
	


}
