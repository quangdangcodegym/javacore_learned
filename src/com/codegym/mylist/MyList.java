package com.codegym.mylist;

import java.util.Arrays;
import java.util.Comparator;

public class MyList<E> {
    private int size = 0;
    public static final int DEFAULT_CAPACITY = 10;
    private Object[] elements;

    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    private void ensureCapa() {
        elements = Arrays.copyOf(elements, elements.length * 2);
    }

    public void add(E e) {
        if (size == elements.length) {
            ensureCapa();
        }
        elements[size++] = e;
    }

    public E get(int index) {
        if (index > 0 || index < size) {
            return (E) elements[index];
        }
        return null;
    }

    // Thêm pt tại vị trí Index
    public void add(int index, int value) {
        if (size >= elements.length) {
            ensureCapa();
        }
        if (index > 0 || index < size) {
            for (int i = size - 1; i >= index; i--) {
                elements[i + 1] = elements[i];
            }
            elements[index] = value;
            size++;
        }
    }

    // Xóa pt tại ví trí index
    public void remove(int index) {
        if (index > 0 || index < size) {
            for (int i = index; i < size - 1; i++) {
                elements[i] = elements[i + 1];
            }
        }
    }

    public void checkChildArray(E[] e) {
        if (e.length <= size) {
            int check = 0;
            for (int i = 0; i < size; i++) {
                if (elements[i] == e[0]) {
                    int count = 0;
                    for (int j = 0; j < e.length; j++) {
                        if (elements[j + i] != e[j]) {
                            break;
                        }
                        count++;
                    }
                    if (count == e.length) {
                        System.out.println(Arrays.toString(e) + " La mang con " + elements);
                        check++;
                        break;
                    }
                }
            }
            if (check == 0) {
                System.out.println(Arrays.toString(e) + " khong phai con cua " + elements);
            }
        } else {
            System.out.println(Arrays.toString(e) + " khong phai con cua " + elements);
        }
    }
    public void concatArray(E[] e) {
        if (size + e.length >= elements.length) {
            ensureCapa();
        }
        for (int i = size; i < size + e.length; i++) {
            elements[i] = e[i-size];
        }
    }
    public void copy (E [] e, int from, int to) {
        E [] array = Arrays.copyOfRange(e, from, to);
        System.out.println(Arrays.toString(array));
    }

    public int getSize() {
        return size;
    }

    public Object[] getElements() {
        return elements;
    }
    public void sortBubble(Comparator<Product> comparator){
        for(int i=0;i<size;i++){
            int min =i;
            for (int j=i;j<size;j++){
                if(comparator.compare((Product)elements[min], (Product)elements[j])==1){
                    min = j;
                }
            }
            // Doi cho
        }
    }
    public void sortInterchangeASC(Comparator<Product> myComparator){
        for(int i=0;i<size-1;i++){
            for(int j=i+1;j<size;j++){
                if(myComparator.compare((Product) elements[i], (Product) elements[j])==1){
                    Object temp = elements[i];
                    elements[i] = elements[j];
                    elements[j] = temp;
                }
            }
        }
    }
    public void sortInterchangeASCComparable(){
        for(int i=0;i<size-1;i++){
            for(int j=i+1;j<size;j++){
                if(((Product) elements[i]).compareTo((Product) elements[j])==1){
                    Object temp = elements[i];
                    elements[i] = elements[j];
                    elements[j] = temp;
                }
            }
        }
    }

    public void printList() {
        for(int i=0;i<size;i++){
            System.out.println(elements[i]);
        }
    }

}
