package ejercicio5;
/*
 * 5) Agregar a la clase anterior métodos estáticos que reciban por parámetro una matriz y devuelvan
un arreglo con la suma de cada fila de la matriz (cuya dimensión sea la cantidad de filas de la
matriz). Crear otro que haga lo mismo, pero con las columnas.
 */
public class Main {
	//Metodo 1: Suma elementos de cada fila de la matriz
	public static int[] sumaFilas(int[][] mat) {
		int[] resultado = new int[mat.length];
			
		for(int f = 0; f<mat.length; f++) {
			for(int c = 0; c<mat[f].length; c++) {
				sumatoria += mat[f][c];
			}
		}		
		return sumatoria;
	}
	//Metodo 2: Suma elementos de la columna de la matriz
		public static int[] sumaColumnas(int[][] mat) {
			int[] resultado = new int[mat[0].length];
				
			for(int f = 0; f<mat.length; f++) {
				for(int c = 0; c<mat[f].length; c++) {
					sumatoria += mat[f][c];
				}
			}		
			return sumatoria;
		}
		
}
