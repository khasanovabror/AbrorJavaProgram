package com.java.class06;

public class WarmUpTest {
    public static void main(String[] args) {
        int a = 7;
        if (a >= 10) {
            //THIS IS CALLED NEST WHERE IF are reliant on IF
            System.out.println("0");
            if (a != 11) {
                System.out.println("1");
            } else {
                System.out.println("2");
            }
        }else{
            System.out.println("3");
        }
    }
    }
