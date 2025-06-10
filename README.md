# ChromeDinoHotseat

Clone multiplayer locale del celebre gioco "Chrome Dino" realizzato in Java con Swing.  
Consente da uno a quattro giocatori di sfidarsi sullo stesso computer.

## Caratteristiche principali
- **Modalità Hotseat** per 1-4 giocatori con tasti personalizzabili.
- **Classifica** con salvataggio dei migliori punteggi in `data/scores.json`.
- **Personalizzazione** delle skin del dinosauro (cartella `data/`).
- **Terreno infinito** con due livelli di parallasse e gestione di nemici (cactus e pterodattili).
- **Opzioni di debug** per visualizzare hitbox e parametri di gioco.

## Struttura del progetto
- `src/ChromeDinoHotseat/src/` – codice sorgente organizzato nei pacchetti `gameobject`, `userinterface` e `util`.
- `src/ChromeDinoHotseat/data/` – risorse di gioco: immagini, audio e file di configurazione.
- `src/ChromeDinoHotseat/test/` – test JUnit.

## Requisiti
- JDK 8 o superiore.
- Ant (o NetBeans 8+) per la compilazione e l'esecuzione.

## Compilazione e avvio
Per avviare il gioco dalla riga di comando:
```bash
cd src/ChromeDinoHotseat
ant run
```
Oppure aprire il progetto con NetBeans e usare i comandi **Run** o **Test**.

## Esecuzione dei test
```bash
ant test
```
I test coprono le classi principali ma sono ancora in evoluzione.
