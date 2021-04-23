/*
* created by dipak
* Java program to sort a numeric array and a string array.
 */
import java.util.Arrays;

public class NumericString {

static void m(){


    int[] num = {
            10,50,60,80,70,20,90,100,30,40
    };

    String[] stg = {
            "Delhi","Mumbai","Ahmedabad","Goa","Chennai","Surat","Rajkot","Baroda"
    };
    System.out.println("Original numeric array : "+Arrays.toString(num));
    Arrays.sort(num);
    System.out.println("Sorted numeric array : "+Arrays.toString(num));

    System.out.println("Original string array : "+Arrays.toString(stg));
    Arrays.sort(stg);
    System.out.println("Sorted string array : "+Arrays.toString(stg));




}

    public static void main(String[] args) {

    NumericString.m();
    }
}
