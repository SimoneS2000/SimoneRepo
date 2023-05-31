import java.util.Scanner;

/*
Convalida della password
Scrivi un programma Java che chiede all'utente di inserire una password e verifica se la password inserita rispetta determinati requisiti
 di complessità.
Utilizza un'espressione regolare per convalidare la password, ad esempio, controllando la lunghezza minima,
la presenza di lettere maiuscole, minuscole, numeri e caratteri speciali.
Fai in modo che il programma stampi "Password valida" o "Password non valida" a seconda dell'esito della convalida.
 */
public class Esercizio5 {
    public static void main(String[] args) {
        Scanner mioScanner=new Scanner(System.in);

        String password=mioScanner.nextLine();
       // String regex="^[a-zA-Z0-9$&!]{8}";
        String regex="^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z]).{4,8}$";
        boolean isValid=password.matches(regex);
        if(isValid){
            System.out.println("La password e' valida");
        }else {
            System.out.println("La password non e' valida");
        }
    }

}
