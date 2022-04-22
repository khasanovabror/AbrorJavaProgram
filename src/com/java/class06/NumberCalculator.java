package com.java.class06;

import java.util.Scanner;

public class NumberCalculator {
    //Write a program to check given number is positive/negative or zero
    public static void main(String[] args) {
        System.out.println("Enter any number");
        Scanner sc = new Scanner(System.in);
        int Num = sc.nextInt();

        if (Num < 0) {
            System.out.println(Num + " is Negative");
        }
        if (Num > 0) {
            System.out.println(Num + " is Positive");
        }
        if (Num == 0) {
            System.out.println(Num + "equals to 0");
        }
    }
}
