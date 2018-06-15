package algorythmExercises;

public class Fibonacci {

    public static void main(String[] args) {

        System.out.println(fibonacciNumber());

    }
        public static int fibonacciNumber() {

                int first = 1;
                int second = 2;
                int sum = 0;
                int counter=0;
                while(first<=4000000){
                    int next = first + second;
                    first = second;
                    if(counter % 3 == 0 ){
                        sum=sum+second;

                    }
                    second = next;
                    counter++;
                }
                return sum;
            }
}