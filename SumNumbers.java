package com.company;

import java.util.Scanner;

public class SumNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int sum=0;

        while (sum < number){
            int currentNum = scanner.nextInt();
            sum +=currentNum;
        }
        System.out.println(sum);
    }
}
