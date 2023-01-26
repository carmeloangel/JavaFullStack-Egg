/**
 * EJERCICIO 18 - adicionales.
 * Escriba un programa que averigüe si dos vectores de N enteros son iguales (la
 * comparación deberá detenerse en cuanto se detecte alguna diferencia entre los
 * elementos).
 */
package introjava;

import java.util.Scanner;

public class exercise18a {

    Scanner leer = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //Cargar un vector con tamanio ingresado y valores random
//        int number = 0;
//        System.out.println("Ingrese la cantidad de numeros a crear en cada vector.");
//        number = readIntValue(number);
//        int[] numbers1 = new int[number];
//        int[] numbers2 = new int[number];
//        loadRandomIntVector(numbers1);
//        loadRandomIntVector(numbers2);
//        
        //Probamos con vectores definidos
        int numbers1[] = {1, 2, 3, 89};
        int numbers2[] = {1, 2, 3, 89};

        //Mostramos los vectores
        showIntVector(numbers1);
        showIntVector(numbers2);

        //comparacion
        if (compareVectors(numbers1, numbers2)) {
            System.out.println("Los vetores son iguales.");
        } else {
            System.out.println("Los vectores son diferentes.");
        }
    }

    public static int readIntValue(int number) {
        Scanner leer = new Scanner(System.in);
        try {
            do {
                System.out.print("Ingrese un numero entero: ");
                number = leer.nextInt();
            } while (number < 1);
        } catch (Exception e) {
            System.out.println("El valor ingresado es incorrecto.");
        }
        return number;
    }

    public static void loadRandomIntVector(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (Math.random() * 100);
        }
    }

    public static void showIntVector(int[] numbers) {
        for (int number : numbers) {
            System.out.print("[" + number + "]");
        }
        System.out.println("");
    }

    public static boolean compareVectors(int[] vector1, int[] vector2) {
        boolean equality = true;
        for (int i = 0; i < vector1.length; i++) {
            if (vector1[i] != vector2[i]) {
                equality = false;
                break;
            }
        }
//        System.out.println(equality);
        return equality;
    }

}
