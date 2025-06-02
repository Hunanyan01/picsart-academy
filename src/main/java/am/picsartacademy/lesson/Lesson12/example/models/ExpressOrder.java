package am.picsartacademy.lesson.Lesson12.example.models;

public class ExpressOrder extends Order implements Deliverable {
    //statikov talis enq vacharox kazmakerputyan anuny
    private static String vendor = "DHL";

    //kontruktra hachaxordov ev arjeqov
    public ExpressOrder(Customer customer, double price) {
        //kanchuma cnoxi konstruktry
        super(customer, price);
    }

    //araqman arjeqn enq hashvark anum
    @Override
    public double calculateDeliveryPrice() {
        return price * 0.1;
    }

    //orderi informacian enq tpum u exspres tvyalner avelacnum
    @Override
    public void printSummery() {
        super.printSummery();
        System.out.println("Type: Express Order");
        System.out.println("Delivery Cost: AMD " + calculateDeliveryPrice());
    }

    @Override
    public boolean isAvailableForDelivery() {
        return true;
    }

    @Override
    public String getDeliveryEstimate() {
        return "1-2 days";
    }

    public static String getVendor() {
        return vendor;
    }

    public static void setVendor(String vendor) {
        ExpressOrder.vendor = vendor;
    }


}
