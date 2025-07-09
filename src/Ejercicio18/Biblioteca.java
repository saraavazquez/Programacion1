package Ejercicio18;

import java.util.HashMap;
import java.util.Map;

public class Biblioteca {
    private Map<String, Usuario> usuarios;
    private Map<String, Articulo> articulos;

    public Biblioteca() {
        usuarios = new HashMap<>();
        articulos = new HashMap<>();
    }

    // Dar de alta un usuario
    public boolean altaUsuario(Usuario usuario) {
        if (usuarios.containsKey(usuario.getId())) {
            System.out.println("El usuario ya existe.");
            return false;
        } else {
            usuarios.put(usuario.getId(), usuario);
            System.out.println("Usuario " + usuario.getNombre() + " dado de alta correctamente.");
            return true;
        }
    }

    // Dar de alta un artículo
    public boolean altaArticulo(Articulo articulo) {
        if (articulos.containsKey(articulo.getCodigo())) {
            System.out.println("El artículo ya existe.");
            return false;
        } else {
            articulos.put(articulo.getCodigo(), articulo);
            System.out.println("Artículo " + articulo.getTitulo() + " dado de alta correctamente.");
            return true;
        }
    }

    // Realizar un préstamo
    public void realizarPrestamo(String idUsuario, String codigoArticulo) {
        if (!usuarios.containsKey(idUsuario)) {
            System.out.println("El usuario no existe.");
            return;
        }
        if (!articulos.containsKey(codigoArticulo)) {
            System.out.println("El artículo no existe.");
            return;
        }

        // Aquí podrías gestionar el préstamo (ej. marcando como prestado)
        System.out.println("Préstamo realizado con éxito. Al usuario " + idUsuario + " se le ha prestado el artículo " + codigoArticulo);
    }
}
