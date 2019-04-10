# ejercicio 7

Consignas

En Península Valdés existen 2 Pingüinos llamados Florencia y Néstor y 2 delfines llamados Laura y Mariano que son muy competitivos.

Fernando, el guardaparque de la reserva, quiere saber qué sucedería si hicieran una carrera Néstor y Mariano. 
Por ello, está solicitando un programa que determine quién ganaría la carrera si la misma tuviera 2 tiempo de carrera diferentes.
1.	Tiempo de carrera 1 – 30 minutos
2.	Tiempo de carrera 2 – 2 horas


Para ello es necesario:

1.	Crear una clase Delfín con las siguientes características:

	a.	Es un animal acuático
	
	b.	Es un animal vivíparo
	
	c.	Crear variables que determinen que 
	
		i.	Velocidad promedio desplazamiento en agua = 8 km/h. El valor debe poder consultarse sin crear una instancia de la clase y es un valor constante.
		
	d.	Modificar método desplazarse para calcular el desplazamiento en el tiempo, considerando la velocidad promedio en mar
	
2.	Crear una clase Pingüino con las siguientes características:

	a.	Es un animal terrestre y acuático
	
	b.	Es un animal ovíparo
	
	c.	Crear variables que determinen que:
	
		i.	Velocidad desplazamiento en agua = 12 km/h 
		
		ii.	Velocidad desplazamiento en tierra = 4 km/h.
		
	d.	El constructor de la clase debe recibir como parámetros las dos variables definidas y debe poder modificarse para cada animal nuevo
	
	e.	Modificar método desplazarse para calcular el desplazamiento en el tiempo, considerando las velocidades promedio en tierra y mar. Asumiendo que pasa el 30 % del tiempo en el agua y el resto en la tierra
	
3.	En el método Main, crear los 4 animales.
	
	a.	El periodo en que crece un delfín es de 6 meses y crece un promedio de 0.25m por año 
	
	b.	El periodo de gestación de un delfin es de 9 meses
	
	c.	El tamaño inicial del delfin es de 0,7 metros
	
	d.	El periodo en que crece un pingüino es de 5 meses y crece un promedio de 0.24m por año
	
	e.	El periodo en que incuba el pingüino es de 2 meses
	
	f.	El tamaño inicial del pingüino es de 0,1 metros

4.	Determinar cuál de los 2 machos ganaría la carrera legando más lejos:
	
	a.	Transcurrido el tiempo 1 – 30 minutos

	b.	Transcurrido el tiempo 2 – 2 horas
	
5.	Crear un ArrayList de tipo Animal y guarde en ella los animales creados
6.	Crear los métodos estaGestando / estaIncubando, según corresponda, en las clases Oviparo y Viviparo cuyos retornos sean boolean
7.	Recorrer la lista de animales e imprimir en consola el nombre y decir si es un Oviparo o un Viviparo
8.	Implemente el método calcularTamanio de la clase Pingüino y Delfín

	a.	En cada método hay que considerar que si la edad es menor al tiempo de incubación/gestación el tamaño debe ser cero. Caso contrario calcular el tamaño según la proporción de crecimiento anual
	
9.	Listar los animales creados en orden según su tamaño cuando tienen 3 meses.
