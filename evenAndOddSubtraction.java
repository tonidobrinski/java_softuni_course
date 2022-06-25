package Fundamentals;

import java.util.Scanner;

public class evenAndOddSubtraction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String numbers = scanner.nextLine();
        String[] array = numbers.split("\\s+");
        //int[] numbersArray = new int[array.length];
        int evenSum = 0;
        int oddSum = 0;
        int sum = 0;

        for (String s: array)
        {
            int number = Integer.parseInt(s);
            if (number % 2 == 0 )
            {
                evenSum += number;
            }
            else
            {
             oddSum += number;
            }
            sum = evenSum - oddSum;
        }
        System.out.print(sum);
    }
}
