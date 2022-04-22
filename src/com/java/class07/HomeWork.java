package com.java.class07;
//. Write a program to take username and password from user and print appropriate message
//        based on below conditions
//        1. If username correct and password correct ---> Login successful
//        2. If username correct and password incorrect --> Invalid password
//        3. If username incorrect and password correct --> Invalid username
//        2. If username incorrect and password incorrect --> Login unsuccessful
import java.util.Scanner;

public class HomeWork {
    public static void main(String[] args) {
        //THIS IS INPUT
        System.out.println("Please enter username & password");
        Scanner sc = new Scanner (System.in);
        String username=sc.nextLine(), password=sc.nextLine();
        String expUsername="User", expPassword = "2022";


        //Output
        if (username == expUsername && password == expPassword) {
            System.out.println("Login Successful");
        }else if(username !=expUsername && password != expPassword) {
            System.out.println("Login Unsuccessful");
        }else if(username !=expUsername && password == expPassword ) {
            System.out.println("Invalid username");
        }else {
            System.out.println("Invalid password");
        }

    }



}
