package Calculadora;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Calculadora B�sica ===");
        System.out.print("Ingresa el primer n�mero: ");
        double num1 = scanner.nextDouble();

        System.out.print("Ingresa el segundo n�mero: ");
        double num2 = scanner.nextDouble();

        System.out.print("Elige una operaci�n (+, -, *, /): ");
        char operacion = scanner.next().charAt(0);

        double resultado = 0;

        switch (operacion) {

            case '+':
                // resultado = num1 + num2;
                System.out.println("Operaci�n de suma a�n no implementada.");
                break;

            case '-':
                // resultado = num1 - num2;
                System.out.println("Operaci�n de resta a�n no implementada.");
                break;
            case '*':
                // resultado = num1 * num2;
                System.out.println("Operaci�n de multiplicaci�n a�n no implementada.");
                break;
            case '/':
                resultado = num1 / num2;
                //System.out.println("Operaci�n de divisi�n a�n no implementada.");
                break;
            default:
                System.out.println("Operaci�n no v�lida.");
                return;
        }

        //System.out.println("Resultado: " + resultado);
        scanner.close();
    }
}
