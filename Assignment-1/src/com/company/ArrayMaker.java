package com.company;

import java.util.Scanner;

public class ArrayMaker {

    private static Scanner scanner = new Scanner(System.in);

    public static int[] makeArray(int capacity) {
        System.out.println("Enter " + capacity + " integer values.");
        int[] array = new int[capacity];

        for(int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

        return array;
    }

    public ArrayMaker() {
    }
}
