package ar.peninsula.valdes.animal;

import ar.peninsula.valdes.ecosistema.Acuatico;
import ar.peninsula.valdes.ecosistema.Terrestre;
import ar.peninsula.valdes.reproduccion.Oviparo;

public class Pinguino extends Oviparo implements Acuatico,Terrestre {

    private float velocidadAgua = 12;
    private  float  velocidadTierra = 4;



    public Pinguino(String nombre, int periodoCrecimiento, float promedioCrecimientoAnual, int tiempoIncubacion, float velocidadAgua, float velocidadTierra, float tamanioInicial) {
        super(nombre, periodoCrecimiento, promedioCrecimientoAnual, tiempoIncubacion);
        this.velocidadAgua=velocidadAgua;
        this.velocidadTierra=velocidadTierra;
        this.tamanioInicial=tamanioInicial;
    }

    @Override
    public float desplazarse(int tiempoMinuto) {

        return nadar(tiempoMinuto)*0.3f + caminar(tiempoMinuto)*0.7f;
    }

    @Override
    public void calcularTamanio(int edadMeses) {
        if(super.estaIncubando(edadMeses)){
            tamanioActual =0;
        }else {
            final int tiempoVida = edadMeses - getTiempoIncubacion();
            if(getPeriodoCrecimiento() < tiempoVida){
                tamanioActual = tamanioInicial + getTamanio(getPeriodoCrecimiento());
            }
            else {
                tamanioActual =tamanioInicial+getTamanio(tiempoVida);
            }
        }
    }

    @Override
    public float nadar(int tiempoMinuto) {
        return (velocidadAgua*tiempoMinuto)/60;
    }

    @Override
    public float caminar(int tiempoMinuto) {
        return (velocidadTierra*tiempoMinuto)/60;
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


}
