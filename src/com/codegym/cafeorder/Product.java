package com.codegym.cafeorder;

import java.util.Objects;

public class Product {
    private String name;
    private double price;
    private int id;

    public Product(){}

    public Product(String name, double price, int id) {
        this.name = name;
        this.price = price;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + "'" +
                ", price=" + price +
                ", amount=" + id +
                '}' + super.toString();
    }




    @Override
    public boolean equals(Object product) {
        Product p1 = (Product) product ;
        if(this == product){
            return true;
        }else{
            if(this.getName().equalsIgnoreCase(p1.getName())&&this.id ==p1.getId() && this.getPrice()==p1.getPrice()){
                return true;
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price, id);
    }
}
