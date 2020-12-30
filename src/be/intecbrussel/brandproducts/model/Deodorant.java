package be.intecbrussel.brandproducts.model;

public class Deodorant extends Product{
    private DeoType deoType;

    public Deodorant(String brand, String name, String volume, double price, DeoType deotype) {
        super(brand, name, volume, price);
        this.deoType = deotype;
    }

    public DeoType getDeoType() {
        return deoType;
    }

    public enum DeoType {
        VAPO, STICK;
    }
}
