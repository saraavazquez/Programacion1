package Ejercicio17;

public class Circulo extends Figura2D {
	
	//Atributo
    private double radio;
    
    //Constructor con parámetros 
    public Circulo(String nombre, double radio) {
        super(nombre);
        this.radio = radio;
    }
    

    @Override
    public double calcularPerimetro() {
        return 2 * Math.PI * radio;
    }

    @Override
    public String toString() {
        return "Círculo: [Nombre: " + getNombre() + ", Radio: " + radio + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Circulo circulo = (Circulo) obj;
        return Double.compare(circulo.radio, radio) == 0 && getNombre().equals(circulo.getNombre());
    }
}

