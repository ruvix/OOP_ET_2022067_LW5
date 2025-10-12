package LW2;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);

        System.out.println("enter the word: ");

        String word=scan.next();
        String drow= word;

        String rev="";
        int len=word.length();

        for(int i=len-1;i>=0;i--){
            rev=rev+word.charAt(i);
        }

        if(drow.equals(rev)){
            System.out.println(drow+"  is palindrome String");

        }
        else {
            System.out.println(drow+" is not palindrome String");
        }

    }
}
