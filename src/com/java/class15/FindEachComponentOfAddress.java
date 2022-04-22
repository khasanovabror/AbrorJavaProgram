package com.java.class15;

public class FindEachComponentOfAddress {
    public static void main(String[] args) {
        String address = "B604, Comsos Society, Magarpatta City, Pune, 411013";
        String[] Split = address.split(" ");
        for (int i = 0; i <= 6; i++) {
            System.out.println(Split[i]);


        }
    }
}
