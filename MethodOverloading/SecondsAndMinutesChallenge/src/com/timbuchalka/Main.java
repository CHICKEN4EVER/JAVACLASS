package com.timbuchalka;

public class Main {
    public static void main(String[] args) {
        System.out.println("TEST INVALID CASE");
        System.out.println(getDurationString(-1, -1));
        System.out.println(getDurationString(1, 60));
        System.out.println(getDurationString(100, 58));
    }

    private static String getDurationString(long minutes, long seconds) {
        if((minutes < 0) || (seconds < 0 || seconds > 59)){
            return "Invalid data";
        }

        long hours = minutes / 60;
        long remainingMinutes = minutes % 60;
        return hours + "h " + remainingMinutes + "m " + seconds + "s";

    }
}
