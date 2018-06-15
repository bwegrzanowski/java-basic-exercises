package oop.bookstore;

import java.util.Scanner;

public class BookstoreApplication {
    public static void main(String[] args) {
        Book[] books = new Book[10];
        Author[] authors = new Author[10];

        Scanner scanner = new Scanner(System.in);
        int answer;
        do{
            System.out.println("1. author");
            System.out.println("2. books");
            System.out.println("0. Exit");
            System.out.println();
            System.out.println("press any key");
            answer = scanner.nextInt();
            scanner.nextLine();

            switch (answer) {
                case 1:
                    showAuthors(scanner, new Author[]{new Author("mickiewicz"),
                            new Author("sienkiewicz")});
                    System.out.println();
                    break;
                case 2:
//                  creating Book[] and inserting values simultaneously
                    showBooks(scanner, new Book[]{new Book("pan tadeusz", 1901),
                            new Book("krzyzacy", 1950)});
                    System.out.println();
                    break;
            }
        } while (answer != 0);
    }

    private static void showBooks(Scanner scanner, Book[] books) {
        list(books);
        scanner.nextLine();
    }

    private static void showAuthors(Scanner scanner, Author[] authors) {
        list(authors);
        scanner.nextLine();
    }
    public static void list (Object[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}

