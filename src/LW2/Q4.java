package LW2;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("how many number you are going to enter: ");
        int n=scan.nextInt();
        System.out.println("the number of element in array :"+n);
        int[] array=new int[n];
System.out.println("enter values: ");
        for(int i=0;i<n;i++){
    array[i]=scan.nextInt();
        }
System.out.print("array :{");
        for(int i=0;i<n;i++){
            System.out.print(array[i]+",");
        }
System.out.print("}");
        System.out.println("        ");


     int frist= Integer.MIN_VALUE;
     int second=Integer.MIN_VALUE;
        for (int num : array){
            if(num>frist){
                second=frist;
                frist=num;
            }
            else if(num> second && num< frist){
                second=num;

            }
        }

       if(second==Integer.MIN_VALUE){
           System.out.println("no second largest value all same..");
       }
       else {
           System.out.println("Second largest value: "+second);
       }
  scan.close();
    }
}
