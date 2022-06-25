package com.company;

import java.util.Scanner;

public class CatDiet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double percentFat = Double.parseDouble(scanner.nextLine());
        double percentProtein = Double.parseDouble(scanner.nextLine());
        double percentCarbohydrates = Double.parseDouble(scanner.nextLine());
        double allCalories = Double.parseDouble(scanner.nextLine());
        double percentWatter = Double.parseDouble(scanner.nextLine());

        double fatGrams = (allCalories * ( percentFat / 100 )) / 9;
        double proteinGrams = (allCalories * ( percentProtein /100))/4;
        double CarbohydratesGrams = (allCalories * (percentCarbohydrates / 100))/4;
        double allFoodWeight = fatGrams + proteinGrams + CarbohydratesGrams;
        double caloriesPerGram = allCalories / allFoodWeight;
        double percentLeft = 100 - percentWatter;
        double result = caloriesPerGram * (percentLeft /100);


        System.out.printf("%.4f",result);
    }
}
