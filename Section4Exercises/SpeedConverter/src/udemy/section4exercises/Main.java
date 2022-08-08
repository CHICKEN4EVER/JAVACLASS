package udemy.section4exercises;

public class Main {
    public static void main(String[] args) {
        double miles = SpeedConverter.toMilesPerHour(10.5);
        System.out.println("Miles = " + miles);

        SpeedConverter.printCoversion(10.5);

        System.out.println("");

        miles = SpeedConverter.toMilesPerHour(19.5);
        System.out.println("Miles = " + miles);

        SpeedConverter.printCoversion(19.5);
    }
}
