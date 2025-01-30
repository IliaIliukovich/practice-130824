package lesson20250128;

public enum ShippingMethod {

    STANDARD ("standard", 5.99),
    EXPRESS("express", 9.99);

    public String name;
    public double price;

    ShippingMethod(String name, double price) {
        this.name = name;
        this.price = price;
    }
}
