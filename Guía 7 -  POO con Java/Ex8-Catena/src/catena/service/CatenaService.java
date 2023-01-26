/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package catena.service;

import catena.entity.Catena;
import java.util.Scanner;

/**
 *
 * @author Angel Campos
 */
public class CatenaService {

    private Scanner reader = new Scanner(System.in).useDelimiter("\n");

    private String readPhrase() {
        //Aqui faltaria validar que no se ingresen solo numeros
        //Aunque una frase tambien podria ser solo un numeros
        String phrase;
        do {
            System.out.print("Escriba una frase: ");
            phrase = reader.next();
            phrase = phrase.trim();

        } while (phrase.length() < 2);
        return phrase;
    }

    public Catena createCatena() {

        try {
            String phrase;

            System.out.println("Ingrese una oración (puede separar con espacios).");
            phrase = readPhrase();
            return new Catena(phrase);

        } catch (Exception e) {
            System.out.println("ERROR: Ingresar los valores correctamente.");
        }

        return null;

    }

    public int showBowels(Catena c) {

        int bowels = -1;

        if (c != null) {
            bowels = 0;
            for (int i = 0; i < c.getLongitude(); i++) {
                switch (c.getPhrase().toLowerCase().charAt(i)) {
                    case 'a':
                        bowels++;
                        break;
                    case 'e':
                        bowels++;
                        break;
                    case 'i':
                        bowels++;
                        break;
                    case 'o':
                        bowels++;
                        break;
                    case 'u':
                        bowels++;
                        break;
//                    default:
//                        throw new AssertionError();
                }

            }

        } else {
            System.out.println("ERROR: No se a creado o ingresado una cadena.");
        }

        System.out.println("La cantidad de vocales en la cadena es " + bowels);

        return bowels;
    }

    public void invertPhrase(Catena c) {
        String aux = "";

        if (c != null) {

            for (int i = c.getLongitude(); i > 0; i--) {
                aux += c.getPhrase().substring(i - 1, i);
            }

            System.out.println("La cadena '" + c.getPhrase() + "', invertida seria '"
                    + aux + "'.");

        } else {
            System.out.println("ERROR: No se a creado o ingresado una cadena.");
        }

    }

    public String readCharacter() {
        boolean flag = true;
        String letter = "";

        do {
            System.out.print("Ingrese un solo caracter: ");
            letter = reader.next();
            letter = letter.trim();
            if (letter.length() == 1) {
                flag = false;
            }
        } while (flag);

        return letter;
    }

    public void countRepeat(Catena c, String letter) {
        String aux = "";
        int counter = 0;

        if (c != null) {

            if (!letter.isEmpty()) {
                for (int i = 0; i < c.getLongitude(); i++) {
                    if (letter.equalsIgnoreCase(c.getPhrase().substring(i, i + 1))) {
                        counter++;
                    }
                }
                System.out.println("El caracter '" + letter + "', se repite "
                        + counter + " veces en la frase '" + c.getPhrase() + "'. ");
            } else {
                System.out.println("No se ingreso el caracter a buscar.");
            }

        } else {
            System.out.println("ERROR: No se a creado o ingresado una cadena.");
        }

    }

    public void comparePhraseLong(Catena c, String phrase) {

        if (c != null) {

            if (phrase.length() == c.getLongitude()) {
                System.out.println("Las frase ingresada tiene la misma longitud que la del objeto.");
            } else {
                System.out.println("Las frase ingresada No tiene la misma longitud que la del objeto.");
            }

        } else {
            System.out.println("ERROR: No se a creado o ingresado una cadena.");
        }

    }

    public void joinStrings(Catena c, String phrase) {
        if (c != null && !phrase.isEmpty()) {

            c.setPhrase(c.getPhrase().concat(phrase));

            System.out.println("La frase resultante es " + c.getPhrase());

        } else {
            System.out.println("ERROR: No se a creado o ingresado una cadena.");
        }
    }

    public void replaceA(Catena c, String letter) {
        String aux = "";

        if (c != null && !letter.isEmpty()) {

            aux = c.getPhrase().replaceAll("a", letter);
            aux = aux.replaceAll("A", letter);

            System.out.println("La nueva cadena con sus 'A' reemplazadas por '"
                    + letter + "', es: " + aux);

        } else {
            System.out.println("ERROR: No se a creado o ingresado una cadena.");
        }

    }

    public boolean containLetter(Catena c, String letter) {

        if (c != null && !letter.isEmpty()) {

            if (c.getPhrase().contains(letter)) {
                return true;
            }

        } else {
            System.out.println("ERROR: No se a creado o ingresado una cadena.");
        }
        return false;
    }
}
