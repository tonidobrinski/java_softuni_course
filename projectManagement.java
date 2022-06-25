package com.company;

import java.util.Scanner;

public class projectManagement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name =scanner.nextLine();
        int project=Integer.parseInt(scanner.nextLine());
        int projectHours=project*3;
        System.out.printf("The architect %s will need %d hours to complete %d project/s." , name,projectHours,project);
    }
}
