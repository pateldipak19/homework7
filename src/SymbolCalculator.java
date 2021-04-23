/*
* created by dipak patel
* Java program for calculation using symbols(+,-,/,*)
 */

import java.util.Scanner;

public class SymbolCalculator {

    static void m (){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Input first number = ");
        int first = scanner.nextInt();
        System.out.print("Input second number = ");
        int second = scanner.nextInt();
        System.out.print("Input symbol '+','-','*','/' =  ");
        char  symbol = scanner.next().charAt(0);



        if (symbol=='+'){
            System.out.println("Addition = "+(first+second));
        }else if (symbol=='-'){
            System.out.println("Subtraction = "+(first-second));
        }else if (symbol=='/'){
            System.out.println("Division = "+(first/second));
        }else if (symbol=='*'){
            System.out.println("Multiplication = "+(first*second));
        }else {
            System.out.println("Invalid symbol");
        }
    }

    public static void main(String[] args) {

        SymbolCalculator.m();
    }
}
