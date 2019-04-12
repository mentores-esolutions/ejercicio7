package ar.peninsula.valdes.especie;

import ar.peninsula.valdes.ecosistema.Acuatico;
import ar.peninsula.valdes.reproduccion.Viviparo;

/**
 * Created by Cristian_Arias on 10/4/2019.
 */
public class Delfin extends Viviparo implements Acuatico{// se debe implementar los metodos abstract de la clase viviparo, obligatoriamente. Implementa la interfaz acuatico, es similar a la herencia

    public static final int VELOCIDAD_DESPLAZAMIENTO = 8; //

    public Delfin(String nombre, int periodoCrecimiento, float promedioCrecimientoAnual, int tiempoGestacion) {
        super(nombre, periodoCrecimiento, promedioCrecimientoAnual, tiempoGestacion);
    }
    @Override
    public float desplazarse(int tiempoMinuto) {
       return nadar(tiempoMinuto);     }

    @Override
    public void calcularTamanio(int edadMeses) {

    }

    @Override
    public float nadar(int tiempoMinuto) {
        return tiempoMinuto * VELOCIDAD_DESPLAZAMIENTO / 60;
    }
}
