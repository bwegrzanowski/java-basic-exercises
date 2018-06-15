package methodsExercises;

import java.util.Arrays;

public class Methods {
    public static void main(String[] args) {
        int[] array = {1,2,7,4,5,6,7,4,9};
        //printArray(array);

        int[] newArray = new int[5];
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = i;
        }
        //printArray(newArray);
        System.out.println("sum =" +sumOfArray(array));
        System.out.println(avg(array));
        System.out.println("smallest value= " + smallestValue(array));
        System.out.println("biggest value= " + biggestValue(array));
        System.out.println("spread =" + spread(array));
        System.out.println("occurences = " + Arrays.toString(occurence(array)));
        System.out.println("moda = " + moda(array));
        System.out.println("sorted = " + Arrays.toString(sortByCounting(array)));
    }

//    public static int printArray(int[] array){
////        int[] array = {1,2,3,4,5,6,7,8,9};
//        int[]
//        for (int i = 0; i < array.length; i++) {
//            System.out.print(array[i] + " ");
//        }
//        return (array);
//    }

    public static int sumOfArray(int[] array){
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = array[i] + sum;
        }
        return sum;
    }

    public static double avg (int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        return ((double) sum/array.length);
    }

    public static int smallestValue (int[] array){
        int smallestValue = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i]<=smallestValue){
                smallestValue=array[i];
            }
        }
        return smallestValue;
    }
    public static int biggestValue (int[] array){
        int biggestValue = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i]>=biggestValue){
                biggestValue=array[i];
            }
        }
        return biggestValue;
    }
    public static int[] occurence (int[] array){
        int[] occurArray = new int[spread(array)];
        int min = smallestValue(array);
        for (int i = 0; i < array.length; i++) {
            occurArray[i] = occurArray[array[i] - smallestValue(array)];

        }
        return occurArray;
    }

    public static int indexOfMax (int[] array){
        int iMax = 0;
        for (int i = 1; i < array.length; i++) {
            if(array[i] > array[iMax]){
                iMax=i;
            }
        }
        return iMax;
    }

    public static int moda (int[] array ){
        int[] stats = occurence(array);
        int indexOfMaximumValue = indexOfMax(stats);
        return indexOfMaximumValue + smallestValue(array);
    }


    public static int spread(int[] array){
        return biggestValue(array) - smallestValue(array) + 1;
    }


    public static int[] sortByCounting (int[] array){
        int[] sortedArray = new int[array.length];
//      int[] sortedArray = new int[sumOfArray[stats]];
        int[] stats = occurence(array);
        int k=0;

        for (int i = 0; i < stats.length; i++) {
            for (int j = 0; j < stats[i]; j++) {
                sortedArray[k] = i + smallestValue(array);
                k++;
            }
        }
        return sortedArray;
    }
}
