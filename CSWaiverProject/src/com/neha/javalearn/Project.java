package com.neha.javalearn;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Random;

public class Project {

    public static void Menu() {
        System.out.println("Please select from the following:");
        System.out.println("1- ComboString Function");
        System.out.println("2 - Near Hundred Function");
        System.out.println("3 - Sum Double Function");
        System.out.println("4 - Sum Numbers Function");
        System.out.println("5 - Get BMI Function");
        System.out.println("6 - Fahrenheit Function");
        System.out.println("7 - Flip Coin Function");
        System.out.println("8 - Sum Digits Function");
        System.out.println("9 - Thank You & Exit Function");
        System.out.println();
    }


    public static void main(String[] args) {
        boolean runLoop = true;

        // run until valid input provided
        while (runLoop) {

            // print menu
            Menu();

            Scanner keyboard = new Scanner(System.in);
            int nextInput;

            // make sure valid input is entered
            try {
                nextInput = keyboard.nextInt();
            } catch (InputMismatchException ex) {
                System.out.println("Exception reading input, Invalid Input Type entered, Need to enter Number 1 - 9 ");
                System.out.println("Try again ..");
                continue;
            }

            // perform action for input = 1
            if (nextInput == 1) {

                System.out.println("Thank you for choosing the Combination String option!");
                System.out.println("Please enter two input strings you would like to combine  - ");
                System.out.println("Please enter String1 : ");
                String a = keyboard.next();
                System.out.println("Please enter String2 : ");
                String b = keyboard.next();
                if (a.length() > b.length()) {
                    System.out.println("Your combination string is: ");
                    System.out.print(b + a + b);
                } else {
                    System.out.println("Your combination string is: ");
                    System.out.print(a + b + a);
                }
            } else if (nextInput == 2) {

                System.out.println("Please enter an integer");
                String number = keyboard.next();
                int str1 = Integer.parseInt(number);
                int absolute = Math.abs(str1);
                if (absolute <= 110 || absolute >= 90)
                    System.out.println("true");
                else
                    System.out.println("false");
            } else if (nextInput == 3) {

                boolean invalidInput = true;
                String numone, numtwo;
                int numo = 0, numt = 0;

                while (invalidInput) {
                    System.out.println("Please enter your first number");
                    numone = keyboard.next();
                    System.out.println("Please enter your second number");
                    numtwo = keyboard.next();

                    try {
                        numo = Integer.parseInt(numone);
                        numt = Integer.parseInt(numtwo);
                    } catch (NumberFormatException ex) {
                        System.out.println("Invalid Input entered, please enter an integer value ");
                        System.out.println("Try again ..");
                        continue;
                    }

                    // if i got here, i got right input
                    invalidInput = false;
                }

                int sum = numo + numt;
                if (!(numo == numt))
                    System.out.println(sum);
                if (numo == numt)
                    System.out.println(sum * 2);
            } else if (nextInput == 4) {
                boolean invalidInput = true;
                while (invalidInput) {
                    System.out.println("Please enter an integer n ");
                    String integer = keyboard.next();
                    int inte;
                    try {
                        inte = Integer.parseInt(integer);
                    } catch (NumberFormatException ex) {
                        System.out.println("Invalid Input entered, please enter an integer value ");
                        System.out.println("Try again ..");
                        continue;
                    }
                    invalidInput = false;

                    int sump = 0;
                    for (int i = 0; i <= inte; i++) {
                        sump = sump + i;
                    }
                    System.out.println(sump);

                }

            } else if (nextInput == 5) {
                boolean invalidInput = true;
                int wt = 0;
                int ht = 0;
                while (invalidInput) {
                    System.out.println("Please enter your weight in pounds");
                    String weight = keyboard.next();
                    System.out.println("Please enter your height in inches");
                    String height = keyboard.next();
                    try {
                        wt = Integer.parseInt(weight);
                        ht = Integer.parseInt(height);
                    } catch (NumberFormatException ex) {
                        System.out.println("Invalid Input entered, please enter an integer value ");
                        System.out.println("Try again ..");
                        continue;
                    }
                    invalidInput = false;
                }
                int BMI = (wt * 703) / (ht * ht);
                if (((wt * 703) / (ht * ht)) <= 18.5)
                    System.out.println("Your BMI is " + BMI + " You are underweight");

                if (((wt * 703) / (ht * ht)) > 18.5 && ((wt * 703) / (ht * ht)) < 25)
                    System.out.println("Your BMI is " + BMI + " You are healthy");

                if (((wt * 703) / (ht * ht)) > 25)
                    System.out.println("Your BMI is " + BMI + " You are overweight");
            } else if (nextInput == 6) {
                boolean invalidInput = true;
                int Celsius = 0;
                while (invalidInput) {
                    System.out.println("Please enter a temperature in Celsius");
                    String temp = keyboard.next();
                    try {
                        Celsius = Integer.parseInt(temp);
                    } catch (NumberFormatException ex) {
                        System.out.println("Invalid Input entered, please enter an integer value ");
                        System.out.println("Try again ..");
                        continue;
                    }
                    invalidInput = false;
                }
                int Farenheit = Celsius * (9 / 5) + 32;
                System.out.println("Your temperature in Farenheit is " + Farenheit);

            } else if (nextInput == 7) {
                int head= 1;
                int tail= 0;
                for (int i=0; i<20; ++i){
                    Random rd = new Random();
                    int Random = rd.nextInt(2);
                    Random = Random%2;

                    if (Random==head)
                        System.out.println("Flip "+i+": You have flipped a head");
                    else
                        System.out.println("Flip "+i+": You have flipped a tail");
                }

            } else if (nextInput == 8) {
                boolean invalidInput = true;
                int sum = 0;
                int n= 0;
                int p;
                while (invalidInput) {
                    System.out.println("Please enter an integer");
                    String m = keyboard.next();
                    try {
                        n = Integer.parseInt(m);
                    } catch (NumberFormatException ex) {
                        System.out.println("Invalid Input entered, please enter an integer value ");
                        System.out.println("Try again ..");
                        continue;
                    }
                    invalidInput = false;
                }
                while (n>0){
                    p= n%10;
                    sum=sum+p;
                    n= n/10;
                }
                System.out.println("Sum of Digits: "+sum);

            } else if (nextInput == 9) {
                runLoop = false;
                System.out.println("Thank you for using the program.. good bye!");
            } else {
                System.out.println("Sorry, you have provided an invalid input, please try again with a number 1-9");
            }


        }
    }
}