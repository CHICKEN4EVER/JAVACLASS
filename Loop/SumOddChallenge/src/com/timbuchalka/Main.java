package com.timbuchalka;

public class Main {
    public static void main(String[] args) {
        System.out.println(sumOdd(1, 100));
        System.out.println(sumOdd(-1, 100));
        System.out.println(sumOdd(100, 100));
        System.out.println(sumOdd(13, 13));
        System.out.println(sumOdd(100, -100));
        System.out.println(sumOdd(100, 1000));
    }

    public static boolean isOdd(int number) {
        if(number <= 0 || (number % 2) != 0) {
            return true;
        }
        return false;

    }

    public static int sumOdd(int start, int end) {
        int sum = 0;
        if(start <= end && start > 0 && end > 0) {
            for(int i = start; i <= end; i++) {
                if(isOdd(i)) {
                    sum += i;
                }
            }

            System.out.print("The start no " + start + " and the end no " + end + " are summed = ");
            return sum;
        } else {
            System.out.print("The start no " + start + " and the end no " + end + " are wrong and the system gives you a result = ");
            return -1;
        }
    }
}
