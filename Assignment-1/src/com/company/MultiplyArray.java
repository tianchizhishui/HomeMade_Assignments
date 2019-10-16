package com.company;

public class MultiplyArray {
    public int multiplyEvenItemArray(int[] array) {
        int res = 1;
        for(int i = 0; i < array.length; i++) {
            if (i % 2 != 0) {
                continue;
            }
            res *= array[i];
        }
        return res;
    }
}
