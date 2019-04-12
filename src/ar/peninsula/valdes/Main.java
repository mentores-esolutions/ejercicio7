package ar.peninsula.valdes;

import java.util.ArrayList;

import ar.peninsula.valdes.animal.Animal;
import ar.peninsula.valdes.animal.Delfin;
import ar.peninsula.valdes.animal.Pinguino;
import ar.peninsula.valdes.reproduccion.Oviparo;

public class Main {

	public static void main(String[] args) {
		ArrayList<Animal> listaAnimal = new ArrayList<Animal>();
		
		Delfin d1 = new Delfin("Laura", 6, 0.25f, 9 );
		Delfin d2 = new Delfin("Mariano", 6, 0.25f, 9 );
		Pinguino p1 = new Pinguino("Florencia", 5, 0.24f, 3, 12, 4);
		Pinguino p2 = new Pinguino("Nestor", 5, 0.24f, 2, 12, 4);
		
		System.out.println("Carrera 1");
		
		if (d2.desplazarse(30)>p2.desplazarse(30)) {
			System.out.println("Gano Mariano!");
		}else if (d2.desplazarse(30)<p2.desplazarse(30)) {
			System.out.println("Gano Nestor!");
		} else {
			System.out.println("empate");
		}
		
		System.out.println("Carrera 2");
		
		if (d2.desplazarse(120)>p2.desplazarse(120)) {
			System.out.println("Gano Mariano!");
		}else if (d2.desplazarse(120)<p2.desplazarse(120)) {
			System.out.println("Gano Nestor!");
		} else {
			System.out.println("empate");
		}
		
		
		
		
	
		listaAnimal.add(d1);
		listaAnimal.add(d2);
		listaAnimal.add(p1);
		listaAnimal.add(p2);
		
for (Animal animal : listaAnimal) {
	if (animal instanceof Oviparo) {
		System.out.println("nombre: "+ animal.getNombre() +" " +animal.estaIncubando());
	}
	else {
	System.out.println("nombre: "+ animal.getNombre() +" " +animal.estaGestando());
	}
}
		


	}
}
