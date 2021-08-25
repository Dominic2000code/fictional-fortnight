package com.dominick;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scan = new Scanner(System.in);
        System.out.println("Hash Table Test\n\n");
        System.out.println("Enter size");
        /* Make object of HashTableChainingSinglyLinkedList */
        HashTableChainingSinglyLinkedList htcsll = new HashTableChainingSinglyLinkedList(scan.nextInt() );

        char ch;
        /*  Perform HashTableChainingSinglyLinkedList operations  */
        do
        {
            System.out.println("\nHash Table Operations\n");
            System.out.println("1. insert ");
            System.out.println("2. remove");
            System.out.println("3. clear");
            System.out.println("4. size");
            System.out.println("5. check empty");

            int choice = scan.nextInt();
            switch (choice) {
                case 1 -> {
                    System.out.println("Enter integer element to insert");
                    htcsll.insert(scan.nextInt());
                }
                case 2 -> {
                    System.out.println("Enter integer element to delete");
                    htcsll.remove(scan.nextInt());
                }
                case 3 -> {
                    htcsll.makeEmpty();
                    System.out.println("Hash Table Cleared\n");
                }
                case 4 -> System.out.println("Size = " + htcsll.getSize());
                case 5 -> System.out.println("Empty status = " + htcsll.isEmpty());
                default -> System.out.println("Wrong Entry \n ");
            }
            /* Display hash table */
            htcsll.printHashTable();

            System.out.println("\nDo you want to continue (Type y or n) \n");
            ch = scan.next().charAt(0);
        } while (ch == 'Y'|| ch == 'y');
    }
}
