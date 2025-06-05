package am.picsartacademy.lesson.Lesson12.example.models;

public class InternationalOrder extends Order implements Deliverable {


    private static String vendor = "FedEx";


    //stanuma arjeq ev hachaxord
    public InternationalOrder(Customer customer, double price) {
        super(customer, price);
    }

    //hashvark araqman arjeqi
    @Override
    public double calculateDeliveryPrice() {
        return price * 0.2;//20%
    }


    //mijazgayin araqman hasaneliutyan stugum
    @Override
    public boolean isAvailableForDelivery() {
        if (customer.getAddress().getCity().equalsIgnoreCase("paris")) {
            return false;
        }
        return price >= 1000;
    }

    //ete mijazgayina patvery
    @Override
    public String getDeliveryEstimate() {
        return "1-2 days";
    }


    @Override
    public void printSummery() {
        super.printSummery();
        System.out.println("Type: International Order. Delivery Price: AMD " + calculateDeliveryPrice());

    }
    public static String getVendor() {
        return vendor;
    }



}
