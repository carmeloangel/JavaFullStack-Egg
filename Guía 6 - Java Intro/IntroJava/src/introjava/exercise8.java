/**
 * EJERCICIO 8.
 * Escriba un programa que valide si una nota está entre 0 y 10, sino está entre
 * 0 y 10 la nota se pedirá de nuevo hasta que la nota sea correcta.
 */
package introjava;

import java.util.Scanner;

public class exercise8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        int opcion=0;
        while (opcion < 1 || opcion > 10) {            
            System.out.print("Ingrese una nota entre 1 y 10: ");
            opcion = leer.nextInt();
        }
    }
}
