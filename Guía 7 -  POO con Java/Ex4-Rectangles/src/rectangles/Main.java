
package rectangles;

import rectangles.entity.Quadrate;
import rectangles.service.QuadrateService;

/**
 *
 * @author Angel Campos
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        QuadrateService qs = new QuadrateService();
        
        Quadrate q = qs.createQuadrate();
        
        qs.graphQuadrate(q);
        
    }
    
}
