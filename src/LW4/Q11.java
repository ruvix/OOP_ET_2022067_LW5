package LW4;

import java.util.Random;
import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {
        Random random=new Random();
        Scanner scan=new Scanner(System.in);
        int num= random.nextInt(1,100);
        int gess;
        do {
            System.out.print("Guesse the number(1,100) : ");
            gess =scan.nextInt();


                 if(gess>num){
                     System.out.println("higher");
                 }
                 else {
                     System.out.println("lower");
                 }

        }while (num!=gess);
           System.out.println("congratulation the number is: "+num);



















    }
}
