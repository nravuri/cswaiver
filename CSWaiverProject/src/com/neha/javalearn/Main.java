package com.neha.javalearn;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // This is my first program
        Scanner output = new Scanner(System.in);
        System.out.println("What is your first name? ");
        String name = output.next();
        System.out.println("Hello " + name);
    }
}
