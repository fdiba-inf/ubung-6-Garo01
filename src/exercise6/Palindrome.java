package exercise6;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        assert number > 0;
        int palnumber = number;
        int reverse = 0;
        while (number>0){
          reverse = reverse*10 + number%10;
          number= number /10;
        }
        System.out.println (reverse);
        if (palnumber==reverse){
          System.out.println ("Palindrome");
        }else{ 
          System.out.println ("Palindrome iok");
        }
        }
    }

