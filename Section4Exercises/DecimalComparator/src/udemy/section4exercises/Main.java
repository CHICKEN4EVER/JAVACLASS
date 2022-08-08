package udemy.section4exercises;

public class Main {
    public static void main(String[] args) {
        boolean compare = DecimalComparator.areEqualByThreeDecimalPlaces(-3.1756, -3.1756);
        System.out.println(compare);
        compare = DecimalComparator.areEqualByThreeDecimalPlaces(3.175, 3.176);
        System.out.println(compare);
        compare = DecimalComparator.areEqualByThreeDecimalPlaces(3.0, 3.0);
        System.out.println(compare);
        compare = DecimalComparator.areEqualByThreeDecimalPlaces(-1.234, 1.234);
        System.out.println(compare);
        compare = DecimalComparator.areEqualByThreeDecimalPlaces(4.777, 4.776);
        System.out.println(compare);
    }
}
