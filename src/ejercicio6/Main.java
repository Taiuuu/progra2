package ejercicio6;
/*
 * 6) Implementar, utilizando acumuladores booleanos, una función que reciba una matriz de
enteros, y devuelva verdadero  en cada una de las filas, existe al menos un número negativo.
 public static boolean tieneNegativos(int[][] mat){ ...}
 */
public class Main {
	public static boolean tieneNegativos(int[][] mat) {
		boolean cumple = true;
		for(int f=0;f<mat.length && cumple;f++) {
			boolean tieneNeg = false;
			
			for(int c=0;c<mat[f].length && !tieneNeg;c++) {
				if(mat[f][c] < 0) {
					tieneNeg=true;
				}
			}
			cumple = tieneNeg;
		}
		return cumple;
	}
}
