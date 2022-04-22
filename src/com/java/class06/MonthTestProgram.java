package com.java.class06;
//write a program to take month from user and print number of days in given month
//11 - 30 days
//2 - 28/29 days
import java.util.Scanner;

public class MonthTestProgram {
    public static void main(String[] args) {
        System.out.println("Enter month here in numerical value 1-12");
        Scanner sc = new Scanner(System.in); //it replaces INT
        int month = sc.nextInt();
        if (month==1){
            System.out.println("30 days");
        }if(month==2) {
            System.out.println("28 days");
        }if(month==3) {
            System.out.println("30 days");
        }if(month==4) {
            System.out.println("31 days");
        }if(month==5) {
            System.out.println("30 days");
        }if(month==6) {
            System.out.println("31 days");
        }if(month==7) {
            System.out.println("30 days");
        }if(month==8) {
            System.out.println("30 days");
        }if(month==9) {
            System.out.println("31 days");
        }if(month==10) {
            System.out.println("30 days");
        }if(month==11) {
            System.out.println("31 days");
        }if(month==12) {
            System.out.println("30 days");
        }

    }
}
