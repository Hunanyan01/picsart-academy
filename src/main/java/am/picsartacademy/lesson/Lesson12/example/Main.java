package am.picsartacademy.lesson.Lesson12.example;

import static am.picsartacademy.lesson.Lesson12.example.models.CustomerUtils.*;

import am.picsartacademy.lesson.Lesson12.example.marketplace.Category;
import am.picsartacademy.lesson.Lesson12.example.marketplace.Product;
import am.picsartacademy.lesson.Lesson12.example.marketplace.ProductService;
import am.picsartacademy.lesson.Lesson12.example.models.*;

import java.util.*;


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
        List<Customer> customers = Arrays.asList(customerOne, customerTwo, customerThree, customerFour, customerFive, customerSix, customerSeven);

        Scanner scanner = new Scanner(System.in);

        //ashxatum enq Skanerov evs
        //System.out.println("Enter Name");
        //String name =scanner.nextLine();
        //printCustomerName(customers,name);

        //System.out.print("Enter country to filter: ");
        //String country = scanner.nextLine();
        //printCustomersByCountry(customers, country);

        //System.out.print("Enter city to filter: ");
        //String city = scanner.nextLine();
        //printCustomersByCity(customers, city);


        //tpum enq hachaxordy  yst erki
        System.out.println("----------------------------------------------Armenia-----------------------------------------------------------------");
        printCustomersByCountry(customers, "Armenia");
        System.out.println("-----------------------------------------------USA--------------------------------------------------------------------");
        printCustomersByCountry(customers, "USA");
        System.out.println("----------------------------------------------Gyumri------------------------------------------------------------------");
        printCustomersByCity(customers, "Gyumri");
        System.out.println("----------------------------------------------Paris-------------------------------------------------------------------");
        printCustomersByCity(customers, "Paris");
        System.out.println("----------------------------------------------New York----------------------------------------------------------------");
        printCustomersByCity(customers, "New York");
        System.out.println("------------------------------------------------John------------------------------------------------------------------");
        printCustomerName(customers, "John");


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

        System.out.println("----------------------------------------------------------------------------------------------------------------------\n\n");

        /*
        TODO:---------------------------list Metodner----------------------
        add(value) – avelacnum e tarr verjum
        add(index, value) - avelacnum e konkret indexsum
        get(index)  - veradarcnum e tary yst indexsi
        set(index, newValue) - popoxum e arjeqy yst indexsi
        remove(index) || remov (value) -jnjum e indexsy kam tary
        contains(value) - stugum e ete ka tary (true) ete chka (folse)
        size() - chaps
        isEmpty() - ete ka (folse) ete chka (true)
        clear() - jnjuma bolor tarery
        for || for-each - ancnuma amen meki vrayov
        indexOf - stuguma ka te che veradarcnelov index kam -1
        --------------------------------------------------------------------
        List<String> name = new ArrayList<>(Arrays.asList("Anna", "Vardan", "Davit"));
        Collections.sort(names) - Sortavorum e aybenakan kargov
        Collections.sort(scores, Collections.reverseOrder()) - sortavorum e nvazman kargov

        */


        //stexcel enq kategoryaner
        Category kosmetika = new Category("Cosmetics", "Makeup, skincare, and beauty products");
        Category igri = new Category("Games", "Board games, video games and more");
        Category elektronika = new Category("Electronics", "Phones, laptops, accessories");
        Category odejda = new Category("Clothing", "Men's and women's clothes");
        Category tufli = new Category("Shoes", "Casual and formal footwear");

        List<Category> categories = Arrays.asList(kosmetika, igri, elektronika, odejda, tufli);


        //stexcel enq apranqner
        Product shrtnerk = new Product("P001", "Maybelline Matte Lipstick", "Long-lasting matte lipstick from Maybelline", 12.99, 25, kosmetika);
        Product fifa25 = new Product("P002", "FIFA 25", "Latest football video game for PS5", 59.99, 12, igri);
        Product macbook = new Product("P003", "MacBook Air M3", "Apple 2024 edition laptop with M3 chip", 1299.99, 10, elektronika);
        Product shapik = new Product("P004", "DavAnna T-shirt", "Unisex t-shirt with DavAnna logo print", 19.99, 50, odejda);
        Product sportKoshik = new Product("P005", "Nike Air Max", "Stylish and comfy sneakers for everyday use", 89.99, 30, tufli);

        List<Product> catalog = Arrays.asList(shrtnerk, fifa25, macbook, shapik, sportKoshik);

        ProductService.printProductsByCategory(categories, catalog);

        Product expensive = ProductService.findMostExpensiveProduct(catalog);

        System.out.println("----------------------------------------------------------------------------------------------------------------------");

        System.out.println("Most expensive: " + expensive.getName() + " - $" + expensive.getPrice());

        System.out.println("----------------------------------------------------------------------------------------------------------------------");

        List<Product> sorted = ProductService.sortByPrice(catalog);

        System.out.println("Sorted products:");
        for (Product p : sorted) {
            System.out.println("  - " + p.getName() + " - $" + p.getPrice());
        }
        System.out.println("----------------------------------------------------------------------------------------------------------------------");

        Product cheapest = ProductService.findCheapestProduct(catalog);


        System.out.println("Cheapest product: " + cheapest.getName() + " - $" + cheapest.getPrice());

        System.out.println("----------------------------------------------------------------------------------------------------------------------");

        System.out.print("Enter price");

        double inputPrice = scanner.nextDouble();

        System.out.println("apranqner voronc giny cacr e " + inputPrice + "$-ic");

        int hashvark = 0;

        for (Product product : catalog) {
            if (product.getPrice() <= inputPrice) {
                System.out.println("  - " + product.getName() + " | $" + product.getPrice());
                hashvark++;
            }
        }
        System.out.println(hashvark + "/5 apranq voronman artyunqum");

        System.out.println("----------------------------------------------------------------------------------------------------------------------");


    }
}


