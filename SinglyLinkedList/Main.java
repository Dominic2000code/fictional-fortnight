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

        data.add(1);
        data.add(2);
        data.add(3);
        data.add(4);
        data.add(5);
        data.add(6);
        list.addAll(data);
        list.addLast(96);
//      list.removeFirst();
//      list.removeFirst();
//      list.removeFirst();
//      list.removeLast();
//      list.clear();
	int index = list.get(3);
        int Firstnum = list.getFirst();
        int Lastnum = list.getLast();
        System.out.println("\nCreated Linked list is: ");
        System.out.println("\nSize:" + list.getSize());
        list.printList();
        System.out.println("\nFnum: "+ Firstnum);
        System.out.println("\nLnum: "+ Lastnum);
	System.out.println("\nIndex: "+ index);
    }
}
