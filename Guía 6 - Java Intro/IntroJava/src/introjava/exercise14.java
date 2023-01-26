/**
 * EJERCICIO 14
 * Utilizando un Bucle for, aloja en el vector Equipo, los nombres de tus
 * compañeros de equipo
 */
package introjava;

import java.util.Scanner;

public class exercise14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        int cantidad = totalElements();
        String[] nombreCompanieros = new String[cantidad];
        loadStringVector(nombreCompanieros);

    }

    public static int totalElements() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de elementos a procesar: ");
        int cantidad;
        do {
            System.out.print("Ingrese un numero entero (10mil max): ");
            cantidad = leer.nextInt();
        } while (cantidad < 1 || cantidad > 10000);

        return cantidad;
    }

    public static void loadStringVector(String[] names) {
        Scanner leer = new Scanner(System.in);
        for (int i = 0; i < names.length; i++) {
            System.out.print("Ingrese el " + (i + 1) + "º elemento: ");
            names[i] = leer.next();
        }
    }

}
