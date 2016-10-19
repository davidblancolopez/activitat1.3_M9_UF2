
package activitat1.pkg3_m9_uf2;

import java.util.concurrent.Callable;




public class Fils implements Callable <Integer>{
    int numComprovar;
    
    
    public Fils(int numero){
        this.numComprovar = numero;
    }
    
    
    public Integer call(){
        
        if (numComprovar % 2 == 0) {
            
        }
        return 0;
    }
}
