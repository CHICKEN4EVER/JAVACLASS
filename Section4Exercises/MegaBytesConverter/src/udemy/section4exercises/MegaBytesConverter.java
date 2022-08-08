package udemy.section4exercises;

public class MegaBytesConverter {
    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        //Invalid
        if(kiloBytes <= 0){
            System.out.println("Invalid Value");
            //Without else, you need a return, the output won't execute this to out put as: -1 MB and 0 KB
        } else {
            //Variables
            int megaBytes = 0; // store megabytes converted from kilobytes
            int remainder = 0; //remainder Kilobytes

            //Calculations
            megaBytes = kiloBytes / 1024;
            remainder = kiloBytes % 1024;

            //Output

            System.out.println(kiloBytes + " KB = " + megaBytes + " MB and " + remainder + " KB.");
        }
    }
}
