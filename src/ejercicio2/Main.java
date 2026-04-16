package ejercicio2;
/*
 * 2) Implementar con acumuladores booleanos una función booleana “multiplo5AlgunoMayor100”
que recibe una lista de números enteros, y devuelve True si todos los elementos son múltiplo
de 5 y alguno de ellos es mayor a 100.
boolean multiplo5AlgunoMayor100(int[] lista){ … }
 */
public class Main {
	boolean multiplo5AlgunoMayor100(int[] lista) {
		if(lista == null || lista.length==0) {
			return false;
		}
		
		boolean todosMultiplo = true;
		boolean algunoMayor100 = false;
		
		for(int i = 0; i<lista.length ; i++) {
			todosMultiplo = todosMultiplo&&(lista[i]%5==0);
			algunoMayor100 = algunoMayor100||(lista[i]>100);
		}
		return todosMultiplo&&algunoMayor100;
	}
}