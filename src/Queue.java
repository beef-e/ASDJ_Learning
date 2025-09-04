public class Queue {
    // Supponendo il primo elemento in posizione 0, con ogni dequeue dobbiamo shiftare ogni elemento
    // Questo porterà l'array a riempirsi con meno di n elementi, in quanto la testa verrà spostata verso destra

    /*
    *   ARRAY CIRCOLARE
    * Uso due indici, uno per la posizione del rimo elemento che sarà calcolato come
    * Elemento front=(front+1)%n
    * Uno che memorizza il numero di elementi contenuti nella coda
    *
    * Se questa ha meno di n elementi, calcoleremo la posizione del prossimo elemento da inserire come
    * r=(f+sz)%n
    * */
}