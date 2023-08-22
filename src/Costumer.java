public class Costumer {
    private String NAme;
    private Passport passport;
    private Produkt product;
    private Bank bank;

    public Costumer(String NAme, Passport passport, Produkt produkt, Bank bank) {
        this.NAme = NAme;
        this.passport = passport;
        this.product = produkt;
        this.bank = bank;
    }

    public Costumer(String alex, Passport passport1, Produkt[] products, Bank bank1) {

    }

    public String getNAme() {
        return NAme;
    }

    public void setNAme(String NAme) {
        this.NAme = NAme;
    }

    public Passport getPassport() {
        return passport;
    }

    public void setPassport(Passport passport) {
        this.passport = passport;
    }

    public Produkt getProdukt() {
        return product;
    }

    public void setProdukt(Produkt produkt) {
        this.product = produkt;
    }

    public Bank getBank() {
        return bank;
    }

    public void setBank(Bank bank) {
        this.bank = bank;
    }

    @Override
    public String toString() {
        return "Costumer{" +
                "NAme='" + NAme + '\'' +
                ", passport=" + passport +
                ", produkt=" + product +
                ", bank=" + bank +
                '}';
    }

    public void deleteProductByName(String alex, String banana) {

    }

    public long[] addProduct(Produkt product1) {
        return new long[0];
    }

    public String getName() {
        return null;
    }

    public void updateCostumerName(String alexander) {

    }

    public String checkProduct(Produkt[] products) {
        return null;
    }

    public long[] getProducts() {
        return new long[0];
    }
}
