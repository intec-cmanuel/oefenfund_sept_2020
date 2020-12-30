package be.intecbrussel.brandproducts.model;

import java.util.Comparator;

public abstract class Product {
    private int productNumber;
    private String brand;
    private String name;
    private String volume;
    private double price;

    public Product(String brand, String name, String volume, double price) {
        this.brand = brand;
        this.name = name;
        this.volume = volume;
        this.price = price;
    }

    public String getProductCode() {
        String brandPart = brand.substring(0, 3);
        String namePart = name.substring(0, 3);
        String volumePart = volume.substring(0, 3);
        String code = brandPart.concat(namePart).concat(volumePart).toUpperCase().replaceAll(" ", "_");
        return code;
    }

    public static Comparator<Product> sortByBrandName() {
        return Comparator.comparing(p -> p.brand);
    }

    public String getBrand() {
        return brand;
    }

    public double getPrice() {
        return price;
    }

    public void setProductNumber(int productNumber) {
        this.productNumber = productNumber;
    }

    @Override
    public String toString() {
        String toString = String.format("%d Brand: %-25s Name: %-25s Volume: %-6s  Price: %-5.2f Code: %-15s", productNumber, brand, name, volume, price, getProductCode());
        if (this instanceof AfterShave) {
            toString = toString.concat(((AfterShave) this).getType().toString());
        } else if (this instanceof Deodorant) {
            toString = toString.concat(((Deodorant) this).getDeoType().toString());
        }

        return toString;
    }
}
