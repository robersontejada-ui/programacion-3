package Ejercicio2_CarreraCorredores;

public class Main {

    public static void main(String[] args) {

        Corredor c1 = new Corredor("Juan");
        Corredor c2 = new Corredor("Pedro");
        Corredor c3 = new Corredor("Ana");
        Corredor c4 = new Corredor("Carlos");

        System.out.println("Estado inicial Juan: " + c1.getState());

        c1.start();
        c2.start();
        c3.start();
        c4.start();

        try {

            c1.join();
            c2.join();
            c3.join();
            c4.join();

        } catch (InterruptedException e) {
            System.out.println("Error.");
        }

        System.out.println("Estado final Juan: " + c1.getState());

        System.out.println("\nGanador: " + Corredor.getGanador());
    }
}
