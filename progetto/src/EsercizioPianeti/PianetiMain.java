package EsercizioPianeti;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

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
        CorpoCeleste terra = new PianetaTerrestre("Terra", 150*10^6, 5972*10^24);
        CorpoCeleste giove = new PianetaGassoso("Giove",    778*10^6 ,69911*2 );

        setPianeti.add(terra);
        setPianeti.add(giove);

        System.out.println(impl.contaPianeti(setPianeti));
        System.out.println(impl.scopriPianeta(setPianeti, terra));

//Crea un oggetto Consumer<CorpoCeleste> che stampi a schermo il nome di un pianeta. Usa questo consumer per stampare i nomi di tutti i corpi celesti nella lista.
        Consumer<CorpoCeleste> consumer=(pianeti)-> System.out.println(pianeti);
        setPianeti.forEach(consumer);
//Crea un oggetto Supplier<CorpoCeleste> che generi un nuovo pianeta con valori casuali per la massa e il diametro.
// Utilizza il supplier per generare un nuovo pianeta e aggiungerlo alla lista di corpi celesti.

        Supplier<CorpoCeleste> supplier=() ->{
            Random random=new Random();
            CorpoCeleste marte=new PianetaTerrestre("Marte", 3*10^8, random.nextDouble(5972*10^24,7000*10^24 ));
            return marte;
        };

        setPianeti.add(supplier.get());
        setPianeti.forEach(consumer);

//Crea un oggetto Runnable che stampi a schermo un messaggio quando viene eseguito.
// Ad esempio, "Esecuzione del calcolo della gravità...". Utilizza il runnable per eseguire il calcolo della gravità per ogni pianeta nella lista.

        Runnable runnable= () ->{

        };

//Crea un oggetto Function<CorpoCeleste, Double> che prenda un pianeta come input e restituisca il rapporto tra la massa e il diametro del pianeta.

      //  Function<CorpoCeleste, Double> function=(pianeta)->{

       // };

//Utilizza le espressioni regolari per effettuare la convalida dei dati inseriti per i pianeti.
// Ad esempio, puoi utilizzare una regex per verificare se il nome del pianeta è composto solo da lettere, se la massa e il diametro sono valori numerici validi, ecc.


    }
}
