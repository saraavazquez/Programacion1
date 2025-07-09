package Ejercicio18;

public class Revista extends Articulo {
    private String periodicidad;

    public Revista(String codigo, String titulo, String periodicidad) {
        super(codigo, titulo);
        this.periodicidad = periodicidad;
    }

    @Override
    public String getTipo() {
        return "Revista";
    }

    public String getPeriodicidad() {
        return periodicidad;
    }
}