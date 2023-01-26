package nespresso;

import java.util.Scanner;
import nespresso.entity.CoffeeMaker;
import nespresso.service.CoffeeMakerService;

/**
 *
 * @author Angel Campos
 */
public class Main {

    private static Scanner reader = new Scanner(System.in).useDelimiter("\n");

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CoffeeMakerService cs = new CoffeeMakerService();

        CoffeeMaker c = cs.createCoffeeMaker();
//        CoffeeMaker c = null;
//        System.out.println(c.toString());

        cs.fillCoffeeMaker(c);
//        System.out.println(c.toString());

        cs.emptyCoffeeMaker(c);
//        System.out.println(c.toString()); 

        if (c != null) {
            System.out.print("Ingrese la cantidad (en ml) de cafe a agregar: ");
            cs.addCoffee(c, reader.nextInt());
            System.out.println(c.toString());

            System.out.print("Ingrese la capacidad (en ml) de la taza a llenar: ");
            cs.pourCup(reader.nextInt(), c);
            System.out.println(c.toString());
        }

    }

}
