package com.java.class16;

// Write a program to take one statement from user and find out number of words
// We have inside the statement


import java.util.Scanner;

public class StringPractiseWordCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Statement Here:");
        String str = sc.nextLine();

        String[] parts = str.split(" ");
        System.out.println("Number of words in a string" + " " + parts.length);
    }
}
