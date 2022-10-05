package com.codegym.cafeorder;

import java.util.HashSet;
import java.util.Set;

public class Table {
    private String name;
    private int id;
    private double total;

    private Set<OrderItem> orderItems;

    public Table(String name, int id, double total, Set<OrderItem> orderItems) {
        this.name = name;
        this.id = id;
        this.total = total;
        this.orderItems = orderItems;
    }
    public Table(int id, String name, double total){
        this.name = name;
        this.id = id;
        this.total = total;
        this.orderItems = new HashSet<>();
    }
    public Table(int id, String name){
        this.name = name;
        this.id = id;

        this.total = 0;
        this.orderItems = new HashSet<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public Set<OrderItem> getOrderItems() {
        return orderItems;
    }

    public void setOrderItems(Set<OrderItem> orderItems) {
        this.orderItems = orderItems;
    }
}
