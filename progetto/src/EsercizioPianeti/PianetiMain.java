package EsercizioPianeti;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*creare un programma java per calcolare alcune informazioni su diversi corpi celesti, tra cui pianeti terrestri e pianeti gassosi.

1. Definisci un'interfaccia chiamata "Pianeta" con il seguente metodo:
   - contaPianeti()
   - scopriPianeta()
  // - calcolaGravita(): restituisce un valore double rappresentante l'accelerazione di gravità del pianeta.

2. Crea una classe chiamata "CorpoCeleste" che implementi l'interfaccia "Pianeta" e abbia i seguenti attributi:
   - nome (String): rappresenta il nome del corpo celeste.
   - tipo
   - distanza dal sole


3. Definisci le classi dei vari pianeti (es: PianetaTerra)

     - massa (double): rappresenta la massa del pianeta terrestre.
     - diametro (double): rappresenta il diametro del pianeta gassoso.

4. Nella classe principale "PianetiMain":
   - Crea una lista di tipo "CorpoCeleste".
   - Crea almeno due istanze di pianeti, uno terrestre e uno gassoso.
   - Aggiungi le istanze alla lista di corpi celesti.*/
public class PianetiMain {
    public static void main(String[] args) {
        Set<CorpoCeleste> setPianeti = new HashSet<>();
        PianetaImpl impl = new PianetaImpl();
        CorpoCeleste terra = new PianetaTerrestre("Terra", 150 * 10 ^ 6, 5972 * 10 ^ 24, 12000);
        CorpoCeleste giove = new PianetaGassoso("Giove", 778 * 10 ^ 6, 2 * 10 ^ 27, 69911 * 2);


        setPianeti.add(terra);
        setPianeti.add(giove);

        System.out.println(impl.contaPianeti(setPianeti));
        System.out.println(impl.scopriPianeta(setPianeti, terra));

//Crea un oggetto Consumer<CorpoCeleste> che stampi a schermo il nome di un pianeta. Usa questo consumer per stampare i nomi di tutti i corpi celesti nella lista.
        Consumer<CorpoCeleste> consumer = (pianeti) -> System.out.println(pianeti);
        setPianeti.forEach(consumer);
//Crea un oggetto Supplier<CorpoCeleste> che generi un nuovo pianeta con valori casuali per la massa e il diametro.
// Utilizza il supplier per generare un nuovo pianeta e aggiungerlo alla lista di corpi celesti.

        Supplier<CorpoCeleste> supplier = () -> {
            Random random = new Random();
            if (random.nextBoolean()) {
                return new PianetaTerrestre("Marte", 3 * 10 ^ 8, random.nextDouble(5972 * 10 ^ 24, 7000 * 10 ^ 24), random.nextDouble(100000, 200000));
            } else {
                return new PianetaGassoso("Saturno", 2 * 10 ^ 9, random.nextDouble(5972 * 10 ^ 24, 7000 * 10 ^ 24), random.nextDouble(100000, 200000));
            }
        };
//Crea un oggetto Runnable che stampi a schermo un messaggio quando viene eseguito.
// Ad esempio, "Esecuzione del calcolo della gravità...". Utilizza il runnable per eseguire il calcolo della gravità per ogni pianeta nella lista.

        Runnable runnable = () -> System.out.println("Sto aggiungendo un pianeta");

        System.out.println("--------------------------------------------");
        runnable.run();

        setPianeti.add(supplier.get());
        System.out.println(supplier.get() + "\n--------------------------------------------");
        setPianeti.forEach(consumer);


//Crea un oggetto Function<CorpoCeleste, Double> che prenda un pianeta come input e restituisca il rapporto tra la massa e il diametro del pianeta.

        Function<CorpoCeleste, Double> function = (pianeta) -> {
            double massaDiametro = pianeta.getMassa() / pianeta.getDiametro();
            return massaDiametro;
        };

        System.out.println("il rapporto tra massa e diametro del pianeta " + terra.getNome() + " e': " + function.apply(terra));
//Utilizza le espressioni regolari per effettuare la convalida dei dati inseriti per i pianeti.
// Ad esempio, puoi utilizzare una regex per verificare se il nome del pianeta è composto solo da lettere, se la massa e il diametro sono valori numerici validi, ecc.

        System.out.println("--------------------------------------------");
        String regex = "^[a-zA-Z]+$";
        boolean isValid = false;
        String nomePianeta = "";

        for (CorpoCeleste c : setPianeti) {
            nomePianeta = c.getNome();
            isValid = nomePianeta.matches(regex);
            if (isValid) {
                System.out.println("Il nome del pianeta " + nomePianeta + " e' composto solo da lettere");
            } else {
                System.out.println("Il nome del pianeta " + nomePianeta + " non e' composto solo da lettere");
            }
        }
    }
}
