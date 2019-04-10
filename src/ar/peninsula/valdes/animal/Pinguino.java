package ar.peninsula.valdes.animal;

import ar.peninsula.valdes.ecosistema.Acuatico;
import ar.peninsula.valdes.ecosistema.Terrestre;
import ar.peninsula.valdes.reproduccion.Oviparo;

public class Pinguino extends Oviparo implements Terrestre, Acuatico {

    // velocidad en Km/h
    private float velocidadPromedioDesplazamientoEnAgua = 12f;
    private float velocidadPromedioDesplazamientoEnTierra = 4f;
    private float tamanioInicial = 0.1f;
    private float tamanio;

    public Pinguino(String nombre, int periodoCrecimiento, float promedioCrecimientoAnual, int tiempoIncubacion, float velAgua, float velTierra) {
        super(nombre, periodoCrecimiento, promedioCrecimientoAnual, tiempoIncubacion);
        this.velocidadPromedioDesplazamientoEnAgua = velAgua;
        this.velocidadPromedioDesplazamientoEnTierra = velTierra;
    }

    public float getVelocidadPromedioDesplazamientoEnAgua() {
        return velocidadPromedioDesplazamientoEnAgua;
    }

    public float getVelocidadPromedioDesplazamientoEnTierra() {
        return velocidadPromedioDesplazamientoEnTierra;
    }

    public float nadar(float kilometros) {
        return kilometros/this.velocidadPromedioDesplazamientoEnAgua;
    }

    public float caminar(float kilometros) {
        return 0;
    }

    public float desplazarse(int tiempoMinuto) {
        float tiempoEnTierra = (float) (tiempoMinuto * 0.7);
        float tiempoEnAgua = (float) (tiempoMinuto * 0.3);

        return (tiempoEnTierra/60)*velocidadPromedioDesplazamientoEnTierra + (tiempoEnAgua/60)*velocidadPromedioDesplazamientoEnAgua;
    }

    // Ejercicio 8
    public void calcularTamanio(int edadMeses) {
        if (edadMeses < getTiempoIncubacion())
            this.tamanio = 0;
        else {
            if (getAnios(edadMeses) > this.getPeriodoCrecimiento())
                this.tamanio = this.getPeriodoCrecimiento() * this.getPromedioCrecimientoAnual();
            else
                this.tamanio = getAnios(edadMeses) * this.getPromedioCrecimientoAnual();
        }
    }
}