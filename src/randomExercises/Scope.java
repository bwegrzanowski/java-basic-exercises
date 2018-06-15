package randomExercises;

import java.util.Arrays;
import java.util.Scanner;
// array exercises

public class Scope {
    public static void main(String[] args) {

//1. sum of numers in array
        int[] zad1 = {4,5,6,7,8};
        int sum=0;
        for(int i = 0; i < zad1.length; i++){
            sum = zad1[i] +sum;
        }
        System.out.println(sum);
//2. average
        int[] zad2 = {4,5,6,7,8};
        int averageToBe=0;
        int step = 0;
        for(int i = 0; i < zad1.length; i++){
            averageToBe = zad2[i] + averageToBe;
            step++;
        }
        int average = averageToBe/step;
        System.out.println(average);
//3. max and min value
        int[] zad3 = {1,2,3};
        int max = zad3[0];
        int min = zad3[0];
        for (int i=1; i<zad3.length; i++) {
            if (zad3[i] < min) {
                min = zad3[i];
            }
            if (zad3[i] > max) {
                max=zad3[i];
            }
        }
        System.out.println(max);
        System.out.println(min);

//8 inserting values to array and
        int size = 5;
        int[] descendingNumbers =new int[size];
        for (int i = 0; i <size; i++) {
            descendingNumbers[i]=descendingNumbers.length-i;
        }
        System.out.println(Arrays.toString(descendingNumbers));

//9 inserting values to array
        Scanner scanner = new Scanner(System.in);
        System.out.println("insert size of array");
        int sizeOfUserArray = scanner.nextInt();
        int[] userArray = new int[sizeOfUserArray];
        int[] ints = new int[sizeOfUserArray];
        int sumOfArray=0;
        for (int i = 0; i < userArray.length; i++) {
            System.out.println("insert next value");
            userArray[i]=scanner.nextInt();
            sumOfArray +=userArray[i];
        }
        System.out.println("avg = " + ((double)sumOfArray/userArray.length));
//10 sorted array, checking smaller values
        int searchingNumbers = 6;
        int[] sortedArray = {1,3,5,6,8,9};
        int counterForSearching = 0;
        while (counterForSearching<sortedArray.length && sortedArray[counterForSearching] !=searchingNumbers) {
            counterForSearching++;
        }
        System.out.println(counterForSearching);

    }
}