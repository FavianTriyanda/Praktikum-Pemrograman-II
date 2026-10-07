package module02.problem01;

public class Fruit {

    private String name;
    private float weight;
    private float price;
    private float quantity;
    private double pricePerKg;

    public Fruit(String name, float weight, float price, float quantity) {
        this.name = name;
        this.weight = weight;
        this.price = price;
        this.quantity = quantity;
        this.pricePerKg = this.price / this.weight;
    }

    public void printInfo() {
    System.out.println("Nama buah: " + name);
    System.out.println("Berat: " + weight);
    System.out.println("Harga: " + price);
    System.out.println("Jumlah Beli: " + quantity + "kg");
    System.out.println("Harga Sebelum Diskon: Rp" + getPreDiscountPrice());
    System.out.println("Total Diskon: Rp" + getDiscountTotal());
    System.out.println("Harga Setelah Diskon: Rp" + getPostDiscountPrice());
    System.out.print("\n");
    }

    public double getPreDiscountPrice() {
        return pricePerKg * quantity;
    }

    public double getDiscountTotal() {
        int discountThresholdKg = 4;
        double discountPercentage = 0.02;

        int discountBatches = (int)(this.quantity / discountThresholdKg);
        return discountBatches * (this.pricePerKg * discountThresholdKg) * discountPercentage;
    }

    public double getPostDiscountPrice() {
        return getPreDiscountPrice() - getDiscountTotal();
    }
}
