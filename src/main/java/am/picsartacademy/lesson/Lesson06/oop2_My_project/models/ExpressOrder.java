package am.picsartacademy.lesson.Lesson06.oop2_My_project.models;



public class ExpressOrder extends Order implements Deliverable {

    public ExpressOrder() {
        super();
    }

    @Override
    public double getDeliveryPrice() {
        return getOrderId() * 0.1;
    }

    @Override
    public String getOrderName() {
        return "Express Order *" + getOrderId();
    }
}
