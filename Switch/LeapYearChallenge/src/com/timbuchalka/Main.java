package com.timbuchalka;

public class Main {
    public static void main(String[] args) {
        isLeapYear(0);
        isLeapYear(1600);
        isLeapYear(2022);
        isLeapYear(10000);
        System.out.println("SPACE");
        getDaysInMonth(1, 2020);
        getDaysInMonth(2, 2020);
        getDaysInMonth(2,  2018);
        getDaysInMonth(-1, 2020);
        getDaysInMonth(1,-2020);
    }

    public static  boolean isLeapYear(int year) {
        boolean leapYear = false;
        if (year < 1 || year > 9999) {
            System.out.println("Invalid input");
            return leapYear;
        } else {
            if ((year % 4) == 0  && (year % 100 != 0)) {
                System.out.println("This " +  year + " is a leap year");
                leapYear = true;
            } else if ((year % 100) == 0 && (year % 400 ) == 0 ) {
                System.out.println("This " +  year + " is a leap year");
                leapYear = true;
            } else {
                System.out.println("This " + year + " is not a leap year");
                leapYear = false;
            }
        }
        return leapYear;
    }



    public static int getDaysInMonth(int month, int year) {

        if (month < 1 || month > 12 || year < 1 || year > 9999) {
            return -1;
        }
        int noOfDays = 0;
        switch (month) {
            case 1: case 3: case 5: case 7: case 8: case 10 : case 12:
                noOfDays = 31;
                System.out.println("This " + month + " month has " + noOfDays + " days");
                break;
            case 2:
                if(isLeapYear(year)) {
                    noOfDays = 29;
                    System.out.println("This " + month + " month has " + noOfDays + " days");
                    break;
                }
                noOfDays = 28;
                System.out.println("This " + month + " month has " + noOfDays + " days");
                break;
            case 4: case 6: case 9 : case 11:
                noOfDays = 30;
                System.out.println("This " + month + " month has " + noOfDays + " days");
                break;
            default:
                noOfDays = -1;
                System.out.println("This " + month + " month has " + noOfDays + " days as INVALID");
                break;

        }
        return noOfDays;

    }

}
