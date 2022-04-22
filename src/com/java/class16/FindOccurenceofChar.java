package com.java.class16;

import java.util.Scanner;

public class FindOccurenceofChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Statement Here:");
        String str = sc.nextLine();
        char c = 'a';
        int count = 0;
        for (int i =0; i<str.length(); i++){
            if (str.charAt(i) == 'a' || str.charAt(i) == 'A'){
                count++;
            }
            }
        System.out.println("The Letter" + " " + c + " " + "occurs" + " " + count + " " + "times" );
        }
}
