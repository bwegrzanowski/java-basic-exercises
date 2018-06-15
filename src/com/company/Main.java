package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("insert length of first side");
        int sideA = scanner.nextInt();
        System.out.println("insert length of second side");
        int sideB = scanner.nextInt();
        System.out.println("insert length of third side");
        int sideC = scanner.nextInt();

        if ((sideA + sideB > sideC) && (sideA + sideC > sideB) && (sideB + sideC > sideC) &&
                (sideA * sideA + sideB * sideB == sideC * sideC)) {

            double area = 0.5 * sideA * sideB;
            System.out.println("triangle\'s area is: " + area);
            int circuit = sideA + sideB + sideC;
            System.out.println("triangle\'s circuit is: " + circuit);
            double averageLength = (sideA + sideB + sideC) /3;
            System.out.println("average side\'s length is: " + averageLength);

        } else {
            System.out.println("that lengths won\'t create a triangle");
        }

    }
}
