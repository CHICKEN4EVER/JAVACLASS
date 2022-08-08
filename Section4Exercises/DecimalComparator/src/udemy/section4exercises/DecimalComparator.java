package udemy.section4exercises;

public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double number1, double number2) {
        // *1000 because needs to take 3 decimals
        //Use casting to cast from double to int
        int num1 = (int) (number1 * 1000);
        int num2 = (int) (number2 * 1000);

        if (num1 == num2) {
            return true;
        }
        return false;
    }
}
