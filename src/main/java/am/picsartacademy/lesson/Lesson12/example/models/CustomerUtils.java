package am.picsartacademy.lesson.Lesson12.example.models;

import am.picsartacademy.lesson.Lesson12.example.models.Customer;

import java.util.List;
import java.util.Scanner;

public class CustomerUtils {


    public static void printCustomerName(List<Customer> customers, String name) {
        System.out.println("\nName " + name + ":");
        boolean found = false;

        for (Customer customer : customers) {
            if (customer.getFirstName().equalsIgnoreCase(name)) {
                customer.printSummary();
                found = true;
            }
        }
        if (!found){
            System.out.println("no costomers found whith name "+ name);
        }
    }

    //tpum enq hachaxordner@ yst erkri
    public static void printCustomersByCountry(List<Customer> customers, String country) {
        System.out.println("\nCustomers from " + country + ":");


        boolean found = false;

        for (Customer customer : customers) {
            if (customer.getAddress().getCountry().equalsIgnoreCase(country)) {
                customer.printSummary();
                found = true;
            }
        }

        if (!found) {
            System.out.println("No customers found in " + country);
        }

    }

    //tpum enq hachaxordner@ yst qaxaqneri
    public static void printCustomersByCity(List<Customer> customers, String city) {
        boolean found = false;

        System.out.println("\nCustomers from " + city + ":");
        for (Customer customer : customers) {
            if (customer.getAddress().getCity().equalsIgnoreCase(city)) {
                customer.printSummary();
                found = true;

            }
        }
        if (!found) {
            System.out.println("No customers found in " + city);
        }
    }

}
