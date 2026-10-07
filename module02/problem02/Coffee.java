package module02.problem02;

import java.util.Locale;

public class Coffee {

    private String name;
    private String size;
    private float price;
    private String customer;
    private double tax = 0.11;

    public void printInfo() {
        Locale.setDefault(Locale.US);
        System.out.println("Nama Kopi: " + name);
        System.out.println("Ukuran: " + size);
        System.out.println("Harga: " + price);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public String getCustomer() {
        return customer;
    }
    public double getTax() {
        return price * tax;
    }
}