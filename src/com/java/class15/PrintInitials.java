package com.java.class15;

// print the initials of the name - A.K.K.
public class PrintInitials {
    public static void main(String[] args) {
        String fullName = "Abror Khodjiakbarovich Khasanov";
        String[] splitName = fullName.split(" ");
        String initials = splitName[0].substring(0,1) + "."+ splitName[1].substring(0,1)+ "."+ splitName[2].substring(0,1);
        System.out.println(initials );


    }
}
