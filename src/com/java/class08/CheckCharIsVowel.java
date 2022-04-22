package com.java.class08;

import java.util.Scanner;

// take single char in the program & check weather given char is vowel or not
// vowel char are - a, e, i, o, u
public class CheckCharIsVowel {
    public static void main(String[] args) {
        char c = 'a';

        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
            System.out.printf("vowel");
        } else {
            System.out.printf("not vowel");
        }
    }
}
