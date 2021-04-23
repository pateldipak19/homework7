/*
* created by dipak
 * java program to input any alphabet from “A" to “F” and print their city name accordingly using switch
 */

import java.util.Scanner;

public class CityNameSwitch {

    static void cityName () {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter alphabet A to F : ");
        char letter1 = scanner.next().charAt(0);
       // char letter2 = Character.toUpperCase(letter1);


        switch (letter1){

            case 'a':
                System.out.println("Ahmedabad,Amritsar,Agra");
                break;
            case 'b':
                System.out.println("Bombay,Baroda");
                break;
            case 'c':
                System.out.println("Chennai,Cherrapunji");
                break;
            case 'd':
                System.out.println("Daman,Delhi,Diu,Dehradun");
                break;
            case 'e':
                System.out.println("Elappara,Ellenabad");
                break;
            case 'f':
                System.out.println("Faridabad,Fatehabad,Faridkot");
                break;
            default:
                System.out.println("Invalid Entry");
            }
    }

    public static void main(String[] args) {

        CityNameSwitch.cityName();
    }
    }









