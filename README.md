# Template Java 25 — Guida all'uso con GitHub Codespaces

Benvenuto nel repository template ufficiale per le esercitazioni di Informatica! Questo ambiente di sviluppo è progettato per offrirti una postazione di lavoro completa e standardizzata direttamente nel browser web tramite **GitHub Codespaces**.

Non occorre installare alcun compilatore o software sul tuo computer locale: il sistema si avvia in un contenitore cloud preconfigurato con la versione **OpenJDK 25 (Temurin)**, l'estensione **Extension Pack for Java** di Visual Studio Code e la personalizzazione visiva dell'istituto.

---

## 1. Struttura del Progetto

Il repository presenta un'architettura standard per i progetti Java in ambiente scolastico. Quando apri il progetto per la prima volta, la struttura delle cartelle si presenta nel modo seguente:

```text
template-java25-4itt/
├── .devcontainer/
│   └── devcontainer.json    # Configurazione della macchina virtuale cloud (Java 25)
├── .vscode/
│   └── settings.json        # Impostazioni di compilazione e dell'interfaccia
├── src/
│   └── App.java             # Codice sorgente Java da modificare ed estendere
├── bin/
│   └── .gitkeep             # Destinazione automatica dei file compilati (.class)
├── lib/
│   └── .gitkeep             # Spazio riservato a eventuali librerie esterne (.jar)
└── .gitignore               # Regole per escludere i file binari dal controllo versione
```

### Significato delle cartelle principali

* **Cartella `src/` (Source):** Contiene tutti i file con codice sorgente `.java`. Qui è presente il file di partenza `App.java`.
* **Cartella `bin/` (Binary):** Accoglie automaticamente i file compilati `.class` generati da Java quando salvi o esegui il programma.
* **Cartella `lib/` (Libraries):** Destinata a contenere librerie esterne `.jar` nel caso in cui l'esercizio richieda moduli aggiuntivi.
* **Cartella `.vscode/`:** Custodisce le impostazioni di lavoro, inclusa la disattivazione dei suggerimenti automatici AI e la configurazione dei colori istituzionali.

---

## 2. Passo 1: Creare il proprio Repository personale dal Template

Per iniziare un nuovo esercizio o compito in classe, non devi lavorare direttamente su questo repository di partenza, ma devi crearne una tua copia personale.

> **Avviso Importante:** Non utilizzare il pulsante **Fork**. Il comando Fork crea un collegamento pubblico visibile a tutta la classe. Utilizza esclusivamente la procedura descritta di seguito.

### Procedura passo-passo

1. Assicurati di aver effettuato l'accesso a GitHub con il tuo account personale.
2. Nella pagina principale di questo repository template, individua in alto a destra il pulsante verde **Use this template** e seleziona la voce **Create a new repository**.
3. Nella schermata di configurazione del nuovo repository:
   * **Owner:** Verifica che sia selezionato il tuo nome utente personale.
   * **Repository name:** Inserisci il nome dell'esercitazione seguendo la convenzione indicata dal docente (ad esempio `es01-calcolatrice` oppure `es02-gestione-conto`).
   * **Visibility:** Seleziona **Private** (obbligatorio, affinché il codice non sia visibile agli altri studenti).
   * **Include all branches:** Lascia la casella deselezionata.
4. Fai clic sul pulsante verde **Create repository** in fondo alla pagina.

Dopo pochi secondi, GitHub creerà la tua copia riservata del progetto con l'intera struttura pronta all'uso.

---

## 3. Passo 2: Avviare l'Ambiente di Sviluppo (Codespaces)

Una volta creato il tuo repository privato, puoi avviare il computer virtuale nel cloud su cui eseguirai il codice.

1. All'interno del tuo nuovo repository privato, fai clic sul pulsante verde **<> Code** in alto a destra.
2. Seleziona la scheda **Codespaces** (accanto alla scheda *Local*).
3. Fai clic sul pulsante **Create codespace on main**.

Si aprirà una nuova scheda nel browser web con l'interfaccia di Visual Studio Code. 

> **Nota sul primo avvio:** La prima volta che avvii un Codespace su un nuovo repository, il sistema impiega circa 30–60 secondi per scaricare l'immagine Linux, installare OpenJDK 25 e configurare l'ambiente. Gli avvii successivi saranno molto più rapidi.

Al termine del caricamento, noterai che la barra superiore e inferiore dell'editor assumono la colorazione blu ufficiale dell'istituto.

---

## 4. Passo 3: Scrittura, Compilazione ed Esecuzione del Codice

### Il file di partenza (`src/App.java`)

Nella cartella `src/` troverai il file `App.java`, già strutturato con le buone pratiche di programmazione apprese a lezione:

* Contiene l'importazione di `java.io.BufferedReader` e `java.io.InputStreamReader` per la gestione dell'input da tastiera tramite buffer di memoria.
* Include l'intestazione del metodo principale con la clausola `throws IOException` per la gestione delle eccezioni di I/O.
* Presenta commenti di documentazione in formato **Javadoc** (`/** ... */`) e un metodo helper `stampaIntestazione()` per l'output incorniciato a terminale.

### Regole per la compilazione e il salvataggio

Per mantenere un ambiente di apprendimento pulito ed evitare distrazioni durante la scrittura:

1. **Autobuild disattivato:** La compilazione automatica ad ogni singolo carattere digitato è disabilitata. Quando modifichi il codice, salva sempre le modifiche premendo **Ctrl + S** (o **Cmd + S** su macOS).
2. **Generazione dei file `.class`:** Quando salvi o premi il pulsante di esecuzione, il sistema compila il file `.java` e deposita il relativo file `.class` all'interno della cartella `bin/`.
3. **Esecuzione del programma:** Per avviare il programma, fai clic sull'icona **Play** (▷) situata in alto a destra nell'editor, oppure fai clic sulla scritta grigia **Run** presente sopra la riga del metodo `public static void main`.
4. **Input da Terminale:** Quando il programma richiede di inserire dati da tastiera (ad esempio il nome o un numero), fai clic nel riquadro del **Terminal** in basso e digita la risposta seguita da **Invio**.

---

## 5. Passo 4: Salvataggio delle Modifiche (Git) e Consegna

A fine lezione o al completamento dell'esercizio, devi salvare il tuo lavoro sul repository remoto di GitHub e consegnarlo al docente.

### 1. Eseguire Commit e Sync dei sorgenti

1. Fai clic sull'icona **Source Control** nella barra laterale sinistra di VS Code (la terza icona dall'alto, raffigurante un ramo Git con un pallino).
2. Nel campo di testo in alto (*Message*), scrivi un breve messaggio che descriva il lavoro svolto (ad esempio `"Completato esercizio 01"`).
3. Fai clic sul pulsante blu **Commit**.
4. Fai clic sul pulsante **Sync Changes** (oppure *Publish Branch*) per inviare le modifiche su GitHub.

### 2. Aggiungere il docente come Collaboratore

Poiché il tuo repository è impostato su **Private**, il docente non potrà vedere il tuo codice se non gli fornisci l'accesso.

1. Apri la pagina del tuo repository su GitHub nel browser.
2. Vai nella scheda **Settings** nella barra del repository.
3. Nel menu laterale sinistro, seleziona **Collaborators** (sotto la voce *Access*).
4. Fai clic su **Add people**.
5. Inserisci il nome utente GitHub del docente e conferma l'invio dell'invito.

### 3. Scaricare l'archivio ZIP con prefisso `cognome_nome`

Oltre alla sincronizzazione Git, è richiesta la scaricamento e rinominazione dell'archivio completo dei sorgenti:

1. Dalla pagina principale del tuo repository su GitHub, fai clic sul pulsante verde **<> Code**.
2. Seleziona la voce **Download ZIP**.
3. Apri la cartella dei download sul tuo computer e rinomina il file appena scaricato aggiungendo in testa il prefisso `cognome_nome` (tutto in minuscolo o rispettando le maiuscole del tuo nome, separato da un trattino basso).
   * **Convenzione di nome:** `cognome_nome_nome-repository.zip`
   * **Esempio pratico:** `rossi_mario_es01-calcolatrice.zip`

### 4. Consegna su Google Classroom

Per completare la consegna, devi allegare al compito **sia il link al repository privato sia il file ZIP**:

1. Copia l'indirizzo URL della pagina principale del tuo repository su GitHub.
2. Apri la scheda del compito corrispondente su **Google Classroom**.
3. Nella sezione **Il tuo lavoro** (in alto a destra):
   * Fai clic su **Aggiungi o crea** -> **Link** e incolla l'URL del tuo repository GitHub.
   * Fai clic su **Aggiungi o crea** -> **File** e seleziona il file ZIP appena scaricato e rinominato (`cognome_nome_...zip`).
4. Verifica che entrambi gli allegati (**Link** e **File ZIP**) siano correttamente presenti.
5. Fai clic su **Consegna** (o *Contrassegna come inviato*) e conferma la scelta.

---

## 6. Passo 5: Gestione della Quota Gratuita e Pulizia (Delete vs Stop)

Ogni account GitHub gratuito include mensilmente:
* **60 ore di calcolo** (pari a 120 core-hours su macchine standard a 2 core).
* **15 GB di spazio di archiviazione (Storage)** per salvare gli ambienti di lavoro.

Per evitare di esaurire le risorse gratuite prima della fine del mese, è fondamentale seguire una corretta gestione delle macchine virtuali.

### Configurazione consigliata dei timer sul proprio account GitHub

Fai questa configurazione una sola volta dal tuo profilo GitHub:

1. Fai clic sulla tua foto profilo in alto a destra su GitHub e seleziona **Settings**.
2. Nel menu laterale sinistro, fai clic su **Codespaces** (sotto la voce *Code, planning, and automation*).
3. Imposta le seguenti opzioni:
   * **Default idle timeout:** Imposta a **15** o **30 minutes**. Se lasci il browser aperto o chiudi la scheda senza spegnere la macchina, il consumo delle ore si ferma automaticamente dopo questo intervallo.
   * **Default retention period:** Imposta a **1 day** o **7 days**. I Codespace inattivi verranno eliminati automaticamente dopo il periodo indicato.
4. Fai clic su **Save**.

### Quando fare STOP e quando fare DELETE

| Azione | Quando usarla | Cosa comporta |
| :--- | :--- | :--- |
| **Stop (Sospensione)** | Quando fai una pausa breve durante la giornata e devi riprendere lo stesso esercizio più tardi. | Ferma il consumo delle 60 ore di calcolo, ma mantiene occupata la quota di 15 GB di archiviazione. |
| **Delete (Eliminazione)** | **Sempre a esercizio concluso**, dopo aver completato la procedura di *Commit & Sync*. | Elimina il contenitore temporaneo, liberando al 100% sia le ore di calcolo sia lo spazio su disco. Il codice rimane al sicuro nel repository. |

> **Nota:** Per eliminare un Codespace a lavoro finito, vai alla pagina di gestione dei Codespaces su GitHub, fai clic sui tre puntini (`...`) accanto al nome dell'ambiente concluso e seleziona **Delete**.

---

## 7. Domande Frequenti e Risoluzione Problemi

### Il codice appare monocromatico o i pulsanti di esecuzione non funzionano
* **Causa:** L'estensione Java sta ancora completando l'inizializzazione o l'ambiente si trova in *Lightweight Mode*.
* **Soluzione:** Attendi 15–20 secondi. Se compare una notifica in basso a destra che chiede di passare a *Standard Mode*, fai clic su **Yes**. Se il problema persiste, apri la Command Palette con `Ctrl + Shift + P` (o `Cmd + Shift + P` su Mac), digita `Codespaces: Rebuild Container` e premi Invio.

### Errore durante il Push o la sincronizzazione
* **Causa:** Mancata autorizzazione della sessione Git dentro Codespaces.
* **Soluzione:** Assicurati che l'operazione di Commit sia stata completata prima del Sync. In alternativa, dal terminale integrato puoi eseguire `git push origin main`.

### Non vedo i file `.class` nella cartella `bin/`
* **Causa:** Non hai ancora salvato il file `.java` o il programma non è stato eseguito.
* **Soluzione:** Apri il file `.java` in `src/`, premi `Ctrl + S` per salvare, oppure fai clic sull'icona **Play** in alto a destra. La cartella `bin/` si popolerà automaticamente.
