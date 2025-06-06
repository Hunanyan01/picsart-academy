package am.picsartacademy.lesson.Lesson06.oop2_My_project.models;

public class InternationalOrder extends Order implements Deliverable {

    @Override
    public double getDeliveryPrice() {
        return getOrderId() * 0.25 + 5000;
    }

    @Override
    public String getOrderName() {
        return "International Order #" + getOrderId();
    }


}
