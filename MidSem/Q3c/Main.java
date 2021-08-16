import java.util.ArrayList;
import java.util.Collection;

public class Main {
    public static void main(String[] args)
    {
        SinglyLinkedList<Integer> list = new SinglyLinkedList<>();
        Collection<Integer> data = new ArrayList<>();
	list.addLast(6);

        list.addFirst(7);

        list.addFirst(1);

        list.addLast(4);

        list.insertAfter(list.head.next, 8);
	list.insertAfter(list.head.next.next.next.next, 100);
	SinglyLinkedList.Node<Integer> n1 = new SinglyLinkedList.Node<>(200);

        data.add(1);
        data.add(2);
        data.add(3);
        data.add(4);
        data.add(5);
        data.add(6);
        data.add(7);
        list.addAll(data);

        list.head = list.mergeSort(list.head);
        System.out.println("\nSorted Linked list is: ");
        list.printList();
    }
}
