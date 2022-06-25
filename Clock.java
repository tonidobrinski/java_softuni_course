package com.company;

public class Clock {
    public static void main(String[] args) {
        int i;
        int k;
        for (i=0 ; i<=23; i++){
            for (k=0; k<=59;k++){
                System.out.printf("%d:%d\n",i,k);
            }
        }
    }
}
