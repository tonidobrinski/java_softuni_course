package Fundamentals;

import java.util.Scanner;

public class equalArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] number1 = scanner.nextLine().split(" ");
        int[] array1 = new int[number1.length];

        String[] number2 = scanner.nextLine().split(" ");
        int[] array2 = new int[number2.length];

        int sum = 0;
        int different=0;
        int position=0;

        for (int i = 0; i < number1.length;i++)
        {
            array1[i] = Integer.parseInt(number1[i]);
            array2[i] = Integer.parseInt(number2[i]);
            if (array1[i] != array2[i])
            {
                different++;
                position = i;
                break;
            }
            sum += array1[i];
        }
        if (different == 0 )
        {
            System.out.printf("Arrays are identical. Sum: %d", sum);
        }
        else
        {
            System.out.printf("Arrays are not identical. Found difference at %d index.",position);
        }
    }
}
