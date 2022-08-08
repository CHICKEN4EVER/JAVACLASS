package udemy.section4exercises;

public class Main {
    public static void main(String[] args) {
        // Basic code
        /*
        boolean case1 = BarkingDog.shouldWakeUp(true, 1);
        System.out.println(case1);
        boolean case2 = BarkingDog.shouldWakeUp(false, 2);
        System.out.println(case2);
        boolean case3 = BarkingDog.shouldWakeUp(true, 8);
        System.out.println(case3);
        boolean case4 = BarkingDog.shouldWakeUp(true, -1);
        System.out.println(case4);

        */

        // Smarter code
        BarkingDog dog = new BarkingDog();
        boolean wakeup;
        wakeup = dog.shouldWakeUp(true, 1);
        System.out.println(wakeup);
        wakeup = dog.shouldWakeUp(false, 2);
        System.out.println(wakeup);
        wakeup = dog.shouldWakeUp(true, 8);
        System.out.println(wakeup);
        wakeup = dog.shouldWakeUp(true, -1);
        System.out.println(wakeup);
    }
}
