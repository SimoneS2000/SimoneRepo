import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
Estrazione di dati da una stringa
Scrivi un programma Java che chiede all'utente di inserire una stringa contenente informazioni strutturate, ad esempio una stringa nel formato
"Nome: John, Cognome: Doe, Età: 25".
 Utilizza espressioni regolari per estrarre i valori dei diversi campi dalla stringa (come nome, cognome ed età) e stampali separatamente.
 */
public class Esercizio4 {
    public static void main(String[] args) {
        String frase="Nome: John, Cognome: Doe, Età: 25";
        String regex=": \\w+";
        String regex2="Nome: (.*), Cognome: (.*), Età: (.*)";

        Pattern pattern= Pattern.compile(regex);
        Matcher matcher= pattern.matcher(frase);
        while(matcher.find()){
           System.out.println(matcher.group());
        }
        Pattern pattern2= Pattern.compile(regex2);
        Matcher matcher2= pattern2.matcher(frase);
        while(matcher2.find()) {
            String nome = matcher2.group(1);
            String cognome = matcher2.group(2);
            String eta = matcher2.group(3);
            System.out.println(nome + " " + cognome + " " + eta);
        }
    }
}
