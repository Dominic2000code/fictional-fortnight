class SinglyLinkedList {
    Node head; // head of list

    /* Linked list Node*/
    static class Node<E> {
        private final int element;
        private Node<E> next;

        public Node(int element) {
            this.element = element;
            this.next = null;
        }
    }

    /* Inserts a new Node at front of the list. */
    public void push(int new_data) {
		
        Node new_node = new Node(new_data);

        new_node.next = head;

        head = new_node;
    }

    public void insertAfter(Node prev_node, int new_data) {
        if (prev_node == null) {
            System.out.println("Previous node is null");
            return;
        }

        Node new_node = new Node(new_data);

        new_node.next = prev_node.next;

        prev_node.next = new_node;
    }

    public void append(int new_data)
    {

        Node new_node = new Node(new_data);


        if (head == null)
        {
            head = new Node(new_data);
            return;
        }

        new_node.next = null;

        Node last = head;
        while (last.next != null)
            last = last.next;

        last.next = new_node;
        return;
    }


    public void printList()
    {
        Node tailNode = head;
        while (tailNode != null)
        {
            System.out.print(tailNode.element +"->");
            tailNode = tailNode.next;
        }
    }


    public static void main(String[] args)
    {
        /* Start with the empty list */
        SinglyLinkedList list = new SinglyLinkedList();

        list.append(6);
        list.push(7);
        list.push(1);
        list.append(4);
        list.insertAfter(llist.head.next, 8);

        System.out.println("\nCreated Linked list is: ");
        llist.printList();
    }
}





