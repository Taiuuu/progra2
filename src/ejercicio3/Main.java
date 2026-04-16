package ejercicio3;
/*
 * 3) Implementar una función que determine si un arreglo es subconjunto de otro:
public static boolean pertenecenTodos(int[] elems,
 int[] arreglo) ...
Casos borde a tener en cuenta:
- elems está vacío (y la función devuelve verdadero)
- arreglo está vacío (y la función devuelve falso)
- alguno de los arreglos contiene duplicados (no influye, es suficiente con que estén una vez)
Algunos ejemplos:
[1, 2] ⊆ [3, 2, 1]
[4, 1] ⊈ [1, 2, 3]
[2, 2] ⊆ [1, 2, 3]
 */
public class Main {
	public static boolean pertenecenTodos(int[] elems, int[] arreglo) {
		if(elems == null || elems.length == 0) {
			return true;
		}
		if (arreglo == null || arreglo.length == 0) {
			return false;
		}
		for(int i = 0; i<elems.length; i++) {
			boolean encontrado = false;
			for(int j = 0; j<arreglo.length;j++) {
				encontrado = encontrado||(elems[i] == arreglo[j]);
			}
			if(!encontrado) {
				return false;
			}
		}
		return true;
	}
}
