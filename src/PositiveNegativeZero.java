/*
* created by dipak
* java program to check if enter number is “POSITIVE”, “NEGATIVE” or  “ZERO”
 */

import java.util.Scanner;

public class PositiveNegativeZero {

    void m (){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number here : ");
        int number = scanner.nextInt();

        if (number>0){
            System.out.println(number+" number is Positive ");
        }else if (number<0){
            System.out.println(number+" number is Negative");
        }else
            System.out.println(number+" number is Zero");


    }


    public static void main(String[] args) {

        PositiveNegativeZero pnz = new PositiveNegativeZero();
        pnz.m();
    }
}
