package com.java.class16;

// Write a program to print 1 to 10 using for loop
public class Print1to10 {
    public static void main(String[] args) {
        int n = 1;
        for (int i = 1; i <= 5; i++) {
            n = n * i;
        }
        System.out.println(n);
    }
}
