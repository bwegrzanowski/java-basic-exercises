package oop;

public class Address {
    public String country;
    public String voivodeship;
    public String city;
    public String zipCode;
    public String district;
    public String street;
    public int homeNumber;
    public int flatNumber;

    public void show() {
        System.out.println(zipCode + " " + city + ", ul. "+ street + " " + homeNumber);
    }

}
