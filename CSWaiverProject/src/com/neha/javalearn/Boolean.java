package com.neha.javalearn;

import javax.swing.JOptionPane;//needed for JO option Pane

public class Boolean {
    public static void main(String[] args) {

        //First Test Score
        String input = JOptionPane.showInputDialog("Enter Score One:");
        double score1=Double.parseDouble(input);

        //Second Test Score
        String input2= JOptionPane.showInputDialog("Enter Score Two:");
        double score2=Double.parseDouble(input2);

        //Third Test Score
        String input3= JOptionPane.showInputDialog("Enter Score Three:");
        double score3=Double.parseDouble(input3);

        //Average Caluculation
        double average= (score1+score2+score3)/3;

        //Display the Average
        JOptionPane.showMessageDialog(null,"The average is" +average);

        //Congratulate
        if(average>95)
            JOptionPane.showMessageDialog(null, "Great Job, that is a great score!");




}}
