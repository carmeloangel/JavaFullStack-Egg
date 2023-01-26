package person.service;

import java.util.Scanner;
import person.entity.Person;

/**
 *
 * @author Angel Campos
 */
public class PersonService {

    private Scanner reader = new Scanner(System.in).useDelimiter("\n");

    private String readGender() {
        boolean flag = true;
        String option;

        do {
            System.out.println("Seleccione el genero de la persona. \n"
                    + "H - Para Hombre \n"
                    + "M - Para Mujer \n"
                    + "O - Para Otro");
            System.out.print("Escriba una opcion de las mencionadas: ");
            option = reader.next();
            option = option.toLowerCase();

            if (option.equals("h") || option.equals("m") || option.equals("o")) {
                flag = false;
            } else {
                System.out.println("AVISO: Debe ingresar una de las opciones mostradas.");
                flag = true;
            }

        } while (flag);

        return option;
    }

    private int readIntPositiveNumber() {
        int number;
        do {
            System.out.print("Escriba un numero entero positivo: ");
            number = reader.nextInt();
        } while (number <= 0);
        return number;
    }

    private float readFloatPositiveNumber() {
        float number;
        do {
            System.out.print("Escriba un numero positivo: ");
            number = reader.nextInt();
        } while (number <= 0);
        return number;
    }

    private String readName() {
        //Aqui faltaria validar que no se ingresen solo numeros
        //Aunque un nombre tambien podria ser solo un numero
        String name;
        do {
            System.out.print("Escriba un nombre: ");
            name = reader.next();
            name = name.trim();

        } while (name.length() < 2);
        return name;
    }

    public Person createPerson() {

        try {
            String name, gender;
            int age;
            float weight, height;

            System.out.println("Ingrese el nombre de la persona.");
            name = readName();

            System.out.println("Ingrese la edad. ");
            age = readIntPositiveNumber();

            gender = readGender();

            System.out.println("Ingrese el peso en kilogramos (kg). ");
            weight = readFloatPositiveNumber();

            System.out.println("Ingrese la altura en centímetros (cm). ");
            height = readFloatPositiveNumber();

            return new Person(name, age, gender, weight, height);

        } catch (Exception e) {
            System.out.println("ERROR: Ingresar los valores correctamente.");
        }

        return null;
    }

    public int calculateIMC(Person p) {
        float imc;
        int result = 2;
        if (p != null) {
            float height = p.getHeight() / 100;
            imc = p.getWeight() / (height * height);

            if (imc < 20) {
                result = -1;
            } else if (imc >= 20 && imc <= 25) {
                result = 0;
            } else {
                result = 1;
            }

        } else {
            System.out.println("ERROR: No se a creado o ingresado una persona.");
        }

        return result;
    }

    public void showIMC(Person p) {

        switch (calculateIMC(p)) {
            case -1:
                System.out.println(p.getName() + " esta por debajo de su peso ideal.");
                break;
            case 0:
                System.out.println(p.getName() + " esta dentro de su peso ideal.");
                break;
            case 1:
                System.out.println(p.getName() + " esta por encima de su peso ideal.");
                break;
            default:
                System.out.println("AVISO: Ocurrio un error al calcular el IMC.");
                break;
        }
    }

    public boolean isAdult(Person p) {
        if (p != null) {
            if (p.getAge() >= 18) {
                return true;
            }
        } else {
            System.out.println("ERROR: No se a creado o ingresado una persona.");
        }
        return false;
    }
    
    public void showIsAdult(Person p) {
        if (isAdult(p)) 
            System.out.println(p.getName() + " es mayor de edad.");
        else
            System.out.println(p.getName() + " es menor de edad.");
    }
     
   
}
