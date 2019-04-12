package ar.peninsula.valdes;

import ar.peninsula.valdes.animal.Animal;
import ar.peninsula.valdes.animal.Delfin;
import ar.peninsula.valdes.animal.Pinguino;

public class Main {

	public static void main(String[] args) {
		Animal d1= new Delfin("Laura",6, 2.5F, 2);
		System.out.println("Desplazamiento de "+d1.getNombre()+": "+d1.desplazarse(5));
		
		Animal d2= new Delfin("Mariano", 10, 2f, 6);
		System.out.println("Desplazamiento de "+d2.getNombre()+": "+d1.desplazarse(100));
	
		Animal p1= new Pinguino("Nestor", 2, 2f, 5, 12f, 4f);
		//System.out.println("Nadar: "+ p1.nadar());
		System.out.println("Desplazamiento de "+p1.getNombre()+": "+p1.desplazarse(2));
	
		Animal p2= new Pinguino("Florencia", 2, 2f, 5, 12f, 20f);
		System.out.println("Desplazamiento de "+p2.getNombre()+": "+p2.desplazarse(2));
		
		
		
	
			
			
		
	}
}
