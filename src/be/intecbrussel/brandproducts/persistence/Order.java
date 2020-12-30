package be.intecbrussel.brandproducts.persistence;

import be.intecbrussel.brandproducts.model.Parfum;
import be.intecbrussel.brandproducts.model.Product;

import java.util.*;
import java.util.stream.Collectors;

public class Order {
    private List<Product> order;
    private static int productNumber;

    static {
        productNumber = 1000;
    }

    public Order() {
        this.order = new ArrayList<>();
    }

    public Order(ArrayList<Product> order) {
        this.order = order;
    }

    public void addProduct(Product product) {
        product.setProductNumber(productNumber++);
        order.add(product);
    }

    public void sortByBrand() {
        order.sort(Product.sortByBrandName());
    }

    public void showList() {
        for (Product product : order) {
            System.out.println(product);
        }
    }

    public void showByBrand() {
        Map<String, List<Product>> productMap = order.stream().collect(Collectors.groupingBy(Product::getBrand));

        for (String brand : productMap.keySet()) {
            System.out.println("Brand: " + brand);
            for (Product product : productMap.get(brand)) {
                System.out.println(product);
            }
            System.out.println();
        }
    }

    public Product searchMostExpensiveProduct() {
        return order.stream()
                .max(Comparator.comparingDouble(Product::getPrice))
                .orElse(null);
    }

    public void showParfums() {
        System.out.println("Parfums: ");
        order.stream()
                .filter(product -> product instanceof Parfum)
                .forEach(System.out::println);
    }
}
