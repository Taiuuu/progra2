package ejercicio1;
/*
 * 1) Implementar con acumuladores booleanos una función booleana “mayor10” que recibe una
lista de números enteros, y devuelve True si todos los elementos son mayores a 10.
boolean mayor10(int[] lista){ … }
 */
public class Main {
	boolean mayor10(int[] lista) {
		boolean todosMayores = true;
		if(lista.length==0) {
			return false;
		}
		for(int i = 0; i < lista.length;i++) {
			todosMayores = todosMayores&&(lista[i]>10);
		}
		return todosMayores;
	}
}
