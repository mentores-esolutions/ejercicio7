# ejercicio 7

Consignas

En Península Valdés existen 2 Pingüinos llamados Florencia y Néstor y 2 delfines llamados Laura y Mariano que son muy competitivos.
Fernando, el guarda parque de la reserva, quiere saber qué sucedería si hicieran una carrera Néstor y Mariano. Por ello, está solicitando un programa que determine quien ganaría la carrera si la misma tuviera 2 metas diferentes.
1.	Punto de llegada 1 – 4km
2.	Punto de llegada 2 – 10km
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
4.	Determinar cuál de los 2 machos ganaría la carrera:
	a.	En el punto de llegada 1
	b.	En el punto de llegada 2
5.	Crear un ArrayList de tipo Animal y guarde en ella los animales creados
6.	Crear los métodos estaGestando / estaIncubando según corresponda si son ovíparos o vivíparos cuyos retornos sean boolean
7.	Recorrer la lista de animales e imprimir en consola el nombre del mismo y decir si es un Oviparo o un Viviparo
8.	Implemente el método calcularTamanio de la clase Pingüino y Delfín
	a.	En cada método hay que considerar que si la edad es menor al tiempo de incubación/gestación el tamaño debe ser cero. Caso contrario calcular el tamaño según la proporción de crecimiento anual
9.	Listar los animales creados en orden según su tamaño cuando tienen 3 meses.
