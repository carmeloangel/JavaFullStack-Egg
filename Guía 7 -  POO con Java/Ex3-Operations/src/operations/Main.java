package operations;

import operations.entity.Operations;
import operations.services.OperationsService;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        OperationsService os = new OperationsService();
        
        Operations o = os.createOperation();
        
        System.out.println("La suma de los numeros ingresados es: " + os.add(o));
        
        System.out.println("La resta de los numeros ingresados es: " + os.subtract(o));
        
        float operation = os.multiply(o);
        if (operation != 0)
            System.out.println("El resultado de la multiplicacion es: " + operation);
        else
            System.out.println("Debe ingresar dos números distintos de cero.");
        
        operation = os.divide(o);
        if (operation != 0)
            System.out.println("El resultado de la disivión es: " + operation);
        else
            System.out.println("Debe ingresar dos números distintos de cero.");
    }
    
}
