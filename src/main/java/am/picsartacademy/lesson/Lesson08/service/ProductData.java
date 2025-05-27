package am.picsartacademy.lesson.Lesson08.service;

import am.picsartacademy.lesson.Lesson08.Product;

import java.util.Scanner;

public class ProductData {
    public Product creatProduct() {
        Scanner s1 = new Scanner(System.in);
        Product product = new Product();
        System.out.println("Grel apranqi anuny");
        product.setName(s1.next());
        System.out.println("Grel aprranqi ID hamary");
        product.setID(s1.nextInt());
        System.out.println("Grel apranqi jamkety");
        product.setData(s1.nextInt());
        System.out.println("Grel apranqi arjeqy");
        product.setPrice(s1.nextInt());
        System.out.println("Grel apranqy jaketi mech e ete ayo (Y) ete voch (N)");
        String n = s1.next().toLowerCase();
        product.setStock(n.charAt(0) == 'y');
        System.out.println("Grel apranqi qanaky");
        product.setQuantity(s1.nextInt());
        return product;
    }


    public void printDataProduct(Product product) {
        System.out.println(product.getName() + " " + product.getData());
    }
}
