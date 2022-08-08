package com.timbuchalka;

import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        String monthBirth = "february";
        switch (monthBirth.toLowerCase()) {
            case "january":
                System.out.println(monthBirth + " is my birthday");
                break;
            default:
                System.out.println(monthBirth + " is not my birthday");
                break;
        }
    }
}
