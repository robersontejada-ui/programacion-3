package Ejercicio1_SimuladorDescargas;

public class Descarga extends Thread {

    private String nombreArchivo;

    public Descarga(String nombreArchivo) {
        this.nombreArchivo = nombreArchivo;
    }

    @Override
    public void run() {

        System.out.println("Iniciando descarga: " + nombreArchivo +
                " - Hilo: " + Thread.currentThread().getName());

        for (int i = 0; i <= 100; i += 20) {

            System.out.println(nombreArchivo + " " + i + "%");

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Error en la descarga.");
            }
        }

        System.out.println(nombreArchivo + " completado.");
    }
}