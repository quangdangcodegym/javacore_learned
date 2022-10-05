package com.codegym.cafeorder;

public class OrderItem {
    private int id;
    private Product product;
    private int amount;
    public OrderItem(){}

    public OrderItem(int id, Product product, int amount) {
        this.id = id;
        this.product = product;
        this.amount = amount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
