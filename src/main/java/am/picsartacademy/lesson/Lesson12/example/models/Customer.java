package am.picsartacademy.lesson.Lesson12.example.models;

public class Customer {

    //gaxni tvyalner mer Customer-i masin
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private String address;

    //mer kontruktory ir bolor tvyalnerov
    public Customer(String firstName,
                    String lastName,
                    String email,
                    String phone,
                    String address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phone = phone;
        this.address = address;
    }

    //get ev set veracum vor heto karoxananq clasic dus kanchel
    public String getFirstName() {
        return firstName;
    }

    //popoxel enq mer set-@
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    //uzum enq tpel hachaxordi tvyalnbery
    public void printSummary() {
        System.out.println("Customer: "
                + firstName + " "
                + lastName + " "
                + email + " "
                + phone + " "
                + address);
    }
}
