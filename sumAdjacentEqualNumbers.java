package Fundamentals;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class sumAdjacentEqualNumbers extends nextLineOfInts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = nextLineOfInts(scanner);

        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));
        }
    }

    private static List<Integer> nextLineOfInts(Scanner scanner) {

        List<Integer> numbers = new ArrayList<>();
        String lineOfNumbers = scanner.nextLine();
        String [] numbersAsStrings = lineOfNumbers.split(" ");
        for (String s : numbersAsStrings){
            numbers.add(Integer.parseInt(s));
        }
        return numbers;
    }
}
