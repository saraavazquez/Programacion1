package Ejercicio18;

public class Pelicula extends Articulo {
    private String director;

    public Pelicula(String codigo, String titulo, String director) {
        super(codigo, titulo);
        this.director = director;
    }

    @Override
    public String getTipo() {
        return "Película";
    }

    public String getDirector() {
        return director;
    }
}