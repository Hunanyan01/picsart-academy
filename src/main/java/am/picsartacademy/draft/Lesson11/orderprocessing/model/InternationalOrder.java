package am.picsartacademy.draft.Lesson11.orderprocessing.model;

public class InternationalOrder extends Order implements DeliverAble {



    public InternationalOrder(String customerName, double price) {
        super(customerName, price);
    }

    @Override
    public double calculateDeliveryPrace() {
        return price * 0.2;
    }
}
