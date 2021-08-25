package com.dominick;

/* Class HashTableChainingSinglyLinkedList */
public class HashTableChainingSinglyLinkedList
{
    private SLLNode[] table;
    private int size ;

    /* Constructor */
    public HashTableChainingSinglyLinkedList(int tableSize)
    {
        table = new SLLNode[ nextPrime(tableSize) ];
        size = 0;
    }
    /* Function to check if hash table is empty */
    public boolean isEmpty()
    {
        return size == 0;
    }
    /* Function to clear hash table */
    public void makeEmpty()
    {
        int l = table.length;
        table = new SLLNode[l];
        size = 0;
    }
    /* Function to get size */
    public int getSize()
    {
        return size;
    }
    /* Function to insert an element */
    public void insert(int val)
    {
        size++;
        int pos = myhash(val);
        SLLNode nptr = new SLLNode(val);
        if (table[pos] == null)
            table[pos] = nptr;
        else
        {
            nptr.next = table[pos];
            table[pos] = nptr;
        }
    }
    /* Function to remove an element */
    public void remove(int val)
    {
        int pos = myhash(val);
        SLLNode start = table[pos];
        SLLNode end = start;
        if (start.data == val)
        {
            size--;
            table[pos] = start.next;
            return;
        }
        while (end.next != null && end.next.data != val)
            end = end.next;
        if (end.next == null)
        {
            System.out.println("\nElement not found\n");
            return;
        }
        size--;
        if (end.next.next == null)
        {
            end.next = null;
            return;
        }
        end.next = end.next.next;
        table[pos] = start;
    }
    /* Function myhash */
    private int myhash(Integer x )
    {
        int hashVal = x.hashCode( );
        hashVal %= table.length;
        if (hashVal < 0)
            hashVal += table.length;
        return hashVal;
    }
    /* Function to generate next prime number >= n */
    private static int nextPrime( int n )
    {
        if (n % 2 == 0)
            n++;
        for ( ; !isPrime( n ); n += 2);

        return n;
    }
    /* Function to check if given number is prime */
    private static boolean isPrime( int n )
    {
        if (n == 2 || n == 3)
            return true;
        if (n == 1 || n % 2 == 0)
            return false;
        for (int i = 3; i * i <= n; i += 2)
            if (n % i == 0)
                return false;
        return true;
    }
    public void printHashTable ()
    {
        System.out.println();
        for (int i = 0; i < table.length; i++)
        {
            System.out.print ("Bucket " + i + ":  ");
            SLLNode start = table[i];
            while(start != null)
            {
                System.out.print(start.data +" ");
                start = start.next;
            }
            System.out.println();
        }
    }
}

