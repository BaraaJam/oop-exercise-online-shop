package se.lexicon;

public class App {
    public static void main(String[] args) {
        Product product1 = new Product("Milk", 20.0);
        Product product2 = new Product("Bred", 35.9);
        Customer customer = new Customer("Baraa jam", "baraa@baraa.com");
        Order order = new Order(customer);

        product1.applyDiscount(40);

        order.addProduct(product1);
        order.addProduct(product2);

        System.out.println("\n--- FIRST SUMMARY ---");
        order.printSummary();

        order.removeProduct(product1);

        System.out.println("\n--- UPDATED SUMMARY (After Removal) ---");
        order.printSummary();

    }
}
