package javaejemplo;

/**
 * La clase Main es la clase principal que contiene el método de inicio (main)
 * para ejecutar la aplicación de ejemplo. En este método, se crean instancias de
 * las clases Libro y Reserva, y se muestra información sobre ellas por medio de
 * la salida estándar.
 */
public class Main {

    /**
     * El método principal (main) es el punto de entrada de la aplicación.
     * Se crean instancias de las clases Libro y Reserva y se muestra información
     * sobre ellas por medio de la salida estándar.
     *
     * @param args Los argumentos de línea de comandos (no se utilizan en este ejemplo).
     */
    public static void main(String[] args) {
        // Crear instancias de Libro
        Libro l1 = new Libro();
        Libro l2 = new Libro();

        // Crear instancias de Reserva
        Reserva r1 = new Reserva();
        Reserva r2 = new Reserva();

        // Mostrar información sobre las instancias creadas
        System.out.println("Libro 1: " + l1);
        System.out.println("Libro 2: " + l2);

        System.out.println("Reserva 1: " + r1);
        System.out.println("Reserva 2: " + r2);
    }
}
