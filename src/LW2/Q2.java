package LW2;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        int number;
        Scanner scan = new Scanner(System.in);

        while (true){
        System.out.print("Enter The Number:");
        number = scan.nextInt();

        if(number< 0) {

            System.out.println("number is negative!, program stopped");
            break;
        }
        else {
            int digit = String.valueOf(number).length();
            System.out.println("Number of digits: " + digit);
        }

        }

        scan.close();

    }
}
