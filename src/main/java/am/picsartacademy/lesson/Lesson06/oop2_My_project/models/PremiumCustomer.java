package am.picsartacademy.lesson.Lesson06.oop2_My_project.models;

public class PremiumCustomer extends Customer {
    private int discountPercent = 10;

    public int getDiscountPercent() {
        return discountPercent;
    }

    @Override
    public void setLoyaltyPoints(int points) {
        super.setLoyaltyPoints(points + 20);
    }
}

