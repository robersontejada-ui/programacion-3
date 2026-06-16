package Ejercicio3_ValidadorEdad;

import java.util.Scanner;

public class Main {

    public static void validarEdad(int edad)
            throws EdadInvalidaException {

        if (edad < 18) {
            throw new EdadInvalidaException(
                    "Debe ser mayor de edad.");
        }
    }

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        try {

            System.out.print("Ingrese su edad: ");
            int edad = leer.nextInt();

            validarEdad(edad);

            System.out.println("Edad válida.");

        } catch (EdadInvalidaException e) {

            System.out.println("Error: " +
                    e.getMessage());

        } catch (Exception e) {

            System.out.println("Dato incorrecto.");
        }
    }
}
