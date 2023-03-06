package com.bridgelabz;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter a num: ");
        int num = scanner.nextInt();
        scanner.close();
        int reverse  = 0;
        while(num !=0) {
            int digit  = num % 10;
            reverse =(reverse *10) + digit;
            num /= 10;
        }
        System.out.println("Reversed number : " + reverse);
    }
  }
