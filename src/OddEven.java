/*
* created by dipak patel
* Java program that tells the input number is odd or even.
 */

import java.util.Scanner;

public class OddEven {

        //instance method
        void m (){

            Scanner scanner=new Scanner(System.in);  //scanner created
            System.out.print("Input number: ");  //print statement of input number
            int number = scanner.nextInt();

            String result = (number % 2==0) ? "even":"odd"; //formula used for odd and even
            System.out.println(number+" is " + result); //print statement for result

        }

    public static void main(String[] args) {
        //calling instance method
            OddEven p1 = new OddEven();
        p1.m();
    }

}
