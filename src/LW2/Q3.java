package LW2;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        int row;
        System.out.println("Enter the number of ROW: ");
        Scanner scan =new Scanner(System.in);
        row=scan.nextInt();

        for(int i=0;i<row;i++){
            for(int j=row-i-1;j>=1;j--)
                System.out.print(" ");
            for(int j=0;j<=i;j++)
                System.out.print("* ");
            System.out.println();

        }

    }
}
