/*
* created by dipak
* Java program which input any number between 1 to 7 and it print The Days
 */


import java.util.Scanner;

public class Number2Days {

    static void m (){

        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter any day number from 1 to 7 of a week :  ");
        int day = scanner.nextInt();


        switch (day){

            case 1 :
                System.out.println("Monday");
                break;
            case 2 :
                System.out.println("Tuesday");
                break;
            case 3 :
                System.out.println("Wednesday");
                break;
            case 4 :
                System.out.println("Thursday");
                break;
            case 5 :
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Week contains 1 to 7 days");

        }
    }

    public static void main(String[] args) {

        Number2Days.m();
    }
}
