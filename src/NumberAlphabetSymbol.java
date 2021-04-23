/*
*created by dipak
* java program that tells input value is number or an alphabet or symbol
 */


import java.util.Scanner;

public class NumberAlphabetSymbol {

    static void valueCheck() {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Input the value: ");
        char value = scanner.next().charAt(0);


        /*ASCII value ranges-
       * For capital alphabets 65 – 90
       * For small alphabets 97 – 122
       * For digits 48 – 57
         */

        if ((value >= 65 && value <= 90) || (value >= 97 && value <= 122)) {
            System.out.println(" Alphabet ");
        } else if (value >= 48 && value <= 57){
            System.out.println(" Number ");
        }else {
            System.out.println(" Symbol ");
        }

    }




    public static void main(String[] args) {

      NumberAlphabetSymbol.valueCheck();
    }
}
