
package activitat1.pkg3_m9_uf2;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;


public class Activitat13_M9_UF2 {
    

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        //Creación de los hilos.
        ThreadPoolExecutor executor = (ThreadPoolExecutor) Executors.newFixedThreadPool(3);

        //Creación del array que contendra los multiples.
        ArrayList<Future<Boolean>> multiples = new ArrayList();
        

        //Este bucle añade al arrayList de multiples los muliples de 2 i 3
        for (int i = 0; i <= 100; i++) {
            multiples.add(executor.submit(new Fils(i)));
        }
                
        
        //Este bucle nos muestra los multiples que hemos guardado en el array anterior.
        for (int i = 4; i < multiples.size(); i++) {
            if (multiples.get(i).get()) {
                System.out.println(i + " és múltiple.");
            }
        }
        
        //Se cierra el executor.
        executor.shutdown();
        
        
    }
    
}
