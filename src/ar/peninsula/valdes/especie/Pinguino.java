package ar.peninsula.valdes.especie;

import ar.peninsula.valdes.ecosistema.Acuatico;
import ar.peninsula.valdes.ecosistema.Terrestre;
import ar.peninsula.valdes.reproduccion.Oviparo;

/**
 * Created by Cristian_Arias on 10/4/2019.
 */
public class Pinguino extends Oviparo implements Acuatico, Terrestre {

    public static int velocidad_desplazamiento_agua = 12;
    public static int velocidad_desplazamiento_tierra = 4;

    public Pinguino(String nombre, int periodoCrecimiento, float promedioCrecimientoAnual, int tiempoIncubacion, int velocidad_desplazamiento_agua,
                    int velocidad_desplazamiento_tierra) {
        super(nombre, periodoCrecimiento, promedioCrecimientoAnual, tiempoIncubacion);
    }

    @Override
    public float caminar(int tiempoMinuto) {

        return tiempoMinuto * velocidad_desplazamiento_tierra / 60;
    }

    @Override
    public float nadar(int tiempoMinuto) {

        return tiempoMinuto * velocidad_desplazamiento_agua / 60;
    }

    @Override
    public float desplazarse(int tiempoMinuto) {
        return nadar(tiempoMinuto) * 0.3f + caminar(tiempoMinuto) * 0.7f;
    }

    @Override
    public void calcularTamanio(int edadMeses) {

    }
}
