package com.company;

import java.util.Scanner;

public class TradeCommissions {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String town = scan.nextLine();
        double sell = Double.parseDouble(scan.nextLine());
        double commision = 0;
        boolean error = true;
        if ("Sofia".equals(town)) {

            if (sell >= 0 && sell <= 500) {
                commision = sell * 0.05;
            } else if (sell > 500 && sell <= 1000) {
                commision = sell * 0.07;
            } else if (sell > 1000 && sell <= 10000) {
                commision = sell * 0.08;
            } else if (sell > 10000) {
                commision = sell * 0.12;
            } else {
                error = false;
            }
        } else if ("Varna".equals(town)) {
            if (sell >= 0 && sell <= 500) {
                commision = sell * 0.045;
            } else if (sell > 500 && sell <= 1000) {
                commision = sell * 0.075;
            } else if (sell > 1000 && sell <= 10000) {
                commision = sell * 0.1;
            } else if (sell > 10000) {
                commision = sell * 0.13;
            } else {
                error = false;
            }

        } else if ("Plovdiv".equals(town)) {

            if (sell >= 0 && sell <= 500) {
                commision = sell * 0.055;
            } else if (sell > 500 && sell <= 1000) {
                commision = sell * 0.08;
            } else if (sell > 1000 && sell <= 10000) {
                commision = sell * 0.12;
            } else if (sell > 10000) {
                commision = sell * 0.145;
            } else {
                error = false;
            }

            // System.out.printf("%.02f", commision);
        } else {
            error = false;
        }
        if (error) {
            System.out.printf("%.2f", commision);
        } else {
            System.out.println("error");
        }

    }
}