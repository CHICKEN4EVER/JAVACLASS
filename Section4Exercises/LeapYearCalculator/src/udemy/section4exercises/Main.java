package udemy.section4exercises;

public class Main {
    public static void main(String[] args) {
        boolean leapYear;

        leapYear = LeapYearCalculator.isLeapYear(-1600);
        System.out.println(leapYear);
        leapYear = LeapYearCalculator.isLeapYear(1600);
        System.out.println(leapYear);
        leapYear = LeapYearCalculator.isLeapYear(2017);
        System.out.println(leapYear);
        leapYear = LeapYearCalculator.isLeapYear(2000);
        System.out.println(leapYear);

    }
}
