
package nespresso.service;

import java.util.Scanner;
import nespresso.entity.CoffeeMaker;

/**
 *
 * @author Angel Campos
 */
public class CoffeeMakerService {
    private Scanner reader = new Scanner(System.in).useDelimiter("\n");
    
    public CoffeeMaker createCoffeeMaker(){
        
        int max;
        
        boolean flag = true;

        try {
            do {
                System.out.print("Ingrese la capacidad máxima (en ml) de la cafetera: ");
                max = reader.nextInt();

                if (max > 0 ) {
                    flag = false;
                } else {
                    flag = true;
                    System.out.println("ERROR: Ingresar los valores correctamente.");
                }

            } while (flag);

            return new CoffeeMaker(max, 0);

        } catch (Exception e) {
            System.out.println("ERROR: Ingresar los valores correctamente.");
        }
        return null;
    }
    
    public void fillCoffeeMaker(CoffeeMaker c){
        if (c != null){
            c.setCurrentAmount(c.getMaximunCapacity());
        } else {
            System.out.println("ERROR: No se a creado o ingresado una cafetera.");
        }        
    }
    
    public void emptyCoffeeMaker(CoffeeMaker c){
        if (c != null){
            c.setCurrentAmount(0);
        } else {
            System.out.println("ERROR:  No se a creado o ingresado una cafetera.");
        }        
    }
    
    public void pourCup (int cupCapacity, CoffeeMaker c){
        if (c != null){
            if (c.getCurrentAmount() == 0) {
                System.out.println("La cafetera esta vacia");
            } else if (c.getCurrentAmount() < cupCapacity){
                System.out.println("La cefetera solo tiene " + c.getCurrentAmount() 
                        + "ml. Se agrega eso a la taza.");
                c.setCurrentAmount(0);
            } else {
                System.out.println("Se a llenado la taza");
                c.setCurrentAmount(c.getCurrentAmount() - cupCapacity);
            }
        } else {
            System.out.println("ERROR:  No se a creado o ingresado una cafetera.");
        }        
    }
    
    public void addCoffee(CoffeeMaker c, int coffeeQuantity){
        if (c != null){
           if (coffeeQuantity >= 0) {
                if (c.getCurrentAmount() + coffeeQuantity > c.getMaximunCapacity()) {
                System.out.println("Se supero la cantidad maxima, no se puede "
                        + "agregar esa cantidad de cafe.");
            } else {
                System.out.println("Se agrego el cantidad de " + coffeeQuantity +
                        "ml a la cafetera.");
                c.setCurrentAmount(c.getCurrentAmount() + coffeeQuantity);
            }
           } else {
               System.out.println("Se debe ingresar una cantidad positiva.");
           }
        } else {
            System.out.println("ERROR:  No se a creado o ingresado una cafetera.");
        }        
    }
    
}
