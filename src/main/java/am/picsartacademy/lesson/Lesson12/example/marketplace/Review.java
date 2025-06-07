package am.picsartacademy.lesson.Lesson12.example.marketplace;

public class Review {
    private String reviewerName;
    private Product product;
    private int rating;
    private String comment;

    public String getReviewerName() {
        return reviewerName;
    }

    public void setReviewerName(String reviewerName) {
        this.reviewerName = reviewerName;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Review(String reviewerName, Product product, int rating, String comment) {
        this.reviewerName = reviewerName;
        this.product = product;
        this.rating = rating;
        this.comment = comment;
    }

    @Override
    public String toString() {
        return rating + "/5 by " + reviewerName + ": " + comment;
    }

    //TODO: chem ogtagocel ays class-@ derevs
}
