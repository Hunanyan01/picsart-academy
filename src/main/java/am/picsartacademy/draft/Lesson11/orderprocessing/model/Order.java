package am.picsartacademy.draft.Lesson11.orderprocessing.model;

public class Order {
    protected String customerName;
    protected double price;

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void printSummery() {
        System.out.println("Coustomer: " + customerName + "Price: AMD " + price);
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Order(String customerName) {
        this.customerName = customerName;
        this.price = 0;
    }

    public Order(String customerName, double price) {
        this.customerName = customerName;
        this.price = price;
    }

}

//qasterneymi poxarnen sarqenq anun azganun heraxos hasce
//odery kunena qastmer
//qastm petqa sarqenq
//mainum sarqum enq orderneri yrey
//u sarqac orderrnery lcenqn yrneri mech //grenq forich cik u mi toxov tpenq bolor orderneri summernery//dranic heto stugenq arreyi mechi vory vo exspes order en tpenq mechinery ,exspress ordernery arandzin peqa tpenq
