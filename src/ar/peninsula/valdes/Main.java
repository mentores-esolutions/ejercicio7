package ar.peninsula.valdes;

import ar.peninsula.valdes.animal.Animal;
import ar.peninsula.valdes.animal.Delfin;
import ar.peninsula.valdes.animal.Pingüino;

public class Main {

	public static void main(String[] args) {

		Animal p1 = new Pingüino("Nestor",0,0,0);
		Animal p2 = new Pingüino("Florencia",0,0,0);
		Animal d1= new Delfin("Mariano",0,0,0);
		Animal d2 = new Delfin("Laura",0,0,0);
	}
}
