package com.gloriane;

import java.util.UUID;

// ===================== Exercise 4 =====================
    // Fields
public class Product {
    private int productId;
    private String name;
    private double price;

    // Parameterized constructor
    public Product(int productId, String name, double price) {
        this .productId = getProductId();
        setName(name);
        setPrice(price); // use setter for safety
    }

    // Getters/Setters
    public  int getProductId() {
        return productId;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    private String generateProductId() {
        return UUID.randomUUID().toString();
    }
    public void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Name cannot be null or empty");
        }
        this.name = name;
    }

    // simple validation: price cannot be negative
    public void setPrice(double price) {
        if (price <= 0) {
            throw new IllegalArgumentException("Price must be positive");
        }
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{name='" + name + "', price=" + price + "}";
    }
}