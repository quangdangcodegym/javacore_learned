package com.codegym.threadc07.primite;

public class Main {
    public  static  int limitSize = 100;
    public static void main(String[] args) {

        Thread t1 = new Thread(new LazyPrimeFactorization());
        Thread t2 = new Thread(new OptimizedPrimeFactorization());
        t1.start();
        t2.start();

    }
}
