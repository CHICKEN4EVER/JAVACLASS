package udemy.section4exercises;

public class Main {
    public static void main(String[] args) {
        boolean sumChecker = EqualSumChecker.hasEqualSum(1, 1, 1);
        System.out.println(sumChecker);
        sumChecker = EqualSumChecker.hasEqualSum(1, 1, 2);
        System.out.println(sumChecker);
        sumChecker = EqualSumChecker.hasEqualSum(1, -1, 0);
        System.out.println(sumChecker);
    }
}
