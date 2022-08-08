package com.timbuchalka;
// print result A or B or C or D or E if case is matched with the char variable
// print wasn't found if the char variable is not one of those above:
public class Main {
    public static void main(String[] args) {
        char kaLoma = 'L';
        switch (kaLoma) {
            case 'A': case 'B': case 'C': case 'D': case 'E':
                System.out.println(kaLoma + " was found");
                break;

            default:
                System.out.println("A, B, C, D, E wasn't found");
                break;
        }

    }
}
