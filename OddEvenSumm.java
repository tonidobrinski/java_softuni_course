package com.company;

import java.util.Scanner;

public class OddEvenSumm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int oddSumm = 0;
        int evenSumm = 0;

        for (int i =0;i < n;i++){
            int element = scanner.nextInt();

            if (i % 2 == 0){
                evenSumm +=element;
            }else {
                oddSumm += element;
            }

        }
        if (evenSumm == oddSumm ){
            System.out.println("Yes ");
            System.out.println("Sum = " + evenSumm);
        }else {
            int difference = Math.abs(evenSumm - oddSumm);
            System.out.println("No ");
            System.out.println("Diff = " + difference);
        }
    }
}
