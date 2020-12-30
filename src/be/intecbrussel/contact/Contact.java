package be.intecbrussel.contact;

public class Contact {
    private ContactDetails details;
    private String name;

    public Contact(String name, String emailAddress, String phoneNr, String gsmNr) {
        this.name = name;
        this.details = new ContactDetails(emailAddress, new Phone(phoneNr, "fix"), new Phone(gsmNr, "mobile"));
    }

    @Override
    public String toString() {
        String toString = "";
        toString = toString.concat("Name: " + name + "\n");
        toString = toString.concat(details.toString());

        return toString;
    }

    public void showInfo() {
        System.out.println(this);
    }
}
