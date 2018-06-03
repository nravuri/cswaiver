package com.neha.javalearn;

import java.util.Scanner;

public class Length {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter the word that you would like to measure:");
        String a= keyboard.next();
        ShowLength (a);

    }


    public static void ShowLength(String str){
        System.out.println( str+ " is " + str.length() + " charcters long!" );
    }

}
