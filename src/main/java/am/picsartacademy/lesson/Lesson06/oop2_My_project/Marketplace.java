package am.picsartacademy.lesson.Lesson06.oop2_My_project;

import am.picsartacademy.lesson.Lesson06.oop2_My_project.models.Customer;
import am.picsartacademy.lesson.Lesson06.oop2_My_project.models.ExpressOrder;
import am.picsartacademy.lesson.Lesson06.oop2_My_project.models.Order;
import am.picsartacademy.lesson.Lesson06.oop2_My_project.models.Product;

public class Marketplace {
    public static void main(String[] args) {


        Order o1 = new Order();
        Product p1 = new Product();
        Product p2 = new Product();
        Product p3 = new Product();
        Customer c1 = new Customer();

        o1.setStatus("on the way");
        o1.setOrderId(10);

        p1.setId(15);
        p1.setName("Apple");
        p1.setAvailable(true);
        p1.setPrice(12000);

        p2.setId(20);
        p2.setName("Orring");
        p2.setAvailable(false);
        p2.setPrice(5000);

        p3.setId(8);
        p3.setName("Apple");
        p3.setAvailable(true);
        p3.setPrice(2000);


        c1.setName("Poxos");
        c1.setLoyaltyPoints(5);

        Product[] products = {p1, p2, p3};

        for (Product p : products) {
            System.out.print("Name -" + p.getName() + "\n");
            System.out.print("Price -" + p.getPrice() + "\n");
            System.out.print("Available -" + p.getId() + "\n");
            System.out.println("---------------------------------");
        }
        System.out.println(o1.getOrderName());

        c1.setName("Poxos");
        c1.setLoyaltyPoints(5);

        System.out.println("Customer Name -" + c1.getLoyaltyPoints());
        System.out.println("Status -" + c1.getName());


        String text = "Helllllllo word ";
        System.out.println(text.charAt(0));

        for (int i = 0; i < text.length(); i++) {
            System.out.print(text.charAt(i) + " ");
        }
        int hashvich = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == 'l')
                hashvich++;
        }
        System.out.println();
        System.out.println(hashvich);


        ExpressOrder eo = new ExpressOrder();
        eo.setOrderId(10);
        System.out.println("Order Name: " + eo.getOrderName());
        System.out.println("Delivery Price: AMD " + eo.getDeliveryPrice());

        //sarrqum enq adrees u qastmrin talis enq voshte ades objext ayl sting,
        //iqsebshen enq sarqum,ete erkiry vrastana iqsebshen enq qcum (case)vor iran chenq kaa delivr anenq
        //ete giny (ship metod vory uxarkeluya shpmnti ete et metody stugi vor bacasakana iqsebshn enq qcelu vor peymnty avac chi
        //ete bacasakana email uxarki ,tre cachov grvi vor uzer uxarki u email
        //order sarqenq vory vorr bacaskaan lini vory vor ship aneluc asi vor iqsepshn unenq

        //sarqum enq peymn iqsepshn kasenq vor peymnty arvac chi
        //ayn taym iqsepshn ,chgidenq bacasakan klini te che ,kgrenq ship metot get kani ete ordrri praicy bacasakana iqsepsh tro kanin,meinum ete sarqenq trolow vor bacasakan lini kbrnenq u kasenq peymnt ches ael normal ara
        //
    }
}