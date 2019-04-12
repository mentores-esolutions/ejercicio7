package ar.peninsula.valdes.animal;

import ar.peninsula.valdes.ecosistema.Acuatico;
import ar.peninsula.valdes.reproduccion.Viviparo;

public class Delfin extends Viviparo implements Acuatico {


        static final float VELOCIDAD_AGUA = 8;

    public Delfin(String nombre, int periodoCrecimiento, float promedioCrecimientoAnual, int tiempoGestacion) {
        super(nombre, periodoCrecimiento, promedioCrecimientoAnual, tiempoGestacion);
    }

    @Override
    public float desplazarse(int tiempoMinuto){
        return nadar(tiempoMinuto);
    }

    @Override
    public void calcularTamanio(int edadMeses) {

    }

    @Override
    public float nadar(int tiempoMinuto) {
        return (VELOCIDAD_AGUA/60)*tiempoMinuto;
    }
}
