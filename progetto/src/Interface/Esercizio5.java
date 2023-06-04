package Interface;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class Esercizio5 {
    public static void main(String[] args) {
//5.Combina le interfacce funzionali Consumer, Supplier, Function e Runnable per
// implementare un programma che genera una sequenza di numeri casuali, li filtra prendendo solo quelli pari, li eleva al quadrato e li stampa.
        List<Integer> numeriCasuali = new ArrayList<>();
        Supplier<Integer> supplier = () -> {
            Random random = new Random();
            return random.nextInt(1, 100);
        };

        Function<Integer, Integer> function = (interi) -> {
            int numeroPari = interi;
            int numeroAlQuadrato = 0;
            if (numeroPari % 2 == 0) {
                numeroAlQuadrato = numeroPari + numeroPari;
            }
            return numeroAlQuadrato;
        };

        Consumer<Integer> consumer = (intero) -> {
            if (intero == 0) {
                System.out.println("Non e' stato possibile calcolare il quadrato del numero perche' e' dispari");
            } else {
                System.out.println(intero);
            }
        };

        Runnable runnable = () -> {
            for (int i = 0; i < 5; i++) {
                numeriCasuali.add(supplier.get());
            }
            numeriCasuali.stream().map(function).forEach(consumer);
        };

        runnable.run();
    }
}