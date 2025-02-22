import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("salida de datos");
        // este es un comentario
        /*
         * Este
         * es un
         * comentario
         * de
         * una
         * sola
         * linea
         */

        // variables y tipo de datos
        String namePrincipal = "johan";
        int edad = 20;
        float decimal = 23.32f;
        double decimalflotante = 12.32d;
        // concatenacion
        System.out.println("Esto son los datos" + namePrincipal + edad + decimal + decimalflotante);

        // condicionales

        if (edad == decimal) {
            System.out.println("------------------------------------");
            System.out.println("Este se cumple");
        } else if (namePrincipal == namePrincipal && namePrincipal == namePrincipal) {
            System.out.println("------------------------------------");
            System.out.println("Esto no se cumple");
        }

        // boleanos
        boolean boleanos = true;
        boolean boleanootro = false;
        System.out.println(boleanootro);
        System.out.println(boleanos);

        // ejercicio pasar de entero a decimal o flotante
        int numeroEntero = 23;
        float numeroNuevo = numeroEntero;
        System.out.println("Ejercicio de java");
        System.out.println(numeroEntero);
        System.out.println("El numero nuevo es : " + numeroNuevo);
        // entrada de datos

    }
}