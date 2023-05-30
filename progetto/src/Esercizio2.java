import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
Sostituzione di testo
Scrivi un programma Java che chiede all'utente di inserire una stringa da cercare e una parola da sostituire.
Utilizza un'espressione regolare per trovare tutte le occorrenze della parola da cercare nel testo e sostituirle con la parola specificata dall'utente.
stampa il testo modificato.
 */
public class Esercizio2 {
    public static void main(String[] args) {
        Scanner mioScanner=new Scanner(System.in);

        String frase="Ciao a tutti, come va?";
        System.out.println("inserire una parola da cercare all'interno del testo: \""+frase+"\"");
        String parolaDaCercare=mioScanner.nextLine();

        System.out.println("inserire una parola da sostiuire al posto di: "+parolaDaCercare);
        String parolaDaSostituire= mioScanner.nextLine();
        String regex="\\b"+parolaDaCercare;

        Pattern pattern= Pattern.compile(regex);
        Matcher matcher= pattern.matcher(frase);
        String fraseModificata="";
        while(matcher.find()){
            fraseModificata= frase.replaceAll(Pattern.quote(matcher.group()), parolaDaSostituire);

        }
        System.out.println(fraseModificata);

    }
}
