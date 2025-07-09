package Ejercicio17;

public class Triangulo extends Figura2D {
    private double lado1;
    private double lado2;
    private double lado3;

    public Triangulo(String nombre, double lado1, double lado2, double lado3) {
        super(nombre);
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    @Override
    public double calcularPerimetro() {
        return lado1 + lado2 + lado3;
    }

    @Override
    public String toString() {
        return "Triángulo: [Nombre: " + getNombre() + ", Lado1: " + lado1 + ", Lado2: " + lado2 + ", Lado3: " + lado3 + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Triangulo that = (Triangulo) obj;
        return Double.compare(that.lado1, lado1) == 0 &&
               Double.compare(that.lado2, lado2) == 0 &&
               Double.compare(that.lado3, lado3) == 0 &&
               getNombre().equals(that.getNombre());
    }
}

