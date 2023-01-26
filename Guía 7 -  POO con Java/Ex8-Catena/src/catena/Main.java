package catena;

import catena.entity.Catena;
import catena.service.CatenaService;
import java.util.Scanner;

/**
 *
 * @author Angel Campos
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in).useDelimiter("\n");
        CatenaService cs = new CatenaService();

        Catena c = cs.createCatena();

//        cs.showBowels(c);

//        cs.invertPhrase(c);

//        cs.countRepeat(c, cs.readCharacter());

//        System.out.print("Ingrese una frase para compara con la longitud del la ya cargada: ");
//        cs.comparePhraseLong(c, reader.next());

//        System.out.print("Ingrese una frase para agregar a la ya cargada: ");
//        cs.joinStrings(c, reader.next());

//        cs.replaceA(c, cs.readCharacter());

        if (cs.containLetter(c, cs.readCharacter())) {
            System.out.println("El objeto cadena contiene la letra buscada.");
        } else {
            System.out.println("El objeto cadena NO contiene la letra buscada.");
        }
    }

}
