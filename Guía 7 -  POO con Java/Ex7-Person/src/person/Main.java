package person;

import person.entity.Person;
import person.service.PersonService;

/**
 *
 * @author Angel Campos
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PersonService ps = new PersonService();
//        Person p = ps.createPerson();

        //Creamos 4 personas
        Person p1 = new Person("Este Ban", 26, "o", 85, 179);
        Person p2 = new Person("Diego Arma", 17, "h", 70, 172);
        Person p3 = new Person("Dora Explo", 23, "m", 68, 175);
        Person p4 = new Person("Hernan Tall", 35, "o", 70, 192);

        //Calculamos IMC y adultez de cada una. Y guardamos en variables
        int[] imcs = new int[4];
        imcs[0] = ps.calculateIMC(p1);
        ps.showIMC(p1);
        imcs[1] = ps.calculateIMC(p2);
        ps.showIMC(p2);
        imcs[2] = ps.calculateIMC(p3);
        ps.showIMC(p3);
        imcs[3] = ps.calculateIMC(p4);
        ps.showIMC(p4);

        boolean[] ads = new boolean[4];
        ads[0] = ps.isAdult(p1);
        ps.showIsAdult(p1);
        ads[1] = ps.isAdult(p2);
        ps.showIsAdult(p2);
        ads[2] = ps.isAdult(p3);
        ps.showIsAdult(p3);
        ads[3] = ps.isAdult(p4);
        ps.showIsAdult(p4);

        //Calculamos porcentas de personas por encima, debajo o a nivel IMC
        calculateIMCPercentages(imcs);

        //Calculamos porcentas de personas mayores y menores de edad
        calculateAdultsPercentages(ads);

    }

    /**
     * Calculamos porcentas de personas por encima, debajo o a nivel IMC. A
     * partir de un vector con los resultados de pruebas previas.
     *
     * @param imcs
     * @param elements
     */
    private static void calculateIMCPercentages(int[] imcs) {
        int imcEncima = 0, imcDebajo = 0, imcIdeal = 0;
        for (int imc : imcs) {
            switch (imc) {
                case -1:
                    imcDebajo += 1;
                    break;
                case 0:
                    imcIdeal += 1;
                    break;
                case 1:
                    imcEncima += 1;
                    break;
                default:
                    System.out.println("Ocurrio un error al calcular los porcentajes de IMC de cada persona.");
            }
        }
        
        imcDebajo = imcDebajo * 100 / imcs.length;
        imcIdeal = imcIdeal * 100 / imcs.length;
        imcEncima = imcEncima * 100 / imcs.length;
        
        System.out.println("** Balance de personas con por encima, debajo o en su IMC ideal.");
        System.out.println(
                "La cantidad personas por debajo de su peso ideal es del " + imcDebajo + "%. \n"
                + "En su peso ideal " + imcIdeal + "%. \n"
                + "Por encima de su peso ideal " + imcEncima + "%."
        );
    }

    /**
     * Calculaporcentaje de personas mayores y menores
     * @param ads 
     */
    private static void calculateAdultsPercentages(boolean[] ads) {
        
        int mayores = 0, menores = 0;
        for (boolean ad : ads) {
            if (ad) {
                mayores += 1;
            } else {
                menores += 1;
            }
        }
        mayores = mayores * 100 / ads.length;
        menores = menores * 100 / ads.length;
        
        System.out.println("** Balance de personas mayores y menores de edad.");
        System.out.println(
                "La cantidad personas mayores de edad es " + mayores + "%. \n"
                + "De menores " + menores + "%."
        );
    }

}
