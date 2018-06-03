package com.neha.javalearn;
import java.util.Scanner;
import java.lang.Integer;

public class Celsius {
    public static void main(String[] args) {
        Scanner output = new Scanner(System.in);
        String unit;
        int unitInt = 0;

        boolean invalidInput = true;
        while(invalidInput) {
            System.out.println("For a Farenheit to Celsius converter, please enter 1. For a Celsius to Farenheit converter, please enter 2");
            unit = output.next();
            unitInt = new Integer(unit).intValue();
            if (unitInt != 1 && unitInt != 2)
                System.out.println("ERROR:PLEASE ENTER A 1 OR 2");
            else
                invalidInput = false;
        }

        Scanner output2 = new Scanner(System.in);
        System.out.println("Please enter a temperature:");
        String Temp = output.next();
        int tempInt = new Integer(Temp).intValue();

        if (unitInt==2)
        {
            int C2F= ((tempInt *9)/5)+32;
            System.out.println("Your temperature in Farenheit is "+ C2F);
        }

        else if (unitInt==1)
        {
            int F2C= ((tempInt-32)*5)/9;
            System.out.println("Your temperature in Celsius is "+ F2C);
        }


    }
}
