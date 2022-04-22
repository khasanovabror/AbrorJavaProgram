package com.java.class09;

public class PreFixAndPostFix {
    public static void main(String[] args) {
        int i = 4;
        int j = 4;



        int k = i++ + --j; // (4+1 + -1) 5 4
        int m = k++ - i++; //0



        System.out.println(i);
        System.out.println(j);
        System.out.println(k);
        System.out.println(m);
    }
}
