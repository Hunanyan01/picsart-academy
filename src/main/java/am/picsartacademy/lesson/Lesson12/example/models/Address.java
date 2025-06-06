package am.picsartacademy.lesson.Lesson12.example.models;

public class Address {
    private String street;
    private String city;
    private String country;
    private String phoneNumber;

    public Address(String country, String city, String street, String phoneNumber) {
        this.street = street;
        this.city = city;
        this.country = country;
        this.phoneNumber = phoneNumber;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    @Override
    public String toString() {
        return street + " | " + city + " | " + country + " (" + phoneNumber + ")";
    }
}
