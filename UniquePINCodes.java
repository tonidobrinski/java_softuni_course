package com.company;

import java.util.Scanner;

public class UniquePINCodes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pincode1 = scanner.nextInt();
        int pincode2 = scanner.nextInt();
        int pincode3 = scanner.nextInt();

        for (int i = 2; i <= pincode1; i += 2) {
            for (int j = 2; j <= pincode2; j++) {
                for (int k = 2; k <= pincode3; k += 2) {
                    if (j == 2 || j == 3 || j == 5 || j == 7) {
                        System.out.println(i + " " + j + " " + k);
                    }
                }
            }
        }
    }
}
