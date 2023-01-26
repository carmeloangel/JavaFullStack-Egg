/**
 * EJERCICIO 9
 * Escriba un programa que pida una frase o palabra y valide si la primera letra
 * de esa frase es una ‘A’. Si la primera letra es una ‘A’, se deberá de 
 * imprimir un mensaje por pantalla que diga “CORRECTO”, en caso contrario, 
 * se deberá imprimir “INCORRECTO”. Nota: investigar la función Substring y 
 * equals() de Java.
 */
package introjava;

import java.util.Scanner;

public class exercise9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        String phrase = "";
        System.out.print("Ingrese un palabra o frase que empueze con 'A': ");
        phrase = leer.next();
//        System.out.println(phrase.substring(0,1));
        if (phrase.substring(0,1).equalsIgnoreCase("a")){            
            System.out.println("CORRECTO");
        } else {
            System.out.println("INCORRECTO");
        }

    }

    

}
