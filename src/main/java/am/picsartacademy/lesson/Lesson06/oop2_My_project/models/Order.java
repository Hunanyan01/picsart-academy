package am.picsartacademy.lesson.Lesson06.oop2_My_project.models;

public class Order {
    private Product[] products;
    private String status;
    private int orderId;
    private String orderName = "Premium Order";

    public String getOrderName() {
        return orderName;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }

    public Product[] getProducts() {
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



}
