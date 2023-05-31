import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
Ricerca e sostituzione di numeri romani
Scrivi un programma Java che legge un testo da input e utilizza un'espressione regolare per individuare tutti i numeri romani presenti nel testo.
Successivamente, converti ogni numero romano trovato nel corrispondente numero decimale e sostituisci il numero romano con il numero decimale nel testo.
Fai in modo che il programma stampi il testo modificato.

 */
public class Esercizio7 {
    public static void main(String[] args) {
        Scanner mioScanner = new Scanner(System.in);
        // System.out.println("inserire una frase: ");
        //  String frase=mioScanner.nextLine();
        List<String> numeriRomani = Arrays.asList("I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X");
        String frase = "sono passati X giorni ";

        String valore = "";
        Pattern pattern;
        Matcher matcher;
        String m = "";


        for (String n : numeriRomani) {
            pattern = Pattern.compile("\\b" + n);
            matcher = pattern.matcher(frase);
            while (matcher.find()) {
                m = matcher.group();
                if (n.contains(m)) {
                    valore = n;

                }
            }
        }

        String regex = "\\b" + valore;
        Pattern pattern2 = Pattern.compile(regex);
        Matcher matcher2 = pattern2.matcher(frase);
        String fraseModificata = "";
        while (matcher2.find()) {
            fraseModificata = frase.replaceAll(Pattern.quote(matcher2.group()), valoreDecimale(valore));
        }
        System.out.println(fraseModificata);
    }

    public static String valoreDecimale(String valore) {
        StringBuilder sb = new StringBuilder();
        switch (valore) {
            case "I":
                sb.append("1");
                break;
            case "II":
                sb.append("2");
                break;
            case "III":
                sb.append("3");
                break;
            case "IV":
                sb.append("4");
                break;
            case "V":
                sb.append("5");
                break;
            case "VI":
                sb.append("6");
                break;
            case "VII":
                sb.append("7");
                break;
            case "VIII":
                sb.append("8");
                break;
            case "IX":
                sb.append("9");
                break;
            case "X":
                sb.append("10");
                break;

        }
        return sb.toString();

    }
}
