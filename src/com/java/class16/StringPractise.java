package com.java.class16;


// Write a program to take one string from user and print reverse of it

import java.util.Scanner;

public class StringPractise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String reverse = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            System.out.println(str.charAt(i));
    }

    }

}
