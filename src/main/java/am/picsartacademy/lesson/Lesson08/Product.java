package am.picsartacademy.lesson.Lesson08;

public class Product {
    private String name;
    private int price;
    private int ID;
    private int quantity;
    private boolean stock;

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    private int data;

//    public Product(String name, int price, int ID, int quantity, boolean stock) {
//        this.name = name;
//        this.price = price;
//        this.ID = ID;
//        this.quantity = quantity;
//        this.stock = stock;
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public boolean isStock() {
        return stock;
    }

    public void setStock(boolean stock) {
        this.stock = stock;
    }

    public void printInfo() {
        System.out.printf("Name = %s, Data = %d, ID = %d, Price = %d, Quantity = %d, Is Stock = %s",
                name, data, ID, price, quantity, stock ? "Yes" : "NO");

    }


}
