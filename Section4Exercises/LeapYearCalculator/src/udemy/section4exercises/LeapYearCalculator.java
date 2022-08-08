package udemy.section4exercises;

public class LeapYearCalculator {
    public static boolean isLeapYear(int year) {
        if(year >= 1 && year <= 9999){
            //Purpose:
            if(year % 4 == 0) {
                if(year % 100 == 0) {
                    if(year % 400 == 0) {
                        return true;
                    }
                    else {
                        return false;
                    }
                }
                return true;
            }
            return false;
        }
        return false;

    }
}
