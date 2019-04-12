package ar.peninsula.valdes.especie;
import ar.peninsula.valdes.ecosistema.Acuatico;
import ar.peninsula.valdes.reproduccion.Viviparo;


public class Delfin extends Viviparo implements Acuatico{
    public Delfin(String nombre, int periodoCrecimiento, float promedioCrecimientoAnual, int tiempoGestacion) {
        super(nombre, periodoCrecimiento, promedioCrecimientoAnual, tiempoGestacion);
    }


    private float tamanioInicial;
    float tamanio;
    int mesesCrecimiento;
    public static final int VELOCIDAD = 8;
    public static final float TAMANIO_INICIAL = 0.7f;
    @Override
    public float desplazarse(int tiempoMinuto) {
        float distanciaNado;
        distanciaNado = nadar(tiempoMinuto);
        return distanciaNado;
    }

    @Override
    public void calcularTamanio(int edadMeses) {
        float promedioCrec;
        int mesesCrecidos;
        mesesCrecimiento = edadMeses - getTiempoGestacion();
        if (estaGestando(edadMeses)){
            tamanio = 0;
        }
        else {
            if (mesesCrecimiento <= periodoCrecimiento){
                mesesCrecidos = mesesCrecimiento;
            }
             else {
                mesesCrecidos = periodoCrecimiento;
            }
            promedioCrec = (promedioCrecimientoAnual / 12);
            tamanio = tamanioInicial + (promedioCrec * mesesCrecidos);
        }
    }
    public float tamanioDelfin(int edadMeses){
        calcularTamanio(edadMeses);
        return tamanio;
    }

    @Override
    public float nadar(int tiempoMinuto) {
        float desplazamiento;
        desplazamiento= (tiempoMinuto/60f)*VELOCIDAD;
        return desplazamiento;
    }
}