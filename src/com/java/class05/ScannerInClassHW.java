package com.java.class05;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ScannerInClassHW {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Number 1");
        int num1 = sc.nextInt();
        System.out.println("Number 2");
        int num2 = sc.nextInt();
        if (num1 > num2) {
            System.out.println(num1 + " Is greater");
        }else if (num2 > num1){
            System.out.println(num2 + " Is Greater");
        }else if (num1 == num2){
            System.out.println(num1 + " and " + num2 + " are equal" );
        }

    }
}