package LW4;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        System.out.println("****My JAVA Lo-Fat Burgers****");
        //   System.out.println("----Entree----------------Side Dish------------------Drink----");
        //   System.out.println("Tofu Burger           $3.49Rice Cracker           $0.79Cafe Mocha");
        //   System.out.println("Cajun Chicken         $4.59No-Salt Fries          $0.69Cafe Latte");
        //   System.out.println("Buffalo Wings         $3.99 Zucchini              $1.09Espresso");
        //   System.out.println("Rainbow Fillet        $2.99Brown Rice             $0.59Oolong Tea\n");


        System.out.println("****The Ctegories***");
        System.out.println("1.Entree");
        System.out.println("2.Side Dish");
        System.out.println("3.Drink");

        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the menu Number:");
        int num=scan.nextInt();

        if(num==1){
            System.out.println("Tofu Burger $3.49");
            System.out.println("Cajun Chicken $4.59");
            System.out.println("Buffalo Wings $3.99");
            System.out.println("Rainbow Fillet $2.99");
        }
        else if(num==2){
            System.out.println("Rice Cracker $0.79");
            System.out.println("No-Salt Fries $0.69");
            System.out.println("Zucchini $1.09 ");
            System.out.println("Brown Rice $0.59");
        }
        else if (num==3) {
            System.out.println("Cafe Mocha $1.99");
            System.out.println("Cafe Latte $1.90");
            System.out.println("Espresso $2.49 ");
            System.out.println("Oolong Tea $0.99");
        }
        else {
            System.out.println("***plz use only 1,2,3 options***");
        }
    }
}
