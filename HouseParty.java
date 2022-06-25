package Fundamentals;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class HouseParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> guests = new ArrayList<>();
        int numberOfCommands = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < numberOfCommands; i++) {

            String[] command = scanner.nextLine().split("\\s+");
            if (!command[2].equals("not")) {
                if (guests.contains(command[0])) {
                    System.out.printf("%s is already in the list!%n", command[0]);

                } else {
                    guests.add(command[0]);
                }

            } else {
                if (guests.contains(command[0])) {
                    guests.remove(command[0]);
                } else {
                    System.out.printf("%s is not in the list!%n", command[0]);
                }
            }
        }
        guests.forEach(System.out::println);
    }
}
