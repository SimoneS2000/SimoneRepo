import java.util.Scanner;

/*
Validazione di un indirizzo IP
Scrivi un programma Java che chiede all'utente di inserire un indirizzo IP e verifica se l'indirizzo inserito è valido.
 Utilizza un'espressione regolare per convalidare la struttura dell'indirizzo IP, controllando che sia nel formato corretto (es. "xxx.xxx.xxx.xxx")
 e che ogni parte dell'indirizzo sia compresa tra 0 e 255. Fai in modo che il programma stampi "Indirizzo IP valido" o "Indirizzo IP non valido"
 a seconda dell'esito della convalida.
 */
public class Esercizio9 {
    public static void main(String[] args) {
        Scanner mioScanner=new Scanner(System.in);
        System.out.println("Inserire in indirizzo ip");
        String indirizzo= mioScanner.nextLine();
        String regex="[0-9]{3}\\.[0-9]{3}\\.[0-9]{3}\\.[0-9]{3}";
        boolean isValid = indirizzo.matches(regex);
        if(isValid){
            System.out.println("il numero e' valido");
        }else
            System.out.println("il numero non e' valido");


    }
}
