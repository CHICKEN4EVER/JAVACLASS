package com.timbuchalka;

public class Main {
    public static void main(String[] args) {
        int count = 0;
        int sum = 0;
        for(int i = 1; i <= 1000; i++){
            if((i % 3 == 0) && (i % 5 == 0)) {
                count++;
                sum += i;
                System.out.println("Found number is: " + i);
            }
            if(count == 10){
                break;
            }

        }

        System.out.println("Sum of those above is: " + sum);
    }


}
