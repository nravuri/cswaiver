package com.neha.javalearn;

public class SportsCar {
    public static void main(String[] args) {
        double KPH;
        double MPH;
        for (KPH=60,MPH=(KPH*.06214);KPH<140;KPH+=10)
            System.out.println("KPH\t\tMPH");
            System.out.println("-------------------");
            System.out.printf("%d\t\t%.1f\n", KPH, MPH);
    }
    }

