package moreless;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MoreLessApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int answer;
        do {
            System.out.println("1. Start");
            System.out.println("2. Show rules");
            System.out.println("3. Hire a bot to find my number");
            System.out.println("0. Exit");
            System.out.println();
            System.out.println("press any key");
            answer = scanner.nextInt();
            scanner.nextLine();
            switch (answer) {
                case 1:
                    startGame(scanner);
                    break;
                case 2:
                    rules(scanner);
                    break;
                case 3:
                    randomNumberSeeker();
                    break;
            }
        } while (answer != 0);
    }


    //bot searching for random number, binary search basis
    public static void randomNumberSeeker() {
        Random random = new Random();
        int size = 100;
        int[] numbers = new int[size];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i;
        }
        int botsValue = numbers[size / 2];
        int computerValue = random.nextInt(100);
        int i = 0;
        int newSize = size;
        int[] newArray = numbers;
        while (i < size && botsValue != computerValue) {
            if (botsValue > computerValue) {
                newArray = Arrays.copyOfRange(newArray, 0, newSize / 2);
                botsValue = newArray[newArray.length / 2];
                if (newSize % 2 == 0) {
                    newSize = newSize / 2;
                } else {
                    newSize = (newSize / 2) + 1;
                }
            } else {
                newArray = Arrays.copyOfRange(newArray, newSize / 2, newSize);
                botsValue = newArray[newArray.length / 2];
                if (newSize % 2 == 0) {
                    newSize = newSize / 2;
                } else {
                    newSize = (newSize / 2) + 1;
                }
            }
            i++;
        }
        System.out.println("congrats your bot found secret number in " + i + " steps, " +
                "and it is " + botsValue);
    }

    private static void rules(Scanner scanner) {
        System.out.println("this program generates a number which you have to find");
        System.out.println("type a numer of presented range of values, the faster you guess");
        System.out.println("the more lucky you are!");
    }

    private static void startGame(Scanner scanner) {
        Random random = new Random();
        int computerValue = random.nextInt(100);
        System.out.println("guess my number! (0-99)");
        int usersValue = scanner.nextInt();
        int counter = 0;

        while (usersValue != computerValue) {
            if (usersValue > computerValue) {
                System.out.println("your number is to big, try again");
                usersValue = scanner.nextInt();
            } else {
                System.out.println("your number is to small, try again");
                usersValue = scanner.nextInt();
            }
            counter++;
        }
        System.out.println("congratulations! you found my number which was " + computerValue + " in only " + counter + " steps!");
    }
}
