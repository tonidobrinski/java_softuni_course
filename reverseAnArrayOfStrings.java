package Fundamentals;

import java.util.Scanner;

public class reverseAnArrayOfStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String words = scanner.nextLine();
        String[] array = words.split(" ");
        for (int i = array.length-1; i >= 0;i--)
        {
            System.out.print(array[i] + " ");
        }
    }
}
