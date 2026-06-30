package se.lexicon;

public class Product {
    private String name;
    private double price;

    public Product (String name, double price){
        if (name == null || name.trim().isBlank())
            throw new IllegalArgumentException("Product name cannot be empty.");

        if (price < 0)
            throw new IllegalArgumentException("Price cannot be negative.");

        this.name = name.trim();
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void applyDiscount(double precent) {
        if (precent > 80.0)
            throw new IllegalArgumentException("Discount cannot be greater than 80%.");

        if (precent < 0)
            throw new IllegalArgumentException("Discount cannot be negative.");

        this.price = this.price * (1 - (precent / 100));
    }

    public void printInfo(){
        System.out.printf("Product: %s | Price: $%.2f%n", this.name, this.price);
    }
}
