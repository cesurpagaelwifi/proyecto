package daw;
//Bibliotecas
import java.util.Scanner;

public class Proyecto {
	
	public static void main(String[]args) {
		Scanner sc= new Scanner(System.in);
		int i = 1;
		int opcion=0;
		int j = 2;
		
	String [][]datos=new String[i][j];
	
	while (opcion != 4) {
	System.out.println("Opcion");
	opcion = sc.nextInt();
	
	switch(opcion) {
	case 1:
		registroUsuario(sc, datos);
		break;
		
	case 2:
		inicioSesion(sc, datos);
		break;
		
	}
	}
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
		
	}
	public static void inicioSesion(Scanner sc, String[][]datos) {
	
	        System.out.println("Ingrese su nombre de usuario: ");
	        String nombreUsuario = sc.nextLine();
	        System.out.println("Ingrese su contraseña: ");
	        String contraseña = sc.nextLine();

	     
	        boolean existeUsuario = false;
	        for (int i = 0; i < datos.length; i++) {
	            if (datos[i][0].equals(nombreUsuario)) {
	                existeUsuario = true;

	                if (datos[i][1].equals(contraseña)) {
	                    System.out.println("Inicio de sesión exitoso");
	                } else {
	                    System.out.println("La contraseña es incorrecta");
	                }
	                break;
	            }
	        }

	        if (!existeUsuario) {
	            System.out.println("El usuario no existe");
	        }
	    }
	}
