package Fundamentals;

import java.util.Scanner;

public class FinalExam1StringGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String manipulatorString = scanner.nextLine();

        String line = scanner.nextLine();

        while (!line.equals("Done")) {
            String[] command = line.split("\\s+");
            switch (command[0]) {
                case "Change":
                    String newString = "";
                    String charToBeReplaced = command[1];
                    String replacement = command[2];
                    for ( int i = 0; i < manipulatorString.length(); i++ ) {
                        if (String.valueOf(manipulatorString.charAt(i)).equals(charToBeReplaced)) {
                            newString = newString.concat(replacement);
                        } else newString = newString.concat(String.valueOf(manipulatorString.charAt(i)));
                    }
                    manipulatorString = newString;
                    System.out.println(manipulatorString);
                    break;
                case "Includes":
                    if (manipulatorString.contains(command[1])) {
                        System.out.println("True");
                    } else System.out.println("False");
                    break;
                case "FindIndex":
                    System.out.println(manipulatorString.indexOf(command[1]));
                    break;
                case "End":
                    if (manipulatorString.endsWith(command[1])) {
                        System.out.println("True");
                    } else System.out.println("False");
                    break;
                case "Uppercase":
                    manipulatorString = manipulatorString.toUpperCase();
                    System.out.println(manipulatorString);
                    break;
                case "Cut":
                    int startIndex = Integer.parseInt(command[1]);
                    int count = Integer.parseInt(command[2]);
                    int endIndex = startIndex + count;

                    newString = "";
                    for ( int i = 0; i < manipulatorString.length(); i++ ) {
                        if (i >= startIndex && i < endIndex) {
                            newString = newString.concat(String.valueOf(manipulatorString.charAt(i)));
                        }
                    }
                    manipulatorString = newString;
                    System.out.println(manipulatorString);
                    break;
            }

            line = scanner.nextLine();
        }
    }
}
