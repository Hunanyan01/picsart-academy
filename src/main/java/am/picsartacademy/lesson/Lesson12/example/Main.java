package am.picsartacademy.lesson.Lesson12.example;

import am.picsartacademy.lesson.Lesson12.example.models.*;

import java.util.*;

import static am.picsartacademy.lesson.Lesson12.example.models.CustomerUtils.*;

public class Main {
    public static void main(String[] args) {

        // stexcel enq hasceneri obektner
        Address address1 = new Address("Armenia", "Gyumri", "Ashot St. 5", "094_545_454");
        Address address2 = new Address("Armenia", "Vanadzor", "Tumanyan St. 10", "095_123_456");
        Address address3 = new Address("Armenia", "Yerevan", "Mashtots Ave. 3", "096_987_654");
        Address address4 = new Address("France", "Paris", "Antarayin 12", "+33_611_223_344");
        Address address5 = new Address("France", "Lyon", "Noy St. 6", "+33_622_334_455");
        Address address6 = new Address("Germany", "Berlin", "Alexanderplatz 15", "+49_301_234_567");
        Address address7 = new Address("USA", "New York", "5th Avenue 21", "+1_212_555_0101");



        System.out.println("----------------------------------------------------------------------------------------------------------------------");
        //stexcel enq hachaxodneri mail,anun,azganun,heraxosi hamar,hasce
        Customer customerOne = new Customer("Aram", "Mkrtchyan", "aram.mk@gmail.com", "+37494000000", address1);
        Customer customerTwo = new Customer("Lusine", "Galstyan", "lusine.g@gmail.com", "+37495000000", address2);
        Customer customerThree = new Customer("Hrach", "Hakobyan", "h.hakobyan@mail.com", "+37496000000", address3);
        Customer customerFour = new Customer("Claire", "Dubois", "claire.dubois@gmail.com", "+33_611_223_344", address4);
        Customer customerFive = new Customer("Marc", "Lemoine", "marc.lemoine@gmail.com", "+33_622_334_455", address5);
        Customer customerSix = new Customer("Hans", "Schmidt", "h.schmidt@gmail.com", "+49_301_234_567", address6);
        Customer customerSeven = new Customer("John", "Doe", "john.doe@gmail.com", "+1_212_555_0101", address7);

        //stexcum enq patverneri tesakner

        System.out.println(customerOne);
        Order orderOne = new ExpressOrder(customerOne, 1850);
        Order orderTwo = new ExpressOrder(customerTwo, 2100);
        Order orderThree = new InternationalOrder(customerThree, 900);//kanxamtacvac sxal n<1000

        System.out.println("----------------------------------------------------------------------------------------------------------------------");

        //tpum  enq vacharox kazmakerputyan anuny
        System.out.println(ExpressOrder.getVendor());

        //stexcum enq cucak Customerneri
        List<Customer> customers = Arrays.asList(customerOne, customerTwo, customerThree,customerFour,customerFive,customerSix,customerSeven);

        Scanner scanner = new Scanner(System.in);

        //ashxatum enq Skanerov evs
        System.out.println("Enter Name");
        String name =scanner.nextLine();
        printCustomerName(customers,name);

        System.out.print("Enter country to filter: ");
        String country = scanner.nextLine();
        printCustomersByCountry(customers, country);

        System.out.print("Enter city to filter: ");
        String city = scanner.nextLine();
        printCustomersByCity(customers, city);



        //tpum enq hachaxordy  yst erki
        System.out.println("----------------------------------------------Armenia-----------------------------------------------------------------");
        printCustomersByCountry(customers, "Armenia");
        System.out.println("-----------------------------------------------USA--------------------------------------------------------------------");
        printCustomersByCountry(customers,"USA");
        System.out.println("----------------------------------------------Gyumri------------------------------------------------------------------");
        printCustomersByCity(customers, "Gyumri");
        System.out.println("----------------------------------------------Paris-------------------------------------------------------------------");
        printCustomersByCity(customers, "Paris");
        System.out.println("----------------------------------------------New York----------------------------------------------------------------");
        printCustomersByCity(customers, "New York");
        System.out.println("------------------------------------------------John------------------------------------------------------------------");
        printCustomerName(customers,"John");



        // pahum enq boloru zangvacneri mech
        Order[] orders = new Order[]{
                orderOne,
                orderTwo,
                orderThree
        };

        List<Order> orders1 = new ArrayList<>(Arrays.asList(orderOne, orderTwo, orderThree));





        //verevum avelacnum enq listi mech
//        orders1.add(orderOne);
//        orders1.add(orderTwo);
//        orders1.add(orderThree);


//        Collections.sort(orderner,Collection.reverseOrder());
//        System.out.println("After Soting in descending orrder");
//        System.out.println(orderner);

        System.out.println("\n===== BEFORE SORTING =====");
        System.out.println(orders1);
        System.out.println("----------------------------------------------------------------------------------------------------------------------");

        System.out.println("\n===== AFTER SORTING =====");
        Collections.sort(orders1);
        System.out.println(orderOne);
        System.out.println("----------------------------------------------------------------------------------------------------------------------");



        //stugum enq patvernery
        for (Order order : orders) {
            try {
                //stugum enq patveri giny
                order.validate();
                //ete sax lava tpum enq
                order.getCustomer().printSummary();
                order.printSummery();
                //stugum enq araqvox orderneri vichaky
                try {
                    Deliverable d = (Deliverable) order;

                    if (d.isAvailableForDelivery()) {
                        System.out.println("Delivery:  Possible");
                        System.out.println("----------------------------------------------------------------------------------------------------------------------");
                    } else {
                        System.out.println("Delivery:  Not available");
                        System.out.println("----------------------------------------------------------------------------------------------------------------------");
                    }

                    System.out.println("Estimated time: " + d.getDeliveryEstimate());

                } catch (ClassCastException e) {
                    System.out.println("Order is not deliverable: " + e.getMessage());
                } catch (Exception e) {
                    System.out.println("Error while checking delivery info: " + e.getMessage());
                }

            } catch (Exception e) {
                //ete sxal lini paymany tpum enq (payman n<1000)
                System.out.println("Invalid order: " + e.getMessage());
            }

            System.out.println("----------------------------------------------------------------------------------------------------------------------");
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








    }
}


