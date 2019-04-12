package ar.peninsula.valdes.animal;

import ar.peninsula.valdes.ecosistema.Acuatico;
import ar.peninsula.valdes.reproduccion.Viviparo;

public class Delfin extends Viviparo implements Acuatico {

    // velocidad en Km/h
    public final static float velocidadPromedioDesplazamientoEnAgua = 8f;
    private float tamanioInicial = 0.7f;
    private float tamanio;

    public Delfin(String nombre, int periodoCrecimiento, float promedioCrecimientoAnual, int tiempoGestacion) {
        super(nombre, periodoCrecimiento, promedioCrecimientoAnual, tiempoGestacion);
    }

    public float desplazarse(int tiempoMinuto) {
        return (tiempoMinuto/60)*velocidadPromedioDesplazamientoEnAgua;
    }

    public float nadar(float kilometros) {
        return kilometros/this.velocidadPromedioDesplazamientoEnAgua;
    }

    // Ejercicio 8
    public void calcularTamanio(int edadMeses) {
        if (edadMeses < getTiempoGestacion())
            this.tamanio = 0;
        else {
            if (getAnios(edadMeses) > this.getPeriodoCrecimiento())
                this.tamanio = this.getPeriodoCrecimiento() * this.getPromedioCrecimientoAnual();
            else
                this.tamanio = getAnios(edadMeses) * this.getPromedioCrecimientoAnual();
        }
    }
}