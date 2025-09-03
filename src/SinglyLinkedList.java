public class SinglyLinkedList<E> {
    //-------- nested Node class --------
    private static class Node<E>{
        private E element;
        private Node<E> next;
        public Node(E e, Node<E> n){
            element = e;
            next = n;
        }

        public E getElement() {
            return element;
        }
        public Node<E> getNext(){return next;}

        public void setNext(Node<E> n) {
            next=n;
        }
    }
    //-------- end of Nested class --------

    private Node<E> head = null;
    private Node<E> tail = null;
    private int size=0;
    public SinglyLinkedList(){}
    public int getSize() {
        return size;
    }
    public boolean isEmpty(){return size==0;}
    public E first(){
        if(isEmpty()) return null;
        return head.getElement();
    }

    //Inserimento in testa
    public void addFirst(E e){
        Node<E> node = new Node<>(e, head); //create node
        head = node; //link the new node as the head;
        if (size==0){
            tail=head; //if empty, new node becomes tail also
        }
        size++;
    }
    //Inserimento in coda
    public void addLast(E e){
        Node<E> newest = new Node<>(e, null);
        if(isEmpty()){
            head = newest; //empty list case
        } else {
            tail.setNext(newest);
        }
        tail = newest;
        size++;
    }

    //Eliminazione in testa
    public E removeFirst() {
        if(isEmpty()) return null;
        E answer = head.getElement();
        head = head.getNext();
        size--;
        if(size == 0){
            tail = null;
        }
        return answer;
    }

    //Eliminazione in coda non possibile con una single linked list (a meno di saltare per tutta la lista)

}
