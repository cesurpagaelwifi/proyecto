package daw;

import java.util.Scanner;

public class AniadirNumero {
	

	    public static void main(String[] args) {
	        int[][] matriz = obtenerMatriz();
	        pintarMatriz(matriz);
	        int numero = pedirUsuario();
	        int numero1 = pedirContraseña();
	        matriz = aniadirUsuario (numero, matriz);
	        matriz =aniadirContraseña(numero1, matriz);
	        pintarMatriz(matriz);
	    }

	    public static void pintarMatriz(int[][] matriz) {
	        for (int i = 0; i < matriz.length; i++) {
	            for (int j = 0; j < matriz[i].length; j++) {
	                System.out.print(matriz[i][j] + " ");
	            }
	            System.out.println();
	        }
	    }

	    public static int pedirUsuario() {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Usuario: ");
	        int numero = sc.nextInt();
	        sc.close();
	        return numero;
	    }
	    
	    public static int pedirContraseña() {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Contraseña: ");
	        int numero1 = sc.nextInt();
	        sc.close();
	        return numero1;
	    }

	    public static int[][] obtenerMatriz() {
	        int[][] matriz = {{7, 5}, {6, 9}, {8, 2}};
	        return matriz;
	    }

	    public static int[][] aniadirUsuario(int numero, int[][] matriz) {
	        int[][] matrizAux = new int[matriz.length + 1][matriz[0].length];
	        for (int i = 0; i < matriz.length; i++) {
	            for (int j = 0; j < matriz[0].length; j++) {
	                matrizAux[i][j] = matriz[i][j];
	            }
	        }
	        matrizAux[matriz.length][0] = numero;

	        return matrizAux;
	    }
	    public static int[][] aniadirContraseña(int numero, int[][] matriz) {
	        int[][] matrizAux = new int[matriz.length + 1][matriz[0].length];
	        for (int i = 0; i < matriz.length; i++) {
	            for (int j = 0; j < matriz[0].length; j++) {
	                matrizAux[i][j] = matriz[i][j];
	            }
	        }
	        matrizAux[matriz.length][0] = numero;

	        return matrizAux;
	    }
	}

