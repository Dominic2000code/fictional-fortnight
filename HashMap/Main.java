package com.dominick;

public class Main {

    public static void main(String[] args) {
	// write your code here
        HashMap<String,Integer> hashMap =new HashMap<>();
        hashMap.add("key1",1 );
        hashMap.add("key2", 2);
        hashMap.add("key3", 3);
        hashMap.add("key4", 4);
        hashMap.add("key5", 5);
        hashMap.add("key6", 6);

        int size = hashMap.getSize();
        int item = hashMap.get("key5");
        System.out.println("size of map: " + size);
        System.out.println("Item of Key5: " + item);
        System.out.println("Is map empty?: " + hashMap.isEmpty());
    }
}
