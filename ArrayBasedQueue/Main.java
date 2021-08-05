import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {
        int queue_size = 10;
        ArrayBasedQueue<Integer> queue = new ArrayBasedQueue<>(queue_size);
        print(queue);

        // populate queue with random integers between 0 and 10 (inclusive)
        int[] added_elements = new int[12];
        for(int i = 0; i < 12; i++){
            int element = (int) (Math.random() * 11);
            added_elements[i] = element;
            queue.enqueue(element);
        }
        print("Order of addition "+Arrays.toString(added_elements));
        print(queue);
	print("Head: " +queue.getFirst());
        print("Tail: " +queue.getLast());

        // repetitive removal
        int[] removed = new int[queue.getSize()];
        for(int i = 0; i < queue_size; i++){
            int element = queue.dequeue();
            removed[i] = element;
        }
        print("Order of removal "+Arrays.toString(removed));
        print(queue);

        /**
         * Print the elements of the queue in the right order
         * i.e. the head first, and the tail last.
         * In your codes to demonstrate your solution, ensure that
         * the head of the queue is in the middle of the array backing the queue.
         */
        //Put your codes here
	/*
        public void enqueue(E element) {
        if (!isFull()) {
            int insertion_index = (head_index + size) % queue.length;
            this.queue[insertion_index] = element;
            size++;
        }
       }
         */
    }

    public static void print(Object o){
        System.out.println(o.toString());
    }
}
