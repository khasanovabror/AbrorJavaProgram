package com.java.class14;

import java.sql.SQLOutput;

public class StringMethods {
    public static void main(String[] args) {
        String str1 = "Hello World";
        String str2 = "hello World";
        String str3 = "Hello World! Welcome to Devx!";

        // 1. We want to check equality of two string
        System.out.println("1. equality" + str1.equals(str2));

        // 2. Check equality of two string ignoring case
        System.out.println("2. Equality ignore case" + str1.equalsIgnoreCase(str2));

        // 3. Check one String contains another String
        //. Contains will only check one string containts anothet string
        System.out.println("3. Containts: "+str3.contains(str1));

        // 4. Changin the case of String
        System.out.println("4.Upper Case:" +str3.toUpperCase());
        System.out.println("4. Lower Case:" +str3.toLowerCase());

        // if we want to check string contains another string ignore case then we have to change both
        //string in the same case and then check contains, so it'll check only content of both string
        String str3LowerCase = str3.toLowerCase();
        String str2LowerCase = str2.toLowerCase();
        System.out.println("5. Contains" + str3LowerCase.contains(str2LowerCase));

        //6. Find index of charter
        str1 = "Hello Wwwworld";
        System.out.println("5. Index Of Char:" + str1.indexOf('W'));

        //9. Replcae & ReplaceALL
        str1 = "INR 200 INR 300 INR 500";
        System.out.println("9. Replace:" + str1.replace("INR", "USD"));
        System.out.println("9. Replace using [A-Z]" + str1.replaceAll("[A-Z]", " "));
        System.out.println("9.===============");

        //11. Substring
        str1= "Welcome to jave class. Today is fun day";
        System.out.println("11.Substring " + str1.substring(7)); //substring print letters where 0 = first letter, when used 1 (1)
        // then that ignore those letter and executes from it, so in example above (7) = W E L C O M E
        System.out.println("11. Substring" + str1.substring(0,7)); // (0-7) looks for letter 0-7
        System.out.println("11.=========");



        //12. split
        str1 = "welcome to java class";
        String[] words = str1.split(" ");
        System.out.println("12. Split: ");
        System.out.println(words[0]);
        System.out.println(words[1]);
        System.out.println(words[2]);
        System.out.println("12. Split in 1 line: " + words[0] + words[1]);

        str3 = "welcome to java class";
        String[] words3 = str3.split(" ");
        System.out.println(words.length);
        for(int i=0; i<words.length; i++) {
            System.out.println("string 3" + " "+ words[i]);
        }
        str2 = "welcome to java class";
        String[] words2 = str2.split(" ");
        for(int i=0; i<=3; i++){
            System.out.println(words[i]);

        }
    }
}
