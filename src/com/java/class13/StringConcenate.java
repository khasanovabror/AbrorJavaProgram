package com.java.class13;

public class StringConcenate {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "DevX";
        int a = 10;
        int b = 20;
        int c = 5;

        System.out.println("Add" + a + b);
        System.out.println("Add" + a + b + c);
        System.out.println("Add" + a + b * c);
        System.out.println(a + b + "Add");
        System.out.println(a + b + "Add" + a + b);
        System.out.println(str1 + a + b +str2);
    }
}
