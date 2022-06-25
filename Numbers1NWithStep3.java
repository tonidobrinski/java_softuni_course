package com.company;

import java.util.Scanner;

public class Numbers1NWithStep3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int i;
        for (i= 1;i<=n;i+=3){
            System.out.println(i);
        }
    }
}
