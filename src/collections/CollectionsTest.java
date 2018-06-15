package collections;

import java.util.*;

public class CollectionsTest {
    public static void main(String[] args) {

        Random random = new Random();
        Set<Integer> uniqueNumbers = new HashSet<>();
        while (uniqueNumbers.size()<10){
            uniqueNumbers.add(random.nextInt(10));
        }
        System.out.println(uniqueNumbers.size());
        uniqueNumbers.add(5);
        System.out.println(uniqueNumbers.size());

        for (Integer uniqueNumber : uniqueNumbers) {
            System.out.println(uniqueNumber);
        }

    }

    private static void listExample() {
        List<String> names = new LinkedList<>();
        names.add("jan");
        names.add("karolina");
        for (String name : names) {
            System.out.println(name);
        }
    }

    private static void arrayListExample() {
        List<String> names = new ArrayList<>();
        names.add("szymon");

        //for z dostepem do indeksu -> i
        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }
        //for each, przejscie po elementach
        for (String value : names) {
            System.out.println(value);
        }
    }

    private static <T> void showArray(T[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
