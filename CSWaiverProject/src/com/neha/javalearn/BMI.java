package com.neha.javalearn;

import javax.swing.JOptionPane;

public class BMI {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Please enter your weight in pounds");
        int weight = Integer.parseInt(input);

        String input2 = JOptionPane.showInputDialog("Please enter your height in inches");
        int height = Integer.parseInt(input2);

        int BMI= (weight * 703) / (height * height);

        if (((weight * 703) / (height * height)) <= 18.5)
            JOptionPane.showMessageDialog(null,"Your BMI is " + BMI+ " You are underweight");

        if (((weight * 703) / (height * height)) > 18.5 && ((weight * 703) / (height * height)) < 25)
            JOptionPane.showMessageDialog(null,"Your BMI is " +BMI+ " You are healthy");

        if (((weight * 703) / (height * height)) > 25)
            JOptionPane.showMessageDialog(null,"Your BMI is "+BMI+ " You are overweight");

    }
}
