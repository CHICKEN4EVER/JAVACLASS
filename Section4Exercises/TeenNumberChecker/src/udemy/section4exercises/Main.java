package udemy.section4exercises;

public class Main {
    public static void main(String[] args) {
        boolean ageChecker = TeenNumberChecker.hasTeen(9, 99, 19);
        System.out.println(ageChecker);
        ageChecker = TeenNumberChecker.hasTeen(23, 15, 42);
        System.out.println(ageChecker);
        ageChecker = TeenNumberChecker.hasTeen(22, 23, 24);
        System.out.println(ageChecker);

        System.out.println("");

        boolean sureTeen = TeenNumberChecker.isTeen(9);
        System.out.println(sureTeen);
        sureTeen = TeenNumberChecker.isTeen(14);
        System.out.println(sureTeen);
    }
}
