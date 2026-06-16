package Ejercicio4_CalculadoraSegura;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        try {

            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");

            System.out.print("Seleccione una opción: ");
            int opcion = leer.nextInt();

            System.out.print("Ingrese el primer número: ");
            double num1 = leer.nextDouble();

            System.out.print("Ingrese el segundo número: ");
            double num2 = leer.nextDouble();

            double resultado;

            switch (opcion) {

                case 1:
                    resultado = num1 + num2;
                    System.out.println("Resultado: " + resultado);
                    break;

                case 2:
                    resultado = num1 - num2;
                    System.out.println("Resultado: " + resultado);
                    break;

                case 3:
                    resultado = num1 * num2;
                    System.out.println("Resultado: " + resultado);
                    break;

                case 4:

                    if (num2 == 0) {
                        throw new ArithmeticException();
                    }

                    resultado = num1 / num2;

                    System.out.println("Resultado: " + resultado);
                    break;

                default:
                    System.out.println("Opción inválida.");
            }

        } catch (ArithmeticException e) {

            System.out.println(
                    "Error: No se puede dividir entre cero.");

        } catch (InputMismatchException e) {

            System.out.println(
                    "Error: Debe ingresar números válidos.");

        } finally {

            System.out.println("Proceso finalizado.");
        }
    }
}
