/*
 Implementar un programa que le pida dos números enteros a usuario y determine 
si ambos o alguno de ellos es mayor a 25.
 */
package introjava;

import java.util.Scanner;

/**
 *
 * @author walter
 */
public class exercise6 {

    void exercise6() {
        Scanner leer = new Scanner(System.in);

        System.out.print("Ingrese el primer numero: ");
        int num1 = leer.nextInt();
        System.out.print("Ingrese el segundo numero: ");
        int num2 = leer.nextInt();
        
        if (num1>num2) {
            System.out.println("El mayor es primer numero: " + num1);
        } 
        else if (num1==num2) {
            System.out.println("Los numeros son inguales.");
        } 
        else {
            System.out.println("El mayor es el segundo numero: " + num2);
        }
    }

}
