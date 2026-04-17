package ejercicio9;

public class Main {
	public static boolean arregloEnFilas(int[][] mat, int[] arreglo) {
		if(arreglo == null || arreglo.length == 0) {
			return true;
		}
		if(mat==null ||mat.length == 0) {
			return false;
		}
		
		boolean cumple = true;
		
		for(int i = 0; i<arreglo.length && cumple; i++) {
			boolean estaEnFila = false;
			
			for(int c = 0; c<mat[i].length && !estaEnFila; c++) {
				if(mat[i][c] == arreglo[i]) {
					estaEnFila = true;
				}
			}
			cumple = estaEnFila;
		}
		return cumple;
	}
}
