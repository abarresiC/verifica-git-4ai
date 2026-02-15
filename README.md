# verifica-git-4ai

Tutto deve essere fatto da terminale.

Ogni punto richiesto deve corrispondere ad almeno 1 commit (commit separati, non uno solo alla fine).

Il repository verrà valutato guardando file + cronologia commit.

Obiettivo

Completare le attività richieste e pubblicare tutto su GitHub con git push.

PARTE A — Operazioni Git (obbligatorie)
A1) Clonazione (non si consegna, ma serve farla)

Clona il repository sul PC e entra nella cartella del progetto.

A2) Compilazione informazioni (1 commit)

Apri il file:

progetto/info.txt

e aggiungi in cima:

Nome e cognome

Classe

Data

Commit richiesto

Messaggio: A2 - Compilazione info

A3) File personale (1 commit)

Crea il file:

progetto/<cognome_nome>.txt

Dentro scrivi (minimo 4 righe):

Differenza tra git add e git commit

Differenza tra git push e git pull

Commit richiesto

Messaggio: A3 - File personale

A4) Modifica dati (1 commit)

Nel file progetto/dati.txt:

modifica una riga esistente

aggiungi una nuova riga in fondo

Commit richiesto

Messaggio: A4 - Aggiornamento dati

A5) Cronologia (1 commit)

Esegui un comando per visualizzare gli ultimi commit in forma breve (es. oneline).

Copia/incolla l’output (almeno gli ultimi 5 commit) dentro:

progetto/log.txt

Commit richiesto

Messaggio: A5 - Inserito log

PARTE B — Correzione codice (obbligatoria, da terminale)

Il file programma/main.c contiene 1 errore di compilazione e 1 errore logico.

B1) Fix compilazione (1 commit)

Da terminale prova a compilare (puoi usare gcc oppure l’IDE solo per compilare, ma la modifica file resta libera da editor).

Correggi l’errore che impedisce la compilazione.

Commit richiesto

Messaggio: B1 - Fix compilazione

B2) Fix logico (1 commit)

Esegui il programma (o ragiona sull’output).
Correggi l’errore logico in modo che la somma funzioni correttamente.

Commit richiesto

Messaggio: B2 - Fix logico

PARTE C — Ripristino (obbligatorio)
C1) Ripristina dati.txt (1 commit)

Riporta il file progetto/dati.txt alla versione precedente (quella prima del punto A4).

Poi salva e crea un commit.

Commit richiesto

Messaggio: C1 - Ripristino dati

Nota: devi usare un comando Git (non “annullare a mano” riscrivendo il file).
