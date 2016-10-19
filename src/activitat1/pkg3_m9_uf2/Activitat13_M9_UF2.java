
package activitat1.pkg3_m9_uf2;

import java.util.ArrayList;
import java.util.List;


public class Activitat13_M9_UF2 {
    

    public static void main(String[] args) {
        List<Fils> llistaResultatsMultiples2i3 = new ArrayList<Fils>();
        
        for (int i = 1; i <= 100; i++) {
            Fils fil = new Fils(int i);
            llistaResultatsMultiples2i3.add(fil);
        }
        
        
    }
    
}
