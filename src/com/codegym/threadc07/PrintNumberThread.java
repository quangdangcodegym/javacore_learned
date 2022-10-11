package com.codegym.threadc07;

public class PrintNumberThread extends Thread{

    private int number;
    public PrintNumberThread(int number){
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
