package LW4;

import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        System.out.print("enter the number of ROWS: ");

        Scanner scan =new Scanner(System.in);
        int row=scan.nextInt();

        for(int i=0;i<row;i++){
            for(int j=row-i-1;j>=1;j--)
                System.out.print(" ");
            for( int j =0;j<=i;j++)
                System.out.print("* ");
            System.out.println();
            }


















    }
}
