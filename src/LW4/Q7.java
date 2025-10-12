package LW4;

import java.util.Scanner;

class Digits {
    public static int countDigits(int n){
        if(n==0)return 1;
        int count=0;
        while (n!=0){
            count++;
            n/=10;
        }
        return count;
    }

}

public class Q7 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int num;

        do {

            System.out.print("enter the number: ");
            num = scan.nextInt();
            if (num >= 0) {
                System.out.println("digits: " + Digits.countDigits(num));
            }
        }
            while (num>=0);

            System.out.println("end of the program");
            scan.close();
    }
}
