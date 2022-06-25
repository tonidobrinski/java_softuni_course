package Fundamentals;

import java.util.Scanner;

public class sumEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String array = scanner.nextLine();
        String[] numberAsStrings = array.split("\\s+");
        int evenSum=0;
        for (String s : numberAsStrings){
            int number = Integer.parseInt(s);
            if (number % 2 == 0) {
                evenSum += number;
            }
        }
        System.out.println(evenSum);
    }
}
