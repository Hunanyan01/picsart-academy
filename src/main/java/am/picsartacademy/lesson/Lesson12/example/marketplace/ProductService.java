package am.picsartacademy.lesson.Lesson12.example.marketplace;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ProductService {

    public static void printProductsByCategory(List<Category> categories, List<Product> products) {
        for (Category category : categories) {
            System.out.println("Category: " + category.getName());
            for (Product product : products) {
                if (product.getCategory().equals(category)) {
                    System.out.println("  - " + product.getName() + " | $" + product.getPrice());
                }
            }
        }
    }

    public static Product findMostExpensiveProduct(List<Product> products) {
        Product top = products.get(0);
        for (Product product : products) {
            if (product.getPrice() > top.getPrice()) {
                top = product;
            }
        }
        return top;
    }

    public static List<Product> sortByPrice(List<Product> products) {
        List<Product> sorted = new ArrayList<>(products);
        sorted.sort(Comparator.comparingDouble(Product::getPrice));
        return sorted;
    }

    public static Product findCheapestProduct(List<Product> products) {
        if (products == null || products.isEmpty()) {
            return null;
        }

        Product cheapest = products.get(0);
        for (Product product : products) {
            if (product.getPrice() < cheapest.getPrice()) {
                cheapest = product;
            }
        }
        return cheapest;
    }
}

