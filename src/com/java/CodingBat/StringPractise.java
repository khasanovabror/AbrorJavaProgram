package com.java.CodingBat;



public class StringPractise {
    public static void main(String[] args) {
        String FirstWord = "<<>>";
        String SecondWord = "Yay";
        System.out.println(FirstWord.substring(0, FirstWord.length()/2) + SecondWord + FirstWord.substring(0,FirstWord.length()/2));
    }

}
