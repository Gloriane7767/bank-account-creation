package com.gloriane;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

// ===================== Exercise 5 (Optional) =====================
public class Order {
    private int orderId;
    private Customer customer;
    private List<Product> products;
    private double totalPrice;

    // Constructor: order with customer
    public Order(int orderId, Customer customer) {
        this .orderId = getOrderId();
        this.customer = customer;
        this.products = new ArrayList<>();
        this.totalPrice = 0.0;
    }

    // Constructor: order with customer + initial products
    public Order(int orderId, Customer customer, List<Product> products) {
        this .orderId = getOrderId();
        this.customer = customer;
        this.products = (products == null) ? new ArrayList<>() : products;
        this.totalPrice = 0.0;
    }

    // Add/remove products
    public void addProduct(Product p) {
        if (p != null) {
            products.add(p);
        }
    }

    public void removeProduct(Product p) {
        products.remove(p); // removes one matching item if exists
    }

    // Calculate total and store it in totalPrice
    public double calculateTotal() {
        double sum = 0.0;
        for (Product p : products) {
            sum += p.getPrice();
        }
        this.totalPrice = sum;
        return totalPrice;
    }

    // Getters/Setters (no setter for totalPrice on purpose)
    public int getOrderId() {

        return orderId;
    }

    private String generateOrderId() {
        return UUID.randomUUID().toString();
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public List<Product> getProducts() {
        return products;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    @Override
    public String toString() {
        String customerName = (customer == null) ? "No Customer" : customer.getName();
        return "Order{orderId=" + orderId +
                ", customer=" + customerName +
                ", items=" + products.size() +
                ", totalPrice=" + totalPrice +
                "}";
    }
}