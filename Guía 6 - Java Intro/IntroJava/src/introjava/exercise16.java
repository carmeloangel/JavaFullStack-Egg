/**
 * EJERCICIO 16.
 * Realizar un algoritmo que rellene un vector de tamaño N con valores
 * aleatorios y le pida al usuario un numero a buscar en el vector. El programa
 * mostrará donde se encuentra el numero y si se encuentra repetido.
 */
package introjava;

import java.util.Scanner;

public class exercise16 {

    Scanner leer = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int number = 0;
        System.out.println("Ingrese la cantidad de numeros a crear.");
        number = readIntValue(number);
        int[] numbers = new int[number];
        loadRandomIntVector(numbers);
        showIntVector(numbers);
        searchNumberOnIntVector(numbers);

    }

    public static int readIntValue(int number) {
        Scanner leer = new Scanner(System.in);

        try {
            do {
                System.out.print("Ingrese un numero entero: ");
                number = leer.nextInt();
            } while (number < 1);
//        System.out.println("El numero ingresado es " + number);
        } catch (Exception e) {
            System.out.println("El valor ingresado es incorrecto.");
        }

        return number;
    }

    public static void loadRandomIntVector(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (Math.random() * 1000);
        }
    }

    public static void showIntVector(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("[" + numbers[i] + "]");
        }
        System.out.println("");
    }

    public static void searchNumberOnIntVector(int[] numbers) {
        System.out.print("Ingrese el número a buscar en el vector. ");
        int num = 0, acumulator = 0;
        num = readIntValue(num);
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == num) {
                acumulator += 1;
            }
        }
        if (acumulator > 0) {
            System.out.println("El valor " + num + " fue encontrado en el vector. ");
            if (acumulator > 1) System.out.println("Y ademas esta repetido.");
        } else 
            System.out.println("El numero pedido no fue encontrado.");

    }
}
