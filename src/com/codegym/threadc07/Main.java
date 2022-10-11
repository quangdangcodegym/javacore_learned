package com.codegym.threadc07;

public class Main {
    public static void main(String[] args) {
//        PrintNumber printNumber = new PrintNumber(100);
//        PrintChar printChar = new PrintChar(100, 'a');
//        PrintChar printChar1 = new PrintChar(100, 'b');
//
//        Thread thread1 = new Thread(printNumber);
//        Thread thread2 = new Thread(printChar);
//        Thread thread3 = new Thread(printChar1);
//
//
//        thread1.start();
//        thread2.start();
//        thread3.start();
//
//
//
//        Thread thread4 = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                for (int i= 0; i<1000; i++){
//                    System.out.println("C07....");
//                    try {
//                        Thread.sleep(1000);
//                    } catch (InterruptedException e) {
//                        throw new RuntimeException(e);
//                    }
//                }
//            }
//        });
//        thread4.start();

        PrintNumberThread printNumberThread = new PrintNumberThread(100);
        printNumberThread.start();

        PrintCharThread printCharThread = new PrintCharThread(100, 'a');
        PrintCharThread printCharThread1 = new PrintCharThread(100, 'b');
        printCharThread.start();
        printCharThread1.start();
    }
}
