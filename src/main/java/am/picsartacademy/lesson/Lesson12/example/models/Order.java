package am.picsartacademy.lesson.Lesson12.example.models;

public class Order {

    //gaxni patverneri apahovagrum
    protected Customer customer;
    protected double price;


    //aranc gni construktr miayn hachaxord unenq
    public Order(Customer customer) {
        this.customer = customer;
        this.price = 0;
    }
    //hachaxor ev gin
    public Order(Customer customer, double price) {
        this.customer = customer;
        this.price = price;
    }


    //patveri manramasneri tpum

    public void printSummery() {
        System.out.println("Total amount: " + price + " AMD");
    }

    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public Customer getCustomer() {
        return customer;
    }
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }


    //stuguma patveri giny ev hascei arkayutyuny
    public void validate() throws Exception {
        if (price < 1000) {
            throw new Exception("Order price is too low. Minimum is 1000 AMD.");
        }
        if (customer.getAddress() == null || customer.getAddress().isBlank()) {
            throw new Exception("Customer address is missing.");
        }
    }

}
