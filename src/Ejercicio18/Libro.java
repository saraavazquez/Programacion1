package Ejercicio18;

public class Libro extends Articulo {
    private String autor;

    public Libro(String codigo, String titulo, String autor) {
        super(codigo, titulo);
        this.autor = autor;
    }

    @Override
    public String getTipo() {
        return "Libro";
    }

    public String getAutor() {
        return autor;
    }
}
