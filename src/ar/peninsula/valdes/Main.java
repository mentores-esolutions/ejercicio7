package ar.peninsula.valdes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import ar.peninsula.valdes.animal.Animal;
import ar.peninsula.valdes.animal.Delfin;
import ar.peninsula.valdes.animal.Pinguino;
import ar.peninsula.valdes.reproduccion.Oviparo;
import ar.peninsula.valdes.reproduccion.Viviparo;

public class Main {

	public static void main(String[] args) {

		Animal delfin1 = new Delfin("Laura",6,0.25f,9,0.7f);
		Animal delfin2 = new Delfin("Mariano",6,0.25f,9,0.7f);
		Animal pinguino1 = new Pinguino("Florencia",5,0.24f,2,12,4,0.9f);
		Animal pinguino2 = new Pinguino("Nestor",5,0.24f,2,12,4,0.1f);

		int tiempoCarrera = 30;
		getGanador(delfin2,pinguino2,tiempoCarrera);
		tiempoCarrera= 120;
		getGanador(delfin2,pinguino2,tiempoCarrera);


		List<Animal> list = new ArrayList<Animal>();
		list.add(delfin1);
		list.add(delfin2);
		list.add(pinguino1);
		list.add(pinguino2);


		for (Animal animal: list) {
			if(animal instanceof Oviparo){
				System.out.println(animal.getNombre() + " es oviparo");
			} else if (animal instanceof Viviparo) {
				System.out.println(animal.getNombre() + " es viviparo");
			}
		animal.calcularTamanio(10);
		}

		Collections.sort(list);
		for (Animal animal: list) {
			System.out.println(animal.getNombre() + " mide: " + animal.getTamanioActual());
		}



	}

	private static void getGanador(Animal animal1, Animal animal2, int tiempoCarrera) {
		 float kmAnimal1 = animal1.desplazarse(tiempoCarrera);
		 float kmAnimal2 = animal2.desplazarse(tiempoCarrera);

		if(kmAnimal1 < kmAnimal2){
			System.out.println("Gano " + animal2.getNombre() );
		} else if (kmAnimal1 > kmAnimal2) {
			System.out.println("Gano " + animal1.getNombre());
		}else {
			System.out.println("Empataron!!");
		}
	}



}
