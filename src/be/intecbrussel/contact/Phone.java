package be.intecbrussel.contact;

public class Phone {
    private static final int MOBILE_LENGTH = 10;
    private static final int FIX_LENGTH = 9;
    private String number;
    private String type;

    public Phone (String number, String type) {
        this.number = number;
        this.type = type;
    }

    public String getNumber() {
        return number;
    }

    public String getType() {
        return type;
    }

    public boolean isNumberValid() {
        if (!(type.equalsIgnoreCase("mobile") || type.equalsIgnoreCase("fix"))) {
            return false;
        }

        int amountOfNumbers = type.equalsIgnoreCase("mobile") ? 10 : 9;
        return number.matches("0\\d{" + amountOfNumbers + "}");
    }
}
