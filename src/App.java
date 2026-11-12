import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Classe principale dell'applicazione.
 * Punto di partenza standard.
 *
 * @author Nome Cognome
 * @version 1.0
 */
public class App {

    /**
     * Metodo principale (entry point) avviato dalla Java Virtual Machine.
     *
     * @param args Eventuali argomenti passati da riga di comando.
     * @throws IOException In caso di errore durante la lettura dallo stream di input.
     */
    public static void main(String[] args) throws IOException {
        String titoloProgetto = "Esercitazione Java 25 - 4ª ITT";
        stampaIntestazione(titoloProgetto);

        // Oggetto per la lettura dell'input da tastiera (es. String s = tastiera.readLine();)
        BufferedReader tastiera = new BufferedReader(new InputStreamReader(System.in));

        // TODO: Inserisci qui il codice dell'esercizio
        
    }

    /**
     * Metodo di utilità che stampa a video un titolo incorniciato.
     *
     * @param titolo Il testo da visualizzare come intestazione.
     */
    public static void stampaIntestazione(String titolo) {
        System.out.println("=========================================");
        System.out.println("===   " + titolo );
        System.out.println("=========================================");
    }
}
