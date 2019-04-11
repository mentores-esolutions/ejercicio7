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

	/*
	 * a. El periodo en que crece un delfín es de 6 meses y crece un promedio de 0.25m por año 
	 * b. El periodo de gestación de un delfin es de 9 meses 
	 * c. El tamaño inicial del delfin es de 0,7 metros 
	 * d. El periodo en que crece un pingüino es de 5 meses y crece un promedio de 0.24m por año 
	 * e. El periodo en que incuba el pingüino es de 2 meses 
	 * f. El tamaño inicial del pingüino es de 0,1 metros
	 */

	public static void main(String[] args) {

		Animal mariano = new Delfin("Mariano", 6, 0.25f, 9);
		Animal laura = new Delfin("Laura", 6, 0.25f, 9);

		Animal nestor = new Pinguino("Nestor", 5, 0.24f, 2, 12, 4);
		Animal florencia = new Pinguino("Florencia", 5, 0.24f, 2, 12, 4);

		System.out.println("El ganador de la carrera 1... " + getNombreGanadorCarrera(mariano, nestor, 30));
		System.out.println("El ganador de la carrera 2... " + getNombreGanadorCarrera(mariano, nestor, 30));

		
		List<Animal> peninsula = new ArrayList<>();
		peninsula.add(mariano);
		peninsula.add(laura);
		peninsula.add(nestor);
		peninsula.add(florencia);
		
		System.out.println("\n------------------------------------------\n");
		decirTipoDeReproduccion(peninsula);
		System.out.println("\n------------------------------------------\n");
		int mesesDesdeConcepcion = 9;
		ordenarAnimalesPorTamanio(peninsula, mesesDesdeConcepcion);
	}

	private static String getNombreGanadorCarrera(Animal corredor1, Animal corredor2, int tiempoCarrera) {
		float distanciaCorredor1 = corredor1.desplazarse(tiempoCarrera);
		float distanciaCorredor2 = corredor2.desplazarse(tiempoCarrera);

		if (distanciaCorredor1 > distanciaCorredor2) {
			return corredor1.getNombre();
		} else if (distanciaCorredor1 < distanciaCorredor2) {
			return corredor2.getNombre();
		} else {
			return "ambos. Fue un empate.";
		}
	}

	private static void decirTipoDeReproduccion(List<Animal> peninsula) {
		for (Animal a : peninsula) {
			if (a instanceof Oviparo) {
				System.out.println(a.getNombre() + " es un Oviparo");
			} else if (a instanceof Viviparo) {
				System.out.println(a.getNombre() + " es un Viviparo");
			}
		}
	}

	private static void ordenarAnimalesPorTamanio(List<Animal> peninsula, int edadMeses) {
		for (Animal a : peninsula) {
			a.calcularTamanio(edadMeses);
		}

		Collections.sort(peninsula);

		for (Animal a : peninsula) {
			System.out.println(a.getNombre() + " mide " + a.getTamanioActual() + "cms");
		}
	}
}
