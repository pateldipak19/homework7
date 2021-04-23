/*
 * created by dipak patel
 * Java program to print salary slip with HRA,TA,DA,PF and Gross salary.
 */


import java.util.Scanner;

public class SalarySlip {

    //static method
    static void p5 (){

        //scanner created
        Scanner scanner = new Scanner(System.in);

        //salary slip print statements
        System.out.println("_______________________________");
        System.out.println("|        Salary Slip          |");
        System.out.println("|_____________________________|");
        System.out.print(  "|Employee Id       : ");
        int id =scanner.nextInt();

        System.out.print(  "|Employee Name     : ");
        String name = scanner.next();

        System.out.println("|_____________________________|");
        System.out.print(  "|Basic Salary      : ");
        float basic =scanner.nextFloat();

        float hra = basic*10/100;
        System.out.println("|HRA 10%           : "+hra);

        float ta = basic*8/100;
        System.out.println("|TA 8%             : "+ta);

        float da = basic*9/100;
        System.out.println("|DA 9%             : "+da);

        float pf = basic*20/100;
        System.out.println("|PF 20%            : "+pf);

        System.out.println("|_____________________________|");

        float gross = (basic+hra+da+ta)-pf;
        System.out.println("|Gross Salary      : "+gross);
        System.out.println("|=============================|");











    }


    public static void main(String[] args) {

        //calling static method
        SalarySlip.p5();
    }
}
