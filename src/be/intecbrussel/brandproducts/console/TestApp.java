package be.intecbrussel.brandproducts.console;

import be.intecbrussel.brandproducts.model.AfterShave;
import be.intecbrussel.brandproducts.model.Deodorant;
import be.intecbrussel.brandproducts.model.Parfum;
import be.intecbrussel.brandproducts.model.Product;
import be.intecbrussel.brandproducts.persistence.Order;

public class TestApp {
    public static void main(String[] args) {
        Product p1 = new AfterShave("Nivea", "Aftershave For Humans", "500ml", 60, AfterShave.Type.GEL);
        Product p2 = new Parfum("Jean Jaque Jaqueline", "parfum glutenfree", "500ml", 60);
        Product p3 = new AfterShave("Nivea", "Aftershave glutenfree", "500ml", 70, AfterShave.Type.VAPO);
        Product p4 = new Deodorant("Jean Jaque Jaqueline", "Anti-skunk", "500ml", 60, Deodorant.DeoType.VAPO);
        Product p5 = new Deodorant("Nivea", "Sticky anti-skunk", "500ml", 60, Deodorant.DeoType.STICK);

        Order userOrder = new Order();
        userOrder.addProduct(p1);
        userOrder.addProduct(p2);
        userOrder.addProduct(p3);
        userOrder.addProduct(p4);
        userOrder.addProduct(p5);

        userOrder.showByBrand();
        System.out.println("Most Expensive: ");
        System.out.println(userOrder.searchMostExpensiveProduct());
        System.out.println();
        userOrder.showParfums();
        System.out.println("\nAll products");
        userOrder.showList();
    }
}
