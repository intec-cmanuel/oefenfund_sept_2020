package be.intecbrussel.brandproducts.model;

public class AfterShave extends Product{
    private Type type;

    public AfterShave(String brand, String name, String volume, double price, Type type) {
        super(brand, name, volume, price);
        this.type = type;
    }

    public Type getType() {
        return type;
    }

    public enum Type{
        VAPO, GEL;
    }
}
