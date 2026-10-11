package uk.ac.westminster.products_api;

public class Product {

    private Long id;
    private String name;
    private double price;

    public Product (Long id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;

    }

    public Product () { }

    public Long getId() {
        return id;
    }

    //Because JSON serializers like Jackson only include fields exposed through getters.
    //So removing the getter makes the field invisible and drops it from the JSON output.
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}
