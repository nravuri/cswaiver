package com.neha.javalearn;
import java.util.Scanner;

public class Methods {
    public static void main (String[] args){
        WhatIsYourName();
        System.out.println("Thank you for choosing an option! Please wait for assistance!");

    }

    public static void WhatIsYourName(){
        Scanner keyboard = new Scanner(System.in);
        System.out.println ("What is your name?");
        String Name =keyboard.next();
        System.out.println ("Hi " +Name + " Please enter a W for withdrawal or a D for deposit ");
        String A =keyboard.next();
        }
    }

