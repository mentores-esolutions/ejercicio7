package ar.peninsula.valdes;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import ar.peninsula.valdes.animal.Animal;
import ar.peninsula.valdes.animal.Delfin;
import ar.peninsula.valdes.animal.Pinguino;
import ar.peninsula.valdes.reproduccion.Oviparo;

public class Main {

	public static void main(String[] args) {

		Pinguino Florencia = new Pinguino("Florencia", 5, 0.24f, 2, 10, 3);
		Pinguino Nestor = new Pinguino("Nestor", 5, 0.24f, 2, 10, 3);
		Delfin Mariano= new Delfin ("Mariano", 6, 0.25f, 9);
		Delfin Laura= new Delfin ("Laura", 6, 0.25f, 9);
		
		if (Nestor.desplazarse(30)<Mariano.desplazarse(30)) {
			System.out.println("Mariano Win");
			
		}
		else {
			System.out.println("Nestor Win");
		}
		
		if (Nestor.desplazarse(120)<Mariano.desplazarse(120)) {
			System.out.println("Mariano Win");
			
		}
		else {
			System.out.println("Nestor Win");
		}
		
		List<Animal> listaAnimal = new ArrayList <>();
		listaAnimal.add(Florencia);
		listaAnimal.add(Nestor);
		listaAnimal.add(Laura);
		listaAnimal.add(Mariano);
		
		System.out.println("esta gestando ? "+Mariano.estaGestando(1));
		
		for (Animal animal : listaAnimal) {
			System.out.println("Nombre: "+animal.getNombre()+" "+ animal.getClass().getSuperclass().getSimpleName());
			if (animal instanceof Oviparo) {
				System.out.println("Nombre: "+animal.getNombre()+" es oviparo " );
			}
			else 
			{
				System.out.println("Nombre: "+animal.getNombre()+" es viviparo " );
			}
		}
		
		for(int x=0;x<listaAnimal.size();x++) {
			  listaAnimal.get(x).calcularTamanio(3);
			}
		//(Comparator.comparing(Animal::getTamanio));
		listaAnimal.sort(Comparator.comparing(Pinguino::getTamaño()));
		
		
	}
}
