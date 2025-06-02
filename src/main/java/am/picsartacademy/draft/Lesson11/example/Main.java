package am.picsartacademy.draft.Lesson11.example;


import am.picsartacademy.draft.Lesson11.example.models.Customer;
import am.picsartacademy.draft.Lesson11.example.models.ExpressOrder;
import am.picsartacademy.draft.Lesson11.example.models.Order;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer("John",
                "Smith",
                "john@gmail.com",
                "+37477777777",
                "5 Azatutyun, Yerevan, Armenia");

        Order order = new ExpressOrder(customer, 1500);
        order.getCustomer().printSummary();
        order.printSummery();
    }
}