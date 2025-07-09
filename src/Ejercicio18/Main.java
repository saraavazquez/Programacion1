package Ejercicio18;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Biblioteca biblioteca = new Biblioteca();
        
        while (true) {
            mostrarMenu();
            int opcion = scanner.nextInt();
            scanner.nextLine();  // Limpiar el buffer
            switch (opcion) {
                case 1: // Dar de alta un usuario
                    System.out.print("Introduzca el ID del usuario: ");
                    String id = scanner.nextLine();
                    System.out.print("Introduzca el nombre del usuario: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Introduzca la dirección del usuario: ");
                    String direccion = scanner.nextLine();
                    Usuario usuario = new Usuario(id, nombre, direccion);
                    biblioteca.altaUsuario(usuario);
                    break;

                case 2: // Dar de alta un artículo
                    System.out.print("Introduzca el código del artículo: ");
                    String codigo = scanner.nextLine();
                    System.out.print("Introduzca el título del artículo: ");
                    String titulo = scanner.nextLine();
                    System.out.print("Elija el tipo de artículo (1: Libro, 2: Revista, 3: Película): ");
                    int tipoArticulo = scanner.nextInt();
                    scanner.nextLine(); // Limpiar el buffer
                    
                    Articulo articulo = null;
                    switch (tipoArticulo) {
                        case 1:
                            System.out.print("Introduzca el autor del libro: ");
                            String autor = scanner.nextLine();
                            articulo = new Libro(codigo, titulo, autor);
                            break;
                        case 2:
                            System.out.print("Introduzca la periodicidad de la revista: ");
                            String periodicidad = scanner.nextLine();
                            articulo = new Revista(codigo, titulo, periodicidad);
                            break;
                        case 3:
                            System.out.print("Introduzca el director de la película: ");
                            String director = scanner.nextLine();
                            articulo = new Pelicula(codigo, titulo, director);
                            break;
                        default:
                            System.out.println("Tipo de artículo no válido.");
                            continue;
                    }
                    biblioteca.altaArticulo(articulo);
                    break;

                case 3: // Hacer un préstamo
                    System.out.print("Introduzca el ID del usuario: ");
                    String idUsuario = scanner.nextLine();
                    System.out.print("Introduzca el código del artículo: ");
                    String codigoArticulo = scanner.nextLine();
                    biblioteca.realizarPrestamo(idUsuario, codigoArticulo);
                    break;

                case 4: // Salir
                    System.out.println("Gracias por usar la biblioteca.");
                    scanner.close();
                    return;

                default:
                    System.out.println("Opción no válida.");
            }
        }
    }

    public static void mostrarMenu() {
        System.out.println("\nMenu:");
        System.out.println("1.- Dar de alta un usuario.");
        System.out.println("2.- Dar de alta un artículo.");
        System.out.println("3.- Hacer un préstamo.");
        System.out.println("4.- Salir.");
        System.out.print("Elija una opción: ");
    }
}
