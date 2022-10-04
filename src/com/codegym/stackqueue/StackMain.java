package com.codegym.stackqueue;

import java.util.List;
import java.util.Stack;

public class StackMain {
    public static void main(String[] args) {
        // Cách 1:
        Stack<Integer> list = new Stack<>(); //
        List<Integer> list1 = new Stack<>();    // Khai báo stack sử dụng đa hình


        // Khai báo
        list.push(1);
        list.push(2);
        list.push(3);


//        list.add(1);
//        list.add(2);
//        list.add(3);
//        System.out.println(list.toString());
        list1.add(5);
        list1.add(6);
        list1.add(7);
        System.out.println(list.toString());
        System.out.println(list1.toString());

        System.out.println("Pop" +  ((Stack<Integer>) list1).pop());
        System.out.println("Pop" +  list.pop());


    }
}
