public interface Stack<E> {
    int size();
    boolean isEmpty();
    E top();
    void push(E element);
    E pop();
}

/*
* Algorithm size()
*   return t+1
*
* Algorithm pop()
*   if isEmpty() then
*       return null
*   else
*       ans=data[t]
*       data[t]=null
*       t=t-1
*       return ans
*
* Algorithm push(E o)
*   if t= data.length-1 then
*       throw IllegalStateException //CARATTERISTICA DEL VOLER IMPLEMENTARE CON UN ARRAY, NON INTRINSECA DELLA STRUTTURA DATI
*   else
*       t=t+1
*       data[t]=o
* */