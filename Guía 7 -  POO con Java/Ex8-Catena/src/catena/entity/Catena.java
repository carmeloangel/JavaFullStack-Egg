/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package catena.entity;

/**
 *
 * @author Angel Campos
 */
public class Catena {
    private String phrase;
    private int longitude;

    public Catena() {
    }

    public Catena(String phrase) {
        this.phrase = phrase;
        this.longitude = phrase.length();
    }

    public String getPhrase() {
        return phrase;
    }

    public void setPhrase(String phrase) {
        this.phrase = phrase;
        this.longitude = phrase.length();
    }

    public int getLongitude() {
        return longitude;
    }

}
