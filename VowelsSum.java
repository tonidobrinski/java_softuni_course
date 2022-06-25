package com.company;

import java.util.Scanner;

public class VowelsSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        int suma = 0;
        for (int i = 0; i < s.length(); i++) {
            char word = s.charAt(i);
            switch (word){
                case 'a': suma+=1;break;
                case 'e': suma +=2;break;
                case 'i': suma +=3;break;
                case 'o': suma +=4;break;
                case 'u': suma +=5;break;
            }

        }
        System.out.println(suma);
    }
}
