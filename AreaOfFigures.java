package com.company;

import java.util.Scanner;

public class AreaOfFigures {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String figure = scanner.nextLine();
        double area = 0.0;
        if (figure.equals("square")) {
            double side = Double.parseDouble(scanner.nextLine());
            area = side * side;
            System.out.printf("%.3f", area);
        }
        if (figure.equals("rectangle")) {
            double a = scanner.nextDouble();
            double b = scanner.nextDouble();
            area = a*b;
            System.out.printf("%.3f",area);
        }
        if (figure.equals("circle")) {
            double pi = scanner.nextDouble();
            area = Math.PI*pi*pi;
            System.out.printf("%.3f",area);
        }
        if (figure.equals("triangle")) {
            double c = scanner.nextDouble();
            double h = scanner.nextDouble();
            area = c*h/2;
            System.out.printf("%.3f",area);
        }
    }
}
