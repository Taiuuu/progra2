package ejercicio5;
/*
 * 5) Agregar a la clase anterior métodos estáticos que reciban por parámetro una matriz y devuelvan
un arreglo con la suma de cada fila de la matriz (cuya dimensión sea la cantidad de filas de la
matriz). Crear otro que haga lo mismo, pero con las columnas.
 */
public class Main {
	//Metodo 1: devuelve un arreglo con la suma de cada fila
	public static int[] sumaFilas(int[][] mat) {
	    int[] vector = new int[mat.length];
		
		for(int f = 0; f<mat.length; f++) {
			int sumatoria = 0;
			for(int c = 0; c<mat[f].length; c++) {
				sumatoria += mat[f][c];
			}
			vector[f] = sumatoria;
		}		
		return vector;
	}
	//Metodo 2: devuelve un arreglo con la suma de cada columna
		public static int[] sumaColumnas(int[][] mat) {
			int[] vector = new int[mat[0].length];
			
			for(int c = 0; c<mat[0].length; c++) {
				int sumatoria = 0;
				for(int f = 0; f<mat.length; f++) {
					sumatoria += mat[f][c];
				}
				vector[c] = sumatoria;
			}		
			return vector;
		}
		
}
