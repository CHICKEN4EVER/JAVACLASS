package academy.learnprogramming;

import jdk.swing.interop.SwingInterOpUtils;

public class Main {
    public static void main(String[] args) {
        //code from here
        float myMin = Float.MIN_VALUE;
        float myMax = Float.MAX_VALUE;
        System.out.println("Float min value is: " + myMin);
        System.out.println("Float max value is: " + myMax);

        double my1Min = Double.MIN_VALUE;
        double my1Max = Double.MAX_VALUE;
        System.out.println("Double min value is: " + my1Min);
        System.out.println("Double max value is: " + my1Max);

        float myAge = 38f;
        System.out.print("Age: ");
        System.out.println(myAge);

        double myWeight = 78.123456d;
        System.out.print("Weight: ");
        System.out.println(myWeight);
        System.out.println("");

        // CHALLENGE
        System.out.println("--- CHALLENGE ---");
        int myPounds = 78;
        float myKilograms = myPounds * 0.45359237f;
        System.out.println("78 Pounds equal to Kilograms: "+ myKilograms +"Kgs");

    }
}
