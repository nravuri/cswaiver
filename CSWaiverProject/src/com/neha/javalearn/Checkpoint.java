package com.neha.javalearn;
import javax.swing.JOptionPane;

public class Checkpoint {
    public static void main(String[] args) {
        String input= JOptionPane.showInputDialog ("Enter a y value");
        double y=Double.parseDouble(input);

        if(y>20) {
            int x = 0;
            System.out.println(x);

            double payRate= 8.50;
            String input2= JOptionPane.showInputDialog("How many hours did you work?");
            double z=Double.parseDouble(input2);
            if(z>40){
                double pay= payRate*1.50;
                System.out.println("Your pay per hour is $ "+pay);
            }
        }
}}
