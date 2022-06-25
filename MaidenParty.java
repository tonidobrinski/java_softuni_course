package com.company;
import java.util.Scanner;

class MaidenParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double partyPrice = Double.parseDouble(scanner.nextLine());
        int loveLettersCount = Integer.parseInt(scanner.nextLine());
        int waxRoses = Integer.parseInt(scanner.nextLine());
        int keyHolders = Integer.parseInt(scanner.nextLine());
        int pictures = Integer.parseInt(scanner.nextLine());
        int surprises = Integer.parseInt(scanner.nextLine());

        double priceForLoveLetters = loveLettersCount * 0.60 ;
        double priceForWaxRoses =waxRoses * 7.20;
        double priceForKeyHolders =keyHolders * 3.60;
        double priceForPictures =pictures * 18.20;
        double priceForSurprises =surprises * 22;

        double totalPrice = priceForLoveLetters + priceForWaxRoses + priceForKeyHolders + priceForPictures + priceForSurprises;
        double allItemsCount = loveLettersCount + waxRoses + keyHolders + pictures + surprises;
        double totalPricePlusDiscount = 0;
        double winPrice = 0;



        if ( allItemsCount >= 25){
            totalPricePlusDiscount = totalPrice - (totalPrice * 0.35);
            winPrice = totalPricePlusDiscount - (totalPricePlusDiscount * 0.1);

        }else {
            winPrice = totalPrice - (totalPrice * 0.1);
        }


        if (winPrice > partyPrice){
            System.out.printf("Yes! %.2f lv left.",Math.abs(winPrice - partyPrice));
        }else
            System.out.printf("Not enough money! %.2f lv needed.",Math.abs(winPrice - partyPrice));


    }
}