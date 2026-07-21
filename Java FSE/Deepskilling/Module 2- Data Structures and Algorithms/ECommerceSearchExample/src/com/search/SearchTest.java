package com.search;

public class SearchTest {

    public static Product linearSearch(Product[] products, int id) {

        for (Product product : products) {
            if (product.getProductId() == id) {
                return product;
            }
        }

        return null;
    }

    public static Product binarySearch(Product[] products, int id) {

        int left = 0;
        int right = products.length - 1;

        while (left <= right) {

            int mid = (left + right) / 2;

            if (products[mid].getProductId() == id) {
                return products[mid];
            }

            if (products[mid].getProductId() < id) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return null;
    }

    public static void main(String[] args) {

        Product[] products = {

                new Product(101, "Laptop", "Electronics"),
                new Product(102, "Keyboard", "Electronics"),
                new Product(103, "Shoes", "Fashion"),
                new Product(104, "Watch", "Accessories"),
                new Product(105, "Phone", "Electronics")

        };

        int searchId = 104;

        System.out.println("Linear Search");

        Product p1 = linearSearch(products, searchId);

        if (p1 != null)
            System.out.println(p1);
        else
            System.out.println("Product not found");

        System.out.println();

        System.out.println("Binary Search");

        Product p2 = binarySearch(products, searchId);

        if (p2 != null)
            System.out.println(p2);
        else
            System.out.println("Product not found");
    }
}