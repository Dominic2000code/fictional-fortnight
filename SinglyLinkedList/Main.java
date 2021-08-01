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
