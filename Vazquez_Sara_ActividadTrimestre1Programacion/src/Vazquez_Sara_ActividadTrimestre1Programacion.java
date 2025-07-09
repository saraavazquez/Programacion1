import java.util.Scanner;

public class Vazquez_Sara_ActividadTrimestre1Programacion{
    // Definir constantes para los pagos por hora según la clase
    private static final int SALARIO_CLASE_A = 25;
    private static final int SALARIO_CLASE_B = 20;
    private static final int SALARIO_CLASE_C = 15;
    private static final int SALARIO_CLASE_D = 10;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            // Solicitar horas trabajadas
            System.out.print("Ingrese el número de horas trabajadas en la semana: ");
            int horasSemanales = scanner.nextInt();
            int horasMensuales = horasSemanales * 4; // 4 semanas en un mes

            // Solicitar la clase del trabajador
            System.out.print("Ingrese la clase del trabajador (A, B, C, D): ");
            char clase = scanner.next().toUpperCase().charAt(0);

            // Determinar el salario por hora según la clase
            int salarioHora;
            switch (clase) {
                case 'A':
                    salarioHora = SALARIO_CLASE_A;
                    break;
                case 'B':
                    salarioHora = SALARIO_CLASE_B;
                    break;
                case 'C':
                    salarioHora = SALARIO_CLASE_C;
                    break;
                case 'D':
                    salarioHora = SALARIO_CLASE_D;
                    break;
                default:
                    System.out.println("Clase no válida. Inténtelo nuevamente.");
                    continue;
            }

            // Calcular salario bruto
            int salarioBruto = salarioHora * horasMensuales;

            // Calcular la retención de IRPF
            double irpf;

            if (salarioBruto > 1200) {
                irpf = 0.20; // Retención del 20% si el salario bruto es mayor a 1200
            } else {
                irpf = 0.15; // Retención del 15% si el salario bruto es menor o igual a 1200
            }
            
            double retencion = salarioBruto * irpf;
            double salarioNeto = salarioBruto - retencion;

            // Mostrar resultados
            System.out.println("-- Detalles del salario --");
            System.out.println("Horas trabajadas al mes: " + horasMensuales);
            System.out.println("Salario bruto: " + salarioBruto + "€");
            System.out.println("Retención IRPF (" + (irpf * 100) + "%): " + retencion + "€");
            System.out.println("Salario neto: " + salarioNeto + "€");

            // Preguntar si desea continuar
            System.out.print("¿Desea calcular otro salario? (S/N): ");
            char respuesta = scanner.next().toUpperCase().charAt(0);
            if (respuesta != 'S') {
                continuar = false;
            }
        }

        System.out.println("¡Gracias por usar el programa!");
        scanner.close();
    }
}



