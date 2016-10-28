
package activitat1.pkg3_m9_uf2;

import java.util.concurrent.Callable;




public class Fils  implements Callable{
    private int num;

    public Fils(int num) {
        this.num = num;
    }

    @Override
    public Object call() throws Exception {
        return (this.num % 2 == 0) && (this.num % 3 == 0);
    }
    
    
}
