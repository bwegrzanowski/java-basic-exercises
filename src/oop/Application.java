package oop;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        User user = createUser(scanner);
        User user2 = new User();
        user2.firstName = "Jan";
        user2.lastName= "kowalski";

        System.out.println(user.firstName + " " + user.lastName +
                " phone number " + user.phoneNumber+ " email " + user.email);

        user.introduceYourself();
        user2.introduceYourself();

        Address address= new Address();
        address.zipCode = "72-311";
        address.city = "poznan";
        address.street = "polwiejska";
        address.homeNumber = 20;
//        address.show();
        user.address = address;

    }

    public static User createUser(Scanner scanner){
        User user = new User();
        System.out.println("insert firstname");
        user.firstName = scanner.nextLine();

        System.out.println("insert lastname");
        user.lastName= scanner.nextLine();

        System.out.println("insert phone number");
        user.phoneNumber= scanner.nextLine();

        System.out.println("mail");
        user.email = scanner.nextLine();

//        System.out.println(firstName+ " " + lastName+ " " + "email "+ email);

        return user;
    }
}
