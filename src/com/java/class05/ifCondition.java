package com.java.class05;

import sun.font.TrueTypeFont;

public class ifCondition {
    public static void main(String[] args) {
        // syntax for IF condition

        // if(Condition){
        //statements to execute if condition is true
        //}
        int isFuelIsLow = 0;
        System.out.println("1. Starting drive");

        if (isFuelIsLow == 1) {
            System.out.println("2. Fill the fuel");
        }

            System.out.println("3. Ending drive");

            //Boolean Example where we can use True or False
            boolean isFuelIsLow2 = true;{
            System.out.println("1. Starting drive");

            if (isFuelIsLow2 == true) {
                System.out.println("2. Fill the fuel");
            }

            System.out.println("3. Ending drive");
            int fuelPercentage = 0; // Fuel Percentage = Zero

            System.out.println("1. Starting Drive");

            if(fuelPercentage <= 20){ // We are setting up the {} with an IF condition, which if FuelPercentage
                //which equals ZERO as above is < or = 20, if TRUE, execute line 2.
                    System.out.println("2. Fill the fuel");
            }

            System.out.println("3. Ending Drive");



        }
    }
}
