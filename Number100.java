package com.company;

import java.util.Scanner;

public class Number100 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        if(i < 100) {
            System.out.println("Less than 100");
        }
        if (i >= 100 && i <=200){
            System.out.println("Between 100 and 200");
        }
        if (i > 200) {
            System.out.println("Greater than 200");
        }
    }
}
