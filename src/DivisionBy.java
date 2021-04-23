/*
*created by dipak
* java program to print the numbers between 1 to 100 which can be divided by 3  and 5 separately
 */


import java.util.Scanner;

public class DivisionBy {

    void p11(){

        System.out.println("\nDivided by 3: ");
        for (int a=1; a<100; a++) {
            if (a%3==0)
                System.out.print(a +", ");
        }

        System.out.println("\n\nDivided by 5: ");
        for (int b=1; b<100; b++) {
            if (b%5==0) System.out.print(b +", ");
        }



    }

    public static void main(String[] args) {
        DivisionBy db = new DivisionBy();
        db.p11();
    }
}
