
package activitat1.pkg3_m9_uf2;

import java.util.concurrent.Callable;




public class Fils implements Callable <boolean>{
    int numComprovar;
    
    
    public Fils(int numero){
        this.numComprovar = numero;
    }
    
    

    public boolean Call() throws Exception{
        return (numComprovar % 2 == 0 && numComprovar % 3 == 0);
    }
}
