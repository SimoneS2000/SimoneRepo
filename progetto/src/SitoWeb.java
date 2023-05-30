import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SitoWeb {
    public static void main(String[] args) {
        //trovare la URL in una stringa

        String testoStringa="nostro sito web e': www.sitoweb.it oppure www.nuovosito.it";
        String regex="\\bwww\\.[a-zA-Z0-9]+\\.[a-z]{2,3}";

        Pattern pattern= Pattern.compile(regex);
        Matcher matcher= pattern.matcher(testoStringa);

        while(matcher.find()){
            System.out.println(matcher.group());
        }

        String regex2 = "^[a-zA-Z0-9]+@[a-zA-Z0-9]+\\.[a-zA-Z]{2,3}$";
        String email = "tiziocaio77@provami.it";
        String email2= "tizio_caio44@prova.it";
        String regex3 = "^[a-zA-Z0-9_]+@[a-zA-Z0-9]+\\.[a-zA-Z]{2,3}$";
        boolean isValid = email2.matches(regex3);
        System.out.println("Indirizzo valido: " + isValid);
        System.out.println(email2);
    }
}
