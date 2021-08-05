/**
 * author: bbrighttaer
 * @param <E> Generic type
 */
public interface Queue<E> {
    /**
     * Inserts an element at the end of the queue
     * @param element The element to be inserted
     */
    void enqueue(E element) throws Exception;

    /**
     * Removes and returns the element at the front of the queue
     * @return
     */
    E dequeue() throws Exception;

    /**
     * Returns the element at the front of the queue without removing it
     * @return
     */
    E first() throws Exception;

    E last() throws Exception;

    /**
     * Returns the number of elements stored
     * @return
     */
    int getSize();

    /**
     * Indicates whether no elements are stored
     * @return
     */
    boolean isEmpty();

    boolean isFull();

}
