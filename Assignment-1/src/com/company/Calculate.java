package com.company;

import java.util.Scanner;

public class Calculate {
    private Scanner scanner;
    private String name;

    public String getName() {
        return this.name;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public int addSum(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public double divide(int a, int b) {
        if (b == 0) {
            System.out.print("The divider cannot be zero, error code ");
            return -1;
        }
        return (double)a / (double)b;
    }
}
