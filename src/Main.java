import java.io.*;
import java.util.*;
import java.lang.*;

public class Main {
    public static void main (String[] args) {
        System.out.println("Hello World");
        Counter c;
        c= new Counter(); // c viene inserito nella memoria stack, count viene inserito in quella heap
        c.increment(); // c viene inserito nella stack come indirizzo,
        // Che riporta alla cella di memoria in cui viene memorizzato count. Sarà così anche per d ed e
        c.increment(3);
        int temp=c.getCount(); // Temp, essendo un int, viene memorizzato come talle, nella stack
        c.reset();
        Counter d = new Counter(5); // viene creato un nuovo "count" nella heap, con un indirizzo di memoria differente
        d.increment();
        Counter e=d;
        temp=e.getCount();
        e.increment(2);
    }
}
