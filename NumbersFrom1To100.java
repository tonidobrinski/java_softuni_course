package com.company;

import java.util.Scanner;

public class NumbersFrom1To100 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i=n; i >= 1; i--) {
            System.out.println(i);
        }
    }
}
