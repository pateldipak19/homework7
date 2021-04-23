/*
*created by dipak
* Java program to sum values of an array
 */


import java.util.Scanner;

public class ArraySum {

    void m(){

        int arraySum []= {1,2,3,4,5,6,7,8,9,10};
        int sum =0;
        for (int x : arraySum)
            sum += x;
        System.out.println("The sum is " + sum);

    }

    public static void main(String[] args) {
        ArraySum as = new ArraySum();
        as.m();
    }
}
