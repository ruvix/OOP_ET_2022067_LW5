package LW4;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        System.out.println("Enter the the year:");
        Scanner scan=new Scanner(System.in);
        int year=scan.nextInt();
        if((year%4==0 && year%100!=0)||(year%4==0 && year%100==0 && year%400==0)){
            System.out.println("its a leap year");

        }
        else {
            System.out.println("its not a leap year:"+year);
        }
    }

    public static class Main {
        public static void main(String[] args) {

            System.out.println("Enter the sentence: ");
            Scanner scan=new Scanner(System.in);
            String sentence=scan.nextLine();

            System.out.println("Enter the old word: ");
            String oldw=scan.nextLine();

            System.out.println("Enter the new word: ");
            String neww=scan.nextLine();

            System.out.println(sentence.replace(oldw,neww));


        }
    }
}
