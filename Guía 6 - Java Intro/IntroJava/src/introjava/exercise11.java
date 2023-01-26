/**
 * EJERCICIO 11.
 * scribir un programa que procese una secuencia de caracteres ingresada por
 * teclado y terminada en punto, y luego codifique la palabra o frase ingresada
 * de la siguiente manera: cada vocal se reemplaza por el carácter que se indica
 * en la tabla y el resto de los caracteres (incluyendo a las vocales acentuadas)
 * se mantienen sin cambios.
 * a e i o u
 *
 * @ # $ % *
 * Realice un subprograma que reciba una secuencia de caracteres y retorne la
 * codificación correspondiente. Utilice la estructura “según” para la
 * transformación. Por ejemplo, si el usuario ingresa: Ayer, lunes, salimos a
 * las once y 10. La salida del programa debería ser: @y#r, l*n#s, s@l$m%s @ l@s
 * %nc# y 10.
 */
package introjava;

import java.util.Scanner;

public class exercise11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        String phrase;
        do {
            System.out.print("Ingrese una frase: ");
            phrase = leer.nextLine();
        } while (phrase.length() < 2);

        System.out.println(codear(phrase));

    }

    public static String codear(String phrase) {
        String returnPhrase = "";

        for (char c : phrase.toCharArray()) {
            String caracter = String.valueOf(c).toLowerCase();
            switch (caracter) {
                case "a":
                    returnPhrase = returnPhrase.concat("@");
                    break;
                case "e":
                    returnPhrase = returnPhrase.concat("#");
                    break;
                case "i":
                    returnPhrase = returnPhrase.concat("$");
                    break;
                case "o":
                    returnPhrase = returnPhrase.concat("%");
                    break;
                case "u":
                    returnPhrase = returnPhrase.concat("*");
                    break;
                default:
                    returnPhrase = returnPhrase.concat(String.valueOf(c));
            }
        }

        return returnPhrase;
    }
}
