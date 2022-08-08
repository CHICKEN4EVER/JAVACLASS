package academy.learnprogramming;

public class MAIN {
    public static void main(String[] args) {
        double myDouble = 20.00d;
        double my2Double = 80.00d;
        double total = (myDouble + my2Double) * 100.00d; //if this expression is without () then
        System.out.println("My total is: " + total);
        double theRemainder = total % 40.00d;
        System.out.println("My remainder is: " + theRemainder); // the Remainder is not 0

        boolean isNoRemainder = (theRemainder == 0) ? true : false; // then it is false
        System.out.println("isNoRemainder is: " + isNoRemainder);

        if (!isNoRemainder) {
            System.out.println("Got some remainder!!!"); // then  this will be  printout
        }
    }
}

// Please note that this challenge expects the 16th line is not printed out because it must be true