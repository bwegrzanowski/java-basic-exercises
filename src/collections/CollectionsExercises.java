package collections;

import oop.User;
import oop.bookstore.Author;
import oop.bookstore.Book;

import java.util.*;

public class CollectionsExercises {
    public static void main(String[] args) {
        List<Integer> mySet = new ArrayList<>();
        mySet.add(3);
        mySet.add(5);
        mySet.add(8);
        mySet.add(10);
        for (Integer i : mySet) {
            System.out.println(i);
        }

    }

    //getting n values from user, print only unique ones

    public static void uniqueNumbersFromUser (){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Set<Integer> set = new HashSet<>();

        for (int j = 0; j < n; j++) {
            int nextValue = scanner.nextInt();
            set.add(nextValue);
        }

        Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }


    //creating a map with pesel -> user
    public static void userDatabase (){
        Map<String, User> usersDatabase = new HashMap<>();
        usersDatabase.put("64564645", new User());
        usersDatabase.put("5226512", new User());
        Set<Map.Entry<String, User>> entries = usersDatabase.entrySet();
        Iterator<Map.Entry<String, User>> iterator = entries.iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, User> next = iterator.next();
            System.out.println(next.getKey() + ":" + next.getValue());
        }
    }

    //creating a map with author -> booklist
    public static void bookstore(){
        Map<Author,List<Book>> bookstore = new HashMap<>();
        bookstore.put(new Author("adam mickiewicz"), Arrays.asList(new Book("dziady", 1234)));
        bookstore.put(new Author("hernyk sienkiewicz"),
                Arrays.asList(new Book("quo vadis", 1922)));
    }


    //printing random value
    public static void randomUnique (List<Integer> numbers){
        Random random = new Random();
        ArrayList<Integer> tmpList = new ArrayList<>(numbers);

        for (int i = 0; i < numbers.size();) {
            int index= random.nextInt(tmpList.size());
            System.out.println(tmpList.remove(index));
        }
    }
}
