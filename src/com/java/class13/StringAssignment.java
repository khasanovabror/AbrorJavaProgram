package com.java.class13;

import java.util.Scanner;

// Create String Variable -> Intiliazer two variables with constant values

// take third variable value from scanner
// compare 1st and 2nd using == operator
// compare 2nd and 3rd using == operator
// compare 1st and 3rd using .equals() method
public class StringAssignment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = "Variable";
        String str2 = "Variable";
        String str3 = sc.nextLine();
        if (str1 == str2) {
            System.out.println("1st Method");
        } else System.out.println("False");
        if (str2 == str3) {
            System.out.println("True");
        } else System.out.println("2nd Method");
        if (str1.equals(str3)) {
            System.out.println("3rd method");
        } else System.out.println("False");

    }
}
