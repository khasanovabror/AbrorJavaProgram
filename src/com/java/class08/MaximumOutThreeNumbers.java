package com.java.class08;

import java.util.Scanner;

// take three number from users and print maximum number out of three numbers
public class MaximumOutThreeNumbers {
    public static void main(String[] args) {
        //input
        System.out.println("Enter Number");
        Scanner sc = new Scanner (System.in);
        // THIS IS OUR INPUT, WE NEED 3 INPUTS THERE 3 INT SC.nextInt
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();

        if (a > b && a > c) {
            System.out.println(a + "is the largest number");
        }else if (b > c){
            System.out.println(b + "is the largest number");
        }else{
            System.out.println(c + "is the largest number");
        }
    }
}
