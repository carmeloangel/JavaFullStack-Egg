/**
 * EJERCICIO 18.
 * Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y
 * muestre la traspuesta de la matriz. La matriz traspuesta,se obtiene cambiando
 * sus filas por columnas (o viceversa).
 */
package introjava;

import java.util.Scanner;

public class exercise18 {

    Scanner leer = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int number = 0;
        int[][] numbers = new int[4][4];
        loadRandomIntMatrix(numbers);
        showIntMatrix(numbers);
        int[][] transposed = new int[4][4];
        makeTransposedIntMatrix(numbers, transposed);
        System.out.println("Se muestra la transpuesta:");
        showIntMatrix(transposed);
        
    }

    public static void loadRandomIntMatrix(int[][] numbers) {
        for (int[] number : numbers) {
            for (int j = 0; j < numbers.length; j++) {
                number[j] = (int) (Math.random() * 100);
            }
        }
    }

    public static void showIntMatrix(int[][] numbers) {
        for (int[] number : numbers) {
            for (int i : number) {
                System.out.print("[" + i + "] ");
            }
            System.out.println("");
        }
    }

    public static void makeTransposedIntMatrix(int[][] numbers, int[][] transposed) {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                transposed[j][i] = numbers[i][j];
            }
        }
    }

}
