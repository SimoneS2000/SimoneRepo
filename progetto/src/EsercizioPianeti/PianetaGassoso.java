package EsercizioPianeti;

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
public class PianetaGassoso extends CorpoCeleste {


    public PianetaGassoso() {
    }

    public PianetaGassoso(String nome, double distanzaDalSole,double massa, double diametro) {
        super(nome, true, distanzaDalSole, massa, diametro);
    }


    @Override
    public String toString() {
        StringBuilder sb=new StringBuilder();
        sb.append(" { PianetaGassoso[");
        sb.append(super.toString());
        sb.append("}");
        return sb.toString();
    }
}
