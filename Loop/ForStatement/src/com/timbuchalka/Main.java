package com.timbuchalka;

public class Main {
    public static void main(String[] args) {
        //Without For loop:
//        System.out.println("10,000 at 2% interest = " + calculateInterest(10000.0, 2.0));
//        System.out.println("10,000 at 3% interest = " + calculateInterest(10000.0, 3.0));
//        System.out.println("10,000 at 4% interest = " + calculateInterest(10000.0, 4.0));
//        System.out.println("10,000 at 5% interest = " + calculateInterest(10000.0, 5.0));

        //With For loop;
        for(int i = 2; i < 9; i++){
            System.out.println("10,000 at " + i + " interest = " + String.format("%.2f", calculateInterest(10000.0, i)));
            //Because of the result will run 7 at 700.00000000001 then you use the String.format before the method
        }

        //Perform For loop but up size down from  8 -> 2:
        System.out.println("");
        for(int i = 8; i >= 2; i--){
            System.out.println("10,000 at " + i + " interest = " + String.format("%.2f", calculateInterest(10000.0, i)));
        }
    }

    // Create a method to calculate the interest of an amount:
    public static double calculateInterest(double amount, double interest){
        return(amount * (interest / 100));
    }
}
