package Ejercicio2;

// Definición de una clase de excepción personalizada que hereda de la clase Exception.
// Esta excepción se utilizará para indicar que un código postal es inválido.
public class CodigoPostalInvalidoException extends Exception {

	// Constructor que recibe un mensaje y lo pasa al constructor de la clase base (Exception).
	// Este mensaje describe el error que ocurrió.
	public CodigoPostalInvalidoException(String mensaje) {
		super(mensaje); // Llama al constructor de la clase padre Exception con el mensaje de error.
	}
}
