package Fundamentals;

import java.util.Scanner;

public class dayOfWeek {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] daysOfWeek= {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        int number = Integer.parseInt(scanner.nextLine());
        if (number >= 1 && number<=7)
        {
            System.out.println(daysOfWeek[number - 1]);
        }
        else
        {
            System.out.println("Invalid day!");
        }
    }
}
