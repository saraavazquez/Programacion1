package Ejercicio18;

public abstract class Articulo {
    private String codigo;
    private String titulo;

    public Articulo(String codigo, String titulo) {
        this.codigo = codigo;
        this.titulo = titulo;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getTitulo() {
        return titulo;
    }
    
    public abstract String getTipo();
}
