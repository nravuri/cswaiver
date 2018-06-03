package com.neha.javalearn;

import javax.swing.JOptionPane;

public class RomanNumerals {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Enter a Number 1-10");
        int y = Integer.parseInt(input);

        if (y == 1)
            JOptionPane.showMessageDialog(null, "Your number is I");
        else if (y == 2)
            JOptionPane.showMessageDialog(null, "Your Number is II");
        else if (y == 3)
            JOptionPane.showMessageDialog(null, "Your Number is III");
        else if (y == 4)
            JOptionPane.showMessageDialog(null, "Your Number is IV");
        else if (y == 5)
            JOptionPane.showMessageDialog(null, "Your Number is V");
        else if (y == 6)
            JOptionPane.showMessageDialog(null, "Your Number is VI");
        else if (y == 7)
            JOptionPane.showMessageDialog(null, "Your Number is VII");
        else if (y == 8)
            JOptionPane.showMessageDialog(null, "Your Number is VIII");
        else if (y == 9)
            JOptionPane.showMessageDialog(null, "Your Number is IX");
        else if (y == 10)
            JOptionPane.showMessageDialog(null, "Your Number is X");
        else if (y > 10)
            JOptionPane.showMessageDialog(null, "ERROR: PLEASE INPUT A NUMBER BETWEEN 1 AND 10");


    }
}