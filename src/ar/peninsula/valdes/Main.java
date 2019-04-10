package ar.peninsula.valdes;

import java.util.ArrayList;
import java.util.List;
import ar.peninsula.valdes.animal.Animal;
import ar.peninsula.valdes.animal.Delfin;
import ar.peninsula.valdes.animal.Pinguino;

public class Main {

	public static void main(String[] args) {

		Animal Nestor = new Pinguino("Nestor", 5, 0.24f, 2, 12, 4);
		Animal Florencia = new Pinguino("Florencia", 5, 0.24f, 2, 12, 4);
		Animal Laura = new Delfin("Laura", 6, 0.25f, 9);
		Animal Mariano = new Delfin("Mariano", 6, 0.25f, 9);
		List<Animal> listaAnimal = new ArrayList<>();
		listaAnimal.add(Nestor);
		listaAnimal.add(Florencia);
		listaAnimal.add(Laura);
		listaAnimal.add(Mariano);

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
	}
}
