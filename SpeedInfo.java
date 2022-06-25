package com.company;

import java.util.Scanner;

public class SpeedInfo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double i = scanner.nextDouble();
        if(i <= 10) {
            System.out.println("slow");
        }
        if (i > 10 && i <=50){
            System.out.println("average");
        }
        if (i > 50 && i <=150) {
            System.out.println("fast");
        }
        if (i > 150 && i <=1000){
            System.out.println("ultra fast");
        }
        if (i >1000){
            System.out.println("extremely fast");
        }
    }
}
