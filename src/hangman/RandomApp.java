package hangman;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class RandomApp {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(someRandomNumbersArray()));

        int[] randomArray = randomArray();
        System.out.println("random array: " + Arrays.toString(randomArray));
        System.out.println("sum of random array: " + sumOfRandomArray(randomArray));
        System.out.println("you threw " + diceThrow() + " on a dice");
        System.out.println(Arrays.toString(randomOfOneToTen()));
    }

    //10 randomly generated even numbers of 0-10
    public static int[] randomOfOneToTen (){
        int[] array = new int[10];
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            int a = random.nextInt(6);
            array[i] = 2*a;
        }
        return array;
    }

    public static int diceThrow (){
        Random random = new Random();
        return random.nextInt(6)+1;
    }

    //sum of random values
    public static int sumOfRandomArray(int[] array){
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum+=array[i];
        }
        return sum;
    }

    //nowa tablica wielkosci zdefiniowanej przez usera elementowa zlozona z losowych
    //          liczb z zakresu podanego przez usera
    public static int[] someRandomNumbersArray (){
        Scanner scanner = new Scanner(System.in);
        System.out.println("insert size");
        int size = scanner.nextInt();
        int[] array = new int[size];
        Random random = new Random();

        System.out.println("insert bottomrange");
        int bottomRange = scanner.nextInt();
        System.out.println("insert toprange");
        int topRange = scanner.nextInt();
        int range = topRange - bottomRange;

        for (int i = 0; i < size; i++) {
            array[i]=random.nextInt(range) + bottomRange;
        }
        return array;
    }

    //creating array of random values
    public static int[] randomArray(){
        Random random = new Random();
        int n =10;
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i]= random.nextInt();
        }
        return array;
    }
}
