package ejercicio8;
/*
 * 8) Implementar funciones con potencias de 2 y logaritmos en base 2 – ES MUY IMPORTANTE QUE PUEDAN HACER ESTE EJERCICIO Y ENTIENDAN LA RELACION ENTRE AMBAS FUNCIONES. 
 * a) Implementar una función que dado un vector de enteros devuelva verdadero si solo si todos sus elementos son potencia de 2. Algunos ejemplos: [8, 2, 32] → Verdadero [ 2 3 , 2 1 , 2 5 ] [15, 2, 8] → Falso. No son todos potencias de 2 Programación II 3 
 * 
 * b) Implementar una función que dada una matriz de enteros devuelva verdadero si solo si en alguna fila todos sus elementos son potencia de 2. (Usar el punto a) Algunos ejemplos: [[1, 2, 3], [8, 2, 1]] → Verdadero fila 1 = [ 2 3, 2 1, 2 0 ] [[1, 2, 3], [11, 2, 8], [[4, 5, 6]] → Falso ninguna lo cumple 
 * 
 * c) Implementar una función que dada una matriz de enteros devuelva verdadero si solo si en alguna fila algún elemento es Parte Entera( log2(c+1) ) donde c es el índice de la columna. Algunos ejemplos: [[1, 2, 3], [4, 1, 2]] → Verdadero fila 1 lo cumple Parte entera(log21)=0 Parte entera(log22)=1 Parte entera(log23)=1 [[1, 2, 3], [11, 2, 8], [[4, 5, 6]] → Falso ninguna lo cumple 
 * 
 * d) IMPORTANTE: Interpretar cual es la relación entre 2n y log2(n)
 */



/*
 * Ejercicio 8 d) La función potencia de 2 y el logaritmo en base 2 son funciones inversas.
Si un número es 2^n, entonces su log₂ es n.
El logaritmo base 2 indica el exponente al que hay que elevar 2 para obtener dicho número.
 */
public class Main {
	//verificar si un número es potencia de 2.
	public static boolean esPotenciaDe2(int num) {
		if (num<1) {
			return false;
		}
		
		while (num%2==0) {
			num /= 2;
		}
		
		return num == 1;
	}
	
	//a) Todos los elementos del vector son potencia de 2.
	public static boolean todosSonPotenciaDe2(int[] vec) {
		boolean cumple = true;
		
		for(int i = 0; i<vec.length && cumple; i++) {
			if(!esPotenciaDe2(vec[i])) {
				cumple = false;
			}
		}
		return cumple;
	}
	
	//b) Alguna fila tiene todos sus elementos potencia de 2.
	public static boolean algunaFilaTodosPotenciaDe2(int[][] mat) {
		boolean cumple = false;
		
		for(int f = 0;f<mat.length && cumple;f++) {
			if(todosSonPotenciaDe2(mat[f])) {
				cumple = true;
			}
		}
		return cumple;
	}
	
	//c) Alguna fila tiene algún elemento = parte entera(log(c+1))
	public static boolean algunaColumnaTodosPotenciaDe2(int[][] mat) {
		boolean cumple = false;
		
		for(int f = 0; f<mat.length && !cumple; f++) {
			boolean filaCumple = false;
			
			for(int c = 0; c<mat[f].length && !filaCumple; c++) {
					int valor = log2Entero(c + 1);
					
					if(mat[f][c]==valor) {
						filaCumple = true;
				}
			}
			if (filaCumple) {
				cumple = true;
			}
		}
		return cumple;
	}

	//funcion auxiliar
	public static int log2Entero(int n){
		int cont = 0;

		while(n > 1){
			n /= 2;
			cont++;
			}

		return cont;	
		}

}
