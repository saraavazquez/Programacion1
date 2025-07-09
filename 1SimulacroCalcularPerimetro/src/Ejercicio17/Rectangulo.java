package Ejercicio17;

public class Rectangulo extends Figura2D {
    private double base;
    private double altura;

    public Rectangulo(String nombre, double base, double altura) {
        super(nombre);
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * (base + altura);
    }

    @Override
    public String toString() {
        return "Rectángulo: [Nombre: " + getNombre() + ", Base: " + base + ", Altura: " + altura + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Rectangulo that = (Rectangulo) obj;
        return Double.compare(that.base, base) == 0 &&
               Double.compare(that.altura, altura) == 0 &&
               getNombre().equals(that.getNombre());
    }
}

