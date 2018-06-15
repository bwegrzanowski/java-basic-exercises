package loopsExercises;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        int numbers = 5;

        for (int i = 1; i <= numbers; i++) {
            System.out.println("1. " + i);
        }
        for (int i = 1; i <= numbers; i++) {
            System.out.println("2. " + 2 * i);
        }
        for (int i = 1; i <= numbers; i++) {
            if (i % 2 == 0) {
                System.out.println("3. " + i);
            }
        }
        for (int i = 1; i <= numbers; i++) {
            if (i % 3 == 0) {
                System.out.println("4. " + i);
            }
        }
        for (int i = 1; i <= numbers; i++) {
            System.out.println("5. a");
        }
        for (int i = 1; i <= numbers; i++) {
            System.out.println("6. " + i * i);
        }
        for (int i = 1; i <= numbers; i++) {
            int b = 0 + i;
            for (int j = 1; j <= i; j++) {
                System.out.println("7. ");
            }
        }
    }

    private static void forLoopExample() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("how many numbers? ");
        int n = scanner.nextInt();

        for (int i = 0; i<n; i++){

                System.out.println("insert number");
                int number = scanner.nextInt();
            if (n >= 5 && n <= 20) {
                System.out.println(i + 1 + ". pow(" + number + ") = " + (number * number));
            } else{
                System.out.println("not supperted, buy full version");
            }
        }
        System.out.println("end of programm");
    }
}
