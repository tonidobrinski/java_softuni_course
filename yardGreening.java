package com.company;

import java.util.Scanner;

public class yardGreening {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double yardGreening = Double.parseDouble(scanner.nextLine());
        double finalPrice = yardGreening*7.61;
        double discount = finalPrice*0.18;
        finalPrice -=discount;
        System.out.println("The final price is: "+ finalPrice + " lv.");
        System.out.println( "The discount is: " + discount + " lv.");
    }
}
