package com.codegym.cleancode;

import java.util.Comparator;

public class MyComparator implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        if (o1.getNameProduct().compareToIgnoreCase(o2.getNameProduct()) > 0 ){
            return 1;
        } else {
            if (o1.getNameProduct().compareToIgnoreCase(o2.getNameProduct()) < 0){
                return -1;
            } else {
                if (o1.getPrice() > o2.getPrice()){
                    return 1;
                } else if (o1.getPrice() < o2.getPrice()){
                    return -1;
                } else {
                    if (o1.getAmount() > o2.getAmount()){
                        return 1;
                    } else {
                        if (o1.getAmount() < o2.getAmount()){
                            return -1;
                        } else {
                            return 0;
                        }
                    }
                }
            }
        }



    }
}