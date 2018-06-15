package oop;

public class User {

    public String firstName;
    public String lastName;
    public String phoneNumber;
    public String email;
    public Address address;

    public void introduceYourself() {

        System.out.println(firstName + " " + lastName +
                " phone number " + phoneNumber+ " email " + email);
        if (address!= null) {
            address.show();
        }
    }


}
