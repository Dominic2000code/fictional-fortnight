package com.dominick;

import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] arr = { 1, 2, 3, 4, 5};
        removeElements(arr);
    }

    static void removeElements(int[] array) {
        Random rand = new Random();
        while (array.length > 0) {
            int index = rand.nextInt(array.length);
            System.out.println("Item removed: "+ array[index]);
            int[] array1 = new int[array.length - 1];
            for (int i = 0; i < index; i++)
                array1[i] = array[i];
            for (int j = index; j < array.length - 1; j++)
                array1[j] = array[j + 1];
            array = array1;
            System.out.println(Arrays.toString(array));
        }
    }
}
