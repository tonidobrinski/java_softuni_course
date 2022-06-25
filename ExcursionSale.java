package com.company;

import java.util.Scanner;

public class ExcursionSale {

    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

        int sea = 680;
        int seaCount = Integer.parseInt(scanner.nextLine());
        int mountain = 499;
        int mountainCount = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        int count = 0;

        String vacation = scanner.nextLine();
        while (!(vacation.equals("Stop"))) {
            if (count != 0 && !(seaCount == 0 && mountainCount == 0)) {
                vacation = scanner.nextLine();
            }
            count++;
            if (seaCount == 0 && mountainCount == 0) {
                break;
            }
            if (vacation.equals("sea")) {
                if (seaCount == 0) {
                    continue;
                }
                sum += sea;
                seaCount--;
            }else if (vacation.equals("mountain")) {
                if (mountainCount == 0) {
                    continue;
                }
                sum += mountain;
                mountainCount--;
            }

        }

        if (seaCount == 0 && mountainCount == 0) {
            System.out.println("Good job! Everything is sold.");
        }

        System.out.printf("Profit: %d leva.",sum);

    }
}