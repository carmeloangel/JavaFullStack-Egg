/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introjava;

import java.util.Scanner;

/**
 *
 * @author walter
 */
public class example1 {

    void example1() {
        Scanner leer = new Scanner(System.in);

        System.out.println("Casitasss");
        System.out.print("INgrese un nnumerillo: ");
        int num = leer.nextInt();
        System.out.print("INgrese un nombresillo: ");
        String nom = leer.next();
        System.out.println("El numero ingresado es " + num);
        System.out.println("El nombre ingresado es " + nom);
    }

}
