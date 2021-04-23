/*
 * created by dipak patel
 * Java program for the students mark sheet.
 */

import java.util.Scanner;

public class StdentMarkSheet {

    //instance method
    void m (){

        //scanner created
        Scanner scanner = new Scanner(System.in);

        //pattern print statements
        System.out.println(" ______________________________ ");
        System.out.println("|                              |");
        System.out.println("|         Mark Sheet           |");
        System.out.println("|______________________________|");
        System.out.print(  "|   Name          :    ");
        String Name= scanner.nextLine();
        System.out.print(  "|   Roll No.      :    ");
        int rollNumber = scanner.nextInt();
        System.out.println("|______________________________|");
        System.out.println("|   Subjects      :    Marks   |");
        System.out.println("|______________________________|");


       //Subjects marks with if-else conditions
        System.out.print(  "|   Math          :    ");
        int math= scanner.nextInt();
        if (math<0 || 100<math){
            System.out.println("Invalid input");
        }
        System.out.print(  "|   Science       :    ");
        int science = scanner.nextInt();
        if (science<0 || 100<science){
            System.out.println("Invalid input");
        }
        System.out.print(  "|   English       :    ");
        int english = scanner.nextInt();
        if (english<0 || 100<english){
            System.out.println("Invalid input");
        }

        System.out.println("|______________________________|");
        int total = math+science+english;
        System.out.println(  "|   Total         :    "+total);
        System.out.println("|______________________________|");

        int percentage = total/3;
        System.out.println(  "|   Percentage    :    "+percentage);


        if(percentage>=35){
        System.out.println("|   Result        :    Pass    |");
        }else {
        System.out.println("|   Result        :    Fail    |");
        }





        if(percentage>=80){
        System.out.println("|   Grade         :     A+     |");
        }else
        if(percentage>=60){
        System.out.println("|   Grade         :     A      |");
        }else
        if(percentage>=50){
        System.out.println("|   Grade         :     B      |");
        }else
        if(percentage>=35){
        System.out.println("|   Grade         :     C      |");
        }
        System.out.println("|______________________________|");

    }




    //Main method
    public static void main(String[] args) {

        StdentMarkSheet ms = new StdentMarkSheet();//object created
        ms.m();//calling instance method
    }
}
