package com.company;

public class MultiplicationTable {
    public static void main(String[] args) {
        int i;
        int k;

        for (i=1;i<=10;i++){
            for (k=1;k<=10;k++){
                int sum=i*k;
                System.out.printf("%d * %d = %d\n",i,k,sum);
            }
        }
    }
}
