package rectangles.service;

import java.util.Scanner;
import rectangles.entity.Quadrate;

/**
 *
 * @author Angel Campos
 */
public class QuadrateService {

    private Scanner reader = new Scanner(System.in).useDelimiter("\n");

    public Quadrate createQuadrate() {

        System.out.print("Ingresar la base del triangulo: ");
        int side1 = reader.nextInt();

        System.out.print("Ingresar la altura del triangulo: ");
        int side2 = reader.nextInt();

        Quadrate q = new Quadrate(side1, side2);

        return q;
    }

    /**
     * Grafica el rectángulo
     * @param q 
     */
    public void graphQuadrate(Quadrate q) {
        for (int i = 0; i < q.getSide2(); i++) {
            if (i == 0 || (i == q.getSide2() - 1)) {
                for (int j = 0; j < q.getSide1(); j++) System.out.print(" *");
            } else {
                for (int j = 0; j < q.getSide1(); j++) {
                    if (j == 0 || (j == q.getSide1() - 1))
                        System.out.print(" *");
                    else {
                        System.out.print("  ");
                    }
                }
            }
            System.out.println("");
        }
    }
    
    //Faltan definir los metodos para calcular superficie y perímetro.
    //Que no se los hace porque son muy parecidos a los del ejercicio 2
}
