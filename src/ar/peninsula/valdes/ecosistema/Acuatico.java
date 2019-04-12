package ar.peninsula.valdes.ecosistema;
public interface Acuatico { //la interfaz tiene la firma de sus metodos unicamente (no lleva codigo). Cada clase que implemente esta interfaz, debera
    // llamar a este metodo y colocar el codigo que desee. En cambio si Acuatico fuese una clase, puede tener metodos abstractos, que funcionarian
    // como el metodo de esta interfaz y metodos con codigo que heredarian las clases hijas

    float nadar(int tiempoMinuto);
}
