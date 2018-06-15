package arrayExercises;

import java.util.Scanner;

public class Warmup {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("insert value");
        int n = scanner.nextInt();

//        for(int i=0; i<n; i++){
//            System.out.println("insert value 2");
//            int m = scanner.nextInt();
//
//            if(m%6 == 0){
//                System.out.println("can be divided by 6");
//            }
//            else if (m%3 == 0){
//                System.out.println("can be divided by 3");
//            }
//            else if (m%2 == 0){
//                System.out.println("can be divided by 2");
//            }
//            else {
//                System.out.println("well... you found an exception");
//            }
//        }
//        System.out.println("end of programm");

//        zad 2
        int previousValue =0;
        for (int i = 0; i<n; i++){
            System.out.println("insert next value to compare");
            int value = scanner.nextInt();

            if (value > previousValue){
                System.out.println("new value is bigger than previous one" );
            } else if (value == previousValue){
                System.out.println("value is equal to previous one");
            } else {
                System.out.println("new value is smaller than previous one");
            }
            previousValue = value;
        }

        //zad 3
//        int sum = 0;
//        for (int i = 0; i<n; i++){
//            if (i%2 == 0 && i%3 != 0){
//                sum += i; //to samo co sum = sum + i;
//            }
//        }
//        System.out.println("sum equals = " + sum);

        //zad 4
//        int factorial =1;
//        for(int i=1; i<=n; i++){
//            factorial *= i;
//        }
//        System.out.println(factorial);
    }
}
