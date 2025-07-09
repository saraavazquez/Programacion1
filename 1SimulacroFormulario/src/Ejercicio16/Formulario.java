//package ej16
//static --> compartida por todos los objetos. El DNI es compartido. Todos los objetos comparten la misma memoria. quitar el static 
// privado solo se puede acceder desde dentro de la clase, fuera de la clase no se utilizan para nada. Protegido acceso desde la misma clase y desde todas las que pertenezca a ello
// y público se puede acceder desde cualquier sitio 
package Ejercicio16;
	import java.util.Scanner;

	public class Formulario {
	    // Variables para almacenar los datos del formulario
	    static String nombre = "";
	    static String apellidos = "";
	    static String dni = "";
	    static String email = "";
	    
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Bucle principal
	        while (true) {
	        // Mostrar el menú
	        mostrarMenu();
	        int opcion = scanner.nextInt(); // Leer la opción del usuario
	        scanner.nextLine(); // Limpiar el buffer

	         // Menú
	            switch (opcion) {
	                case 1:
	                    rellenarNombre(scanner);
	                    break;
	                case 2:
	                    rellenarApellidos(scanner);
	                    break;
	                case 3:
	                    rellenarDNI(scanner);
	                    break;
	                case 4:
	                    rellenarEmail(scanner);
	                    break;
	                case 5:
	           // Verificar si todos los datos están completos
	                if (todosDatosCompletos()) {
	                System.out.println("Formulario completado correctamente.");
	                 return; // Salir del programa
	                  } else {
	                     System.out.println("No se puede salir del formulario. Le faltan datos por rellenar.");
	                    }
	                    break;
	                default:
	                System.out.println("Opción no válida. Por favor, elija una opción válida.");
	            }
	        }
	    }
	    
	    // Método para mostrar el menú
	    public static void mostrarMenu() {
	    	System.out.println(" ");
	        System.out.println("Menú:");
	        System.out.println("1.- Rellenar nombre.");
	        System.out.println("2.- Rellenar apellidos.");
	        System.out.println("3.- Rellenar DNI.");
	        System.out.println("4.- Rellenar e-mail.");
	        System.out.println("5.- Salir.");
	        System.out.println(" ");
	        System.out.print("Elija una opción del formulario: ");
	    }

	    // Métodos para rellenar los diferentes campos
	    public static void rellenarNombre(Scanner scanner) {
	        System.out.print("Introduce el nombre: ");
	        nombre = scanner.nextLine();
	    }

	    public static void rellenarApellidos(Scanner scanner) {
	        System.out.print("Introduce los apellidos: ");
	        apellidos = scanner.nextLine();
	    }

	    public static void rellenarDNI(Scanner scanner) {
	        System.out.print("Introduce el DNI: ");
	        dni = scanner.nextLine();
	    }

	    public static void rellenarEmail(Scanner scanner) {
	        System.out.print("Introduce el e-mail: ");
	        email = scanner.nextLine();
	    }

	    // Método para verificar si todos los datos están completos
	    public static boolean todosDatosCompletos() {
	        return !nombre.isEmpty() && !apellidos.isEmpty() && !dni.isEmpty() && !email.isEmpty();
	    }
	}

