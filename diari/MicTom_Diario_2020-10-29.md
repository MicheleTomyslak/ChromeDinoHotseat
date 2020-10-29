

# ChromeDinoHotseat | Diario di lavoro
##### Michele Tomyslak
### Trevano, 29.10.2020

## Lavori svolti


|Orario        |Lavoro svolto                 |
|--------------|------------------------------|
|10:05 - 11:35   | Implementazione del loop di gioco e resize friendly|
|12:30 - 15:45| Implementazione funzioni di salvataggio dei punteggi e di lettura della classifica  |


##  Problemi riscontrati e soluzioni adottate
	Per salvare i punteggi, li salvavo semplicemente in un csv e poi li leggevo, ma l'ho trovato molto scomodo, e ho implementato la classe Score e ScoreManager, una contiene il punteggio di un singolo giocatore, con nome,punteggio e timestamp. Mentre ScoreManager è il contenitore di tutti i punteggi che vengono letti dal file "data/scores.csv". L'idea era di permettere a ScoreManager di ordinare anche i dati in modo discendente, e di poter utilizzare direttamente la classe Resource che ho creato un paio di lezioni fa e di implementare in maniera corretta un writeScore e un orderScore.

	La prossima lezione devo concentrarmi sul risolvere il problema riguardante al visualizzare la classifica in gioco. E sto cercando di capire un sistema per stampare a schermo in modo che non sia proprio un pugno nell'occhio quando appare, ma che si "intoni bene"  con il resto del gioco.

	Sto avendo difficoltà a capire come funzionano gli AffineTransform sulle BufferedImage, tramite Graphics2D, quindi per ora il mio piano per ridefinirlo resize friendly, per ora è in pausa finché non avrò trovato una soluzione.
	
	

##  Punto della situazione rispetto alla pianificazione
	Sono un po' indietro riguardo al sistema per mostrare la classifica di gioco, perché sto avendo problemi a stampare a schermo in modo ordinato dal punteggio più alto, i dati conservati in Scores.csv



## Programma di massima per la prossima giornata di lavoro
	
	continuare a rendere l'applicazione resize friendly
	continuare a implementare il salvataggio e la lettura della classifica
	migliorare ulteriormente le prestazioni di gioco (ottimizzazione).