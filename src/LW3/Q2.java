package LW3;

import java.util.Scanner;

public class Q2 {
    static void main() {
        Temperature temp2;
        temp2=new Temperature();
        Scanner scan =new Scanner(System.in);
        System.out.println("Enter the temperature in Fahrenheit :");
        temp2.setFahrenheit(scan.nextDouble());
        System.out.println("Fahrenheit:"+temp2.getFahrenheit());
        System.out.println("temperature equival to celsius: "+temp2.getCelsius());
    }
}
