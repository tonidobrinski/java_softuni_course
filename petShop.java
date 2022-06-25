package com.company;

import java.util.Scanner;

public class petShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dogFood = Integer.parseInt(scanner.nextLine());
        int catFood = Integer.parseInt(scanner.nextLine());
        double dogFoodPrice = dogFood*2.50;
        double catFoodPrice = catFood*4.00;
        double sum = dogFoodPrice + catFoodPrice;
        System.out.println(sum + " lv.");
    }
}
