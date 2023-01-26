
package operations.services;

import java.util.Scanner;
import operations.entity.Operations;

public class OperationsService {
    
    private Scanner reader = new Scanner(System.in).useDelimiter("\n");
    
    public Operations createOperation(){
        
        System.out.print("Ingresar el primer numero: ");
        int number1 = reader.nextInt();
        
        System.out.print("Ingresar el segundo numero: ");
        int number2 = reader.nextInt();
        
        Operations o = new Operations(number1, number2);
        
        return o;
    }
    
    public int add(Operations o ){   
        if ( o != null)
            return o.getNumber1() + o.getNumber2();
        else
            System.out.println("¡Aun no se ingresaron los numeros!");
        return 0;
    }
    
    public int subtract(Operations o ){    
         if ( o != null)
            return o.getNumber1() - o.getNumber2();
        else
            System.out.println("¡Aun no se ingresaron los numeros!");
        return 0;
    }
    
    public float multiply(Operations o ){    
        if ( o != null)
            if (o.getNumber1() != 0 && o.getNumber2() != 0)
                return (float) o.getNumber1() * o.getNumber2();
        else
            System.out.println("¡Aun no se ingresaron los numeros!");
        return 0;
    }
    
      public float divide(Operations o ){    
        if ( o != null)
            if (o.getNumber1() != 0 && o.getNumber2() != 0)
                return (float) o.getNumber1() / o.getNumber2();
        else
            System.out.println("¡Aun no se ingresaron los numeros!");
        return 0;
    }
}
