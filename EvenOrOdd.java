package com.company;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        double i = Scanner.nextDouble();
        if (i % 2 == 0)
        {
            System.out.println("even");
        }
        else
        {
            System.out.println("odd");
        }
    }
}
