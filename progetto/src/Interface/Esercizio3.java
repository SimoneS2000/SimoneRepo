package Interface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class Esercizio3 {
    public static void main(String[] args) {
        //3.Implementa una Function che prende in input una lista di stringhe e restituisce una nuova lista contenente solo le stringhe che iniziano con la lettera "A".
        List<String> listString2= Arrays.asList("Andiamo", "ciao", "Domani", "Adesso","allora");
        Consumer<String> consumer2=(strings)-> System.out.println(strings);

        Function<String, String> function=(strings)->{
            String parola="";
            if(strings.startsWith("A"))
                parola=strings;
            return parola;

        };

        listString2.stream().map(function).forEach(consumer2);
    }
}
