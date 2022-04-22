package com.java.class04;

public class StringExample {
    // if we do addition with String it'll be concatenation
    // String + String =StringString
    // String + Int = StringInt
    // Int + String =IntString
    // Int + Int + String =(Int+Int)+String
    // If we will use " " then this will turn it into string
    public static void main(String args[]){
        int a =10, b =20, c = 30;
        String str1 = "Hello";
        String str2 = "Java";

        System.out.println(a);  // 10
        System.out.println(str1 + str2);// HelloJava
        System.out.println(a+b); // 30
        System.out.println(str1 + a + b); // Hello1020 - Because it goes left to right therefore first formula is
        //(str1+a) then we add int B, so (str1+a)+b = (Hello10)20

        System.out.println("a + b"); // a+b (because "" turns into spring)
        System.out.println("a"+ b + c); // "" turn into string so it will be (String + B)+c
        System.out.println(str1 + a * b); //multiplication is done first
 //       System.out.println(str1 + a - b) Int can't be with a minus (-)
        System.out.println(a - b + str1);
    }
}
