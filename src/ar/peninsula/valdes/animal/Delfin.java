package ar.peninsula.valdes.animal;

import ar.peninsula.valdes.ecosistema.Acuatico;
import ar.peninsula.valdes.reproduccion.Viviparo;

public class Delfin extends Viviparo implements Acuatico  {

        private static final float VELOCIDAD_PROMEDIO_KMH = 8;


    public Delfin(String nombre, int periodoCrecimiento, float promedioCrecimientoAnual, int tiempoGestacion, float tamanioInicial) {
        super(nombre, periodoCrecimiento, promedioCrecimientoAnual, tiempoGestacion);
        this.tamanioInicial=tamanioInicial;
    }

    @Override
    public float nadar(int tiempoMinuto) {

        return  (VELOCIDAD_PROMEDIO_KMH*tiempoMinuto)/60;
    }

    @Override
    public float desplazarse(int tiempoMinuto) {
        return nadar(tiempoMinuto);
    }

    @Override
    public void calcularTamanio(int edadMeses) {
        if(super.estaGestando(edadMeses)){
            tamanioActual =0;
        }else {
             int tiempoVida = edadMeses - getTiempoGestacion();
            if(getPeriodoCrecimiento() < tiempoVida){
                tamanioActual = tamanioInicial + getTamanio(getPeriodoCrecimiento());
            }
            else {
                tamanioActual =tamanioInicial+getTamanio(tiempoVida);
            }
        }
    }
}
