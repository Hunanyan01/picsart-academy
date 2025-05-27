package am.picsartacademy.lesson.Lesson08;

import am.picsartacademy.lesson.Lesson08.service.ProductData;

public class Test {
    public static void main(String[] args) {

        ProductData service = new ProductData();
        Product product = service.creatProduct();

//        System.out.println(product.getName());
//        System.out.println(product.getData());
//        System.out.println(product.getID());
//        System.out.println(product.getPrice());
//        System.out.println(product.isStock());
//        System.out.println(product.getQuantity());
        product.printInfo();

    }
}

