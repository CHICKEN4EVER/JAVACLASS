package com.timbuchalka;

public class Main {
    public static void main(String[] args) {
        int switchValue = 6;
        switch (switchValue) {
            case 1:
                System.out.println("Value was 1");
                break;

            case 2:
                System.out.println("Value was 2");
                break;

                //Shortcut for many cases but 1 result:
            case 3: case 4: case 5:
                System.out.println("Value was one of 3 or 4 or 5");
                break;
            default:
                System.out.println("Value was not 1 or 2 or 3 or 4 or 5");
                break;
        }
    }
}
