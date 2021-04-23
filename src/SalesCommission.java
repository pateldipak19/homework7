/*
* created by dipak patel
* java program to find out sales commission
 */

import java.util.Scanner;

public class SalesCommission {

    void m (){

        Scanner scanner = new Scanner(System.in);//Scanner

        //input data print statements
        System.out.print("Seller ID: ");
        int id = scanner.nextInt();
        System.out.print("Seller Name: ");
        String name = scanner.next();
        System.out.print("Sales amount: ");
        int amount = scanner.nextInt();
        System.out.print("Basic Salary: ");
        int basic = scanner.nextInt();

        //commission
        if (amount>=50000){
            System.out.println("Commission: "+amount*35/100);
        }else if (amount>=30000){
            System.out.println("Commission: "+amount*20/100);
        }else if (amount>=20000){
            System.out.println("Commission: "+amount*10/100);
        }else if (amount>=10000){
            System.out.println("Commission: "+amount*5/100);
        }else if (amount<10000){
            System.out.println("Commission: "+amount*2/100);

        }

    }

    public static void main(String[] args) {

        SalesCommission sc = new SalesCommission();
        sc.m();
    }


}
