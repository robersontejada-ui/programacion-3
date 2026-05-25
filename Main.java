import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        SistemaVehiculos sistema = new SistemaVehiculos();

        int opcion;

        do {

            System.out.println("\n====================================");
            System.out.println("      REGISTRO DE VEHÍCULOS");
            System.out.println("====================================");

            System.out.println("1. Registrar vehículo");
            System.out.println("2. Mostrar vehículos");
            System.out.println("3. Buscar vehículo por placa");
            System.out.println("4. Mostrar vehículos por marca");
            System.out.println("5. Salir");

            System.out.print("Seleccione una opción: ");
            opcion = entrada.nextInt();

            entrada.nextLine();

            switch (opcion) {

                case 1:
                    sistema.registrarVehiculo();
                    break;

                case 2:
                    sistema.mostrarVehiculos();
                    break;

                case 3:
                    sistema.buscarPorPlaca();
                    break;

                case 4:
                    sistema.mostrarPorMarca();
                    break;

                case 5:
                    System.out.println("Saliendo del sistema...");
                    break;

                default:
                    System.out.println("Opción inválida.");
            }

        } while (opcion != 5);
    }
}