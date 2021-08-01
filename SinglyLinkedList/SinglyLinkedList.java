import java.util.Collection;

class SinglyLinkedList<E> {
    Node<E> head; // head of list
    long size =0;

    /* Linked list Node*/
    static class Node<E> {
         E element;
         Node next;

        public Node(E element) {
            this.element = element;
            this.next = null;
        }


    }

    public long getSize(){
        return size;
    }
    public void addFirst(E new_data) {
		
        Node<E> new_node = new Node<E>(new_data);

        new_node.next = head;

        head = new_node;
        size++;
    }

    public void insertAfter(Node<E> prev_node, E new_data) {
        if (prev_node == null) {
            System.out.println("The given previous node cannot be null");
            return;
        }

		
        Node<E> new_node = new Node<>(new_data);

        new_node.next = prev_node.next;

        prev_node.next = new_node;
        size++;
    }

    public void addLast(E new_data)
    {

        Node<E> new_node = new Node<E>(new_data);


        if (head == null)
        {
            head = new Node<E>(new_data);
            size++;
            return;
        }


        new_node.next = null;


        Node last = head;
        while (last.next != null)
            last = last.next;

        last.next = new_node;
        size++;
    }

    public boolean addAll(Collection<E> c){
        for (E n : c){
            addLast(n);
        }
        return true;
    }

    public void removeFirst(){
        if (head == null){
            return;
        }
        head = head.next;
        size--;
    }

    public int getFirst(){
        return (int) head.element;
    }

    public int getLast(){
        Node last = head;
        while (last.next != null)
            last = last.next;
        return (int) last.element;
    }


    public void clear(){

        Node i = head;
        while (i != null){
            removeFirst();
            i = i.next;
        }
    }


    public void printList()
    {
        Node n = head;
        while (n != null)
        {
            System.out.print(n.element +"->");
            n = n.next;
        }
    }
}





