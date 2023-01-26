/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package circumference;

import circumference.services.CircumferenceService;

/**
 *
 * @author Angel Campos
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CircumferenceService cs = new CircumferenceService();
        
        cs.createCircumference();
        
        cs.showArea();
        
        cs.showPerimeter();
    }
    
}
