package Ejercicio2;

// Importa la clase Scanner para leer datos desde la entrada estándar (teclado)
import java.util.Scanner;

// Clase principal que contiene el método main, punto de entrada del programa
public class Principal {

	// Método main: ejecuta el programa
	public static void main(String[] args) {

		// Crea un objeto Scanner para leer entrada del usuario
		Scanner scanner = new Scanner(System.in);

		// Variable booleana para controlar el bucle mientras el código postal no sea válido
		boolean codigoValido = false;

		// Bucle que se repite hasta que se introduzca un código postal válido
		while (!codigoValido) {
			// Solicita al usuario que introduzca un código postal
			System.out.print("Introduce el código postal: ");
			String codigoPostal = scanner.nextLine(); // Lee la entrada del usuario como una cadena

			try {
				// Intenta validar el código postal con un método estático de la clase CodigoPostal
				CodigoPostal.validar(codigoPostal);

				// Si no lanza excepción, el código postal es válido
				System.out.println("Código postal válido: " + codigoPostal);
				System.out.println("Hasta pronto");

				// Establece la variable a true para salir del bucle
				codigoValido = true;

			} catch (CodigoPostalInvalidoException e) {
				// Si se lanza la excepción, el código no es válido
				System.out.println("Error: " + e.getMessage()); // Muestra el mensaje de error
				System.out.println("Por favor, intenta nuevamente.\n"); // Solicita nuevo intento
			}
		}

	}
}
