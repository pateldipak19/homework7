/*
* created by dipak patel
* java program to input any alphabet from “A" to “F” and print their city name accordingly using if-else
 */

import java.util.Scanner;

public class CityNAme {

    //instance method
    static void p8() {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Input alphabet 'A to F': ");
        char letter = scanner.next().charAt(0);

        if (letter=='A'||letter=='a'){
            System.out.println("Ahmedabad,Amritsar,Agra");
        }else if(letter=='B'||letter=='b'){
            System.out.println("Bombay,Baroda");
        }else if(letter=='C'||letter=='c'){
            System.out.println("Chennai,Cherrapunji");
        }else if(letter=='D'||letter=='d'){
            System.out.println("Daman,Delhi,Diu,Dehradun");
        }else if(letter=='E'||letter=='e'){
            System.out.println("Elappara,Ellenabad");
        }else if(letter=='F'||letter=='f'){
            System.out.println("Faridabad,Fatehabad,Faridkot");
        }else {
            System.out.println("Invalid entry");
        }

    }

    public static void main(String[] args) {

        CityNAme.p8();
    }
    }
