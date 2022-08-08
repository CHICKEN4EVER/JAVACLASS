package com.timbuchalka;

public class Main {
    // Lesson
    /* public static void main(String[] args) {
        int newScore = calculateScore("Oliver", 680);
        System.out.println("New score is " + newScore);
        int newScore2 = calculateScore(860);
        System.out.println("New score is " + newScore2);
        calculateScore();
    }
    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " scored " + score + " points!!!");
        return score * 1000;

    }

    public static int calculateScore(int score) {
        System.out.println("Unnamed player scored " + score + " points!!!");
        return score * 1000;

    }

    public static int calculateScore() {
        System.out.println("No data!!!");
        return 0;
    }
*/
    public static void main(String[] args) {
       calcFeetAndInchesToCentimeters(6, 0);
       calcFeetAndInchesToCentimeters(-1, 5);
       calcFeetAndInchesToCentimeters(5, -1);
       calcFeetAndInchesToCentimeters(12,14);
       calcFeetAndInchesToCentimeters(12, 5);
       calcFeetAndInchesToCentimeters(15, 15);
       //
       calcFeetAndInchesToCentimeters(100);
       calcFeetAndInchesToCentimeters(157);

    }

    //Create a new method called calcFeetAndInchesToCentimeters
    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        //Validation
        if((feet < 0) || (inches < 0 || inches  > 12)) {
            System.out.println("Invalid input!!!");
            return -1;
        } else if (feet > 10) {
            System.out.println("No one is at that height!!!");
            return  -1;
        }

        // 1 inch = 2.54 cm
        // 1 foot = 12 inches
        // 1 foot = 12 * 2.54 cm = 30.48 cm
        double centimeters = feet * 30.48;
        centimeters += inches * 2.54;
        System.out.println(feet + "ft and " + inches + "inches are equal to " + centimeters + " centimeters" );
        return centimeters;
    }

    public static double calcFeetAndInchesToCentimeters(double inches) {
        if(inches < 0){
            return -1;
        }
        double feet = (int) inches / 12;
        double remainderInches = (int) inches % 12;
        System.out.println(inches + "inches are equal to " + feet + "ft and " + remainderInches + "inches!!!" );
        /* if you just want to calculate inches to feet and inches
        return inches;

         */
        return calcFeetAndInchesToCentimeters(feet, remainderInches);
    }
}
