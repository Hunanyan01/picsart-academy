package am.picsartacademy.draft.Lesson11.orderprocessing.model;

public class ExpessOrder extends Order implements DeliverAble{


    public ExpessOrder(String customerName, double price) {
        super(customerName, price);
    }

    @Override
    public double calculateDeliveryPrace() {
        return price * 0.1;
    }
    @Override
    public void printSummery(){
        super.printSummery();
        System.out.println(" Type: Exspess Order. Delivery Price $ "+calculateDeliveryPrace());
    }
}
