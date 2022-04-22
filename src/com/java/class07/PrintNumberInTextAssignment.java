package com.java.class07;

// take one number from user & print number in text format

//0-9
// Example input - 1, output - one
// Example - 7, output - Seven

import java.util.Scanner;

public class PrintNumberInTextAssignment {
    public static void main(String[] args) { // First im printing the text!
        System.out.println("Enter month here in numerical value 0-9");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt(); //We just need 1 VARIABLE, so int num is enough
        if (num == 0) {
            System.out.println("Zero");

        } else if (num == 1) {

            System.out.println("One");

        } else if (num == 2) {

            System.out.println("Two");

        } else if (num == 3) {

            System.out.println("Three");

        } else if (num == 4) {
            System.out.println("Four");
        } else if (num == 5) {

            System.out.println("Five");
        } else if (num == 6) {
            System.out.println("Six");
        } else if (num == 7) {


            System.out.println("Seven");
        } else if (num == 8) {
            System.out.println("Eight");
        } else if (num == 9) {

            System.out.println("Nine");
        } else if (num == 10) {

            System.out.println("Ten");

        }
    }
}

