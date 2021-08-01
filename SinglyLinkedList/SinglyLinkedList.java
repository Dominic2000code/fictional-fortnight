//public class SinglyLinkedList {
//    Node head;
//
//    public static class Node<E>{
//        private int element;
//        private Node<E> next;
//
//        public Node(int e, Node<E> n){
//            this.element = e;
//            this.next = n;
//        }
//    }
//
//    public static void main(String[] args) {
////        Node head = new Node(1,null);
////        Node node2 = new Node(1,null);
////        head.next = node2;
////        Node node3 = new Node(1,null);
////        node2.next = node3;
////        Node node4 = new Node(1,null);
////        node3.next = node4;
//
//        Node<Integer> head = new Node<Integer>(1, new Node(2, new Node(3, new Node(4, new Node(5, null)))));
//    }
//}


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

    /* Inserts a new Node at front of the list. */
    public long getSize(){
        return size;
    }
    public void addFirst(E new_data) {
		/* 1 & 2: Allocate the Node &
				Put in the data*/
        Node<E> new_node = new Node<E>(new_data);

        /* 3. Make next of new Node as head */
        new_node.next = head;

        /* 4. Move the head to point to new Node */
        head = new_node;
        size++;
    }

    /* Inserts a new node after the given prev_node. */
    public void insertAfter(Node<E> prev_node, E new_data) {
        /* 1. Check if the given Node is null */
        if (prev_node == null) {
            System.out.println("The given previous node cannot be null");
            return;
        }

		/* 2 & 3: Allocate the Node &
				Put in the data*/
        Node<E> new_node = new Node<>(new_data);

        /* 4. Make next of new Node as next of prev_node */
        new_node.next = prev_node.next;

        /* 5. make next of prev_node as new_node */
        prev_node.next = new_node;
        size++;
    }

    /* Appends a new node at the end. This method is
    defined inside LinkedList class shown above */
    public void addLast(E new_data)
    {
		/* 1. Allocate the Node &
		2. Put in the data
		3. Set next as null */
        Node<E> new_node = new Node<E>(new_data);

		/* 4. If the Linked List is empty, then make the
			new node as head */
        if (head == null)
        {
            head = new Node<E>(new_data);
            size++;
            return;
        }

		/* 4. This new node is going to be the last node, so
			make next of it as null */
        new_node.next = null;

        /* 5. Else traverse till the last node */
        Node last = head;
        while (last.next != null)
            last = last.next;

        /* 6. Change the next of last node */
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


    public void clear(){

        Node i = head;
        while (i != null){
            removeFirst();
            i = i.next;
        }
    }



    /* This function prints contents of linked list starting from
        the given node */
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





