import java.util.ArrayList;
import java.util.Collection;

public class Main {
    public static void main(String[] args)
    {
        /* Start with the empty list */
        SinglyLinkedList<Integer> list = new SinglyLinkedList<>();
        Collection<Integer> data = new ArrayList<>();
        // Insert 6. So linked list becomes 6->NUll
        list.addLast(6);

        // Insert 7 at the beginning. So linked list becomes
        // 7->6->NUllist
        list.addFirst(7);

        // Insert 1 at the beginning. So linked list becomes
        // 1->7->6->NUllist
        list.addFirst(1);

        // Insert 4 at the end. So linked list becomes
        // 1->7->6->4->NUllist
        list.addLast(4);

        // Insert 8, after 7. So linked list becomes
        // 1->7->8->6->4->NUllist
        list.insertAfter(list.head.next, 8);

        data.add(1);
        data.add(2);
        data.add(3);
        data.add(4);
        data.add(5);
        data.add(6);
        list.addAll(data);
        list.removeFirst();
        list.removeFirst();
        list.removeFirst();
//        list.clear();
        int num = list.getFirst();
        System.out.println("\nCreated Linked list is: ");
        System.out.println("\nSize:" + list.getSize());
        list.printList();
        System.out.println("\nnum: "+num);
    }
}
