/**
 * EJERCICIO 15.
 * Realizar un algoritmo que rellene un vector con los 100 primeros números 
 * enteros y los muestre por pantalla en orden descendente.
 */
package introjava;

import java.util.Scanner;

public class exercise15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        int[] numbers = new int[100];
        loadVectorIntX100(numbers);
        System.out.println("Se muestran los 100 elementos del vector en orden descendente");
        showReverseX100Vector(numbers);
        System.out.println("FIN DEL PROGRAMA");
        
    }

    public static void loadVectorIntX100(int[] numbers) {
        for (int i = 0; i < numbers.length; i++)             
            numbers[i] += (i+1);
    }
    
    public static void showReverseX100Vector(int[] numbers) {
        for (int i = numbers.length - 1; i >= 0; i--)             
            System.out.print("[" + numbers[i] + "]");
        System.out.println("");
    }

}
