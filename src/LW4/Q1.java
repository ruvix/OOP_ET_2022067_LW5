package LW4;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        System.out.println("Enter the number 1: ");
        Scanner scan= new Scanner(System.in);
        int num1= scan.nextInt();

        System.out.println("Enter the number 2: ");
        int num2= scan.nextInt();

        System.out.println("Enter the number 3: ");
        int num3= scan.nextInt();

        if(num1<=num2 && num1<=num3){
            System.out.println("smallest num is 1: "+num1);
        }
        else if (num2<=num1 && num2<=num3){
            System.out.println("smallest num is 3: "+num2);

        }
        else{
            System.out.println("smallest num is 3: "+num3);
        }
    }
}
