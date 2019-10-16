package com.company;

import java.util.Scanner;

public class Main {
    public static Scanner scanner;

    public static void main(String[] args) {
//        // P1
//        System.out.println("Please enter two numbers that needs to be calculated:");
//
//        int a = scanner.nextInt();
//        int b = scanner.nextInt();
//
//        Calculate calculate = new Calculate();
//
//        System.out.println("The result of " + a + " + " + b + " = " + calculate.addSum(a, b));
//        System.out.println("The result of " + a + " - " + b + " = " + calculate.subtract(a, b));
//        System.out.println("The result of " + a + " * " + b + " = " + calculate.multiply(a, b));
//        System.out.println("The result of " + a + " / " + b + " = " + calculate.divide(a, b));

//         //P2
//        int[] array2 = ArrayMaker.makeArray(3);
//        print(array2);

//        MultiplyArray arrayMain = new MultiplyArray();
//        //int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//        int[] array = new int[9];
//        for (int i = 0; i < 9; i++) {
//            array[i] = 1 + i;
//        }
//        int res = arrayMain.multiplyEvenItemArray(array);
//        System.out.println("The result of even items multiplied in array is " + res);

        Calculate obj = new Calculate();
        System.out.println(obj.getName());
        obj.setName("panda");
        System.out.println(obj.getName());
    }
    private static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
