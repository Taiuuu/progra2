package ejercicio7;
/*
 * 7) Implementar una función que, dada una matriz de enteros, verifique ambas condiciones: 
 * a) todas las filas están en orden estrictamente ascendente. 
 * b) todas las columnas tienen al menos un elemento impar, y otro par. 
 * public static Boolean filasCrecientesParImpar(int[][] mat) ... 
 * Algunos ejemplos: [[1, 2, 3], [4, 5, 6]] → Verdadero [[1, 2, 3], [4, 5, 5]] → Falso [[1, 2, 3], [2, 4, 6]] → Falso
 */
public class Main {
	public static boolean filasCrecientesParImpar(int[][] mat) {
	    boolean cumple = true;

	    // a) Todas las filas en orden estrictamente ascendente
	    for(int f=0;f<mat.length && cumple;f++) {
	    	for(int c=0;c<mat[f].length - 1 && cumple;c++) {
	    		if(mat[f][c] >= mat[f][c+1]) {
	    			cumple = false;
	    		}
	    	}
	    }
	    // b) Todas las columnas tienen al menos un par y un impar
	    for(int c=0;c<mat[0].length && cumple;c++) {
	    	boolean hayPar = false;
	    	boolean hayImpar = false;
	    	
	    	for(int f=0;f<mat.length && cumple;f++) {
	    		if(mat[f][c]%2==0) {
	    			hayPar = true;
	    		}else {
	    			hayImpar = true;
	    		}
	    		
	    	}
	    	if (!(hayPar && hayImpar)) {
	    		cumple = false;
	    	}
	    }
	    return cumple;
	}
}
