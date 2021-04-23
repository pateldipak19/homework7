import java.util.Scanner;

/*
* created by dipak patel
* Java program to find odd or even of input number using if-else.
 */
public class IFOddEven {

    //instance method
    void p6 (){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Input any number: ");
        int number = scanner.nextInt();

        if (number % 2 ==0){
            System.out.println("Input number is an even number");
        }else{
            System.out.println("Input number is an odd number");
        }

    }

    public static void main(String[] args) {

        IFOddEven oe = new IFOddEven();
        oe.p6();

    }
}
