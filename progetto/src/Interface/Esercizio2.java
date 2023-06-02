package Interface;

import java.util.Random;
import java.util.function.Supplier;

public class Esercizio2 {
    public static void main(String[] args) {
        //2.Implementa un Supplier che genera una sequenza di numeri interi casuali e restituisce la somma di questi numeri.
        Supplier<Integer> supplier=()->{
            Random random=new Random();
            int somma=0;
            for(int i=0; i<random.nextInt(1,10);i++){
                somma=somma+ random.nextInt(1,1000);
            }
            return somma;
        };
        System.out.println(supplier.get());
    }
}
