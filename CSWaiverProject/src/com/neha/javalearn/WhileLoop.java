package com.neha.javalearn;
import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Please enter the substance's temperature:");
        double SubTemp = keyboard.nextDouble();

        while (SubTemp>120) {
            System.out.println("The temperature is too high." + '\n' + "Please turn down the thermostat" +'\n'+ "Wait 5 minutes, and check the temperature again");
            System.out.println("and enter it here");
            SubTemp = keyboard.nextDouble();
        }
        System.out.println("This temperature is acceptable. Please  check again in 15 minutes.");


    }

    }
