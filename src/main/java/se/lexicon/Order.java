package se.lexicon;

import java.util.ArrayList;

public class Order {
    private final Customer customer;
    private final ArrayList<Product> products;

    public Order(Customer customer){
        this.customer = customer;
        this.products = new ArrayList<>();
    }

    public void addProduct(Product product){
        products.add(product);
        System.out.println("\n" + product.getName() + " added. ");
    }

    public void removeProduct(Product product){
        products.remove(product);
        System.out.println("\n" + product.getName() + " removed.");
    }

    public double calculateTotal(){
        double sum = 0;
        for (Product product : products){
            sum += product.getPrice();
        }
        return sum;
    }

    public void printSummary(){
        customer.printInfo();
        System.out.println("Items in Order:");
        for (Product product: products) {
            product.printInfo();
        }
        System.out.printf("Total Order Value: %.2f SEK%n", calculateTotal());
    }
}