package am.picsartacademy.lesson.Lesson12.example.models;

public interface Deliverable {

    //araqman arjeqi hashvarkelu hamar
    double calculateDeliveryPrice();
    //nra hamara vor stugenq hascei karelia araqel te che
    boolean isAvailableForDelivery();
    //teqsta veradarcnum gnahatvac araqman arjeqi hamar
    String getDeliveryEstimate();


}
