/**
 * EJERCICIO 12
 * Crea un procedimiento EsMultiplo que reciba los dos números pasados por el 
 * usuario, validando que el primer numero múltiplo del segundo y e imprima si 
 * el primer numero es múltiplo del segundo, sino informe que no lo son.
 */
package introjava;

import java.util.Scanner;

public class exercise12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese el 1er número: ");
        float num1 = leer.nextFloat();
        System.out.print("Ingrese el 2do número: ");
        float num2 = leer.nextFloat();
        EsMultiplo(num1, num2);

    }

    public static void EsMultiplo(float num1, float num2) {
        if (num2 % num1 == 0) {
            System.out.println("El número " + num2 + " es múltiplo del numero "
                    + num1);
        } else {
            System.out.println("El primer numero no es múltiplo del segundo.");
        }
    }
}
