public class OOP_concepts {
    public OOP_concepts(){

    }

    public int variabilePublic;
    // Un membro public è accessibile da qualsiasi altra classe in qualsiasi altro package. Viene ereditato dalle sottoclassi

    protected int variabileProtected;
    // Un membro protected è accessibile dalle classi e sottoclassi nello stesso package. È accessibile da altre sottoclassi in altri package, solo per ereditarietà

    private int variabilePrivate;
    // Un membro private è accessibile solo all'interno della classe in cui è definito. Viene usato per nascondere dati e comportamenti


    public interface interfaccia{
        public void metodoTeorico();
    }
    /*
    * Una interfaccia "promette" metodi e membri. Una classe che la implementerà dovrà definire COME questi metodi funzionano
    * Una classe può implementare più interfacce. Possiamo quindi trattare allo stesso modo oggetti diversi senza dover riscrivere
    * ogni volta la classe dell'oggetto che stiamo scrivendo.
    * A runtime viene richiesta la tipizzazione forte, per cui i tipi di dati passati al metodo devono essere conformi al tipo
    * specificato nell'interfaccia
    * */

    // In java i tipi primitivi non vengono visti come oggetti, per cui ricorriamo a dei Wrapper messi a disposizione da java.lang

    // Mentre Boolean e Character derivano direttamente da Object, tutti gli altri tipi (quelli numerici) derivano da Number, che a sua volta discenda da Object

    /*
    * Ogni wrapper ha un costruttore, un costruttore che decodifica una stringa, un metodo toString(), un metodo equals() e un metodo per produrre il primitivo corrispondente
    * Java permette di effettuare automatica il boxing e unboxing di un primitivo quando è necessario, passando dinamicamente da un int a un Integer e
    * viceversa a seconda della necessità
    * */
}
