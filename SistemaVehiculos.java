import java.util.ArrayList;
import java.util.Scanner;

public class SistemaVehiculos {

    private ArrayList<Vehiculo> listaVehiculos;
    private Scanner entrada;

    public SistemaVehiculos() {
        listaVehiculos = new ArrayList<>();
        entrada = new Scanner(System.in);
    }

    public void registrarVehiculo() {

        System.out.println("\n=== Registrar Vehículo ===");

        System.out.print("Placa: ");
        String placa = entrada.nextLine();

        System.out.print("Marca: ");
        String marca = entrada.nextLine();

        System.out.print("Modelo: ");
        String modelo = entrada.nextLine();

        System.out.print("Año: ");
        int anio = entrada.nextInt();

        entrada.nextLine();

        System.out.print("Color: ");
        String color = entrada.nextLine();

        System.out.print("Precio: ");
        double precio = entrada.nextDouble();

        entrada.nextLine();

        Vehiculo vehiculo = new Vehiculo(
                placa, marca, modelo, anio, color, precio);

        listaVehiculos.add(vehiculo);

        System.out.println("Vehículo registrado correctamente.");
    }

    public void mostrarVehiculos() {

        if (listaVehiculos.isEmpty()) {
            System.out.println("No hay vehículos registrados.");
            return;
        }

        System.out.println("\n=== Lista de Vehículos ===");

        for (Vehiculo v : listaVehiculos) {
            v.mostrarInformacion();
        }
    }

    // Buscar por placa
    public void buscarPorPlaca() {

        System.out.print("Ingrese la placa: ");
        String placa = entrada.nextLine();

        boolean encontrado = false;

        for (Vehiculo v : listaVehiculos) {

            if (v.getPlaca().equalsIgnoreCase(placa)) {

                System.out.println("\nVehículo encontrado:");
                v.mostrarInformacion();
                encontrado = true;
            }
        }

        if (!encontrado) {
            System.out.println("Vehículo no encontrado.");
        }
    }

    public void mostrarPorMarca() {

        System.out.print("Ingrese la marca: ");
        String marca = entrada.nextLine();

        boolean encontrado = false;

        for (Vehiculo v : listaVehiculos) {

            if (v.getMarca().equalsIgnoreCase(marca)) {

                v.mostrarInformacion();
                encontrado = true;
            }
        }

        if (!encontrado) {
            System.out.println("No hay vehículos de esa marca.");
        }
    }
}