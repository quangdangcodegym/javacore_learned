package com.codegym.cleancode;

import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer("Duy",23,"nam","123456789",
                "122103658985","duy123@gmail.com");
        Product product1 = new Product(1,"iPhone 10",35000000,3);
        Product product2 = new Product(2,"iPhone 13",25000000,2);
        Product product3 = new Product(3,"iPhone 12",20000000,4);
        Product product4 = new Product(4,"iPhone 11",17000000,1);
        product1.setDescription("duy ngao ngo");
        ArrayList<Product> list = new ArrayList<>();
        list.add(product1);
        list.add(product2);
        list.add(product3);
        list.add(product4);
        Order order = new Order();
        order.setListProducts(list);
        order.setCustomer(customer);
        System.out.println(order);
//        order.removeProductById(2);
//        System.out.println(order);
        Comparator<Product> myComparator=new MyComparator();
        order.bubbleSort(myComparator);
        System.out.println(order);
        System.out.println(order.findProductByName("iphone"));
        System.out.println(order.findProductByNameAndDescription("iphone",""));

    }
}
