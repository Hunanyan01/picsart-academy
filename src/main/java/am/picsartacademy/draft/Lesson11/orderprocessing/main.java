package am.picsartacademy.draft.Lesson11.orderprocessing;


import am.picsartacademy.draft.Lesson11.orderprocessing.model.ExpessOrder;
import am.picsartacademy.draft.Lesson11.orderprocessing.model.Order;

public class main {

public static void main(String[] args) {
    Order order =new ExpessOrder("Jon Smith",1500);
    order.printSummery();
}
}
