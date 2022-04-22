package com.java.class06;

import java.util.Scanner;

//write a program to take month from user and print number of days in given month
//11 - 30 days
//2 - 28/29 days
public class HomeworkTestRun {
    public static void main(String[] args) {
        int a = 19;
        if (a % 10 * 2 > 10){
            System.out.println("1");
        }else if (a % 10 -4 == 5){
            System.out.println("2");
    }
        if(a * 2 > 30){
            System.out.println("3");
        }else{
            System.out.println("4");
        }
}
}