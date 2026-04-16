package ejercicio4;
/*
 * 4) Implementar una clase en Java que tenga métodos estáticos que reciban una matriz por
parámetro y muestre los elementos de la matriz por filas y otro que los muestre por columnas,
y un tercer método que sume todos sus elementos.
 */
public class Main {
	//Metodo 1: Matriz muestra elementos por filas
	public static void muestraPorFila(int[][] mat) {
		for(int f = 0; f<mat.length; f++) {
			for(int c = 0; c<mat[f].length; c++) {
				System.out.print(mat[f][c] + " ");			
			}
			System.out.println();
		}
	}
	//Metodo 2: Matriz muestra elementos por columnas
	public static void muestraPorColumna(int[][] mat) {
		for(int c = 0; c<mat[0].length; c++) {
			for(int f = 0; f<mat.length; f++) {
				System.out.print(mat[f][c] + " ");
			}
			System.out.println();
		}
	}
	//Metodo 3: Suma todos elementos de la matriz
	public static int sumaElementosMat(int[][] mat) {
		int sumatoria = 0;
		
		for(int f = 0; f<mat.length; f++) {
			for(int c = 0; c<mat[f].length; c++) {
				sumatoria += mat[f][c];
			}
		}	
		
		return sumatoria;
	}
	
}