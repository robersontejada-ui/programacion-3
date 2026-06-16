package Ejercicio1_SimuladorDescargas;

public class Main {

    public static void main(String[] args) {

        Descarga archivo1 = new Descarga("Archivo1");
        Descarga archivo2 = new Descarga("Archivo2");
        Descarga archivo3 = new Descarga("Archivo3");

        archivo1.start();
        archivo2.start();
        archivo3.start();
    }
}
