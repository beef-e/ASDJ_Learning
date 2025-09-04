public class ArrayStack<E> implements Stack<E>{
    public static final int CAPACITY = 100000;
    private E[] data;
    private int t=-1;
    public ArrayStack(){}
    public ArrayStack(int capacity){
        data=(E[]) new Object[capacity];
    }

    public int size(){
        return t+1;
    }

    @Override
    public boolean isEmpty() {
        if (size()>0){
            return false;
        }
        return true;
    }

    @Override
    public E top() {
        return null; //da fare
    }

    @Override
    public E pop() {
        return null; // da fare
    }

    public void push (E e) throws IllegalStateException {
        if(size()==data.length) throw new IllegalStateException("Full");
        data[++t]=e;
    }
}
