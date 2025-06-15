package Calculadora;
import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Calculadora Básica ===");
        System.out.print("Ingresa el primer número: ");
        double num1 = scanner.nextDouble();

        System.out.print("Ingresa el segundo número: ");
        double num2 = scanner.nextDouble();

        System.out.print("Elige una operación (+, -, *, /): ");
        char operacion = scanner.next().charAt(0);

        double resultado = 0;

        switch (operacion) {
            case '+':
                // resultado = num1 + num2;
                System.out.println("Operación de suma aún no implementada.");
                break;
            case '-':
                // resultado = num1 - num2;
                System.out.println("Operación de resta aún no implementada.");
                break;
            case '*':
                // resultado = num1 * num2;
                System.out.println("Operación de multiplicación aún no implementada.");
                break;
            case '/':
                // resultado = num1 / num2;
                System.out.println("Operación de división aún no implementada.");
                break;
            default:
                System.out.println("Operación no válida.");
                return;
        }

        // System.out.println("Resultado: " + resultado);
        scanner.close();
    }
}
