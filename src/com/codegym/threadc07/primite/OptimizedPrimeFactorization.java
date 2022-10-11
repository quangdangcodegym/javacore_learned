package com.codegym.threadc07.primite;

public class OptimizedPrimeFactorization implements Runnable{
    @Override
    public void run() {
        for(int i = 2; i < Main.limitSize;i++){
            boolean check = true;
            for (int j = 2 ;j<=Math.sqrt(i);j++){
                if(i%j==0){
                    check = false;
                    break;
                }
            }
            if(check==true){
                System.out.printf("OptimizedPrimeFactorization %d la so nguyen to \n", i);
            }
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
