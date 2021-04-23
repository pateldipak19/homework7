/*
*created by dipak
* Java program to sum values of an array
 */


import java.util.Arrays;
import java.util.Scanner;

public class ArrayAverage {

public void arrayAverage(){

    int length;
    int sum = 0,average;
    Scanner scanner=new Scanner(System.in);
    System.out.println("Input length of array: ");
    length = scanner.nextInt();
    int number [] = new int[length];
    System.out.println("Input value of array with space: ");

    for (int i=0;i<length;i++){
        number[i]= scanner.nextInt();
        sum=sum+number[i];
    }
    average=sum/length;
    System.out.println(Arrays.toString(number));
    System.out.println("The average of array: "+average);

}

    public static void main(String[] args) {
        ArrayAverage aa = new ArrayAverage();
        aa.arrayAverage();
    }

}
