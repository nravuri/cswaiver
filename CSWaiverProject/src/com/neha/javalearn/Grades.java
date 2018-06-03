package com.neha.javalearn;

import javax.swing.JOptionPane;

public class Grades {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Please enter your first test score");
        int TOne = Integer.parseInt(input);

        String input2 = JOptionPane.showInputDialog("Please enter your second test score");
        int Ttwo = Integer.parseInt(input2);

        String input3 = JOptionPane.showInputDialog("Please enter your final test score");
        int Tthree = Integer.parseInt(input3);

        int AVG = ((TOne + Ttwo + Tthree) / 3);

        if (AVG < 100 && AVG > 90)
            JOptionPane.showMessageDialog(null, "Your Average test score is a " + AVG + " which is a letter grade of A");

        if (AVG < 89 && AVG > 80)
            JOptionPane.showMessageDialog(null, "Your Average test score is a " + AVG + " which is a letter grade of B");

        if (AVG < 79 && AVG > 70)
            JOptionPane.showMessageDialog(null, "Your Average test score is a " + AVG + " which is a letter grade of C");

        if (AVG < 69 && AVG > 60)
            JOptionPane.showMessageDialog(null, "Your Average test score is a " + AVG + " which is a letter grade of D");

        if (AVG < 50)
            JOptionPane.showMessageDialog(null, "Your Average test score is a " + AVG + " which is a letter grade of F! Sorry you have failed!");
    }
}
