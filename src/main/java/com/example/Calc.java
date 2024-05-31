package com.example;

import java.util.*;

/**
 * Calc
 */
public class Calc {

    public static void main(String[] args) {
        int a, b, c;
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter first number: ");
        a = ob.nextInt();
        System.out.println("Enter second number: ");
        b = ob.nextInt();
        c = sum(a, b);
        System.out.println("Sum of two numbers: " + c);
        System.out.println(greet("nithin12"));
        ob.close();
    }

    public static int sum(int a, int b) {
        return a + b;
    }

    public static String greet(String s) {
        return "Hello " + s;
    }
}
