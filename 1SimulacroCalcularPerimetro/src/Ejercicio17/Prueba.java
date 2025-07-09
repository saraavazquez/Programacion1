package Ejercicio17;
import java.util.ArrayList;
public class Prueba {

	
    public static void main(String[] args) {
        ArrayList<Figura2D> figuras = new ArrayList<>();
        
        // Crear objetos de cada figura
        Circulo circulo = new Circulo("Círculo1", 5);
        Rectangulo rectangulo = new Rectangulo("Rectángulo1", 4, 6);
        Triangulo triangulo = new Triangulo("Triángulo1", 3, 4, 5);
        
        // Agregar las figuras al ArrayList
        figuras.add(circulo);
        figuras.add(rectangulo);
        figuras.add(triangulo);
        
        // Recorrer y mostrar nombre y perímetro de cada figura
        for (Figura2D figura : figuras) {
            System.out.println(figura.toString());
            System.out.println("Perímetro: " + figura.calcularPerimetro());
            System.out.println();
        }
    }
}