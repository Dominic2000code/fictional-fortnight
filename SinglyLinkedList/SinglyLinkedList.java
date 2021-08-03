import java.util.Collection;

class SinglyLinkedList<E> {
    Node<E> head; // head of list
    Node<E> tail;
    long size = 0;

    public long getSize() {
        return size;
    }

    public int indexOf(E n) {
        int index = 0;
        Node<E> current = head;

        while (current != null) {
            if (current.element == n) {
                return index;
            }
            index++;
            current = current.next;
        }

        return -1;
    }

    public void addFirst(E new_data) {

        Node<E> new_node = new Node<>(new_data);
        if (head == null) {
            new_node.next = null;
            head = new_node;
            tail = new_node;
            size++;
        }

        new_node.next = head;
        head = new_node;
        size++;
    }

    public void addFirst(Node<E> new_node) {
        if (head == null) {
            new_node.next = null;
            head = new_node;
            tail = new_node;
            size++;
        }

        new_node.next = head;
        head = new_node;
        size++;
    }

    /* Inserts a new node after the given prev_node. */
    public void insertAfter(Node<E> prev_node, E new_data) {
        Node<E> new_node = new Node<>(new_data);
        if (prev_node == null) {
            addFirst(new_data);
        } else if (prev_node == tail) {
            addLast(new_data);
        } else {
            Node<E> next = prev_node.next;
            prev_node.next = new_node;
            new_node.next = next;
        }
    }

    public void insertAfter(Node<E> prev_node, Node<E> new_node) {
        if (prev_node == null) {
            addFirst(new_node);
        } else if (prev_node == tail) {
            addLast(new_node);
        } else {
            Node<E> next = prev_node.next;
            prev_node.next = new_node;
            new_node.next = next;
        }
    }

        Node<E> new_node = new Node<>(new_data);
        new_node.next = null;
        if (head == null) {
            head = new_node;
            tail = new_node;
            size++;
        }

        tail.next = new_node;
        tail = new_node;
        size++;
    }

    public void addLast(Node<E> new_node) {
        new_node.next = null;
        if (head == null) {
            head = new_node;
            tail = new_node;
            size++;
        }

        tail.next = new_node;
        tail = new_node;
        size++;
    }

    public void addAll(Collection<E> c) {
        for (E n : c) {
            addLast(n);
        }
    }

    public void removeFirst() {
        if (head == null) {
            return;
        }
        head = head.next;
        size--;
    }

    public void removeLast() {
        if (tail == null) {
            return;
        } else {
            if (head == tail) {
                head = null;
                tail = null;
            } else {
                Node<E> prevToTail = head;
                while (prevToTail.next != tail) {
                    prevToTail = prevToTail.next;
                }
                tail = prevToTail;
                tail.next = null;
            }
            size--;
        }
    }

    public E getFirst() {
        return head.element;
    }

    public E getLast() {
        return tail.element;
    }

    public E get(int index)
    // returns the element at the specified position in this list.
    {
        // index must be 1 or higher
        if (index < 0)
            return null;
        Node<E> current = head;
        if (head != null) {
            for (int i = 0; i < index; i++) {
                if (current.next == null)
                    return null;

                current = current.next;
            }
            return current.element;
        }
        return null;
    }

    public void clear() {

        Node<E> current = head;
        while (current != null) {
            removeFirst();
            current = current.next;
        }
    }

    public void printList() {
        Node<E> n = head;
        while (n != null) {
            System.out.print(n.element + "->");
            n = n.next;
        }
        System.out.println("null");
    }

    /* Linked list Node*/
    static class Node<E> {
        E element;
        Node<E> next;

        public Node(E element) {
            this.element = element;
            next = null;
        }

        public Object getElement() {
            return element;
        }

        public Node<E> getNext() {
            return next;
        }


    }
}