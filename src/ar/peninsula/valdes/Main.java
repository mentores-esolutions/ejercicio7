package ar.peninsula.valdes;

import ar.peninsula.valdes.animal.Animal;
import ar.peninsula.valdes.especie.Delfin;
import ar.peninsula.valdes.especie.Pinguino;
import ar.peninsula.valdes.reproduccion.Oviparo;
import ar.peninsula.valdes.reproduccion.Viviparo;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Delfin dLaura = new Delfin("Laura", 6, 0.25f, 9);
        Delfin dMariano = new Delfin("Mariano", 6, 0.25f, 9);
        Pinguino pFlorencia = new Pinguino("Florencia", 5, 0.24f, 2, 12,
                4);
        Pinguino pNestor = new Pinguino("Nestor", 5, 0.24f, 2, 12,
                4);

        dMariano.desplazarse(30);
        pNestor.desplazarse(30);
        dMariano.desplazarse(120);
        pNestor.desplazarse(120);

        System.out.println("Mariano: " + dMariano.desplazarse(30));
        System.out.println("Nestor: " + pNestor.desplazarse(30));
        System.out.println("Mariano: " + dMariano.desplazarse(120));
        System.out.println("Nestor: " + pNestor.desplazarse(120));
        System.out.println("-----------------------------------------------");

        ArrayList<Animal> animal = new ArrayList<>();
        animal.add(dLaura);
        animal.add(dMariano);
        animal.add(pFlorencia);
        animal.add(pNestor);
        //System.out.println(animal);

        for (int i = 0; i < animal.size(); i++) {
            System.out.print(animal.get(i).getNombre()+ " ");
            Animal elAnimal = animal.get(i);
            if (elAnimal instanceof Oviparo) {
                System.out.println("es Oviparo");
            } else if (elAnimal instanceof Viviparo) {
                System.out.println("es Viviparo");
            } else {
                System.out.println("no oviparo ni viviparo");
            }
        }


    }
}
