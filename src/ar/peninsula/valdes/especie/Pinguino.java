package ar.peninsula.valdes.especie;
import ar.peninsula.valdes.ecosistema.Acuatico;
import ar.peninsula.valdes.ecosistema.Terrestre;
import ar.peninsula.valdes.reproduccion.Oviparo;

public class Pinguino extends Oviparo implements Acuatico, Terrestre {

    public Pinguino(String nombre, int periodoCrecimiento, float promedioCrecimientoAnual, int tiempoIncubacion) {
        super(nombre, periodoCrecimiento, promedioCrecimientoAnual, tiempoIncubacion);
    }
    float tamanio;
    float mesesCrecimiento;
    public int VELOCIDAD_AGUA = 12;
    public int VELOCIDAD_TIERRA = 4;
    public final float TAMAÑO_INICIAL = 0.1f;
    float distancia;
    @Override
    public float desplazarse(int tiempoMinuto) {
        float desplazamiento;
        desplazamiento= (nadar(tiempoMinuto)) + (caminar(tiempoMinuto));
        return desplazamiento;
    }

    @Override
    public void calcularTamanio(int edadMeses) {
        float promedioCrec;
        float mesesCrecidos;
        mesesCrecimiento = edadMeses - getTiempoIncubacion();
        if (estaIncubando(edadMeses)){
            tamanio = 0;
        }
        else {
            if (mesesCrecimiento <= periodoCrecimiento){
                mesesCrecidos = mesesCrecimiento;
            }
            else {
                mesesCrecidos = periodoCrecimiento;
            }
            promedioCrec = promedioCrecimientoAnual/12;
            tamanio = TAMAÑO_INICIAL + (promedioCrec * mesesCrecidos);
        }
    }
    public float tamanioPinguino(int edadMeses){
        calcularTamanio(edadMeses);
        return tamanio;
    }

    @Override
    public float nadar(int tiempoMinuto) {
        distancia= (((tiempoMinuto/60f)*0.3f)*VELOCIDAD_AGUA);
        return distancia;
    }

    @Override

    public float caminar(int tiempoMinuto) {
        distancia= (((tiempoMinuto/60f)*0.7f)*VELOCIDAD_TIERRA);
        return distancia;
    }
}

