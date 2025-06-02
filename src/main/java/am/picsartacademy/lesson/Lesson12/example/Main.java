package am.picsartacademy.lesson.Lesson12.example;
import am.picsartacademy.lesson.Lesson12.example.models.*;

public class Main {
    public static void main(String[] args) {
        //stexcel enq hachaxodneri mail,anun,azganun,heraxosi hamar,hasce
        Customer customerOne = new Customer("Aram", "Mkrtchyan", "aram.mk@gmail.com", "+37494000000", "Gyumri");
        Customer customerTwo = new Customer("Lusine", "Galstyan", "lusine.g@gmail.com", "+37495000000", "Vanadzor");
        Customer customerThree = new Customer("Hrach", "Hakobyan", "h.hakobyan@mail.com", "+37496000000", "Paris");
        //stexcum enq patverneri tesakner
        Order orderOne = new ExpressOrder(customerOne, 1850);
        Order orderTwo = new ExpressOrder(customerTwo, 2100);
        Order orderThree = new InternationalOrder(customerThree, 900);//kanxamtacvac sxal n<1000

        //tpum  enq vacharox kazmakerputyan anuny
        System.out.println(ExpressOrder.getVendor());
        //pahum enq boloru zangvacneri mech
        Order[] orders = new Order[]{
                orderOne,
                orderTwo,
                orderThree
        };
        //stugum enq patvernery
        for (Order order : orders) {
            try {
                //stugum enq patveri giny
                order.validate();
                //ete sax lava tpum enq
                order.getCustomer().printSummary();
                order.printSummery();
                //stugum enq araqvox orderneri vichaky
                if (order instanceof Deliverable) {
                    Deliverable d = (Deliverable) order;

                    if (d.isAvailableForDelivery()) {
                        System.out.println("Delivery:  Possible");
                    } else {
                        System.out.println("Delivery:  Not available");
                    }

                    System.out.println("Estimated time: " + d.getDeliveryEstimate());
                }

            } catch (Exception e) {
                //ete sxal lini paymany tpum enq (payman n<1000)
                System.out.println(" Invalid order: " + e.getMessage());
            }

            System.out.println("--------------------------------------------------");
        }

        // statistikan enq hashvum
        int totalOrders = orders.length;
        int expressOrderCount = 0;
        int interOrderCount = 0;

        for (Order order : orders) {
            if (order instanceof ExpressOrder) {
                expressOrderCount++;
            } else if (order instanceof InternationalOrder) {
                interOrderCount++;
            }
        }

        //verjnakan anpopum
        System.out.println("Orders total: " + totalOrders);
        System.out.println("Express: " + expressOrderCount);
        System.out.println("International: " + interOrderCount);
        System.out.println("International: " + interOrderCount);


    }
}