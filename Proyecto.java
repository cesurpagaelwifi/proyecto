package daw;

import java.util.Scanner;

public class Proyecto {
	
	public static void main(String[]args) {
		Scanner sc= new Scanner(System.in);
		int i = 1;
		int opcion;
		int j = 2;
		int bucle=0;
	String [][]datos=new String[i][j];
	do {
	System.out.println("Opcion");
	opcion = sc.nextInt();
	switch(opcion) {
	case 1:
		registroUsuario(sc, datos);
		break;
		
	case 2:
		bucle++;
		inicioSesion(sc, datos);
		break;
		
	case 3:
		for(int k=0;k < datos.length;k++) {
			for (int l=0; l< datos[k].length;l++) {
				System.out.println(datos[k][l] + "");
			}
		}
		break;
		
	}
	}while(bucle==0);
	sc.close();
	for (i = 0; i < datos.length; i++) {
		System.out.println(datos[i][0] + " -> " + datos[i][1]);
	}
	}
	
	public static void registroUsuario(Scanner sc, String [][] datos) {
		System.out.println("Usuario");
		String nuevoUsuario= sc.next();
		System.out.println("Contraseña");
		String nuevaContrasela= sc.next();
		for(int i=0; i<datos.length; i++) {
			datos[i][0]=nuevoUsuario;
			datos[i][1]=nuevaContrasela;
			
			
		}
		return;
		
	}
	
	public static void inicioSesion(Scanner sc, String[][]datos) {
			int bucle=1;
				while(bucle!=4){
			        for (int i = 0; i < datos.length; i++) {
	        		System.out.println("Ingrese su nombre de usuario: ");
	    	        String nombreUsuario = sc.nextLine();
		        	System.out.println("Ingrese su contraseña: ");
			        String contraseña = sc.nextLine();
			        
			        if(nombreUsuario.equals(datos[i][0])&&contraseña.equals(datos[i][1])) {
			        	System.out.println("Acceso permitido");
			        	
			        
			        }else {
				        bucle++;

		        	System.err.println("Inicio de sesion fallido");
		        }
				}
	}
}
}