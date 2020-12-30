package be.intecbrussel.contact;

public class ContactDetails {
    private String eMail;
    private Phone gsm;
    private Phone phone;

    public ContactDetails(String eMail, Phone gsm, Phone phone) {
        this.eMail = eMail;
        this.gsm = gsm;
        this.phone = phone;
    }

    public String getEMail() {
        return eMail;
    }

    public Phone getGsm() {
        return gsm;
    }

    public Phone getPhone() {
        return phone;
    }

    @Override
    public String toString() {
        String toString = "";
        toString = toString.concat("E-mail: " + eMail + "\n");
        toString = toString.concat("PhoneNr: " + phone.getNumber() + "\n");
        toString = toString.concat("GSM: " + gsm.getNumber());

        return toString;
    }
}
