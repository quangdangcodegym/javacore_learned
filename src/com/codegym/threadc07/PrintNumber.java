package com.codegym.threadc07;

public class PrintNumber implements Runnable{

    private int number;
    public PrintNumber(int number){
        this.number = number;
    }
    @Override
    public void run() {
        for(int i=0;i<number;i++){
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
