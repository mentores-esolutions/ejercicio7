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
		Pinguino pFlorencia = new Pinguino("Florencia", 5, 0.24f, 2);
		Pinguino pNestor = new Pinguino("Nestor", 5, 0.24f, 2);

		if (dMariano.desplazarse(30) > pNestor.desplazarse(30)) {
			System.out.println("Quien llego mas lejos en 30 minutos es Mariano con una distancia de :" + dMariano.desplazarse(30)+ " Km") ;
		}
		else {
			System.out.println("Quien llego mas lejos en 30 minutos  es Nestor con una distancia de :" + pNestor.desplazarse(30)+ " Km");
		}
		if (dMariano.desplazarse(120) > pNestor.desplazarse(120)) {
			System.out.println("Quien llego mas lejos en 2h es Mariano con una distancia de : " +dMariano.desplazarse(120)+ " Km");
		}
		else {
			System.out.println("Quien llego mas lejos en 2h es Nestor con una distancia de :" + pNestor.desplazarse(120)+ " Km");
		}
		ArrayList<Animal> animal = new ArrayList<Animal>();
		animal.add(dLaura);
		animal.add(dMariano);
		animal.add(pFlorencia);
		animal.add(pNestor);

		for (int i = 0; i < animal.size(); i++) {
			Animal elAnimal = animal.get(i);
			System.out.print(elAnimal.getNombre() + " ");
			if (elAnimal instanceof Oviparo)
			{
				System.out.println(" es Oviparo");
			}
			else if (elAnimal instanceof Viviparo) {
				System.out.println(" es Viviparo");
			}
			else
				System.out.println(" no es Oviparo ni viviparo");
		}
		System.out.println("-------------------------------------------------------");
		System.out.println(dMariano.estaGestando(8));
		System.out.println(dLaura.estaGestando(10));
		System.out.println(pFlorencia.estaIncubando(4));
		System.out.println(pNestor.estaIncubando(2));
		System.out.println("-------------------------------------------------------");
		System.out.println(dMariano.tamanioDelfin(16));
		System.out.println(dLaura.tamanioDelfin(13));
		System.out.println(pFlorencia.tamanioPinguino(8));
		System.out.println(pNestor.tamanioPinguino(3));
	}
}
