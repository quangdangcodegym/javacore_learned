package com.codegym.threadc07;

public class PrintCharThread extends Thread{

    private char charToPrint;
    private int times;

    public PrintCharThread(int times, char charToPrint){
        this.times = times;
        this.charToPrint = charToPrint;
    }
    @Override
    public void run() {
        for(int i=0;i<times;i++){
            System.out.println(charToPrint);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
