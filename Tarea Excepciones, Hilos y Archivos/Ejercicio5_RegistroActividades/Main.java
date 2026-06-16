package Ejercicio5_RegistroActividades;

import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        int opcion;

        do {

            System.out.println("\n1. Agregar actividad");
            System.out.println("2. Mostrar actividades");
            System.out.println("3. Salir");

            System.out.print("Seleccione una opción: ");
            opcion = leer.nextInt();
            leer.nextLine();

            switch (opcion) {

                case 1:

                    try {

                        FileWriter archivo = new FileWriter("actividades.txt", true);

                        System.out.print(
                                "Ingrese una actividad: ");

                        String actividad = leer.nextLine();

                        archivo.write(
                                actividad + "\n");

                        archivo.close();

                        System.out.println(
                                "Actividad guardada.");

                    } catch (IOException e) {

                        System.out.println(
                                "Error al guardar.");
                    }

                    break;

                case 2:

                    try {

                        BufferedReader lector = new BufferedReader(
                                new FileReader("actividades.txt"));

                        String linea;

                        System.out.println(
                                "\nActividades registradas:\n");

                        while ((linea = lector.readLine()) != null) {

                            System.out.println(linea);
                        }

                        lector.close();

                    } catch (FileNotFoundException e) {

                        System.out.println(
                                "No existe el archivo de actividades.");

                    } catch (IOException e) {

                        System.out.println(
                                "Error al leer el archivo.");
                    }

                    break;

                case 3:

                    System.out.println("Saliendo...");
                    break;

                default:

                    System.out.println("Opción incorrecta.");
            }

        } while (opcion != 3);
    }
}
