package Fundamentals;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Shminko {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> shminko = new ArrayList<>();
        shminko.add(10);
        shminko.add(20);
        shminko.add(30);
        shminko.add(40);
        shminko.add(50);
        shminko.add(50);
        shminko.clear();

        System.out.println(shminko);
    }
}
