package com.neha.javalearn;
import java.util.Scanner;
public class ValidationLoop {
    public static void main (String[] args){
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Please enter a satsifaction rating between 1 and 5");
        int Number=keyboard.nextInt();

        while (Number>5 || 1>Number) {
            System.out.println("PLEASE ADHERE TO THE INSTRUCTIONS AND ENTER A VALID INPUT HERE");
            Number=keyboard.nextInt();
        }
        System.out.println("Thank you for your satisfaction rating!");
    }
}
