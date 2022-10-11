package com.codegym.threadc07;

public class PrintChar implements Runnable{
    private char charToPrint;
    private int times;

    public PrintChar(int times, char charToPrint){
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
