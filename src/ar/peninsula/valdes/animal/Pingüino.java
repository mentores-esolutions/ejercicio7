package ar.peninsula.valdes.animal;

import ar.peninsula.valdes.ecosistema.Acuatico;
import ar.peninsula.valdes.ecosistema.Terrestre;
import ar.peninsula.valdes.reproduccion.Oviparo;

public class Pingüino extends Oviparo implements Terrestre, Acuatico {

    static final float VELOCIDAD_AGUA = 12;
    static final float VELOCIDAD_TIERRA = 4;

    public Pingüino(String nombre, int periodoCrecimiento, float promedioCrecimientoAnual, int tiempoIncubacion) {
        super(nombre, periodoCrecimiento, promedioCrecimientoAnual, tiempoIncubacion);
    }

    @Override
    public float nadar(int tiempoMinuto) {

        return (VELOCIDAD_AGUA/60)*(tiempoMinuto*0.3f);
    }

    @Override
    public float caminar(int tiempoMinuto) {

        return (VELOCIDAD_TIERRA/60)*(tiempoMinuto*0.7f);
    }

    @Override
    public float desplazarse(int ditanciaKM) {

        return caminar(ditanciaKM)+nadar(ditanciaKM);
    }

    @Override
    public void calcularTamanio(int edadMeses) {

    }
}
