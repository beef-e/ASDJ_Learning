import java.util.Arrays; //necessario importare per usare i metodi

public class ArrayMethods {
    public ArrayMethods(){

    }

    int[] EmptyArray;

    int [] Array={1,2,3,4,5};

    //N.B. i metodi qui elencati sono fittizzi utili solo a mostrare quelli integrati un utils.Arrays

    public int[] makeCopy(int[] arrayCopiare, int[] arrayCopiato){
        arrayCopiato=Arrays.copyOf(arrayCopiare, arrayCopiare.length); //fa una copia dell'array interno al metodo
        return arrayCopiato;
    }

    public int[] copyRange(int[] arrayCopiare, int[] arrayCopiato){
        arrayCopiato=Arrays.copyOfRange(arrayCopiare, 0, 4); //makes a copy from index to index
        return arrayCopiato;
    }

    public int[] fill(int[] arrayToFill) {
        Arrays.fill(arrayToFill, 0);
        return arrayToFill;
    }

    //Mi sono stancato di fare tutti i metodi tanto è inutile
}
