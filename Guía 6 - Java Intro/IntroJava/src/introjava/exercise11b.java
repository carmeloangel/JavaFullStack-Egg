/**
 * EJERCICIO 11b.
 * Realizar un programa que pida dos números enteros positivos por teclado y
 * muestre por pantalla el siguiente menú:
 * MENU
 * 1. Sumar
 * 2. Restar
 * 3. Multiplicar
 * 4. Dividir
 * 5. Salir
 * Elija opción:
 * El usuario deberá elegir una opción y el programa deberá mostrar el
 * resultado por pantalla y luego volver al menú. El programa deberá
 * ejecutarse hasta que se elija la opción 5. Tener en cuenta que, si el
 * usuario selecciona la opción 5, en vez de salir del programa directamente,
 * se debe mostrar el siguiente mensaje de confirmación: ¿Está seguro que
 * desea salir del programa (S/N)? Si el usuario selecciona el carácter ‘S’
 * se sale del programa, caso contrario se vuelve a mostrar el menú.
 */
package introjava;

import java.util.Scanner;

public class exercise11b {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.print("Ingrese el primer numero: ");
        int num1 = leer.nextInt();
        System.out.print("Ingrese el segundo numero: ");
        int num2 = leer.nextInt();
        int option;
        String answer;
        boolean out = true;
        do {
            menu();
            option = leer.nextInt();
            answer = String.valueOf(option);
            switch (answer) {
                case "1":
                    System.out.println("La suma es " + (num1 + num2));
                    break;
                case "2":
                    System.out.println("La resta es " + (num1 - num2));
                    break;
                case "3":
                    System.out.println("La multiplicacion es " + (num1 * num2));
                    break;
                case "4":
                    System.out.println("La division es " + (num1 / num2));
                    break;
                case "5":
                    System.out.print("¿Está seguro que desea salir del programa (S/N)?: ");
                    answer = leer.next();
                    answer = answer.substring(0, 1).toLowerCase();
                    switch (answer) {
                        case "s":
                            out = false;
                            break;
                        case "n":
                            out = true;
                            break;
                        default:
                            System.out.println("Opcion incorrecta. Volvera al menu.");;
                    }
                    break;
                default:
                    System.out.println("Opcion incorrecta. Elija una de las posibles.");
            }
        } while (out);
        System.out.println("HASTA LUEGO");
    }

    public static void menu() {
        System.out.print("MENU\n"
                + " 1. Sumar\n"
                + " 2. Restar\n"
                + " 3. Multiplicar\n"
                + " 4. Dividir\n"
                + " 5. Salir\n"
                + "Elija opción: ");
    }

}
