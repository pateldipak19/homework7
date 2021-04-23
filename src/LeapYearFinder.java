/*
        * created by dipak patel
        * Java program to input year and find of if it is leap year or not.
        */


import java.util.Scanner;

public class LeapYearFinder {

    //static method
    static void m (){

        Scanner scanner = new Scanner(System.in);//scanner created
        System.out.print("Input year :  ");//print statement for input
        int year = scanner.nextInt();
        System.out.println("");//print statement for spacing

        String leapYear = (year % 4 == 0) ? "a leap year":"not a leap year";//formula for the leap year
        System.out.println(year+ " is " +leapYear); //print statement for result


    }

    //Main method
    public static void main(String[] args) {

        //calling static method
        LeapYearFinder.m();
    }
}
