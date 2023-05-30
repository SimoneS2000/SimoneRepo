import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 Ricerca di parole
Scrivi un programma Java che chiede all'utente di inserire una stringa da cercare nel testo x.
Utilizza un'espressione regolare per trovare tutte le occorrenze della parola nel testo.
stampa le posizioni delle occorrenze trovate nel testo.
 */
public class Esercizio1 {
    public static void main(String[] args) {
        Scanner mioScanner=new Scanner(System.in);

        String frase="Ciao a tutti, come va?";
        System.out.println("inserire una parola da cercare all'interno del testo: \""+frase+"\"");
        String parola=mioScanner.nextLine();
        String regex="\\b"+parola;

        Pattern pattern= Pattern.compile(regex);
        Matcher matcher= pattern.matcher(frase);
        while(matcher.find()){
            System.out.println(matcher.group());
            System.out.println(matcher.start());
            System.out.println(matcher.end());
        }

    }
}
