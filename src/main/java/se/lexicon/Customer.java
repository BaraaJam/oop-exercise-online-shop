package se.lexicon;

public class Customer {
    private String name;
    private String email;

    public Customer(String name, String email){
        if (name == null || name.trim().isBlank())
            throw new IllegalArgumentException("Customer name cannot be blank.");

        if (email == null || email.trim().isBlank())
            throw new IllegalArgumentException("Customer email cannot be blank.");

        this.name = name.trim();
        this.email = email.trim();
    }

    public String getName() { return name; }
    public String getEmail() { return email; }

    public void printInfo(){
        System.out.printf("Customer: %s | Email: %s%n", this.name, this.email);
    }
}
