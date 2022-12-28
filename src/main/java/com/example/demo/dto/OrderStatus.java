package com.example.demo.dto;

public class OrderStatus {

    private Order order;
    private String status;
    private String message;

    public OrderStatus() {
    }

    public OrderStatus(Order order, String status, String message) {
        this.order = order;
        this.status = status;
        this.message = message;
    }

    public Order getOrder() {
        return order;
    }

    public OrderStatus setOrder(Order order) {
        this.order = order;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public OrderStatus setStatus(String status) {
        this.status = status;
        return this;
    }

    public String getMessage() {
        return message;
    }

    public OrderStatus setMessage(String message) {
        this.message = message;
        return this;
    }
}
