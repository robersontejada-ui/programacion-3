
package Ejercicio2_CarreraCorredores;

public class Corredor extends Thread {

    private static String ganador = "";

    public Corredor(String nombre) {
        super(nombre);
    }

    @Override
    public void run() {

        try {

            for (int i = 1; i <= 10; i++) {

                System.out.println(getName() +
                        " avanzó al metro " + i);

                Thread.sleep((int) (Math.random() * 1000));
            }

            System.out.println(getName() + " llegó a la meta.");

            synchronized (Corredor.class) {
                if (ganador.isEmpty()) {
                    ganador = getName();
                }
            }

        } catch (InterruptedException e) {
            System.out.println("Error en la carrera.");
        }
    }

    public static String getGanador() {
        return ganador;
    }
}
