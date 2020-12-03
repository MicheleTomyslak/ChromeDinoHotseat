

# ChromeDinoHotseat | Diario di lavoro
##### Michele Tomyslak
### Trevano, 3.12.2020

## Lavori svolti


|Orario        |Lavoro svolto                 |
|--------------|------------------------------|
|10:05 - 11:35   | Studiato un sistema per introdurre un controller della Play Station 4 ai comandi disponibili per il gioco|
|12:30 - 15:45| Tentata implementazione del controller della PS4, non riuscito al momento, a causa di una mia incapacità al momento di connettermi al UDP Server messo a disposizione dal softawre DS4 Windows, che permette a Windows di riconoscere il controller PS4 come un controller Xbox 360, il controller è funzionante sul pc, ma non riesco a  raccapezzarmi sui DatagramSocket e i DatagramPacket.Implementato l'algoritmo di sort per la classifica dei giocatori, ho implementato un bubble sort all'interno della classe Resource, che viene poi utilizzata direttamente da ScoreManager per poter ordinare i punteggi, per poi stamparli come semplici stringhe sullo schermo dal GameScreen, per ora. |
![bubblesort](../doc/ResourceBubblesort.png)

##  Problemi riscontrati e soluzioni adottate
	Settimana scorsa sono riuscito ad implementare gran parte del salvataggio dei dati in formato JSON, questo mi ha permesso inoltre di creare un file di configurazione di gioco, che avevo intenzione di rendere poi modificabile direttamente dal gioco, così da poter modificare le impostazioni di gioco generali senza dover andare a modificare il file json a mano. Questo mi ha aiutato nel gestire i dati del giocatore da salvare in classifica, che per ora è abbastanza scarna. Oggi ho implementato finalmente un sort funzionante per la classifica, già settimana scorsa ci ho lavorato un paio di ore e non ho combinato nulla. Ora che lo ho completato, ho fatto un balzo avanti con il progetto, portandomi praticamente al termine delle funzioni base del progetto.
	
	
	

##  Punto della situazione rispetto alla pianificazione
	Ho recuperato il tempo perso con la classifica, e secondo la tabella di marcia, sono comunque indietro, perché non so bene specificare a che punto sono con le classi di test, devo capire bene come implementarle.
	Per il resto il gioco è funzionante, tranne per qualche bug e qualche dettaglio da sistemare


## Programma di massima per la prossima giornata di lavoro
	
	Cominciare a testare pesantemente il codice (Per ora lo avevo fatto solo parzialmente, implementato classi di test di base in java, e testandole modificandole dove necessario), e devo documentarmi su come farlo adeguatamente.
	Implementare una view accattivante per la classifica, che al momento sfora dallo schermo e non si può vedere nella sua interezza.