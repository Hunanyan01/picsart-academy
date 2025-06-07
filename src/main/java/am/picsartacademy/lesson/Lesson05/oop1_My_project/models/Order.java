package am.picsartacademy.lesson.Lesson05.oop1_My_project.models;

import am.picsartacademy.lesson.Lesson06.oop2_My_project.models.Product;

public class Order {
    private am.picsartacademy.lesson.Lesson06.oop2_My_project.models.Product[] products;
    private String status;
    private int orderId;
    private String orderName = "Premyum Oder";

    public String getOrderName() {
        return orderName;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }

    public am.picsartacademy.lesson.Lesson06.oop2_My_project.models.Product[] getProducts() {
        return products;
    }

    public void setProducts(Product[] products) {
        this.products = products;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int x) {
        if (x > 0)
            orderId = x;
    }

    public void setProducts(String kosmetik, String Game, String cloth) {

        System.out.println();
    }


    public void sum(int n) {
        for (int i = 0; i <= n; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public void sum(int a, int b) {
        System.out.println(a + b);
    }

    public void sum(int a, int b, int c) {
        System.out.println(a + b + c);
    }

    public void f(int a) {
        System.out.println(a);

    }

    public void f(long a) {
        System.out.println(a);
    }

}
