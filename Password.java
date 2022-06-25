package com.company;

import java.util.Scanner;

public class Password {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        String pass = scanner.nextLine();
        String pass2 = scanner.nextLine();

        while (!pass2.equals(pass)){
            pass2 = scanner.nextLine();
        }
        System.out.printf("Welcome %s!" ,name);
    }
}
