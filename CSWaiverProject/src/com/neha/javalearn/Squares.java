package com.neha.javalearn;

import java.util.Scanner;

public class Squares {

    public static void main (String[] args){
        int x;
        int y;
        Scanner keyboard = new Scanner(System.in);
        for ( x=1, y=1;x <8;x++,y++)
            System.out.println(x+"+"+y+"="+(x+y));


}
}
