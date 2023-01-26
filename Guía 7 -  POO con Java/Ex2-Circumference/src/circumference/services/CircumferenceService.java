/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package circumference.services;

import circumference.entity.Circumference;
import java.util.Scanner;

/**
 *
 * @author Angel Campos
 */
public class CircumferenceService {

    private final Scanner reader = new Scanner(System.in).useDelimiter("\n");
    private Circumference c;
    private boolean flag = false;

    public void createCircumference() {
        System.out.print("Ingrese el radio de la circunferencia: ");
        float radio = reader.nextFloat();
        c = new Circumference(radio);
        flag = true;

    }

    private float area(Circumference c) {
        return (float) (3.1415 * c.getRadio() * c.getRadio());
    }

    private float perimeter(Circumference c) {
        return (float) (2 * 3.1415 * c.getRadio());
    }
    
    public void showArea(){
        if (flag)
            System.out.println("El area de la circunferencia es: " + area(c));
        else 
            System.out.println("Aun no se ingreso el radio.");
    }
    
     public void showPerimeter(){
        if (flag)
            System.out.println("El perimetro de la circunferencia es: " + perimeter(c));
        else 
            System.out.println("Aun no se ingreso el radio.");
    }
}
