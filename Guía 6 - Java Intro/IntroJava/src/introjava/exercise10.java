/**
 * EJERCICIO 10.
 * Realizar un programa que lea 4 números (comprendidos entre 1 y 20) e imprima 
 * el número ingresado seguido de tantos asteriscos como indique su valor. 
 * Por ejemplo:
 * 5 *****
 * 3 *** 
 * 11 *********** 
 * 2 **
 */
package introjava;

import java.util.Scanner;

public class exercise10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        int opcion;
        do {
            System.out.print("Ingrese un numero entre 1 y 20: ");
            opcion = leer.nextInt();            
        } while (opcion < 1 || opcion > 20);
        
        System.out.print(opcion + " ");
        
        for (int i = 1; i <= opcion; i++) {
            System.out.print("*");
        }
        System.out.println("");
        
    }
}
