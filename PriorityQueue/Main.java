public class Main {

    public static void main(String[] args) {
        SortedPriorityQueue<Integer, Integer> PQ = new SortedPriorityQueue<>();

        PQ.insert(7,10);
        PQ.insert(1,100);
        PQ.insert(5,15);
        PQ.insert(2,7);
        PQ.insert(1,19);
        PQ.insert(3,20);
        PQ.insert(8,25);
        PQ.insert(4,1);


        PQ.print();
//        Entry<Integer, Integer> n = PQ.min();
//        System.out.println(n.getKey());
//        System.out.println(n.getValue());
    }
}
