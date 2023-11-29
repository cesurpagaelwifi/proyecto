package daw;

import java.util.Scanner;

public class AgregarDatos {
	
		public static void main(String[] args) {
			int numeros[] = obtenerNumeros();
			pintarArray(numeros);
			int numero = pedirNumero(); 
			numeros = aniadirNumero(numero, numeros);
			pintarArray(numeros);
			
		}
		
		public static void pintarArray(int[] numeros) {
			for (int i = 0; i < numeros.length; i++) {
				System.out.print(numeros[i]);
			}
			System.out.println("");
		}
		
		public static int pedirNumero() {
			Scanner sc = new Scanner(System.in);
			System.out.println("Número: ");
			int numero = sc.nextInt();
			sc.close(); 
			return numero;
		}
		
		
		public static int[] obtenerNumeros() {
			int numeros[] = {7, 5, 6, 9, 8, 2};
			return numeros;
		}
		
		public static int[] aniadirNumero(int numero, int[] numeros) {
			int numerosAux[] = new int[numeros.length + 1];
			for (int i = 0; i < numeros.length; i++) {
				numerosAux[i] = numeros[i];
			}
			numerosAux[numeros.length] = numero;
			
			return numerosAux;
			
		}

	}


