package ar.peninsula.valdes;

import ar.peninsula.valdes.especie.Delfin;
import ar.peninsula.valdes.especie.Pinguino;

public class Main {

	public static void main(String[] args) {

		Delfin dLaura = new Delfin("Laura", 6, 0.25f, 9);
		Delfin dMariano = new Delfin("Mariano", 6 , 0.25f, 9);
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

	}
}
