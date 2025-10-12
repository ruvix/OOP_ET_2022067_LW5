package LW3;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Temperature temp1;
        temp1=new Temperature();
        Scanner scan=new Scanner(System.in);

        System.out.println("enter the temperature (celsius) :");
        temp1.setCelsius((scan.nextDouble()));

        System.out.println("celsius= "+temp1.getCelsius());

        System.out.println("the temperature equival to fahrenheit :"+temp1.getFahrenheit());


    }

}
