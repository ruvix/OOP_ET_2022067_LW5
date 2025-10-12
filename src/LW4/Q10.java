package LW4;

import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        System.out.print("Enter the word: ");
        Scanner scan=new Scanner(System.in);
        String word=scan.next();
        String drow=word;
        String rev="";
        int len=word.length();

        for(int i=len-1;i>=0;i--){
            rev=rev+word.charAt(i);

        }

        if(drow.equals(rev)){
            System.out.println("it's palindrome: "+drow);
        }
        else {
            System.out.println("it's not a palindrome: "+drow);
        }

    }
}
