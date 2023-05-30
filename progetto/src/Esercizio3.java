import java.util.Scanner;

/*
Convalida di un numero di telefono
Scrivi un programma Java che chiede all'utente di inserire un numero di telefono e verifica se il numero inserito è valido.
Utilizza un'espressione regolare per convalidare la struttura del numero di telefono, ad esempio, controllando il formato corretto,
 eventualmente con prefisso internazionale e separazione dei gruppi di numeri.
 Fai in modo che il programma stampi "Numero di telefono valido" o "Numero di telefono non valido" a seconda dell'esito della convalida.
 */
public class Esercizio3 {
    public static void main(String[] args) {
        Scanner mioScanner=new Scanner(System.in);
        String numeroDiTelefono= mioScanner.nextLine();
        String regex="^\\b39[0-9]{3}-[0-9]{4}-[0-9]{3}$";
        boolean isValid = numeroDiTelefono.matches(regex);
        if(isValid){
            System.out.println("il numero e' valido");
        }else
        System.out.println("il numero non e' valido");


    }
}
