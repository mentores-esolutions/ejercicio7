package ar.peninsula.valdes;

import ar.peninsula.valdes.animal.Animal;
import ar.peninsula.valdes.animal.Delfin;
import ar.peninsula.valdes.animal.Pinguino;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {

        System.out.println("-------------------------  Ejercicio 3  -------------------------");

        System.out.println("Creamos los animales.");

        Animal delfinLau = new Delfin("Laura", 6, 0.25f, 9);
		Animal delfinMar = new Delfin("Mariano", 6, 0.25f, 9);

		Animal pinguinoFlor = new Pinguino("Florencia", 5, 0.24f, 2,10f, 3f);
		Animal pinguinoNes = new Pinguino("Néstor", 5, 0.24f, 2,10f, 3f);

        System.out.println("-----------------------------------------------------------------\n\n");



        System.out.println("-------------------------  Ejercicio 4  -------------------------");

        // carrera 30 minutos
        if (((Delfin) delfinMar).desplazarse(30) > ((Pinguino) pinguinoNes).desplazarse(30))
            System.out.println("Ganador 30 minutos: " + delfinMar.getNombre());
        else
            System.out.println("Ganador 30 minutos: " + pinguinoNes.getNombre());

        // carrera 2 horas
        if (((Delfin) delfinMar).desplazarse(120) > ((Pinguino) pinguinoNes).desplazarse(120))
            System.out.println("Ganador 2 horas: " + delfinMar.getNombre());
        else
            System.out.println("Ganador 2 horas: " + pinguinoNes.getNombre());

        System.out.println("-----------------------------------------------------------------\n\n");



        System.out.println("-------------------------  Ejercicio 5  -------------------------");

        System.out.println("Cargamos los animales en una lista.");

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



        System.out.println("-------------------------  Ejercicio 8  -------------------------");

        for (Animal animal: animales){
            animal.calcularTamanio(12);
            System.out.println("Nombre: " + animal.getNombre() + ", tamaño: ");
        }

        System.out.println("-----------------------------------------------------------------\n\n");



        System.out.println("-------------------------  Ejercicio 9  -------------------------");

        System.out.println("-----------------------------------------------------------------\n\n");
	}
}