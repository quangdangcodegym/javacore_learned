package com.codegym.cleancode;

public class Product {
    private int idProduct;
    private String nameProduct;
    private double price;
    private int amount;
    private String description;
    private String ulrImage;


    public Product() {
    }

    public Product(int idProduct, String nameProduct, double price, int amount) {
        this.idProduct = idProduct;
        this.nameProduct = nameProduct;
        this.price = price;
        this.amount = amount;
    }

    public int getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(int idProduct) {
        this.idProduct = idProduct;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUlrImage() {
        return ulrImage;
    }

    public void setUlrImage(String ulrImage) {
        this.ulrImage = ulrImage;
    }

    @Override
    public String toString() {
        return "Product {" +
                "idProduct=" + idProduct +
                ", nameProduct='" + nameProduct + '\'' +
                ", price=" + price +
                ", amount=" + amount +
                ", description='" + description + '\'' +
                ", ulrImage='" + ulrImage + '\'' +
                '}' + "\n";
    }
}





