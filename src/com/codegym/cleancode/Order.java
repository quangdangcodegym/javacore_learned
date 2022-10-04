package com.codegym.cleancode;

import java.util.ArrayList;
import java.util.Comparator;

public class Order {
    private int idOder;
    private Customer customer;
    private ArrayList<Product> listProducts;

    public Order() {
    }

    public Order(int idOder, Customer customer, ArrayList<Product> listProducts) {
        this.idOder = idOder;
        this.customer = customer;
        this.listProducts = listProducts;
    }

    public int getIdOder() {
        return idOder;
    }

    public void setIdOder(int idOder) {
        this.idOder = idOder;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public ArrayList<Product> getListProducts() {
        return listProducts;
    }

    public void setListProducts(ArrayList<Product> listProducts) {
        this.listProducts = listProducts;
    }

    @Override
    public String toString() {
        return "Order {" +
                "idOder=" + idOder +
                ", customer=" + customer + "\n" +
                ", listProducts=" + listProducts +
                '}';
    }

    //1. Tính tổng
    public double getTotal(){
        double total = 0;
        for (int i = 0; i < listProducts.size(); i++){
            total += listProducts.get(i).getPrice() * listProducts.get(i).getAmount();
        }
        return total;
    }
    //2. Xóa sản phẩm theo danh sách ID
    public void removeProductById(int id) {
        for (int i = 0; i < listProducts.size(); i++) {
            if (listProducts.get(i).getIdProduct() == id) {
                listProducts.remove(i);
            }
        }
    }
    public void removeProductById(Product product){
        for (int i = 0; i < listProducts.size(); i++) {
            if (listProducts.get(i).equals(product)) {
                listProducts.remove(product);
            }
        }
    }

    //3. Sửa tên theo ID
    public void changeProductById(int id, String name) {
        for (int i = 0; i < listProducts.size(); i++) {
            if (listProducts.get(i).getIdProduct() == id) {
                listProducts.get(i).setNameProduct(name);
            }
        }
    }
    public void changeProductById(int id, Product newProduct){
        for (int i = 0; i < listProducts.size(); i++) {
            if (listProducts.get(i).getIdProduct() == id) {
                // Cách 1: cập những thuộc tính cần thiết
//                listProducts.get(i).setIdProduct(newProduct.getIdProduct());
//                listProducts.get(i).setNameProduct(newProduct.getNameProduct());
//                listProducts.get(i).setDescription(newProduct.getDescription());
//                listProducts.get(i).setAmount(newProduct.getAmount());
                // Cách 2:
                listProducts.set(i, newProduct);

            }
        }
    }



    //4. Tìm sản phẩm theo tên sản phẩm
    public ArrayList<Product> findProductByName(String name) {
        ArrayList<Product> listP = new ArrayList<>();
        for (int i = 0; i < listProducts.size(); i++) {
            if (((listProducts.get(i).getNameProduct()).toLowerCase()).contains(name.toLowerCase())) {
                listP.add(listProducts.get(i));
            }
        }
        return listP;
    }

    //5. Tìm sản phẩm theo tên sản phẩm và mô tả
    public ArrayList<Product> findProductByNameAndDescription(String name, String description) {
        ArrayList<Product> listP = new ArrayList<>();
        for (int i = 0; i < listProducts.size(); i++) {
            if (listProducts.get(i).getDescription() != null) {
                if (((listProducts.get(i).getNameProduct()).toLowerCase()).contains(name.toLowerCase()) &&
                        ((listProducts.get(i).getDescription()).toLowerCase()).contains(description.toLowerCase())) {
                    listP.add(listProducts.get(i));
                }
            }
        }
        if (listP.size()==0){
            return null;
        }
        return listP;
    }

    //6. Sắp xếp theo thứ tự từ a-z, giá tiền, số lượng
    public void bubbleSort(Comparator<Product> myComparator) {
        for (int i = 0; i < listProducts.size(); i++) {
            for (int j = listProducts.size() - 1; j > i; j--) {
                if (myComparator.compare(listProducts.get(j - 1), listProducts.get(j)) == 1) {
                    Product temp = listProducts.get(j);
                    listProducts.set(j, listProducts.get(j - 1));
                    listProducts.set(j - 1, temp);
                }
            }
        }
    }
}