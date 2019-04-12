package ar.peninsula.valdes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import ar.peninsula.valdes.animal.Animal;
import ar.peninsula.valdes.animal.Delfin;
import ar.peninsula.valdes.animal.Pinguino;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Animal Nestor = new Pinguino("Nestor", 5, 0.24f,0, 2, 12, 4);
		Animal Florencia = new Pinguino("Florencia", 5, 0.24f,0, 2, 12, 4);
		Animal Laura = new Delfin("Laura", 6, 0.25f,0, 9);
		Animal Mariano = new Delfin("Mariano", 6, 0.25f,0, 9);
		List<Animal> listaAnimal = new ArrayList<>();
		listaAnimal.add(Nestor);
		listaAnimal.add(Florencia);
		listaAnimal.add(Laura);
		listaAnimal.add(Mariano);

		
		System.out.println(" **** Punto 4 carrera de Machos:  ****");
		if (Nestor.desplazarse(30) < Mariano.desplazarse(30)) {
			System.out.println("Gano Mariano los 30 minutos");
		} else {
			System.out.println("Gano Nestor los 30 minutos");
		}

		if (Nestor.desplazarse(60) < Mariano.desplazarse(60)) {
			System.out.println("Gano Mariano los 60 minutos");
		} else {
			System.out.println("Gano Nestor los 60 minutos");
		}
		

		
		System.out.println(" **** Punto 7 :  ****");
		for(int x=0;x<listaAnimal.size();x++) {
			  System.out.println(" - "+listaAnimal.get(x).getNombre()+" es un "+ listaAnimal.get(x).getClass().getSuperclass().getSimpleName() +" (" +listaAnimal.get(x).getClass().getSimpleName()+")");
		}
		
		System.out.println(" **** Punto 8 crecimiento de animales:  ****");
	     //	Laura.setTamanio(Laura.getTamanio(3));
		Laura.calcularTamanio(3000);
		//Mariano.setTamanio(Mariano.getTamanio(3));
		Mariano.calcularTamanio(3000);
		//Nestor.setTamanio(Nestor.getTamanio(3));
		Nestor.calcularTamanio(3000);
		//Florencia.setTamanio(Florencia.getTamanio(3));
		Florencia.calcularTamanio(3000);

		for (Animal animal : listaAnimal) {
			animal.calcularTamaño(93);
		}
		
		for (Animal animal : listaAnimal) {
			System.out.println(" - "+ animal.getNombre() +" su tamaño es  "+animal.getTamanio());
		}
		
		
		
		
		System.out.println(" **** Punto 9 :  ****");
		//for(int x=0;x<listaAnimal.size();x++) {
		//	  listaAnimal.get(x).getTamanio(7);
		//	}
		
		listaAnimal.sort(Comparator.comparing(Animal::getTamanio)
				
				);
	
		for(int x=0;x<listaAnimal.size();x++) {
			  System.out.println(" Nombre: "+ listaAnimal.get(x).getNombre()+" y su tamaño a los 3 meses es "+listaAnimal.get(x).getTamanio());
			}

		
		
	
	}
}
