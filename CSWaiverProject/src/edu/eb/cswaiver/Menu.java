package edu.eb.cswaiver;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Random;

public class Menu {

    // Methods

    // given two string, concatinate them combination of <smallstr><largestr><smallstr>
    public static String comboString(String a, String b) {
        //check for valid input
        if (a == null || b == null)
            return null;

        if (a.length() > b.length()) {
            return (b + a + b);
        } else {
            return (a + b + a);
        }
    }

    // check if input is +/-10 of hundred, if yes, print True, else print false
    public static String nearHundred(int num) {
        int absolute = Math.abs(num);
        if (absolute >= 90 && absolute <= 110)
            return ("true");
        else
            return ("false");
    }

    // Sum the two numbers and retun if the inputs are different, else return twice the sum
    public static int sumDouble(int num1, int num2) {
        int sum = num1+num2;
        if (num1 == num2)
            return (sum * 2);
        else
            return (sum);
    }

    // Given a number, sum all the numbers from 1..n
    public static int sumNumbers(int num) {
        int sum = 0;
        for (int i = 0; i <= num; i++)
            sum = sum + i;
        return (sum);
    }

    // given weight and height, compute body mass index
    public static double getBMI(double ht, double wt) {
        double BMI = (wt * 703) / (ht * ht);
        return (BMI);
    }

    // given temperature in celcius, print farenheit
    public static double Farenheit(double celsius) {
        // formula 9c =5f-160 converterd to 5f = 9c+160; f=(9/5)c+32
        double fh = celsius * (9.0/5.0) + 32;
        return (fh);
    }

    // flip coin twenty times and print Head or Tails
    public static void flipCoin() {

        int ntimes = 20;
        Random rd = new Random();
        for (int i = 0; i < ntimes; ++i) {
            int rand = rd.nextInt(2); // gets random value 0 and 1

            // debug
            //System.out.println("number - " + rand);

            // treat 0 as heads and 1 as tails
            if (rand == 0)
                System.out.println("It is Heads");
            else
                System.out.println("It is Tails");
        }
    }

    // given a number, sum the individual digits in the number
    public static int sumDigits(int n) {
        int p = 0;
        int sum = 0;
        while (n > 0) {
            p = n % 10;
            sum = sum + p;
            n = n / 10;

            // debug
            //System.out.println("Digit - "+p);
            //System.out.println("Remaining Number "+n);
        }
        return (sum);
    }

    // Display the Menu for the project
    public static void displayMenu() {
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

    // Program entry point to run the application
    // Main Method
    public static void main(String[] args) {

        // run until exit condition is provied
        boolean runLoop = true;
        while (runLoop) {

            // display menu
            Menu.displayMenu();

            // Read User input
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
                String result = Menu.comboString(a, b);

                // print result
                System.out.print("Your combination string is: " + result);
            } else if (nextInput == 2) {
                // variable used to check a valid input is entered!
                boolean invalidInput = true;
                int str1 = 0;

                // keep asking user until the right number is entered
                while (invalidInput) {
                    System.out.println("Please enter an integer number : ");
                    String number = keyboard.next();
                    try {
                        str1 = Integer.parseInt(number);
                    } catch (NumberFormatException ex) {
                        System.out.println("Invalid Input entered, please enter an integer value ");
                        System.out.println("Try again ..");
                        continue;
                    }
                    invalidInput = false; // set this to exit loop on valid input
                }

                // call function
                String result2 = Menu.nearHundred(str1);

                // print result
                System.out.println("Near Hundred Status Check : "+result2);
            } else if (nextInput == 3) {

                boolean invalidInput = true;
                String numone, numtwo;
                int num1 = 0, num2 = 0;

                while (invalidInput) {
                    System.out.println("Please enter your first number");
                    numone = keyboard.next();
                    System.out.println("Please enter your second number");
                    numtwo = keyboard.next();

                    try {
                        num1 = Integer.parseInt(numone);
                        num2 = Integer.parseInt(numtwo);
                    } catch (NumberFormatException ex) {
                        System.out.println("Invalid Input entered, please enter an integer value ");
                        System.out.println("Try again ..");
                        continue;
                    }

                    // if i got here, i got right input
                    invalidInput = false;
                }

                int result3 = Menu.sumDouble(num1, num2);

                // print result
                System.out.println("Your Sum is : " + result3);
            } else if (nextInput == 4) {
                boolean invalidInput = true;
                int num = 0;
                while (invalidInput) {
                    System.out.println("Please enter an integer n ");
                    String integer = keyboard.next();
                    try {
                        num = Integer.parseInt(integer);
                    } catch (NumberFormatException ex) {
                        System.out.println("Invalid Input entered, please enter an integer value ");
                        System.out.println("Try again ..");
                        continue;
                    }
                    invalidInput = false;
                }
                int result4 = Menu.sumNumbers(num);

                // print result
                System.out.println("Sum of 1..n numbers :"+result4);
            } else if (nextInput == 5) {
                boolean invalidInput = true;
                double wt = 0;
                double ht = 0;
                while (invalidInput) {
                    System.out.println("Please enter your weight in pounds");
                    String weight = keyboard.next();
                    System.out.println("Please enter your height in inches");
                    String height = keyboard.next();
                    try {
                        wt = Double.parseDouble(weight);
                        ht = Double.parseDouble(height);
                    } catch (NumberFormatException ex) {
                        System.out.println("Invalid Input entered, please enter an integer value ");
                        System.out.println("Try again ..");
                        continue;
                    }
                    invalidInput = false;
                }

                // call function
                double result5 = Menu.getBMI(ht, wt);

                // print result
                System.out.println("Your BMI is : " + result5);

            } else if (nextInput == 6) {
                boolean invalidInput = true;
                double celsius = 0;
                while (invalidInput) {
                    System.out.println("Please enter a temperature in Celsius");
                    String temp = keyboard.next();
                    try {
                        celsius = Double.parseDouble(temp);
                    } catch (NumberFormatException ex) {
                        System.out.println("Invalid Input entered, please enter an integer value ");
                        System.out.println("Try again ..");
                        continue;
                    }
                    invalidInput = false;
                }

                // call function
                double result6 = Menu.Farenheit(celsius);

                // print result
                System.out.println("The temperature in Farenheit is : " + result6);

            } else if (nextInput == 7) {

                // call flipcoin function
                Menu.flipCoin();
            } else if (nextInput == 8) {
                boolean invalidInput = true;
                int sum = 0;
                int n = 0;
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

                // call function
                int result8 = Menu.sumDigits(n);

                // print result
                System.out.println("Result of Sum Digits :"+ result8);
            } else if (nextInput == 9) {
                // exit condition, input
                runLoop = false;
                System.out.println("Thank you for using the program.. good bye!");
            } else {
                // unrecognized input choice from user, show message and read back input
                System.out.println("Sorry, you have provided an invalid input, please try again with a number 1-9");
            }

            //Hold the user to see the result before the next choice
            System.out.println();
            System.out.println("Press enter to continue....");
            keyboard.nextLine();
            keyboard.nextLine();
        }
    }
}