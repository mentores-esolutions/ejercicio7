package ar.peninsula.valdes;

import ar.peninsula.valdes.animal.Animal;
import ar.peninsula.valdes.animal.Delfin;
import ar.peninsula.valdes.animal.Pinguino;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {

        System.out.println("-------------------------  Ejercicio 3  -------------------------");

		Animal delfinLau = new Delfin("Laura", 6, 0.25f, 9);
		Animal delfinMar = new Delfin("Mariano", 6, 0.25f, 9);

		Animal pinguinoFlor = new Pinguino("Florencia", 5, 0.24f, 2,10f, 3f);
		Animal pinguinoNes = new Pinguino("Néstor", 5, 0.24f, 2,10f, 3f);

        System.out.println("-----------------------------------------------------------------\n\n");



        System.out.println("-------------------------  Ejercicio 4  -------------------------");
        // carrera 4K
		if (((Delfin) delfinMar).nadar(4) < ((Pinguino) pinguinoNes).nadar(4))
			System.out.println("Ganador 4K: " + delfinMar.getNombre());
		else
			System.out.println("Ganador 4K: " + pinguinoNes.getNombre());

        // carrera 10K
        if (((Delfin) delfinMar).nadar(10) < ((Pinguino) pinguinoNes).nadar(10))
            System.out.println("Ganador 10K: " + delfinMar.getNombre());
        else
            System.out.println("Ganador 10K: " + pinguinoNes.getNombre());

        System.out.println("-----------------------------------------------------------------\n\n");



        System.out.println("-------------------------  Ejercicio 5  -------------------------");

        List<Animal> animales = new ArrayList<>();
        animales.add(delfinLau);
        animales.add(delfinMar);
        animales.add(pinguinoFlor);
        animales.add(pinguinoNes);

        System.out.println("-----------------------------------------------------------------\n\n");



        System.out.println("-------------------------  Ejercicio 7  -------------------------");

        for (Animal animal: animales){
            System.out.println("Nombre: " + animal.getNombre());
            System.out.println("El animal es: " + animal.getClass().getInterfaces()[0].getSimpleName() + "\n");
        }

        System.out.println("-----------------------------------------------------------------\n\n");



        System.out.println("-------------------------  Ejercicio 9  -------------------------");

        //animales.sort();

        System.out.println("-----------------------------------------------------------------\n\n");
	}
}