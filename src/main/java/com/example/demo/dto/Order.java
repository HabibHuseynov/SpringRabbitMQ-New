package com.example.demo.dto;

public class Order {

    private String orderId;
    private String name;
    private int qty;
    private double price;

    public Order() {
    }

    public Order(String orderId, String name, int qty, double price) {
        this.orderId = orderId;
        this.name = name;
        this.qty = qty;
        this.price = price;
    }

    public String getOrderId() {
        return orderId;
    }

    public Order setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }

    public String getName() {
        return name;
    }

    public Order setName(String name) {
        this.name = name;
        return this;
    }

    public int getQty() {
        return qty;
    }

    public Order setQty(int qty) {
        this.qty = qty;
        return this;
    }

    public double getPrice() {
        return price;
    }

    public Order setPrice(double price) {
        this.price = price;
        return this;
    }
}
